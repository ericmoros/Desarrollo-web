Proceso H1_Ej7
	Definir students, boys, girls Como Entero;
	Definir result Como Real;
	Definir output_text Como Texto;
	
	
		Escribir "Introduce la cantidad de ni�os";
		Leer boys;
	
		Escribir "Introduce la cantidad de ni�as";
		Leer girls;
	
	
			students <- boys + girls;
	
				Escribir "";
				Escribir "De los ", students, " alumnos";
	
	
					result <- (boys / students * 100);
						Escribir " ", result, "% son ni�os";
	
					result <- (girls / students * 100);
						Escribir " ", result, "% son ni�as";
FinProceso