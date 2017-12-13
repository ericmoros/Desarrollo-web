Proceso H1_Ej7
	Definir students, boys, girls Como Entero;
	Definir result Como Real;
	Definir output_text Como Texto;
	
	
		Escribir "Introduce la cantidad de niños";
		Leer boys;
	
		Escribir "Introduce la cantidad de niñas";
		Leer girls;
	
	
			students <- boys + girls;
	
				Escribir "";
				Escribir "De los ", students, " alumnos";
	
	
					result <- (boys / students * 100);
						Escribir " ", result, "% son niños";
	
					result <- (girls / students * 100);
						Escribir " ", result, "% son niñas";
FinProceso