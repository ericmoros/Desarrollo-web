import java.util.ArrayList;

public class Extract {
	@SuppressWarnings("null")
	public static ArrayList<Integer> numberRange(Integer from, Integer to) {
		ArrayList<Integer> nums = null;
		
		for (Integer posNum = from; posNum <= to; posNum++) {
			nums.add(posNum);
		}
		
		return nums;
	}
	
	public static String wordFromText(String text, String word) {
		if (text.contains(word)) {
			return word;
		} else {
			return null;
		}
	}

	public static String wordFromText(String text, ArrayList<String> words) {
		String wordFound = null;

		for (String word : words) {
			if (text.contains(word)) {
				wordFound = word;
				break;
			}
		}

		return wordFound;
	}
	
	public static String strNumberRangeFromText(String text, Integer from, Integer to) {//////HERE!!!!!!
		String numFound = null;
		
		for (Integer num: numberRange(from, to)) {
			numFound = Convert.numberString(num);
			break;
		}
		
		return numFound;
	}

	public static ArrayList<String> wordsFromText(String text, ArrayList<String> words) {
		ArrayList<String> wordsFound = new ArrayList<>();

		for (String word : words) {
			words.add(wordFromText(text, word));
		}

		return wordsFound;
	}
	
	public static String findTrimWord (String text, String word) {
		String textTrimmed = text.replace(wordFromText(text, word), "");
		return textTrimmed;
	}
}
