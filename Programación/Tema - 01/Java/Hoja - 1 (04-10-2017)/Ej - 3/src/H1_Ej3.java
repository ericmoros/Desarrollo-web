import java.util.Scanner;

public class H1_Ej3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int num1, num2;
		
		
			System.out.println("Introduce un n�mero");
			num1 = keyboard.nextInt();
			
			System.out.println("Introduce un n�mero");
			num2 = keyboard.nextInt();
		
			
				if (num1 == num2){
					System.out.println("Los n�meros son iguales");
				} else if (num1 > num2) {
					System.out.println("El primer n�mero es mayor que el segundo");
				} else {
					System.out.println("No se a tenido en cuenta");
				}
	}
}

/*
Proceso H1_Ej3
	Definir num1, num2 Como Real;
	
	
	Escribir "Introduce un n�mero";
	Leer num1;
	
	Escribir "Introduce un n�mero";
	Leer num2;
	
	
	Si num1 == num2 Entonces
		Escribir "Los n�meros son iguales";
	Sino
		Si num1 > num2 Entonces
			Escribir "El primer n�mero es mayor que el segundo";
		Sino
			Si num1 < num2 Entonces
				Escribir "El primer n�mero es menor que el segundo";
			SiNo
				Escribir "No se a tenido en cuenta";
			FinSi
		FinSi
	FinSi
FinProceso
 */
