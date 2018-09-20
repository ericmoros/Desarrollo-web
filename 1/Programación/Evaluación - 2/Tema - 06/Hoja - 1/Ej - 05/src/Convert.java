import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Convert {
//	private static ArrayList<Integer> asciiNumList = new ArrayList<Integer>() {//Repasar
//		{
//			add(48);
//			add(49);
//			add(50);
//			add(51);
//			add(52);
//			add(53);
//			add(54);
//			add(55);
//			add(56);
//			add(57);
//		}
//	};
	
	private static HashMap<String, Integer> monthMap = new HashMap<String, Integer>() {
		{
			put("Enero", 1);
			put("Febrero", 2);
			put("Marzo", 3);
			put("Abril", 4);
			put("Mayo", 5);
			put("Junio", 6);
			put("Julio", 7);
			put("Agosto", 8);
			put("Septiembre", 9);
			put("Octubre", 10);
			put("Noviembre", 11);
			put("Diciembre", 12);
		}
	};

	private static ArrayList<String> monthList = new ArrayList<String>() {
		{
			for (String month : monthMap.keySet()) {
				add(month);
			}
		}
	};

	public static Integer stringNumber(String str) {
		Integer number = Integer.parseInt(str);
		return number;
	}
	
	public static String numberString(Integer num) {
		String number = "" + num;
		return number;
	}

	private static Date textDateToDate(String day, String month, String year) {
		Date date;
		Integer nDay;
		Integer nMonth;
		Integer nYear;

		nDay = stringNumber(day);
		nMonth = monthMap.get(month);
		nYear = stringNumber(year);

		date = new Date(nDay, nMonth, nYear);

		return date;//here
	}

	public static Date textDate(String text) {
		String scanText = text;
		
		Date date;
		String day;
		String month;
		String year;
		
		
		
		day = Extract.strNumberRangeFromText(text, 1, 31);
		scanText = Extract.findTrimWord(scanText, Extract.strNumberRangeFromText(scanText, 1, 31));
		
		month = Extract.findTrimWord(scanText, Extract.wordFromText(text, monthList));
		
		year = "";
		for (Integer num: Extract.numberRange(1, 9)) {
			year += num;
		}
		
		return null;
	}

	public static Integer dateToNumber(Date date) {
		// Date
		Integer day = date.getDay();
		Integer month = date.getMonth();
		Integer year = date.getYear();

		// Num
		Integer number = 0;

		for (Integer yearPos = 0; yearPos < year; yearPos++) {
			for (Integer monthPos = 1; monthPos <= 12; monthPos++) {
				switch (monthPos) {
				// 31
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					number += 31;
					break;
				// 30
				case 4:
				case 6:
				case 9:
				case 11:
					number += 30;
					break;
				// 29 o 28
				case 2:
					if (year % 4 == 0) { ////////////////
						number += 29;
					} else {
						number += 28;
					}
				}
			}
		}

		for (Integer monthPos = 1; monthPos < month; monthPos++) {
			switch (monthPos) {
			// 31
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				number += 31;
				break;
			// 30
			case 4:
			case 6:
			case 9:
			case 11:
				number += 30;
				break;
			// 29 o 28
			case 2:
				if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) { ////////////////
					number += 29;
				} else {
					number += 28;
				}
			}
		}

		for (Integer dayPos = 0; dayPos < day; dayPos++) {
			number++;
		}

		return number;
	}
}
