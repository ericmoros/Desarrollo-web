import java.util.Scanner;

public class H1_Ej2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int num1, num2, result;
		
		
			System.out.println("Introduce un n�mero");
			num1 = keyboard.nextInt();
			
			System.out.println("Introduce un n�mero");
			num2 = keyboard.nextInt();
		
			
				result = num1  + num2;
					System.out.println( "La suma de " + num1 + " y " + num2 + " es: " + result);
				
				result = num1 - num2;
					System.out.println( "La resta de " + num1 + " y " + num2 + " es: " + result);
				
				result = num1 * num2;
					System.out.println( "El producto de " + num1 + " y " + num2 + " es: " + result);
				
				result = num1 / num2;
					System.out.println( "La divisi�n de " + num1 + " y " + num2 + " es: " + result);
	}
}

/*
Proceso H1_Ej2
	Definir num1, num2, result Como Real;
	
	
	Escribir "Introduce un n�mero";
	Leer num1;
	
	Escribir "Introduce un n�mero";
	Leer num2;
	
	
	result <- num1 + num2;
	Escribir "La suma de ", num1, " y ", num2, " es: ", result;
	
	result <- num1 - num2;
	Escribir "La resta de ", num1, " y ", num2, " es: ", result;
	
	result <- num1 * num2;
	Escribir "El producto de ", num1, " y ", num2, " es: ", result;
	
	result <- num1 / num2;
	Escribir "La divisi�n de ", num1, " y ", num2, " es: ", result;
FinProceso
 */
