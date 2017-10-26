import java.util.Scanner;

public class H4_Ej6 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		String inputText;
		int inputLength;
		final int inputLenghtMax = 80;
		
		int vocals = 0;
		int consonants = 0;
		int nums = 0;
		
		char foundChar;
		
		do {
			System.out.println("Introduce una frase: ");
			inputText = keyboard.nextLine();
			
			inputLength = inputText.length();
		} while (inputLength > inputLenghtMax);
		
		
		for (int position = 0; position < inputLength; position++) {
			foundChar = inputText.charAt(position);
			if (foundChar != ' ') {
				int asciiChar = (int) foundChar;
				
				if (
					 (asciiChar == 97 || asciiChar == 101 ||asciiChar == 105 || asciiChar == 111 || asciiChar == 117) 
					 ||
					 (asciiChar == 65 || asciiChar == 69 || asciiChar == 73 || asciiChar == 79 || asciiChar == 85)
				   ) {
					vocals++;
				} else if (
					 (asciiChar >= 66 && asciiChar <= 90)
				   ) {
					consonants++;
				} else if (
					 (foundChar >= 0 || foundChar <= 9)
				   ) {
					nums++;
				}
			}
		}
		
		System.out.println(
		   "\n" + "Consonantes: " + consonants
		 + "\n" + "Vocales:     " + vocals
		 + "\n" + "Números:     " + nums
				
		);
	}
}

/*
Leer una frase por teclado (máximo 80) y a continuación escribir cuantas vocales,
consonantes y caracteres numéricos posee.
*/