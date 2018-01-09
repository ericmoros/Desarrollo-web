#!/bin/sh

						#SCRIPT - 11 (Uso del while)

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
 PARAMETERS_CONT=1

#___________________________________________________________


#___ PRINT-OUT _____________________________________________

 while [ $# -gt 0 ]; do
	if [ `e xpr $PARAMETERS_CONT % 2` -eq 0 ]; then
		PARAMETERS_CONT2=PARAMETERS_CONT + 1
		echo "Parametro $PARAMETERS_CONT:$1 y $PARAMETERS_CONT2:$2"
		PARAMETERS_CONT=`expr $PARAMETERS_CONT + 1`
		shift
	else
		echo "Parametro $PARAMETERS_CONT : $1"
	fi
	PARAMETERS_CONT=`expr $PARAMETERS_CONT + 1`
	shift
 done

#___________________________________________________________
