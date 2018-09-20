import java.util.ArrayList;
import java.util.Scanner;

public class Console {
	private static Scanner keyboard = new Scanner(System.in);

	// print
	public static void print(String str) {
		System.out.print(str);
	}

	public static void print(Integer integer) {
		System.out.print(integer);
	}

	public static void print(Exception exception) {
		System.out.print(exception);
	}

	public static void print(ArrayList<String> strList) {
		for (String str : strList) {
			print(str);
		}
	}

	// readEnter
	public static String readEnter() {
		String str = "";
		str = keyboard.nextLine();
		return str;
	}
	
	//printMenu
	public static void printMenu() {
		print(Text.menu);
	}
}
