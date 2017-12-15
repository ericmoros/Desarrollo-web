Proceso H1_Ej17
	Definir input_num, counter, sum, exit, max, min Como Entero;
	Definir average Como Real;
	
	
		input_num <- 0;
		counter <- 1;
		sum <- 0;
		exit <- 0;
		max <- 0;
		min <- 0;
		average <- 0;
		
		
			Mientras input_num != exit || counter == 1 Hacer
				Escribir "Introduce un número";
				Leer input_num;
				
					Si input_num != exit Entonces
						Si input_num < min Entonces
							min = input_num;
						Fin Si
						Si counter == 1 Entonces
							min = input_num;
						FinSi
						
						Si input_num > max Entonces
							max = input_num;
						FinSi
						
						sum <- sum + input_num;
						average <- (sum / counter);
						
						
							Escribir "";
							Escribir "El número más pequeño es: ", min;
							Escribir "El número más grande es: ", max;
							Escribir "La media es: ", average;
							Escribir ""
							Escribir "[INFO] Para salir Introduce 0";
							
							counter <- counter + 1;
					FinSi
				Fin Mientras
FinProceso