import java.util.Scanner;

public class H1_Ej13 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int nums_to_sum;
		int result = 0;
		
			
			System.out.println("Introduce la cantidad de números naturales a sumar");
			nums_to_sum = keyboard.nextInt();
			
			
			
				System.out.println("Lista de números a sumar:\n");
				
				for (int naturals = 1; naturals <= nums_to_sum; naturals++) {
					System.out.print(naturals);
					
					if (naturals < nums_to_sum) {
						System.out.print(", ");
					}
					
					result += naturals;
				}
				
					System.out.println("\n\nLa suma es: " + result);
	}
}

/* TEMPORAL !!!!
	Integer natural = 0, naturals_limit, result = 0
	Array naturals_list = new Array


	Enviar "Introduce la cantidad de números naturales a sumar"
	Introduce naturals_limit


	Mientras natural <= naturals_limit, natural++
		Insertar en naturals_list natural
	Mientras_fin


	Para  Integer naturals: los numeros almacenados en naturals_list
		result + naturals
	Para_fin


	Enviar "La suma da: " + result
 */
