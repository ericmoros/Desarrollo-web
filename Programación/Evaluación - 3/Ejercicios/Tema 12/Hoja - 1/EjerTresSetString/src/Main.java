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
		final String[] wordDic = {"Lapsus", "Tubería", "Cubierta", "Pepita", "Antorcha", "Viento", "Infusión", "Aspiradora", "Altiplano", "Pensar", "Comisaría", "Acomodador", "Barrio"};
		
		Integer ListLenght = null;
		ArrayList<String> wordList = new ArrayList<>();
		LinkedList<String> wordLinkedList = new LinkedList<>();

		ListLenght = (int) (Math.random() * (15) + 1);
		
		System.out.println("Generando " + ListLenght + " palabras aleatorias...");
		for (Integer actualWord = 0; actualWord < ListLenght; actualWord++) {
			wordList.add(wordDic[(int) (Math.random() * (13))]);
		}
		
		System.out.println(wordList + "\n");
		
		for (String word: wordList) {
			wordLinkedList.add(word);
		}
		
		
		System.out.println("Valores de obj ArrayList");
		for (String word: wordList) {
			System.out.print(word + " ");
		}
		System.out.println("\n");
		
		System.out.println("Valores de obj LinkedList");
		for (String word: wordLinkedList) {
			System.out.print(word + " ");
		}
		System.out.println("\n");
		
		
		
		System.out.println("\nValores de objHashSet:\t\t" + wordList);
		System.out.println("Valores de objLinkedHashSet:\t" + wordLinkedList);
	}

}
