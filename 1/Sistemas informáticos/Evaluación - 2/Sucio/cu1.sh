#/bin/sh

UNAME=test
GNAME=tests
DRAIZ=/home
SHELL=/bin/bash

#Pedir los datos
echo "Nombre..."
 #read UNAME

echo "Grupo..."
 #read GNAME

echo "Raiz..."
 #read DRAIZ

#echo "Home"
 #read SHELL
HOME=$DRAIZ/$GNAME/$UNAME


#Creo el usuario (La contraseña es igual al nombre)
echo "(C/X)"
echo "C=Correcto"
echo "X=Error"
echo "USER:C/X;GROUP:C/X;HOME:C/X;SHELL:C/X"

for NUM in 01 02 03 04 05 06 07 08 09 10 11 12 13 14 15; do
	UNAMENEW=$UNAME$NUM
	if ! cat /etc/passwd | grep ^$UNAMENEW > /dev/null; then
		#echo "useradd -d $HOME -g $GNAME -s $SHELL $UNAMENEW"
		#echo "(echo $UNAMENEW; echo $UNAMENEW) | passwd $UNAMENEW"
		echo "$UNAMENEW:C;$GNAME:C;$HOME:C;$SHELL:C"
	else
		echo "El usuario $UNAMENEW ya existe..."
	fi
done
