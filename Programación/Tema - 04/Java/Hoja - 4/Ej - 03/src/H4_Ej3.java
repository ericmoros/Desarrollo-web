import java.util.Scanner;
public class H4_Ej3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		String input_text;
		int input_length;
		char input_char;
		int input_word = 1;
		String input_text_word;
		String word = "";
		boolean word_status;
		
			System.out.println("Introduce una frase: ");
			input_text = keyboard.nextLine();
			
			System.out.println("Buscar palabra: ");
			input_text_word = keyboard.nextLine();
		
			
				input_length = input_text.length();
		
				
				System.out.println("\nLista de palabras insertadas en la frase (delimitadas por espacios)");
				
					System.out.print(" - Palabra 1: ");
					word_status = false;
					for (int position = 0; position < input_length && word_status == false; position++) {
						input_char = input_text.charAt(position);
						
							if (input_char == ' ') {
								input_word++;
								//System.out.print("\n - Palabra " + input_word + ": ");
							} else {
								System.out.print(input_char);
								
								
								word += input_char;
								
								if (word.equals(input_text_word)) {
									System.out.print("\n" + word);
									word_status = true;
								}
							}
					}
					System.out.print("\nI'm fake: " + word);
	}
}