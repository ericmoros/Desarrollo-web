import java.util.Scanner;

public class Console {
	private static Scanner keyboard = new Scanner(System.in);
	
	public static void print (String str) {
		System.out.print(str);
	}

	public static void print (Integer integer) {
		System.out.print(integer);
	}

	public static void print (Exception exception) {
		System.out.print(exception);
	}


	public static void printTime (Clock clock) {
		Console.print(clock.getDay());
		System.out.printf(" - %02d:%02d:%02d.%03d\n", clock.getHour() , clock.getMin() , clock.getSec(), clock.getMSec());
	}

	public static void readEnter() {
		keyboard.nextLine();
	}
}
