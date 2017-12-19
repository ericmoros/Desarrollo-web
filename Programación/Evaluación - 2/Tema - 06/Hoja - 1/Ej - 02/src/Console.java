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

	
	public static String readEnter() {
		String str = keyboard.nextLine();
		return str;
	}
	
	

	public static void printTime (Clock clock) {
		print(clock.getDay());
		System.out.printf(" - %02d:%02d:%02d.%03d\n", clock.getHour() , clock.getMin() , clock.getSec(), clock.getMSec());
	}
	
	public static void setTime (Clock clock, String askText) {
		Boolean format = false;
		String inputText;
		do {
			print(askText);
			print("Formato: [00:00:00]");
			inputText = readEnter();
			
			if (Check.charNumber(inputText.charAt(0))) {
				if (Check.charNumber(inputText.charAt(1))) {
					if (Check.textChar(inputText.charAt(2), ":")) {
						if (Check.charNumber(inputText.charAt(3))) {
							if (Check.charNumber(inputText.charAt(4))) {
								if (Check.textChar(inputText.charAt(5), ":")) {
									if (Check.charNumber(inputText.charAt(6))) {
										if (Check.charNumber(inputText.charAt(7))) {
											clock.setHour(((inputText.charAt(0) - 48) * 10) + (inputText.charAt(1) - 48));
											clock.setMin(((inputText.charAt(3) - 48) * 10) + (inputText.charAt(4) - 48));
											clock.setSec(((inputText.charAt(6) - 48) * 10) + (inputText.charAt(7) - 48));
											clock.setMSec(0);
											
											format = true;
										}
									}
								}
							}
						}
					}
				}
			}
		} while (format != true);
	}
}
