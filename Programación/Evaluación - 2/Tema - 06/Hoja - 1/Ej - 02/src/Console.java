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
	
	public static void printHelp() {
		print("\n[S] Set time, [C] Countdown, [H] Help, [Enter] See clock\n");
	}

	public static void setTime (Clock clock, String askText) {
		Boolean format = false;
		String inputText;
		do {
			print(askText);
			print("\n"
					+ "Formato: [00:00:00]\n"
					+ "          "
					);
			inputText = readEnter();
<<<<<<< HEAD
			
			if (inputText.length() == 8) {
				if (Check.charNumber(inputText.charAt(0))) {
					if (Check.charNumber(inputText.charAt(1))) {
						if (Check.textChar(inputText.charAt(2), ':', false)) {
							if (Check.charNumber(inputText.charAt(3))) {
								if (Check.charNumber(inputText.charAt(4))) {
									if (Check.textChar(inputText.charAt(5), ':', false)) {
										if (Check.charNumber(inputText.charAt(6))) {
											if (Check.charNumber(inputText.charAt(7))) {
												Integer hour = ((inputText.charAt(0) - 48) * 10) + (inputText.charAt(1) - 48);
												Integer min  = ((inputText.charAt(3) - 48) * 10) + (inputText.charAt(4) - 48);
												Integer sec  = ((inputText.charAt(6) - 48) * 10) + (inputText.charAt(7) - 48);

												if (hour < 24) {
													if (min < 60) {
														if (sec < 60) {
															clock.setHour(hour);
															clock.setMin(min);
															clock.setSec(sec);
															clock.setMSec(0);

															format = true;
														}
													}
												}
=======
			if (inputText.length() == 8) {
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
>>>>>>> 6fbd630ea04ab6d9c134a8721d644833b26fbaeb
											}
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
