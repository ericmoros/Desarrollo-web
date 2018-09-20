
for PROGRAMS; do
	echo "$PROGRAMS: `ps -e | grep $PROGRAMS | cut -c1-6`"
done
