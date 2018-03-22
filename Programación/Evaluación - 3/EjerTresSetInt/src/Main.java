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
		
		for (Integer actualNum = 0; actualNum < ListLenght; actualNum++) {
			numList.add((int) (Math.random() * (8000 - 1000 + 1) + 1000));
		}
		
		for (Integer num: numList) {
			objHashSet.add(num);
			objLinkedHashSet.add(num);
			objTreeSet.add(num);
		}
		
		System.out.println("\nLinkedHashSet");
		for (Integer num: objHashSet) {
			System.out.println(num);
		}
		
		System.out.println("\nLinkedHashSet");
		for (Integer num: objLinkedHashSet) {
			System.out.println(num);
		}
		
		System.out.println("\nTreeSet");
		for (Integer num: objTreeSet) {
			System.out.println(num);
		}
		
		
	}

}
