Proceso H1_Ej5
	Definir num1, num2, num3, result Como Real;
	
	
	Escribir "Introduce un n�mero";
	Leer num1;
	
	Escribir "Introduce un n�mero";
	Leer num2;
	
	Escribir "Introduce un n�mero";
	Leer num3;
	
	
	Si num1 < 0 Entonces
		result <- num1 * num2 * num3;
			Escribir "El producto de los tres n�meros es: ", result;
	Sino
		result <- num1 + num2 + num3;
			Escribir "La suma de los tres n�meros es: ", result;	
	FinSi
FinProceso
