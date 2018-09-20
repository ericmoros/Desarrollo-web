#!/bin/sh

						#SCRIPT - 02

#___ APUNTES _______________________________________________

 # -eq → =
 # -ne → !=
 # -gt → >
 # -ge → >=
 # -lt → <
 # -le → <=
 
#___________________________________________________________


#___ USER_INPUTIABLES ______________________________________

 USER_INPUT_NUM=null
 USER_INPUT_NUM2=null
 USER_INPUT_CONTROL=false
 
#___________________________________________________________


#___ READ-IN _______________________________________________

 echo "Introduce un Número..."
 read USER_INPUT_NUM
 echo "Introduce otro Número..."
 read USER_INPUT_NUM2

#___________________________________________________________


#___ USER_INPUT_CONTROL ____________________________________

 if [ $USER_INPUT_NUM = `echo $USER_INPUT_NUM | egrep '^[0-9]*$')` ]; then 
	USER_INPUT_CONTROL = true
	echo "Hola"
 fi	

#___________________________________________________________


#___ PRINT-OUT _____________________________________________

 clear
 if [ $USER_INPUT_CONTROL = true ]; then
	 if [ $USER_INPUT_NUM -eq $USER_INPUT_NUM2 ]; then
		echo "$USER_INPUT_NUM es igual que $USER_INPUT_NUM2"
	 elif [ $USER_INPUT_NUM -lt $USER_INPUT_NUM2 ]; then
		echo "$USER_INPUT_NUM es menor que $USER_INPUT_NUM2"
	 else
		echo "$USER_INPUT_NUM es mayor que $USER_INPUT_NUM2"
	 fi
 else
	echo "La has liado solo quería números..."
 fi

#___________________________________________________________
