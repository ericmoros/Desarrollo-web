import java.util.concurrent.TimeUnit;

public class Program {
	public static void countUp (Clock clock) {
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
	
	public static boolean countDown (Clock clock) {
		while (clock.getDay() > 0) {
			clock.downDay();
			clock.setHour(23);
			while (clock.getHour() > 0) {
				clock.downHour();
				clock.setMin(59);
				while (clock.getMin() > 0) {
					clock.downMin();
					clock.setSec(59);
					while (clock.getSec() > 0) {
						clock.downSec();
						clock.setMSec(999);
						while (clock.getMSec() > 0) {
							clock.downMSec();
							try {
								TimeUnit.MILLISECONDS.sleep(1);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
				}
			}
		}
		
		return true;
	}
	
}
