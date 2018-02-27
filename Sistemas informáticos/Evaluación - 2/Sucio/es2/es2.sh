#/bin/sh

USERFILES=$*
FINALFILE=./trabajadores.csv
rm $FINALFILE
for USERFILE in $USERFILES; do
	echo "[$USERFILE]"
	while read USERLINE; do
		FILENAME=${USERFILE%%.*}
		echo "$USERLINE$FILENAME;" >> $FINALFILE
		echo "$USERLINE$FILENAME;"
	done < $USERFILE
done
