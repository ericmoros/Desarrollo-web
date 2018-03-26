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
	 * @param args
	 */
	public static void main(String[] args) {
		final String[] wordDic = {"Lapsus", "Tubería", "Cubierta", "Pepita", "Antorcha", "Viento", "Infusión", "Aspiradora", "Altiplano", "Pensar", "Comisaría", "Acomodador", "Barrio"};
		
		Integer ListLenght = null;
		ArrayList<String> wordList = new ArrayList<>();

		HashSet<String> objHashSet = new HashSet<>();
		LinkedHashSet<String> objLinkedHashSet = new LinkedHashSet<>();
		TreeSet<String> objTreeSet = new TreeSet<>();

		ListLenght = (int) (Math.random() * (15 - 1) + 1);
		
		System.out.println("Generando " + ListLenght + " palabras aleatorias...");
		for (Integer actualWord = 0; actualWord < ListLenght; actualWord++) {
			wordList.add(wordDic[(int) (Math.random() * ( 13))]);
		}
		
		System.out.println(wordList + "\n");
		
		for (String str: wordList) {
			objHashSet.add(str);
			objLinkedHashSet.add(str);
			objTreeSet.add(str);
		}
		
		
		System.out.println("Valores de obj LinkedHashSet");
		for (String str: objHashSet) {
			System.out.print(str + " ");
		}
		System.out.println("\n");
		
		System.out.println("Valores de obj LinkedHashSet");
		for (String str: objLinkedHashSet) {
			System.out.print(str + " ");
		}
		System.out.println("\n");
		
		System.out.println("Valores de obj TreeSet");
		for (String str: objTreeSet) {
			System.out.print(str + " ");
		}
		System.out.println("\n");
		
		
		System.out.println("\nValores de objHashSet:\t\t" + objHashSet);
		System.out.println("Valores de objLinkedHashSet:\t" + objLinkedHashSet);
		System.out.println("Valores de objTreeSet:\t\t" + objTreeSet);
	}

}
