import java.util.Scanner;

public class H1_Ej10 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int num1 = 0;
		
			
			while (num1 == 0) {
				System.out.print("Introduce un número diferente de 0");
				num1 = keyboard.nextInt();
			}
			
				
				System.out.println();
			
				if (num1 % 2 == 0) {
					System.out.print(num1 + " es par");
				} else {
					System.out.print(num1 + " es impar");
				}
	}
}

/*
Proceso H1_Ej10
	Definir num1 Como Entero;
	
	
		num1 <- 0;
	
		Mientras num1 == 0 Hacer
			Escribir "Introduce un número diferente de 0";
			Leer num1;
		FinMientras
	
		
			Escribir "";
				
			Si num1 % 2 == 0 Entonces
				Escribir num1, " es par";
			SiNo
				Escribir num1, " es impar";
			Fin Si
FinProceso
 */
