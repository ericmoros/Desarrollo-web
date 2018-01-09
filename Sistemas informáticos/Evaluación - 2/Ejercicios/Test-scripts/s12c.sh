#!/bin/sh

						#SCRIPT - 12c

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

 ARCHIVO=$*

#___________________________________________________________

#___ PRINT-OUT _____________________________________________

 for VAR
 do
#	echo "Buscando $ARCHIVO"
	find / -name $VAR -type f > result.txt 2> lel.txt

 	if [ -s result.txt ]; then
		echo " Esxiste!"
		VAR2=`cat result.txt | wc -l `
		echo " $VAR Esxiste! Hay:$VAR2"
	else 
		echo " No existe!"
	fi
 done
#___________________________________________________________
