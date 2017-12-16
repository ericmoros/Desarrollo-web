import java.util.concurrent.TimeUnit;

public class Time implements Runnable {
	private static Clock clock = new Clock();
	
	@Override
	public void run() {
		while (clock.getDay() > -1) {
			while (clock.getHour() < 24) {
				while (clock.getMin() < 60) {
					while (clock.getSec() < 60) {
						while (clock.getMSec() < 1000) {
							try {
								TimeUnit.MILLISECONDS.sleep(1);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							clock.upMSec();
						}
						clock.upSec();
						clock.setMSec(0);
					}
					clock.upMin();
					clock.setSec(0);
				}
				clock.upHour();
				clock.setMin(0);
			}
			clock.upDay();
			clock.setHour(0);
		}
	}
	
	public Integer getDay() {
		return clock.getDay();
	}
	
	public Integer getHour() {
		return clock.getHour();
	}
	
	public Integer getMin() {
		return clock.getMin();
	}
	
	public Integer getSec() {
		return clock.getSec();
	}
	
	public Integer getMSec() {
		return clock.getMSec();
	}
}
