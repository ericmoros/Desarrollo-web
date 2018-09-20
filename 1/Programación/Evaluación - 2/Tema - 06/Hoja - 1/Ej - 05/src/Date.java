
public class Date {
	private Integer day;
	private Integer month;
	private Integer year;
	
	
	Date (Integer day, Integer month, Integer year) {
		if (Check.date(day, month, year)) {
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
		if (Check.date(day, this.month, this.year)) {
			this.day = day;
		}
	}

	//Mes
	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		if (Check.date(this.day, month, this.year)) {
			this.month = month;
		}
	}

	//Año
	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		if (Check.date(this.day, this.month, year)) {
			this.year = year;
		}
	}
}
