#!/bin/sh

						#SCRIPT - 12 (Uso del while)

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

 

#___________________________________________________________


#___ READ-IN _______________________________________________

 

#___________________________________________________________


#___ PRINT-OUT _____________________________________________

 echo "Buscando $1"

 if [ -f $1 ]; then
	 echo " Esxiste!"
 else 
	 echo " No existe!"
	 exit 1
 fi

 

#___________________________________________________________
