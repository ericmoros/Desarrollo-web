import java.util.ArrayList;
import java.util.Scanner;

public class H1_Ej15 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int nums_to_average = 0;
		int inputs = 0;
		int exit = -1;
		int sum = 0;
		int average;
		
			
		
			System.out.println(
					"Introduce una secuencia de n�meros delimitados por comas (1,2,9,8,15)"
					+ "\n[-1] Para dejar de a�adir n�meros a la media"
			);
			
				
				while (inputs != exit) {
					inputs = keyboard.nextInt();
					
					
					if (inputs != 0) {
						sum += inputs;
						
						
						nums_to_average ++;
						System.out.println(inputs);
					}
				}
				
					average = (sum / nums_to_average);
			
			
						System.out.println("La media de n�meros es: " + average);
	}
}

/*
	String unformated
	Array formated
	Integer result = 0
	Integer counter = 0
	Integer naturals_average

	Enviar "Introduce una secuencia de n�meros delimitados por comas (1,2,9,8,15)"
	Enviar "[Los n�meros negativos no se tendr�n en cuenta]"
	Introduce unformated


	Para Integer naturals_unformated: unformated.Delimitado_por(",")
		Si naturals % 2 es igual a 0 y naturals es diferente de -1
			A�adir naturals a formated
			counter + 1
		Si no
			Enviar "Se ha excluido" + naturals
	Para_fin

	Para  Integer naturals_formated: los n�meros almacenados en formated
			Enviar naturals_formated + "a�adido a la media"
			naturals_average = (naturals_formated / counter)
			result = (result + naturals_average)
	Para_fin

	Enviar "\nLa media da" + result
*/