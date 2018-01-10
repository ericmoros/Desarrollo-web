
public class Convert {
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
					if (year % 4 == 0 ) { ////////////////
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
