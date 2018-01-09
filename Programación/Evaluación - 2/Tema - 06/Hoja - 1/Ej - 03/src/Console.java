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
		String str = keyboard.nextLine();
		return str;
	}
	
	//printDate
	public static String printDate() {
		String date = "" + Date.getDay() + Date.getMonth() + Date.getYear();
		return date;
	}
	
	//setDate
	public static void setDate() {
		
	}
}
