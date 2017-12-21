
public class Check {
	public static Boolean charNumber(char textChar) {
		if (textChar >= 48 || textChar <= 57) {
			return true;
		} else {
			return false;
		}
	}
<<<<<<< HEAD
	
	public static Boolean textChar(char textChar , char objetiveChar, Boolean ignoreCase) {
		if (textChar == objetiveChar) {
=======

	public static Boolean textChar(char textChar , String objetiveChar) {
		if (objetiveChar.length() != 0 && textChar == objetiveChar.charAt(0)) {
>>>>>>> 6fbd630ea04ab6d9c134a8721d644833b26fbaeb
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
