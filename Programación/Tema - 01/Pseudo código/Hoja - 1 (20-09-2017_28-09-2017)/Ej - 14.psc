Proceso H1_Ej14
	Definir naturals, nums_to_sum, result Como Entero;
	
		result <- 0;
		
		
		Escribir "Lista de números a sumar: ";
		Leer nums_to_sum;
		
		
			nums_to_sum <- nums_to_sum * 2;
			
			
				Escribir "Lista de números a sumar:";
				Escribir "";
				
					Para naturals<-2 Hasta nums_to_sum Con Paso 2 Hacer
						Escribir "  ", naturals;
						
						
						result <- result + naturals;
					FinPara
					
						Escribir "";
						Escribir "";
						Escribir "La suma es: ", result;
FinProceso