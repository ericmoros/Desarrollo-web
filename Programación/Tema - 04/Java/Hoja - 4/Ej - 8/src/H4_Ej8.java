import java.util.Scanner;

public class H4_Ej8 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		String inputText;
		int inputLength;
		boolean inputStatus = false;
		
		short inputNum;
		
		char foundChar;
		String generatedText = "";
		
		//CODIFICADO
		do {
			System.out.println("Introduce una frase en mayúsculas: ");
			inputText = keyboard.nextLine();
			
			inputLength = inputText.length();
			generatedText = "";
			
			for (int position = 0; position < inputLength; position++) {
				foundChar = inputText.charAt(position);
				
				if (foundChar != ' ') {
					int asciiChar = (int) foundChar;
					
					if (asciiChar >= 65 && asciiChar <= 90) {
						generatedText += foundChar;
					}
				}
			}
			
			if (generatedText.equals(inputText)) {
				inputStatus = true;
			} else {
				generatedText = "";
			}
		} while (inputStatus == false);
		
		
		do {
			System.out.println("Introduce un número entre 1 y 10: ");
			inputNum = keyboard.nextShort();
		} while (inputNum < 1 || inputNum > 10);
		
		
		generatedText = "";
		for (int position = 0; position < inputLength; position++) {
			foundChar = inputText.charAt(position);
			
			if (foundChar != ' ') {
				generatedText += (char) (foundChar + inputNum);
			}
		}
		
		
		System.out.println(generatedText);
		
		
		//DECODIFICADO
		inputStatus = false;
		
		do {
			System.out.println("Introduce una frase en mayúsculas: ");
			inputText = keyboard.nextLine();
			
			inputLength = inputText.length();
			generatedText = "";
			
			for (int position = 0; position < inputLength; position++) {
				foundChar = inputText.charAt(position);
				
				if (foundChar != ' ') {
					int asciiChar = (int) foundChar;
					
					if (asciiChar >= 65 && asciiChar <= 90) {
						generatedText += foundChar;
					}
				}
			}
			
			if (generatedText.equals(inputText)) {
				inputStatus = true;
			} else {
				generatedText = "";
			}
		} while (inputStatus == false);
		
		
		do {
			System.out.println("Introduce un número entre 1 y 10: ");
			inputNum = keyboard.nextShort();
		} while (inputNum < 1 || inputNum > 10);
		
		
		generatedText = "";
		for (int position = 0; position < inputLength; position++) {
			foundChar = inputText.charAt(position);
			
			if (foundChar != ' ') {
				generatedText += (char) (foundChar - inputNum);
			}
		}
		
		
		System.out.println(generatedText);
	}
}

/*
Leer una frase filtrándola a que todos sus caracteres sean mayúsculas, una vez filtrada y
dado un numero entre 1 y 10 haga un cifrado de la frase (denominado cifrado CESAR) del
modo siguiente , si el numero por ejemplo es 3, transforme la frase de manera que cada
carácter se transforme en 3 códigos ASCII mas es decir :
Frase inicial PROGRAMACION resultado SURJUDPDFLRQ.
Desarrollar los programas de codificar y descodificar mediante dos funciones.
*/