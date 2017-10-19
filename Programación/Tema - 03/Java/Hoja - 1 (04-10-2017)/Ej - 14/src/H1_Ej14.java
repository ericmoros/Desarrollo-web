import java.util.Scanner;

public class H1_Ej14 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int nums_to_sum;
		int result = 0;
		
			
			System.out.println("Introduce la cantidad de números naturales a sumar");
			nums_to_sum = keyboard.nextInt();
			
			
			 nums_to_sum *= 2;
			
			
				System.out.println("Lista de números a sumar:\n");
				
				for (int naturals = 2; naturals <= nums_to_sum; naturals += 2) {
					System.out.print(naturals);
					
					if (naturals < nums_to_sum) {
						System.out.print(", ");
					}
					
					
					result += naturals;
				}
				
					System.out.println("\n\nLa suma es: " + result);
	}
}

/*
Proceso H1_Ej14
	Definir naturals, nums_to_sum, result Como Entero;
	
		result <- 0;
		
		
		Escribir "Lista de números a sumar: ";
		Leer nums_to_sum;
		
		
			nums_to_sum <- nums_to_sum * 2;
			
			
				Escribir "Lista de números a sumar:";
				Escribir "";
				
					Para naturals<-2 Hasta nums_to_sum Con Paso 2 Hacer
						Escribir "  ", naturals;
						
						
						result <- result + naturals;
					FinPara
					
						Escribir "";
						Escribir "";
						Escribir "La suma es: ", result;
FinProceso
*/