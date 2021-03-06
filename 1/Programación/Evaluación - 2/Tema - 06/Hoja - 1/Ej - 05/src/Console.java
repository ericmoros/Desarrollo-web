import java.util.Scanner;

public class Console {
	private static Scanner keyboard = new Scanner(System.in);

	//print
	public static void print (String str) {
		System.out.print(str);
	}

	public static void print (Integer integer) {
		System.out.print(integer);
	}

	public static void print (Exception exception) {
		System.out.print(exception);
	}

	//readEnter
	public static String readEnter() {
		String str = "";
		str = keyboard.nextLine();
		return str;
	}
	
	//readDate
	public static Integer loopAskEnterStrToInt(String ask) {
		String str;
		Integer toInt;
		
		do {
			print(ask);
			str = readEnter();
		} while (! Check.stringNumber(str));
		
		toInt = Integer.parseInt(str);
		return toInt;
	}
	
	//printDate
	public static void printDate(Date date) {
		String strDate = "" + date.getDay() + "/" + date.getMonth() + "/" + date.getYear();
		print(strDate);
	}
	
	//printDateDay
	public static void printDateDay(Date date) {
		Integer dateDay = Convert.dateToNumber(date);
		print(dateDay);
	}
	
	public static void printMenu() {
		print(Text.menu);
	}
	
	//setDate
//	public static void setDate(Date date, Integer day, Integer month, Integer year) {
//		date = new Date(day, month, year);
//	}
}
