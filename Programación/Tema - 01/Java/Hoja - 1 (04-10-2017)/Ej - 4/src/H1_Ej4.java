import java.util.Scanner;

public class H1_Ej4 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int num1, num2, num3;
		
		
			System.out.println("Introduce un n�mero");
			num1 = keyboard.nextInt();
			
			System.out.println("Introduce un n�mero");
			num2 = keyboard.nextInt();
			
			System.out.println("Introduce un n�mero");
			num3 = keyboard.nextInt();
		
			
				if (num1 > num2 && num1 > num3){
					System.out.println("El primer n�mero es mayor que el resto");
				} else if (num2 > num1 && num2 > num3) {
					System.out.println("El segundo n�mero es mayor que el resto");
				} else if (num3 > num1 && num3 > num2) {
					System.out.print("El tercer n�mero es mayor que el resto");
				} else {
					System.out.println("No se a tenido en cuenta");
				}
	}
}

/*
Proceso H1_Ej4
	Definir num1, num2, num3 Como Real;
	
	
	Escribir "Introduce un n�mero";
	Leer num1;
	
	Escribir "Introduce un n�mero";
	Leer num2;
	
	Escribir "Introduce un n�mero";
	Leer num3;
	
	
	Si num1 > num2 y num1 > num3 Entonces
		Escribir "El primer n�mero es mayor que el resto";
	Sino
		Si num2 > num1 y num2 > num3 Entonces
			Escribir "El segundo n�mero es mayor que el resto";
		Sino
			Si num3 > num1 y num3 > num2 Entonces
				Escribir "El tercer n�mero es mayor que el resto";
			SiNo
				Escribir "No se a tenido en cuenta";
			FinSi
		FinSi
	FinSi
FinProceso
 */
