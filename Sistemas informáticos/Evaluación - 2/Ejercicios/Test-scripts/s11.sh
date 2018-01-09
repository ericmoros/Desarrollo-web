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
 USER_INPUT_CONTROL="false"

#___________________________________________________________


#___ USER_INPUT_CONTROL ____________________________________

 if [ $PARAMETERS_TOTAL -gt 1 ]; then
        USER_INPUT_CONTROL="true"
        echo "Hola"
 else
        echo "[ERROR:1] Parametros mínimos 2 -> (./s11.sh 1 2)"
	echo ""
 fi

#___________________________________________________________


#___ PRINT-OUT _____________________________________________

 if [ $USER_INPUT_CONTROL = "true" ]; then
	while [ $# -gt 0 ]; do
		echo "Parametro $PARAMETERS_CONT: $1"
		PARAMETERS_CONT=`expr $PARAMETERS_CONT + 1`
		shift
	done
 fi

#___________________________________________________________
