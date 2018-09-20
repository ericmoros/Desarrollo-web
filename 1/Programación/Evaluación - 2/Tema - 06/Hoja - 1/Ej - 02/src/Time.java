public class Time implements Runnable {
	private static Clock clock;
	private static Boolean upDown;
	
	Time (Clock clock, Boolean upDown) {
		Time.clock = clock;
		Time.upDown = upDown;
	}
	
	@Override
	public void run() {
		if (upDown == true) {
			Program.countUp(clock);
		} else {
			Program.countDown(clock);
		}	
	}
}
