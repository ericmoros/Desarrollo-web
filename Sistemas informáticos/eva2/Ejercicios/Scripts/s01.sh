#!/bin/sh

						#SCRIPT - 01

#___ USER_INPUTIABLES ______________________________________

 USER_INPUT=null
 
#___________________________________________________________


#___ READ-IN _______________________________________________

 echo "Introduce un valor..."
 read USER_INPUT

#___________________________________________________________


#___ PRINT-OUT _____________________________________________

 clear
 echo "Has introducido '$USER_INPUT'"
 echo "[Mayúsculas]: `echo $USER_INPUT | tr [:lower:] [:upper:]`"
 echo "[Minúsculas]: `echo $USER_INPUT | tr [:upper:] [:lower:]`"
 echo ""

#___________________________________________________________
