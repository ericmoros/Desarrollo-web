import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
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
	 * En un objeto de clase HashSet.  En un objeto de clase LinkedHashSet.  En un
	 * objeto de clase TreeSet.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Integer ListLenght = null;
		ArrayList<Integer> numList = new ArrayList<>();

		HashSet<Integer> objHashSet = new HashSet<>();
		LinkedHashSet<Integer> objLinkedHashSet = new LinkedHashSet<>();
		TreeSet<Integer> objTreeSet = new TreeSet<>();

		ListLenght = (int) (Math.random() * (15 - 1) + 1);
		
		System.out.println("Generando " + ListLenght + " números aleatorios...");
		for (Integer actualNum = 0; actualNum < ListLenght; actualNum++) {
			numList.add((int) (Math.random() * (8000 - 1000 + 1) + 1000));
		}
		
		System.out.println(numList + "\n");
		
		for (Integer num: numList) {
			objHashSet.add(num);
			objLinkedHashSet.add(num);
			objTreeSet.add(num);
		}
		
		
		System.out.println("Valores de obj LinkedHashSet");
		for (Integer num: objHashSet) {
			System.out.print(num + " ");
		}
		System.out.println("\n");
		
		System.out.println("Valores de obj LinkedHashSet");
		for (Integer num: objLinkedHashSet) {
			System.out.print(num + " ");
		}
		System.out.println("\n");
		
		System.out.println("Valores de obj TreeSet");
		for (Integer num: objTreeSet) {
			System.out.print(num + " ");
		}
		System.out.println("\n");
		
		
		System.out.print("\t\t\t\t  ");
		for (Integer num: numList) {
			System.out.printf("%-6d",numList.indexOf(num) );
		}
		System.out.println("\nValores de objHashSet:\t\t" + objHashSet);
		System.out.println("Valores de objLinkedHashSet:\t" + objLinkedHashSet);
		System.out.println("Valores de objTreeSet:\t\t" + objTreeSet);
	}

}
