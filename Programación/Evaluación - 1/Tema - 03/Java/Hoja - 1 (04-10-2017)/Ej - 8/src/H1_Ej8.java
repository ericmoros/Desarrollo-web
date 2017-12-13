import java.math.BigDecimal;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class H1_Ej8 {
	public static void main(String[] args) throws InterruptedException {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		BigDecimal amount_converted;
		float amount;
		float discount = (float) 15;
		String month;
		String output_text;
		
			
			System.out.println("Introduce el importe");
			amount = keyboard.nextFloat();
			
			System.out.println("Introduce el mes");
			month = keyboard.next();
			
			
				if (month.equalsIgnoreCase("Octubre") && amount > 0) {
					amount -= discount * amount / 100;
					
					System.out.println("\nComo estamos a " + month);
					
					TimeUnit.SECONDS.sleep(2);
					System.out.println(" Le aplicaremos un descuento del " + discount + "%");
				}
				
					amount_converted = new BigDecimal(amount).setScale(2, BigDecimal.ROUND_HALF_UP);
						TimeUnit.SECONDS.sleep(2);
						output_text = "Importe final: " + amount_converted + "€";
						
							System.out.print("\n\n" + output_text);
	}
}

/*
Proceso H1_Ej8
	Definir amount, discount Como Real;
	Definir month Como Texto;
	
	
		Escribir "Introduce el importe";
		Leer amount;
	
		Escribir "Introduce el mes";
		Leer month;
	
		
		discount <- 15;
		
			Si month == "Octubre" && amount > 0 Entonces
				amount <- amount - discount * amount / 100;
				Escribir "";
				Escribir "Como estamos a ", month;
				Escribir " Le aplicaremos un descuento del ", discount, "%";
			Fin Si
			
			
				Escribir "";
				Escribir "";
				Escribir "Importe final: ", amount, "€";
FinProceso
 */
