Proceso H1_Ej18
	Definir num_from, num_to Como Entero;
	
		num_from <- 1;
		num_to <- 100;
		
		
			Escribir "Del ", num_from, " al ", num_to, " son multiplos de:";
		
			Escribir " [2]:";
			Para num <- num_from Hasta num_to Con Paso 1 Hacer
				Si num % 2 == 0 Entonces
					Escribir "    ", num;
				Fin Si
			Fin Para
			
			Escribir " [3]:";
			Para num <- num_from Hasta num_to Con Paso 1 Hacer
				Si num % 3 == 0 Entonces
					Escribir "    ", num;
				Fin Si
			Fin Para
FinProceso