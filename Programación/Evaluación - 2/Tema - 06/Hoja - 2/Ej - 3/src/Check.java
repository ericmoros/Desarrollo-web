import java.util.ArrayList;

public class Check {
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
