Proceso H3Ej12
	Definir num, max, result2, result3 como Entero;
	
	max <- 100;
	result2 <- 0;
	result3 <- 0;
	
	Para num <- 0 Hasta max Con Paso 1 Hacer
		Escribir num;
		Si num % 2 == 0 Entonces
			result2 <- result2 + num;
		Fin Si
		Si num % 3 == 0 Entonces
			result3 <- result3 + num;
		Fin Si
	Fin Para
	
	Escribir "";
	Escribir "[Suma multiplos]";
	Escribir " - 2: ", result2;
	Escribir " - 3: ",result3;
FinProceso
