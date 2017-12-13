import java.util.Scanner;
public class H4_Ej4 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		String inputText;
		char inputChar;
		String text = null;
		int inputLenghtMax = 80;
		
		do {
			System.out.println("Introduce una frase: ");
			inputText = keyboard.nextLine();
		} while (inputText.length() > inputLenghtMax);
		
		do {
			System.out.println("¿Quieres el texto en mayusculas (M) o minusculas (m)?");
			inputChar = keyboard.next().charAt(0);
		} while (inputChar != 'M' && inputChar != 'm');
		
		switch (inputChar) {
			case 'M':
				text = inputText.toUpperCase();
				break;
			case 'm':
				text = inputText.toLowerCase();
				break;
		}
		
		System.out.println(text);
	}//main
}//class

/*a
Leer una cadena de hasta 80 caracteres y pasarla en función de una variable de opción a
mayúsculas ó a minúsculas e imprimir la cadena resultante
 */