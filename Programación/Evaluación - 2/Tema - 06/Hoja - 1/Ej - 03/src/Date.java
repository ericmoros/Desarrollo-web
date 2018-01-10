
public class Date {
	private Integer day;
	private Integer month;
	private Integer year;
	
	
	Date (Integer day, Integer month, Integer year) {
		if (date(day, month, year)) {
			this.day	= day;
			this.month	= month;
			this.year	= year;
		}
	}

	
	//Día
	public Integer getDay() {
		return day;
	}

	public void setDay(Integer day) {
		if (date(day, this.month, this.year)) {
			this.day = day;
		}
	}

	//Mes
	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		if (date(this.day, month, this.year)) {
			this.month = month;
		}
	}

	//Año
	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		if (date(this.day, this.month, year)) {
			this.year = year;
		}
	}
		
	private Boolean date(Integer day, Integer month, Integer year) {
		Boolean checkDay = false;
		
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
