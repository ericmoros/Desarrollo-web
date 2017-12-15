
public class Clock {
	public static Integer hour = 0, min = 0, sec = 0;
	
	Clock () {
		hour = 0;
		min = 0;
		sec = 0;
	}

	public static Integer getHour() {
		return hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}
	
	public void upHour () {
		hour++;
	}
	

	public Integer getMin() {
		return min;
	}

	public void setMin(Integer min) {
		this.min = min;
	}
	
	public void upMin () {
		min++;
	}
	

	public Integer getSec() {
		return sec;
	}

	public void setSec(Integer sec) {
		this.sec = sec;
	}
	
	public void upSec () {
		min++;
	}
}
