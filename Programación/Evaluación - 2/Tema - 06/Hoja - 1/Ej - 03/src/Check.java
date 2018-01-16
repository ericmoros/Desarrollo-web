import java.util.ArrayList;

public class Check {
	public static Boolean charNumber(Character textChar) {
		if (textChar >= 48 && textChar <= 57) {
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
	
	public static Boolean stringNumber(String text) {
		Integer textLenght = text.length();
		ArrayList<Character> charList = new ArrayList<>();
		ArrayList<Boolean> textCheck = new ArrayList<>();
		
		
		for (Integer charPos = 0; charPos < textLenght; charPos++) {
			charList.add(text.charAt(charPos));
		}
		
		for (Character textChar: charList) {
			if (charNumber(textChar)) {
				textCheck.add(true);
			} else {
				textCheck.add(false);
			}
		}
		
		if (textCheck.contains(false)) {
			return false;
		} else if (textCheck.contains(true)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static Boolean dateInList(String dateName) {
		if (Ultimate.list().contains(dateName)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public static Boolean date(Integer day, Integer month, Integer year) {

		Boolean checkDay = false;
		
		if (day >= 1 && year >= 0) {
			switch (month) {
				//31
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if (day <= 31) {
						checkDay = true;
					}
					break;
				//30
				case 4:
				case 6:
				case 9:
				case 11:
					if (day <= 30) {
						checkDay = true;
					}
					break;
				//29 o 28
				case 2:
					if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) { ////////////////
						if (day <= 29) {
							checkDay = true;
						}
					} else {
						if (day <= 28) {
							checkDay = true;
						}
					}
			}
			if (checkDay == true) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
