#/bin/sh

#OPCIONES
OPT1=1
OPT2=2
OPT3="u"

#RCHIVOS
SHADOW=/etc/shadow
USERSLOCKED=./userslocked.txt
USERS=./users.txt

#CONFIG
RSHELL=/bin/bash

clear
echo OPCIONES: $OPT1, $OPT2, $OPT3
echo "Introduce una opción..."

if [ ! -z $1 ]; then
	INPUTTEXT=$1
	echo "($1)"
else
	read INPUTTEXT
fi


INPUTTEXT=`echo $INPUTTEXT | tr "[[:upper:]]" "[[:lower:]]"`


if [ ! -z $INPUTTEXT ]; then
	if [ $INPUTTEXT = "uno" ]; then
		INPUTTEXT=$OPT1
	fi

	if [ $INPUTTEXT = "dos" ]; then
        	INPUTTEXT=$OPT2
	fi
else 
	echo "Tienes que introducir una opción"
	echo "[FIN DE PROGRAMA]"
	exit 1
fi



OPTION=$INPUTTEXT
shift


case $OPTION in
	$OPT1)
		echo "Bienvenido a la opción $OPT1"
		echo "[CREAR USUARIOS]"
		echo "Introduce el grupo"
		if [ ! -z $1 ]; then
                        INPUTTEXT=$1
			echo "($1)"
                else
                        read INPUTTEXT
                fi
		GNAME=$INPUTTEXT
		
		echo "Introduce el HOME del grupo"
		if [ ! -z $2 ]; then
                        INPUTTEXT=$2
			echo "($2)"
                else
                        read INPUTTEXT
                fi
                DHOME=$INPUTTEXT

		echo "Aplicado shell de configuración"
		echo $RSHELL

		shift
		shift



		echo "Introduce el nombre de los usuarios a crear"
		if [ ! -z $1 ]; then
		        INPUTTEXT=$*
		        echo "($*)"
		else
        		read INPUTTEXT
		fi
		UNAMES=$INPUTTEXT
		
		for UNAME in $UNAMES; do
			if ! cat /etc/passwd | grep ^$UNAME > /dev/null; then
        	        	echo "useradd -d $DHOME -g $GNAME -s $RSHELL $UNAME"
        		        echo "(echo $UNAME; echo $UNAME) | passwd $UNAME"
		        else
		                echo "El usuario $UNAME ya existe..."
        		fi
			shift
		done
		;;
	$OPT2)
		echo "Bienvenido a la opción $OPT2"
		echo "[Usuarios]"
                rm -r $USERS
                while read LINE; do
			UNAME=`echo $LINE | cut -d ":" -f1,1`
                        echo $UNAME >> $USERS
                done < $SHADOW
                cat $USERS
		;;
	$OPT3)
		echo "Bienvenido a la opción $OPT3"
		echo "[Usuarios bloqueados]"
		rm -r $USERS
		while read LINE; do
			BLOCKLINE=`echo $LINE | grep '!!'`
			if [ $BLOCKLINE ]; then
				UNAME=`echo $BLOCKLINE | cut -d ":" -f1,1`
				echo $UNAME >> $USERSLOCKED
			fi
		done < $SHADOW
		cat $USERSLOCKED
		;;
	*)
		echo "[ERROR]Opción '$OPTION' no definida"
esac
