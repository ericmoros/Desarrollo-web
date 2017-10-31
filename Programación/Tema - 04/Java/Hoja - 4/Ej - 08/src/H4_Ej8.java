import java.util.Scanner;

public class H4_Ej8 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		String inputText;
		int inputLength;
		boolean inputStatus = false;
		
		short inputNum;
		
		char inputChar;
		
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
				
				int asciiChar = (int) foundChar;
				
				if (asciiChar >= 65 && asciiChar <= 90) {
					generatedText += foundChar;
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
		
		
		do {
			System.out.println("¿Codificar(C) o decodificar (D)?");
			inputChar = keyboard.next().charAt(0);
		} while (inputChar != 'C' && inputChar != 'D');
		
		
		
		generatedText = "";
		for (int position = 0; position < inputLength; position++) {
			foundChar = inputText.charAt(position);
			
			
			if (inputChar == 'C') {
				if (foundChar + inputNum > 90) {
					short overCoded = (short) ((foundChar + inputNum) - 90);
					generatedText += (char) (64 + overCoded);
				} else {
					generatedText += (char) (foundChar + inputNum);
				}
			} else if (inputChar == 'D') {
				if (foundChar - inputNum < 65) {
					short underCoded = (short) ((foundChar - inputNum) - 65);
					generatedText += (char) (91 + underCoded);
				} else {
					generatedText += (char) (foundChar - inputNum);
				}
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