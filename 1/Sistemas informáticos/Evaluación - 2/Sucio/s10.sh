#!/bin/sh

						#SCRIPT - 10 (Uso del for)

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
 PARAMETERS_TOTAL=$#
 PARAMETERS_LIST=$*

#___________________________________________________________


#___ PRINT-OUT _____________________________________________

 for VAR
 do
	echo "Parametro: $VAR"
 done

#___________________________________________________________
