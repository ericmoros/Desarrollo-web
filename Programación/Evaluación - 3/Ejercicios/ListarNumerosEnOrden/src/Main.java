import java.util.Scanner;
import java.util.TreeSet;

/**
 * 
 */

/**
 * @author Eric Moros P�rez
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer inputNum = null;
		TreeSet<Integer> numTreeSet = new TreeSet<>();
		Scanner keyboard = new Scanner(System.in);

		while (inputNum == null) {
			System.out.println("Introduce un n�mero (-9999)");
			try {
				inputNum = keyboard.nextInt();
			} catch (Exception e) {
				System.err.println("El valor tiene que ser un n�mero");
			}
		}
		
	}
}
