import java.util.Scanner;

public class H1_Ej1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int num1, num2, cache;
		
		
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

/*
Proceso H1_Ej1
	Definir num1, num2, cache Como Real;
	
	
	Escribir "Introduce el primer n�mero";
	Leer num1;
	
	Escribir "Introduce el segundo n�mero";
	Leer num2;
	
	
	cache <- num1;
	num1 <- num2;
	num2 <- cache;
	
	
	Escribir "El primer n�mero ahora es ", num1;
	Escribir "El segundo n�mero ahora es ", num2;
FinProceso
*/