import java.util.Scanner;

public class H1_Ej1 {
	private static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		Integer num1, num2, cache;
		
		
			System.out.println("Introduce el primer n�mero");
			num1 = keyboard.nextInt();
		
			System.out.println("Introduce el segundo n�mero");
			num2 = keyboard.nextInt();
		
			
				cache = num1;
				num1 = num2;
				num1 = cache;
				
			
					System.out.println("El primer n�mero ahora es: " + num1);
					System.out.println("El segundo n�mero ahora es: " + num2);
	}
}
