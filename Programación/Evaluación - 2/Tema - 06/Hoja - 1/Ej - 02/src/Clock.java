
public class Clock {
	private static Integer day, hour, min , sec, mSec;
	
	Clock () {
		day = 0;
		hour = 0;
		min = 0;
		sec = 0;
		mSec = 0;
	}

	public Integer getDay() {
		return day;
	}

	public void setDay(Integer day) {
		Clock.day = day;
	}
	
	public void upDay () {
		day++;
	}
	
	
	public Integer getHour() {
		return hour;
	}

	public void setHour(Integer hour) {
		Clock.hour = hour;
	}
	
	public void upHour () {
		hour++;
	}
	

	public Integer getMin() {
		return min;
	}

	public void setMin(Integer min) {
		Clock.min = min;
	}
	
	public void upMin () {
		min++;
	}
	

	public Integer getSec() {
		return sec;
	}

	public void setSec(Integer sec) {
		Clock.sec = sec;
	}
	
	public void upSec () {
		sec++;
	}	

	
	public Integer getMSec() {
		return mSec;
	}

	public void setMSec(Integer MSec) {
		Clock.mSec = MSec;
	}
	
	public void upMSec () {
		mSec++;
	}
}
