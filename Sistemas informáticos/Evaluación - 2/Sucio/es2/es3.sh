#/bin/sh

FICHERO=trabajadores.csv
while
	read LINEA
do
	NOMBRE=`echo $LINEA | cut -d';' -f1,1`
	APE1=`echo $LINEA | cut -d';' -f2,2`
	APE2=`echo $LINEA | cut -d';' -f3,3`
	
	echo $NOMBRE
	echo $APE1
	echo $APE2
	#UP1=`echo $NOMBRE | cut -cl | tr "[[:upper:]]" "[[:lower:]]"`
	#UP2=`echo $NOMBRE | cut -cl | tr "[[:upper:]]" "[[:lower:]]"`
	#UP3=`echo $APE2 | cut -c1-3 | tr "[[:upper:]]" "[[:lower:]]"`

	#FIN3=`expr lenght $AP2`
	#INI3=`expr $FIN3 - 2`
	#UP3=`echo $AP2 | cut -c $INI3 - $FIN3 | tr "[[:upper:]]" "[[:lower:]]"`

	#USUARIO=`$UP1$UP2$UP3`
	#echo "Creando usuario para $NOMBRE $AP1 $AP2 ($USUARIO)"
done < $FICHERO

#sol1 dni al revés
#sol2 dni char impar
