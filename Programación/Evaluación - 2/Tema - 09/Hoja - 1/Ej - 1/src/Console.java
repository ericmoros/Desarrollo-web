import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Console {
	private static Scanner keyboard = new Scanner(System.in);

	//print
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
	
	//error
	public static void printError(String str) {
		System.err.println(str);
	}
	
	//printMenu
	public static void printMenu() {
		print(Text.menu);
	}

		
	//readEnter
	public static String readEnter() {
		String str = "";
		str = keyboard.nextLine();
		return str;
	}
	

	//readInteger
	public static Integer readInteger() {
		Pattern justNums = Pattern.compile("\\d+");
		String str = null;
		
		str = keyboard.nextLine();
		
		if (Check.matchPattern(justNums, str) ) {
			return Integer.parseInt(str);
		} else {
			return null;
		}
	}
	
	public static Float readFloat() {
		Pattern justNums = Pattern.compile("\\d+\\.\\d+");
		String str = null;
		
		str = keyboard.nextLine();
		
		if (Check.matchPattern(justNums, str) ) {
			return Float.parseFloat(str);
		} else {
			return null;
		}
	}
}
