import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		Clock clock = new Clock();
		Time time = new Time(clock);
		Thread hands = new Thread(time);
		
		Console.print("Presiona [Enter] para iniciar tu reloj");
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		hands.start();
		
		Console.print("Presiona [Enter] para ver la hora");
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Console.print(clock.getHour() + "" + clock.getMin() + "" + clock.getSec());
		
	}
}
