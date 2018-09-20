import java.util.Scanner;

public class H1_Ej1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int alumnos, niños, niñas;
		double result;
		String output_text;

		
			System.out.println("Introduce la cantidad de niños");
			niños = keyboard.nextInt();
			
			System.out.println("Introduce la cantidad de niñas");
			niñas = keyboard.nextInt();
				
			
				alumnos = niños + niñas;
			
				
				System.out.println(alumnos + ", " + niños + ", " + niñas);
				
				
				output_text = "De los " + alumnos + " alumnos";
				
				result = (float) niños / (float) alumnos;
					output_text += (", " + result + " son niños");
					
				result = (niñas / alumnos) * 100;
					output_text += (", " + result + " son niñas");
				
			
					System.out.println(output_text);
	}
}

/*
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
*/