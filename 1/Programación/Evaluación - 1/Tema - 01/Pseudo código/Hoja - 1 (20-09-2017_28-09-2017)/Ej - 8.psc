Proceso H1_Ej8
	Definir amount, discount Como Real;
	Definir month Como Texto;
	
	
		Escribir "Introduce el importe";
		Leer amount;
	
		Escribir "Introduce el mes";
		Leer month;
	
		
		discount <- 15;
		
			Si month == "Octubre" && amount > 0 Entonces
				amount <- amount - discount * amount / 100;
				Escribir "";
				Escribir "Como estamos a ", month;
				Escribir " Le aplicaremos un descuento del ", discount, "%";
			Fin Si
			
			
				Escribir "";
				Escribir "";
				Escribir "Importe final: ", amount, "€";
FinProceso