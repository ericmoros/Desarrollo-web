Proceso H3Ej14
	Definir max, loop como Entero;
	Definir num, numMin, numMax Como Entero;
	
	max = 5;
	
	Escribir "Introduce 5 n�meros";
	Escribir " - ", 1, "�: "
	Leer num;
	numMin <- num;
	numMax <- num;
		
	Para loop <- 2 Hasta max Con Paso 1 Hacer
		Escribir " - ", loop, "�: "
		Leer num;
		
		Si num < numMin Entonces
			numMin <- num;
		FinSi
		
		Si num > numMin Entonces
			numMax <- num;
		FinSi
	Fin Para
	
	Escribir "";
	Escribir "Min: ", numMin;
	Escribir "Max: " numMax;
FinProceso