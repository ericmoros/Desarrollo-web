import java.util.Scanner;

public class H1_Ej9 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int num1;
		
			
			System.out.println("Introduce un número");
			num1 = keyboard.nextInt();
			
				
				System.out.println();
			
				if (num1 % 2 == 0) {
					System.out.print(num1 + " es par");
				} else {
					System.out.print(num1 + " es impar");
				}
	}
}

/* TEMPORAL!!!!
Proceso H1_Ej9
	Definir num1 Como Entero;
	
	
		Escribir "Introduce un número";
		Leer num1;
	
		
			Escribir "";
				
			Si num1 % 2 == 0 Entonces
				Escribir num1, " es par";
			SiNo
				Escribir num1, " es impar";
			Fin Si
FinProceso
 */
