import java.util.Scanner;

public class H1_Ej17 { //INCOMPLETOOOO!!!!!
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		boolean password_status = false;
		int number;
		int max = 0;
		int min = 0;
		int percentage;
		int average = 0;
		int counter = 0;
		
			
			while (number != 0) {
				System.out.println("Introduce un número");
				number = keyboard.nextInt();
				
				
					percentage = number * counter / 100;
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
		Enviar "\nIntroduce un número"
		Introduce number


		percentage = (number / counter)
		average = (average + percentage)


		Si number >= max
			max = number
		y Si number <= min y además counter != 1
			min = number
		Si no
			min = number


		Enviar "\nEl número más pequeño es: " + min
		Enviar "\nEl número más grande es: " + max
		Enviar "\nLa media es: " + average


		Enviar "[INFO] Para salir Introduce 0"
	Mientras_fin
*/