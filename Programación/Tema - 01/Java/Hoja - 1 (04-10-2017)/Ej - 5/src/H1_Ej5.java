import java.util.Scanner;

public class H1_Ej5 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int num1, num2, num3, result;
		
		
			System.out.println("Introduce un n�mero");
			num1 = keyboard.nextInt();
			
			System.out.println("Introduce un n�mero");
			num2 = keyboard.nextInt();
			
			System.out.println("Introduce un n�mero");
			num3 = keyboard.nextInt();
		
			
				if (num1 < 0){
					result = num1 * num2 * num3;
					System.out.println("El producto de los tres n�meros es: " + result);
				} else {
					result = num1 + num2 + num3;
					System.out.println("La suma de los tres n�meros es: " + result);
				}
	}
}

/*
Proceso H1_Ej5
	Definir num1, num2, num3, result Como Real;
	
	
	Escribir "Introduce un n�mero";
	Leer num1;
	
	Escribir "Introduce un n�mero";
	Leer num2;
	
	Escribir "Introduce un n�mero";
	Leer num3;
	
	
	Si num1 < 0 Entonces
		result <- num1 * num2 * num3;
			Escribir "El producto de los tres n�meros es: ", result;
	Sino
		result <- num1 + num2 + num3;
			Escribir "La suma de los tres n�meros es: ", result;	
	FinSi
FinProceso
 */
