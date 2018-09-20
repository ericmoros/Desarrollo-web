import java.util.Scanner;

public class H1_Ej16 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		boolean password_status = false;
		int strikes = 0;
		int strikes_limit = 3;
		String password = "eureka";
		String input_text;
		String output_text = "";
		
			
			while (strikes < strikes_limit && password_status != true) {
				System.out.println("Introduce la contraseña");
				input_text = keyboard.next();
				
				
					if (input_text.equals(password)) {
						password_status = true;
					} else {
						strikes ++;
						System.out.println(
								"[AVISO] Intento fallido"
						    + "\n Restan: " + (strikes_limit - strikes)
						);
					}
			}
			
			
				if (password_status == true) {
						output_text += "\n[CORRECTO] Fin del programa...";
				} else {
						output_text += "\n[FALLO] Fin del programa...";
				}
				
			
					System.out.println(output_text);
	}
}

/*
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
*/