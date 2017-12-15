import java.util.concurrent.TimeUnit;

public class Time implements Runnable {
	private static Clock clock = new Clock();
	
	@Override
	public void run() {
		while (clock.getHour() < 24) {
			while (clock.getMin() < 60) {
				while (clock.getSec() < 60) {
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					clock.upSec();
				}
				clock.upMin();
			}
			clock.upHour();
		}
	}
	public int getHour() {
		return clock.getHour();
	}
	
	public int getMin() {
		return clock.getMin();
	}
	
	public int getSec() {
		return clock.getSec();
	}
}
