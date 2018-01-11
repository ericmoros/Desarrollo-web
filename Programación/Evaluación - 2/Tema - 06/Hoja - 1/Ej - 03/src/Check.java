
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
					if (year % 4 == 0 ) {
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
