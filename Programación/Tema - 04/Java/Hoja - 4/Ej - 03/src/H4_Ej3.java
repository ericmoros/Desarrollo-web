import java.util.Scanner;
public class H4_Ej3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		String input_text;
		String input_word;
		
		int input_length;
		char found_char;
		
		int actual_word = 1;
		String word = "";
		//boolean word_status = false;
		
		
			System.out.println("Introduce una frase: ");
			input_text = keyboard.nextLine();
			
			System.out.println("Buscar palabra: ");
			input_word = keyboard.nextLine();
		
			
				input_length = input_text.length();
		
				
				//System.out.println("\nLista de palabras insertadas en la frase (delimitadas por espacios)");
				System.out.println("\nBuscando la palabra " + input_word);
				
					//System.out.print(" - Palabra 1: ");
					//word_status = false;
					
					//for (int position = 0; position < input_length && word_status == false; position++) {
					for (int position = 0; position < input_length; position++) {
						found_char = input_text.charAt(position);
						
							if (found_char == ' ') {
								actual_word++;
								
								word = "";
							} else {
								word += found_char;
								
								if (word.equals(input_word)) {
									System.out.print("\n - Palabra " + actual_word + ": " + word);
									//word_status = true;
								}
							}
					}
						//System.out.print("\nI'm fake: " + word);
	}
}