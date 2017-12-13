import java.util.Scanner;

public class H4_Ej7 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		String inputText;
		int inputLength;
		
		int uppercase = 0;
		int lowercase = 0;
		int nums = 0;
		
		char foundChar;
		
		System.out.println("Introduce una frase: ");
		inputText = keyboard.nextLine();
		
		inputLength = inputText.length();
		
		for (int position = 0; position < inputLength; position++) {
			foundChar = inputText.charAt(position);
			
			if (foundChar != ' ') {
				int asciiChar = (int) foundChar;
				
				if (asciiChar >= 65 && asciiChar <= 90) {
					uppercase++;
				} else if (asciiChar >= 97 && asciiChar <= 122) {
					lowercase++;
				} else if (Character.isDigit(foundChar)) {
					nums++;
				}
			}
		}
		
		System.out.println(
		   "\n" + "Mayúsculas: " + uppercase
		 + "\n" + "Minúsculas: " + lowercase
		 + "\n" + "Números:    " + nums
		);
	}
}

/*
Leer una frase por teclado y escribir a continuación cuantas mayúsculas, minúsculas y
números contiene.
*/