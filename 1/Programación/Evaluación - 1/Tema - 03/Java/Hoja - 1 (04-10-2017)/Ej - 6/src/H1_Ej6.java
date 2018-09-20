import java.util.Scanner;

public class H1_Ej6 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		double num1, result;
		String output_text;
		
		
			System.out.println("Introduce un número");
			num1 = keyboard.nextInt();
			
			
				if (num1 <= 0) {
					output_text = "El número no puede ser igual o menor a 0";
				} else if (num1 > 0) {
					result = Math.pow(num1, 2);
						output_text = "\nLa potencia de " + num1 + " es: " + result;

					result = Math.sqrt(num1);
						output_text += "\n y su raid cuadrada " + result;
				} else {
					output_text = ("No se ha tenido en cuenta");
				}
				
				
					System.out.println(output_text);
	}
}

/*
Proceso H1_Ej6
	Definir num1, result Como Real;
	
	
	Escribir "Introduce un número";
	Leer num1;
	
	
	Si num1 > 0 Entonces
		result <- num1 ^ 2;
			Escribir "";
			Escribir "La potencia de ", num1, " es: ", result;
			
		result <- RC(num1);
			Escribir " y su raid cuadrada ", result;
	Sino
		Escribir "El número no puede ser igual o menor a 0";
		Escribir " o no se ha tenido en cuenta";
	FinSi
FinProceso
 */
