Proceso H1_Ej1
	Definir num1, num2, cache Como Real;
	
	
	Escribir "Introduce el primer n�mero";
	Leer num1;
	
	Escribir "Introduce el segundo n�mero";
	Leer num2;
	
	
	cache <- num1;
	num1 <- num2;
	num2 <- cache;
	
	
	Escribir "El primer n�mero ahora es ", num1;
	Escribir "El segundo n�mero ahora es ", num2;
FinProceso


