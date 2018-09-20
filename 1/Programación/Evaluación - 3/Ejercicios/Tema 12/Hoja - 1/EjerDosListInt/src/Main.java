import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
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
	 * @param args
	 */
	public static void main(String[] args) {
		Integer ListLenght = null;
		
		ArrayList<Integer> numList = new ArrayList<>();
		LinkedList<Integer> numLinkedList = new LinkedList<>();

		
		ListLenght = (int) (Math.random() * (15) + 1);
		
		System.out.println("Generando " + ListLenght + " números aleatorios...");
		for (Integer actualNum = 0; actualNum < ListLenght; actualNum++) {
			numList.add((int) (Math.random() * (15) + 1));
		}
		
		System.out.println(numList + "\n");
		
		for (Integer num: numList) {
			numLinkedList.add(num);
		}
		
		
		System.out.println("Valores de obj ArrayList");
		for (Integer num: numList) {
			System.out.print(num + " ");
		}
		System.out.println("\n");
		
		System.out.println("Valores de obj LinkedList");
		for (Integer num: numLinkedList) {
			System.out.print(num + " ");
		}
		System.out.println("\n");
		
		
		
		System.out.println("\nValores de objHashSet:\t\t" + numList);
		System.out.println("Valores de objLinkedHashSet:\t" + numLinkedList);
	}

}
