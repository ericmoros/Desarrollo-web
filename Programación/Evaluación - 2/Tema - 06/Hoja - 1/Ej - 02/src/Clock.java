
public class Clock {
	public static int hour, min , sec;
	
	Clock () {
		hour = 0;
		min = 0;
		sec = 0;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}
	
	public void upHour () {
		hour++;
	}
	

	public int getMin() {
		return min;
	}

	public void setMin(Integer min) {
		this.min = min;
	}
	
	public void upMin () {
		min++;
	}
	

	public int getSec() {
		return sec;
	}

	public void setSec(Integer sec) {
		this.sec = sec;
	}
	
	public void upSec () {
		sec++;
	}
}
