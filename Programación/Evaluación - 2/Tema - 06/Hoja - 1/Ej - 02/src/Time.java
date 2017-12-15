import java.util.concurrent.TimeUnit;

public class Time implements Runnable {
	private static Clock clock;
	
	public Time (Clock oneClock) {
		Clock clock = oneClock;
	}
	
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
}
