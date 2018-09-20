import java.util.Scanner;

public class H1_Ej17 { //INCOMPLETOOOO!!!!!
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int input_num = 0;
		int counter = 1;
		int sum = 0;
		int exit = 0;
		int max = 0;
		int min = 0;
		int average = 0;
		
			
			while (input_num != exit || counter == 1) {
				System.out.println("Introduce un número");
				input_num = keyboard.nextInt();
				
				
					if (input_num != exit) {
						if (input_num < min) {
							min = input_num;
						} else if (counter == 1) {
							min = input_num;
						}
					
						if (input_num > max) {
							max = input_num;
						}
					
						sum += input_num;
						average = (sum / counter);
						
						
							System.out.println(
									  "\nEl número más pequeño es: " + min
									+ "\nEl número más grande es: " + max
									+ "\nLa media es: " + average
									+ "\n"
									+ "\n[INFO] Para salir Introduce 0"
							);
							
							counter++;
					}
			}
	}
}

/*
Proceso H1_Ej17
	Definir input_num, counter, sum, exit, max, min Como Entero;
	Definir average Como Real;
	
	
		input_num <- 0;
		counter <- 1;
		sum <- 0;
		exit <- 0;
		max <- 0;
		min <- 0;
		average <- 0;
		
		
			Mientras input_num != exit || counter == 1 Hacer
				Escribir "Introduce un número";
				Leer input_num;
				
					Si input_num != exit Entonces
						Si input_num < min Entonces
							min = input_num;
						Fin Si
						Si counter == 1 Entonces
							min = input_num;
						FinSi
						
						Si input_num > max Entonces
							max = input_num;
						FinSi
						
						sum <- sum + input_num;
						average <- (sum / counter);
						
						
							Escribir "";
							Escribir "El número más pequeño es: ", min;
							Escribir "El número más grande es: ", max;
							Escribir "La media es: ", average;
							Escribir ""
							Escribir "[INFO] Para salir Introduce 0";
							
							counter <- counter + 1;
					FinSi
				Fin Mientras
FinProceso
*/