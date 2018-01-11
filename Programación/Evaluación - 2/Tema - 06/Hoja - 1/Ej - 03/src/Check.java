
public class Check {
	public static Boolean charNumber(char textChar) {
		if (textChar >= 48 && textChar <= 57) {
			return true;
		} else {
			return false;
		}
	}
	
	public static Boolean stringNumber(String text) {
		Integer textLenght = text.length();
		Boolean numCheck = true; 
		
		for (Integer charPos = 0; charPos < textLenght; charPos++) {
			if (charNumber(text.charAt(charPos)) != true) {
				numCheck = false;
				break;
			}
		}
		
		if (numCheck == true) {
			return true;
		} else {
			return false;
		}
	}
}
