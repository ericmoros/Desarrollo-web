Proceso H1_Ej16
	Definir password_status Como Logico;
	Definir strikes, strikes_limit Como Entero;
	Definir password, input_text, output_text Como Cadena;
	
	
		password_status <- Falso;
		strikes <- 0;
		strikes_limit <- 3;
		password <- "eureka";
		output_text <- "";
		
		
			Mientras strikes < strikes_limit && password_status != Verdadero Hacer
				Escribir "Introduce la contraseña";
				Leer input_text;
				
				
					Si input_text == password Entonces
						password_status <- Verdadero;
					SiNo
						strikes = strikes + 1;
						Escribir "[AVISO] Intento fallido";
						Escribir " Restan: ", (strikes_limit - strikes);
					Fin Si
				Fin Mientras
				
				
					Si password_status == Verdadero Entonces
						output_text <- output_text + "[CORRECTO] Fin del programa...";
					SiNo
						output_text <- output_text + "[FALLO] Fin del programa...";
					Fin Si
				
				
						Escribir "";
						Escribir output_text;
FinProceso