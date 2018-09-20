Proceso H1_Ej13
	Definir naturals, nums_to_sum, result Como Entero;
	
		result <- 0;
	
	
		Escribir "Lista de números a sumar: ";
		Leer nums_to_sum;
		
		
			Escribir "Lista de números a sumar:";
			Escribir "";
			
				Para naturals<-1 Hasta nums_to_sum Con Paso 1 Hacer
					Escribir "  ", naturals;
					
					
					result <- result + naturals;
				FinPara
				
					Escribir "";
					Escribir "";
					Escribir "La suma es: ", result;
FinProceso