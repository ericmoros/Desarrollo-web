import java.util.Scanner;

public class H4_Ej10 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		String inputText;
		short inputMax = 60;
		
		int inputLength;
		boolean keyCheker = false;
		
		
		System.out.println("Introduce un texto en mayúsculas (60 max)");
		inputText = keyboard.nextLine();
		inputLength = inputText.length();
		
//		do {
			System.out.print("Comprobando formato: ");
			if (inputLength <= inputMax) {
				for (int checker = 0; checker < inputMax; checker++) {
					char actualChar = inputText.charAt(checker);
					if (actualChar >= 65 && actualChar <= 90 || actualChar.equals('L')) {
						System.out.print(actualChar);
					} else {
						System.out.println("\n [ERROR] La letra: " + (checker + 1) + " no es mayúscula");
						System.out.println("  - Letra: '" + actualChar + "'");
						checker = inputMax;
					}
				}
			} else {
				System.out.println("\n [ERROR] El tamaño es superior a " + inputMax + " carácteres");
				System.out.println("  - Carácteres: " + inputLength);
			}
			
			
//		} while ();
	}
}

/*
“1990H1AZ”
“1995M11?”

Escribir un programa que lea códigos de personas de 8 caracteres de modo que los cuatro
primeros sean numéricos y contenidos entre 1990-1995 (un año), el quinto carácter sea solo
(H ó M) sexo, el sexto un numero que representa el curso 1 ó 2 y los caracteres séptimo y
octavo pueden tener cualquier valor. Deben rechazarse los códigos que no cumplan estas
Ejercicios de cadenas
Pagina 2 de 2
condiciones, la finalización de entrada de códigos se produce cuando se introduce el código
“00000000”.  Al  final  el  programa  debe  sacar  un  informe  indicando  cuántos  hombres
y mujeres hay  matriculados  en  primero  y  segundo  y  cuántos  códigos  correctos  han 
sido leídos
*/