Proceso H1_Ej3
	Definir num1, num2 Como Real;
	
	
	Escribir "Introduce un número";
	Leer num1;
	
	Escribir "Introduce un número";
	Leer num2;
	
	
	Si num1 == num2 Entonces
		Escribir "Los números son iguales";
	Sino
		Si num1 > num2 Entonces
			Escribir "El primer número es mayor que el segundo";
		Sino
			Si num1 < num2 Entonces
				Escribir "El primer número es menor que el segundo";
			SiNo
				Escribir "No se a tenido en cuenta";
			FinSi
		FinSi
	FinSi
FinProceso
