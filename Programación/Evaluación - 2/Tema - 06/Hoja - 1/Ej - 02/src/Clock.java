
public class Clock {
	private Integer day, hour, min , sec, mSec;
	
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
		this.day = day;
	}
	
	public void upDay () {
		day++;
	}
	
	
	public Integer getHour() {
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
		sec++;
	}	

	
	public Integer getMSec() {
		return mSec;
	}

	public void setMSec(Integer MSec) {
		this.mSec = MSec;
	}
	
	public void upMSec () {
		mSec++;
	}
}
