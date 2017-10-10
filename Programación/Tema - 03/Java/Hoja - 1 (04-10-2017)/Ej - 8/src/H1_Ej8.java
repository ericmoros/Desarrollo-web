import java.math.BigDecimal;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class H1_Ej8 {
	public static void main(String[] args) throws InterruptedException {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		BigDecimal amount_converted;
		float amount;
		float discount = (float) 25;
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
				} else {
					System.out.println("\nNo le puedo aplicar el descuento");
				}
				
					amount_converted = new BigDecimal(amount).setScale(2, BigDecimal.ROUND_HALF_UP);
						TimeUnit.SECONDS.sleep(2);
						output_text = "Importe final: " + amount_converted + "€";
						
							System.out.print("\n\n" + output_text);
	}
}

/* TEMPORAL !!!!!
	Float importe
	Float descuento
	String mes


	Enviar "Introduce el importe"
	Introduce importe

	Enviar "Introduce el mes"
	Introduce mes


	Si mes es igual a "octubre" es mayor que 0
		descuento = 15

		importe = importe - (descuento / importe) * 100
			Enviar "Como estamos a " + mes
			Esperar 1 segundos
			Enviar "Le aplicaremos un descuento del" + descuento + "%"
			Esperar 1 segundos
			Enviar "Nuevo importe: " + importe

	Si no
		Enviar "No se puede aplicar el descuento"
 */
