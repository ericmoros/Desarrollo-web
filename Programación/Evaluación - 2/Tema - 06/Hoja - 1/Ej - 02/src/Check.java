
public class Check {
	public static Boolean charNumber(char textChar) {
		if (textChar >= 48 || textChar <= 57) {
			return true;
		} else {
			return false;
		}
	}
	
	public static Boolean textChar(char textChar , char objetiveChar, Boolean ignoreCase) {
		if (textChar == objetiveChar) {
			return true;
		} else if (ignoreCase == true) {
			String formatedChar = "" + textChar;
			String formatedObjetiveChar = "" + objetiveChar;
			if (formatedChar.equalsIgnoreCase(formatedObjetiveChar)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
