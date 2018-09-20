#/bin/sh

if [ $# -gt 0 ]; then
	for PID_NAME ; do
		ps -e | grep " $PID_NAME$" | tr -s [:blank:] | cut -d' ' -f2 > PIDS.tmp
	done

	while
		read PID
	do
	        PROCESS_DATA=`ps -lp $PID 2> /dev/null`
        	if [ $? -eq 0 ]; then
                	PROCESS_DATA=`ps -lp $PID | tail -1 | tr -s [:blank:]`
	                PROCESS_NAME=`echo $PROCESS_DATA | cut -d' ' -f14`
	                FATHER=`echo $PROCESS_DATA | cut -d' ' -f5`
	                
			FATHER_DATA=`ps -lp $FATHER | tail -1 | tr -s [:blank:]`
        	        
			FATHER_NAME=`echo $FATHER_DATA | cut -d' ' -f14`
	                
			echo "Proceso: $PROCESS_NAME"
	                echo " - PID:     $PID"
        	        echo " - Padre:   $FATHER"
                	echo "  * Nombre: $FATHER_NAME"
			echo ""
	        else
        	        echo "[ERROR] El proceso $PID_NAME no existe"
	        fi
	done < PIDS.tmp

else
	echo "[ERROR] Has de introducir como mínimo el nombre de un proceso"
fi
