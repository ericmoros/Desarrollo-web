import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class H1_Ej11 {
	public static void main(String[] args) throws InterruptedException {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		Boolean access; //Si no uso el objeto no puedo comprobar luego si está vacio. Sry :C
		float access_score, access_score_min = (float) 6, access_score_max = (float) 10;
		String output_text, access_output_text = "Has sido admitido en el ciclo";
		
			
			System.out.print("¿Tienes el título de bachiller? (true/false)");
			access = keyboard.nextBoolean();
			
			
				if (access == true) {
					output_text = access_output_text;
				} else {
					
					System.out.print("\n¿Has realizado la prueba de acceso? (true/false)");
					access = keyboard.nextBoolean();
					
					
						if (access == true) {
							System.out.print(" Introduce la nota de tu prueba de acceso");
							access_score = keyboard.nextFloat();
							
								if (access_score >= access_score_min && access_score <= access_score_max) {
									access = true;
									output_text = access_output_text;
								} else {
									access = false;
									output_text = " Tu nota no es apta";
								}
						} else {
							output_text = "Necesitas el título de bachiller o realizar la prueba de acceso";
						}
				}
				
				
					if (access == true) {
						TimeUnit.SECONDS.sleep(2);
						System.out.println("\n\n" + "¡Felicidades!");
						TimeUnit.SECONDS.sleep(2);
					}
					
						System.out.println(" " + output_text);
	}
}

/*
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
*/
