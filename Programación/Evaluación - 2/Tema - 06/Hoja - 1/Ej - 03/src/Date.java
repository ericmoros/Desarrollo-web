
public class Date {
	private Integer day;
	private Integer month;
	private Integer year;
	
	
	Date (Integer day, Integer month, Integer year) {
		this.day	= day;
		this.month	= month;
		this.year	= year;
	}

	
	//Día
	public static Integer getDay() {
		return day;
	}

	public static void setDay(Integer day) {
		if (Control.date()) {
			this.days = day;
		}
		
	}

	//Mes
	public static Integer getMonth() {
		return month;
	}

	public static void setMonth(Integer month) {
		if (Control.date()) {
			this.month = month;
		}
	}

	//Año
	public static Integer getYear() {
		return year;
	}

	public static void setYear(Integer year) {
		if (Control.date()) {
			this.year = year;
		}
	}
	
	
	private  class Control {
		private  Integer day	= getDay();
		private  Integer month	= getMonth();
		private  Integer year	= getYear();
		
		public Boolean date() {
			Boolean checkDay	= false;
			Boolean checkMonth	= false;
			Boolean checkYear	= false;
			
			if (day >= 1) {
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
						if (year % 4 == 0) {
							if (day <= 29) {
								checkDay = true;
							}
						} else {
							if (day <= 28) {
								checkDay = true;
							}
						}
				}
			}
			
			
			return true;
		}
	}
}
