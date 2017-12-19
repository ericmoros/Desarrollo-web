import java.util.concurrent.TimeUnit;

public class Time implements Runnable {
	private static Clock clock;
	
	Time (Clock clock) {
		Time.clock = clock;
	}
	
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
}
