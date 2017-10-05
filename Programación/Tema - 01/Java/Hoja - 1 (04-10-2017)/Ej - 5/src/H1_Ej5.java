import java.util.Scanner;

public class H1_Ej5 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int num1, num2, num3, result;
		
		
			System.out.println("Introduce un número");
			num1 = keyboard.nextInt();
			
			System.out.println("Introduce un número");
			num2 = keyboard.nextInt();
			
			System.out.println("Introduce un número");
			num3 = keyboard.nextInt();
		
			
				if (num1 < 0){
					result = num1 * num2 * num3;
					System.out.println("El producto de los tres números es: " + result);
				} else {
					result = num1 + num2 + num3;
					System.out.println("La suma de los tres números es: " + result);
				}
	}
}

/*
Proceso H1_Ej5
	Definir num1, num2, num3, result Como Real;
	
	
	Escribir "Introduce un número";
	Leer num1;
	
	Escribir "Introduce un número";
	Leer num2;
	
	Escribir "Introduce un número";
	Leer num3;
	
	
	Si num1 < 0 Entonces
		result <- num1 * num2 * num3;
			Escribir "El producto de los tres números es: ", result;
	Sino
		result <- num1 + num2 + num3;
			Escribir "La suma de los tres números es: ", result;	
	FinSi
FinProceso
 */
