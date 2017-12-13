import java.util.Scanner;
public class H4_Ej5 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		String inputText;
		int inputLength;
		final int inputLenghtMax = 80;
		
		char foundChar;
		int positionChar = 0;
		
		String textEven = "";
		String textOdd = "";
		
		do {
			System.out.println("Introduce una frase: ");
			inputText = keyboard.nextLine();
			
			inputLength = inputText.length();
		} while (inputLength > inputLenghtMax);
		
		for (int position = 0; position < inputLength; position++) {
			foundChar = inputText.charAt(position);
			if (foundChar != ' ') {
				if (positionChar % 2 == 0) {
					textEven += foundChar;
				} else {
					textOdd += foundChar;
				}
				
				positionChar++;
			}
		}
		
		System.out.println(
			  "\n" + "Letras en la frase" 
			+ "\n" + " - Pares: " + textEven
			+ "\n" + " - Impares: " + textOdd
		);
	}//main
}//class

/*
Leer una frase por teclado (máximo 80 car) y construir otras dos cadenas de forma que una
contenga los caracteres en posición par y la otra los caracteres en posición impar.
 */