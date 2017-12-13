Proceso H1_Ej11
	Definir access Como Lógico;
	Definir access_text_check Como Cadena;
	Definir access_score, access_score_min, access_score_max Como Real;
	Definir output_text, access_output_text Como Cadena;
	
	
		Escribir "¿Tienes el título de bachiller? (true/false)";
		Leer access_text_check;
			Si access_text_check == "true"  Entonces
				access <- Verdadero;
			SiNo
				access <- Falso;
			Fin Si
				
		
			access_output_text <- "Has sido admitido en el ciclo"
			
				Si access == Verdadero Entonces
					output_text <- access_output_text;
				SiNo
					Escribir "";
					Escribir "¿Has realizado la prueba de acceso? (true/false)";
					Leer access_text_check;
						Si access_text_check == "true"  Entonces
							access <- Verdadero;
						SiNo
							access <- Falso;
						Fin Si
					
						Si access == Verdadero Entonces
							Escribir " Introduce la nota de tu prueba de acceso";
							Leer access_score;
							
							
							access_score_min <- 6;
							access_score_max <- 10;
							
								Si access_score >= access_score_min && access_score <= access_score_max Entonces
									access <- Verdadero;
									output_text <- access_output_text;
								SiNo
									access <- Falso;
									output_text <- " Tu nota no es apta";
								Fin Si
						SiNo
							output_text <- "Necesitas el título de bachiller o realizar la prueba de acceso";
						Fin Si
				Fin Si
					
				
					Si access == Verdadero Entonces
						Escribir "";
						Escribir "";
						Escribir "¡Felicidades!";
					Fin Si
					
						Escribir " ", output_text;
FinProceso