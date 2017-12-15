Proceso H1_Ej1
	Definir num1, num2, cache Como Real;
	
	
	Escribir "Introduce el primer número";
	Leer num1;
	
	Escribir "Introduce el segundo número";
	Leer num2;
	
	
	cache <- num1;
	num1 <- num2;
	num2 <- cache;
	
	
	Escribir "El primer número ahora es ", num1;
	Escribir "El segundo número ahora es ", num2;
FinProceso


