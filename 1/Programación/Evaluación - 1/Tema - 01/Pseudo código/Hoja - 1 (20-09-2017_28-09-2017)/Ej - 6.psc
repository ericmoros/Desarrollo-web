Proceso H1_Ej6
	Definir num1, result Como Real;
	
	
	Escribir "Introduce un número";
	Leer num1;
	
	
	Si num1 > 0 Entonces
		result <- num1 ^ 2;
			Escribir "";
			Escribir "La potencia de ", num1, " es: ", result;
			
		result <- RC(num1);
			Escribir " y su raid cuadrada ", result;
	Sino
		Escribir "El número no puede ser igual o menor a 0";
		Escribir " o no se ha tenido en cuenta";
	FinSi
FinProceso
