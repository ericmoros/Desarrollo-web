import java.util.Scanner;
import java.util.TreeSet;

/**
 * 
 */

/**
 * @author Eric Moros Pérez
 *
 */
public class Main {

	/**
	 *  Pida al usuario que introduzca un número indeterminado de palabras.
	 * La introducción de datos terminará cuando introduzca un “*”
	 * (que por supuesto no se tendrá en cuenta para hacer lo que se pide en el ejercicio).
	 *  Pida que se diga un número entero positivo num que no puede ser mayor que el número
	 * de palabras distintas que se han dado.  Muestre las num primeras palabras en orden
	 * alfabético de la lista de palabras que ha dado el usuario.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Integer inputNum = null;
		TreeSet<Integer> numTreeSet = new TreeSet<>();
		Scanner keyboard = new Scanner(System.in);

		while (true) {
			System.out.println("Introduce un número (-9999)");
			try {
				inputNum = keyboard.nextInt();
				
				if (inputNum != -9999) {
					numTreeSet.add(inputNum);
				} else {
					break;
				}
			} catch (Exception e) {
				System.err.println("El valor tiene que ser un número");
				keyboard.nextLine();
			}
		}
		
		System.out.println(numTreeSet);
	}
}
