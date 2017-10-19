Proceso H1_Ej15 //Hay veces que no va y no se porque... Si alquien encuetra el problema comentarme a ver
	Definir nums_to_average, inputs, exit, sum, average Como Entero;
	
	
		nums_to_average <- 0;
		inputs <- 0;
		exit <- -1;
		sum <- 0;
		
		
			Escribir "Introduce una secuencia de números delimitados por comas (1,2,9,8,15)";
			Escribir "[-1] Para dejar de añadir números a la media";
			
			
				Mientras (inputs != exit) Hacer
					Leer inputs;
					
						Si (inputs != exit) Entonces
							sum <- sum + inputs;
							
							
							nums_to_average <- nums_to_average + 1;
						Fin Si
				Fin Mientras
					
					average <- (sum / nums_to_average);
						Escribir "La media de números es: ", average;
FinProceso