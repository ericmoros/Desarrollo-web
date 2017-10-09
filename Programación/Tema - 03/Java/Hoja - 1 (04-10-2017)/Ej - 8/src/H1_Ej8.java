import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class H1_Ej8 {
	public static void main(String[] args) throws InterruptedException {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		Float amount;
		Float discount = (float) 15;
		String month;
		
			
			System.out.println("Introduce el importe");
			amount = keyboard.nextFloat();
			
			System.out.println("Introduce el mes");
			month = keyboard.next();
			
			
				if (month.equalsIgnoreCase("Octubre") && amount > 0) {
					amount -= (discount / amount) * 100;
					
					
					System.out.println("Como estamos a " + month);
					
					TimeUnit.SECONDS.sleep(2);
					
					System.out.println("Le aplicaremos un descuento del " + discount + "%");

					TimeUnit.SECONDS.sleep(2);
					
					System.out.println("Nuevo importe: " + amount);
					
				} else {
					System.out.println("No se puede aplicar el descuento");
				}
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
