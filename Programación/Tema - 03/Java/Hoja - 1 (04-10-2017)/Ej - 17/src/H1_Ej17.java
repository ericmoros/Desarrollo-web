import java.util.Scanner;

public class H1_Ej17 { //INCOMPLETOOOO!!!!!
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int input_num = 0;
		int counter = 1;
		int sum = 0;
		int exit = 0;
		int max = 0;
		int min = 0;
		int average = 0;
		
		
			
			while (input_num != exit || counter == 0) {
				System.out.println("Introduce un n�mero");
				input_num = keyboard.nextInt();
				
				
					sum += input_num;
					average = (sum / counter);
					
					
					if (input_num >= max) {
						max = input_num;
					} else if (input_num < min && counter == 1) {
						min = input_num;
					} else {
						min = input_num;
					}
					
					
						System.out.println(
								  "\nEl n�mero m�s peque�o es: " + min
								+ "\nEl n�mero m�s grande es: " + max
								+ "\nLa media es: " + average
								+ "\n"
								+ "\n[INFO] Para salir Introduce 0"
						);
						
						counter++;
			}
	}
}

/* INCOMPLETOOOO!!!!!
	Integer number
	Integer max = 0
	Integer min = 0
	Integer percentage
	Integer average = 0
	Integer counter = 0


	Mientras number != 0, counter++
		Enviar "\nIntroduce un n�mero"
		Introduce number


		percentage = (number / counter)
		average = (average + percentage)


		Si number >= max
			max = number
		y Si number <= min y adem�s counter != 1
			min = number
		Si no
			min = number


		Enviar "\nEl n�mero m�s peque�o es: " + min
		Enviar "\nEl n�mero m�s grande es: " + max
		Enviar "\nLa media es: " + average


		Enviar "[INFO] Para salir Introduce 0"
	Mientras_fin
*/