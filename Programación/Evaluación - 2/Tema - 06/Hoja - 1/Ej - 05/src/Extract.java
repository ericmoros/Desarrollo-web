import java.util.ArrayList;

public class Extract {
	public static String wordFromText (String text, String word) {
		if (text.contains(word)) {
			return word;
		} else {
			return null;
		}
	}
	public static ArrayList<String> wordsFromText (String text, ArrayList<String> words) {
		ArrayList<String> wordsFound = new ArrayList<>();
		
		for (String word: words) {
			words.add(wordFromText(text, word));
		}
		
		return wordsFound;
	}
}
