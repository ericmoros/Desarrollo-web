Proceso H1_Ej4
	Definir num1, num2, num3 Como Real;
	
	
	Escribir "Introduce un n�mero";
	Leer num1;
	
	Escribir "Introduce un n�mero";
	Leer num2;
	
	Escribir "Introduce un n�mero";
	Leer num3;
	
	
	Si num1 > num2 y num1 > num3 Entonces
		Escribir "El primer n�mero es mayor que el resto";
	Sino
		Si num2 > num1 y num2 > num3 Entonces
			Escribir "El segundo n�mero es mayor que el resto";
		Sino
			Si num3 > num1 y num3 > num2 Entonces
				Escribir "El tercer n�mero es mayor que el resto";
			SiNo
				Escribir "No se a tenido en cuenta";
			FinSi
		FinSi
	FinSi
FinProceso
