
public class Check {
	public static Boolean charNumber(char textChar) {
		if (textChar >= 48 || textChar <= 57) {
			return true;
		} else {
			return false;
		}
	}

	public static Boolean textChar(char textChar , String objetiveChar) {
		if (objetiveChar.length() != 0 && textChar == objetiveChar.charAt(0)) {
			return true;
		} else {
			return false;
		}
	}
}
