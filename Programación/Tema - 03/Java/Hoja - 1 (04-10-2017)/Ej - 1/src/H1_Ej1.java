import java.util.Scanner;

public class H1_Ej1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int alumnos, ni�os, ni�as;
		double result;
		String output_text;

		
			System.out.println("Introduce la cantidad de ni�os");
			ni�os = keyboard.nextInt();
			
			System.out.println("Introduce la cantidad de ni�as");
			ni�as = keyboard.nextInt();
				
			
				alumnos = ni�os + ni�as;
			
				
				System.out.println(alumnos + ", " + ni�os + ", " + ni�as);
				
				
				output_text = "De los " + alumnos + " alumnos";
				
				result = (float) ni�os / (float) alumnos;
					output_text += (", " + result + " son ni�os");
					
				result = (ni�as / alumnos) * 100;
					output_text += (", " + result + " son ni�as");
				
			
					System.out.println(output_text);
	}
}

/*
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
*/