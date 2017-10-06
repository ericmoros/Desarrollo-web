import java.util.Scanner;

public class H1_Ej1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int num1, num2, cache;
		
		
			System.out.println("Introduce el primer número");
			num1 = keyboard.nextInt();
		
			System.out.println("Introduce el segundo número");
			num2 = keyboard.nextInt();
		
			
				cache = num1;
				num1 = num2;
				num1 = cache;
				
			
					System.out.println("El primer número ahora es: " + num1);
					System.out.println("El segundo número ahora es: " + num2);
	}
}

/*
Proceso H1_Ej1
	Definir num1, num2, cache Como Real;
	
	
	Escribir "Introduce el primer número";
	Leer num1;
	
	Escribir "Introduce el segundo número";
	Leer num2;
	
	
	cache <- num1;
	num1 <- num2;
	num2 <- cache;
	
	
	Escribir "El primer número ahora es ", num1;
	Escribir "El segundo número ahora es ", num2;
FinProceso
*/