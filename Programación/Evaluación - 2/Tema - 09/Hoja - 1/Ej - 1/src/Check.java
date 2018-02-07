import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check {
	public static Boolean textChar(Character textChar , Character objetiveChar, Boolean ignoreCase) {
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
	
	public static Boolean matchPattern(Pattern pattern, String str) {
		Matcher m = pattern.matcher(str);
		if (m.matches() == true) {
			return true;
		} else {
			return false;	
		}
	}
}