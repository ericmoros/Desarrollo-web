package test;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MyMenu {
	private static Map<Character, Runnable> options = new HashMap<>();
	private static Map<Character, String> optionsDesc = new HashMap<>();
	private static String optionsBuffer = "";
	private static String help = "";
	private static String defaultNoOptions = "";
	private static Boolean exit = false;
	
	public static void lauch() {
		Character option;
		while (true) {
			for (Integer optionPos = 0; optionPos < optionsBuffer.length(); optionPos++) {
				option = optionsBuffer.charAt(optionPos);
				
				if (options.containsKey(option)) options.get(option).run();
				else if (!defaultNoOptions.equals("")) noOption(option, defaultNoOptions);
				else noOption(option);
			}
			if (exit) break;
			optionsBuffer = askOptions();
		}
		
		selfdestruction();
	}
	
	public static void exit() {
		exit = false;
	}
	
	public static Map<Character, Runnable> getOptions() {
		return options;
	}

	public static Boolean setOptionsAndDesc(Map<Character, Runnable> options, Map<Character, String> optionsDesc) {
		if (options.size() == optionsDesc.size()) {
			MyMenu.options = options;
			MyMenu.optionsDesc = optionsDesc;
			return true;
		} else {
			return false;
		}
	}

	public static Map<Character, String> getOptionsDesc() {
		return optionsDesc;
	}

	public static String getOptionsBuffer() {
		return optionsBuffer;
	}

	public static void setOptionsBuffer(String optionsBuffer) {
		MyMenu.optionsBuffer = optionsBuffer;
	}

	public static String getHelp() {
		return help;
	}

	public static void setHelp(String help) {
		MyMenu.help = help;
	}

	public static String getDefaultNoOptions() {
		return defaultNoOptions;
	}

	public static void setDefaultNoOptions(String defaultNoOptions) {
		MyMenu.defaultNoOptions = defaultNoOptions;
	}

	public static void addOption(Character option, String desc, Runnable method) {
		options.put(option, method);
		optionsDesc.put(option, desc);
	}
	
	public static void deleteOption(Character option) {
		options.remove(option);
		optionsDesc.remove(option);
	}
	
	public static void printHelp() {
		System.out.println(help);
	}
	
	public static void setHelp(Character option) {
		String head =  "_ Menu ________________("+ option + "-Salir)__\n";
		String body =  "";
		String foot =  "__________________________________\n";
		
		for (Character actualOption : options.keySet()) {
			body += " " + actualOption + " - " + optionsDesc.get(actualOption) + "\n";
		}
		
		help = head + body + foot;
		options.put(option, () -> printHelp());
	}
	
	@SuppressWarnings("resource")
	private static String askOptions() {
		System.out.println("Introduce una o varias opciones");
		return new Scanner(System.in).nextLine();
	}
	
	private static void noOption(Character option) {
		System.err.println("La opción: '" + option + "' no existe");
		try {
			TimeUnit.MILLISECONDS.sleep(750);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private static void noOption(Character option, String optionNew) {
		noOption(option);
		
		for (Character actualOption : defaultNoOptions.toCharArray()) {
			if (options.containsKey(actualOption)) {
				System.out.println("Añadida la opción '" + optionNew + "' a la cola de trabajo");
				optionsBuffer += optionNew;	
			}
			else {
				System.err.println("La opción: '" + actualOption + "' no existe");
			}
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void selfdestruction() {
		System.out.println("Nos vemooos! :D");
		try {
			TimeUnit.MILLISECONDS.sleep(750);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.err.println("{Fin de programa}");
	}
}
