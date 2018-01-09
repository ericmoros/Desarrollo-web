#!/bin/sh

						#SCRIPT - 12b

#___ APUNTES _______________________________________________

 # -eq → =
 # -ne → !=
 # -gt → >
 # -ge → >=
 # -lt → <
 # -le → <=
 # $1 (2,3,4,5,6,7,8,9...)
 
#___________________________________________________________


#___ VARIABLES _____________________________________________

 PARAMETRO_FIND=f
 ARCHIVO=$1

#___________________________________________________________

#___ PRINT-OUT _____________________________________________


 if [ $1 = f ]; then
	shift
 elif [ $1 = d ]; then
	PARAMETRO_FIND=d
	shift
 fi

 for ARCHIVOS; do
	echo "Buscando $ARCHIVOS"
	find / -type $PARAMETRO_FIND -name $ARCHIVOS > result.txt 2> lel.txt
 	if [ -s result.txt ]; then
		echo " Esxiste!"
		cat result.txt
		echo $VAR
	 else
		echo " No existe!"
		echo ""
 	fi
	shift
 done
 

#___________________________________________________________
