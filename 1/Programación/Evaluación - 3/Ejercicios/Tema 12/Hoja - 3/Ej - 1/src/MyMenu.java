import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.function.IntConsumer;

public class MyMenu {
	private final Main main;
	public TreeMap<Integer, IntConsumer> dansMethod(Integer i, IntConsumer aMethod) {
		TreeMap<Integer, IntConsumer> optionMethod = new TreeMap<>();
		optionMethod.put(i, aMethod);
		return optionMethod;
    }
    public MyMenu(Main instance) {
        main = instance;
    }
	private static String options = "1";
	private static Character option;
	private static Boolean exit = false;
	
	public static void main(String[] args) {
		while (true) {
			for (Integer optionPos = 0; optionPos < options.length(); optionPos++) {
				option = options.charAt(optionPos);
			}
			
			if (exit) break;

			options = Leer.pedirCadena("Introduce una o varias opciones");
			
		}
		
		selfdestruction();
	}
	
	private static void noOption(Character option) {
		System.err.println("La opción: '" + option + "' no existe");
		try {
			TimeUnit.MILLISECONDS.sleep(750);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private static String noOption(Character option, String optionNew) {
		noOption(option);
		if (optionNew.length() == 1) Leer.mostrarEnPantalla("Añadida la opción '" + optionNew + "' a la cola de trabajo");
		else Leer.mostrarEnPantalla("Añadida/s la/s opción/es \"" + optionNew + "\" a la cola de trabajo");
		try {
			TimeUnit.MILLISECONDS.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return optionNew;
	}

	private static void selfdestruction() {
		Leer.mostrarEnPantalla("Nos vemooos! :D");
		try {
			TimeUnit.MILLISECONDS.sleep(750);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.err.println("{Fin de programa}");
	}
}
