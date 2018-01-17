import java.util.ArrayList;
import java.util.HashMap;

public class Convert {
	private static HashMap<String, Integer> monthMap =  new HashMap<String, Integer>(){///No me gusta
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
	
	private static ArrayList<String> monthList = new ArrayList<String>(){
		{
			ArrayList<String> monthList = new ArrayList<>();
			
			for (String month: monthMap.keySet()) {
				monthList.add(month);
			}
		}
	};
	
	public static Integer stringNumber (String str) {
		Integer number = Integer.parseInt(str);
		return number;
	}
	
	private static Date textDatetoDate (String day, String month, String year) {
		Date date;
		Integer nDay;
		Integer nMonth;
		Integer nYear;
		
		nDay   = stringNumber(day);
		nMonth = monthMap.get(month);
		nYear  = stringNumber(year);
		
		date = new Date (nDay, nMonth, nYear);
		
		return date;
	}
	
	public static Date textDate (String text) {
		Date date;
		String day;
		String month;
		String year;
		
		
		
		return null; //HERE!!!!!
	}
	
	public static Integer dateToNumber (Date date) {
		//Date
		Integer day		= date.getDay();
		Integer month	= date.getMonth();
		Integer year	= date.getYear();
		
		//Num
		Integer number = 0;
		
		for (Integer yearPos = 0; yearPos < year; yearPos++) {
			for (Integer monthPos = 1; monthPos <= 12; monthPos++) {
				switch (monthPos) {
					//31
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						number += 31;
						break;
					//30
					case 4:
					case 6:
					case 9:
					case 11:
						number += 30;
						break;
					//29 o 28
					case 2:
						if (year % 4 == 0 ) { ////////////////
							number += 29;
						} else {
							number += 28;
						}
				}
			}
		}
		
		for (Integer monthPos = 1; monthPos < month; monthPos++) {
			switch (monthPos) {
				//31
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					number += 31;
					break;
				//30
				case 4:
				case 6:
				case 9:
				case 11:
					number += 30;
					break;
				//29 o 28
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
