Proceso H3Ej13
	Definir num, max, result como Entero;
	
	max <- 100;
	result <- 0;
	
	Para num <- 0 Hasta max Con Paso 1 Hacer
		Escribir num;
		Si num % 2 == 0 Entonces
			result <- result + num;
		Fin Si
		Si num % 3 == 0 Entonces
			result <- result + num;
		Fin Si
	Fin Para
	
	Escribir "";
	Escribir "[Suma multiplos]";
	Escribir " - 2 y 3: ", result;
FinProceso