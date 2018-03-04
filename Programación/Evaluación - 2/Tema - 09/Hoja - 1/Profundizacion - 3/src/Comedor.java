import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import utilidades.Leer;

public class Comedor {
	public static void main(String[] args) {
		//MENU
		final char optionMenu = '?';
		final char optionExit = 'x';
		
		String inputText = null;
		String optionBuffer = "0";
		Boolean exitProgram = false;
		Character option = null;
		
		//PROGRAMA
		Client client = new Client();
		Menu menu =
			new Menu("" + (Calendar.DAY_OF_WEEK), new Dish[] {
				new Dish("Pasta rellena", 5F, new String[]{
						"1 calabacín",
						"1 berenjena",
						"1 puerro",
						"1 pimiento rojo",
						"1 pimiento verde",
						"1 cebolla",
						"1 tomate",
						"1 manzana reineta",
						"Una pizca de sal",
						"2 cucharadas de azúcar",
						"2 cucharadas de aceite de oliva virgen extra"}),
				new Dish("Pasta rellena", 5F, new String[]{
						"1 calabacín",
						"1 berenjena",
						"1 puerro",
						"1 pimiento rojo",
						"1 pimiento verde",
						"1 cebolla",
						"1 tomate",
						"1 manzana reineta",
						"Una pizca de sal",
						"2 cucharadas de azúcar",
						"2 cucharadas de aceite de oliva virgen extra"}),
				new Dish("Pasta rellena", 5F, new String[]{
						"1 calabacín",
						"1 berenjena",
						"1 puerro",
						"1 pimiento rojo",
						"1 pimiento verde",
						"1 cebolla",
						"1 tomate",
						"1 manzana reineta",
						"Una pizca de sal",
						"2 cucharadas de azúcar",
						"2 cucharadas de aceite de oliva virgen extra"}),
				new Dish("Pasta rellena", 5F, new String[]{
						"1 calabacín",
						"1 berenjena",
						"1 puerro",
						"1 pimiento rojo",
						"1 pimiento verde",
						"1 cebolla",
						"1 tomate",
						"1 manzana reineta",
						"Una pizca de sal",
						"2 cucharadas de azúcar",
						"2 cucharadas de aceite de oliva virgen extra"}),
				new Dish("Pasta rellena", 5F, new String[]{
						"1 calabacín",
						"1 berenjena",
						"1 puerro",
						"1 pimiento rojo",
						"1 pimiento verde",
						"1 cebolla",
						"1 tomate",
						"1 manzana reineta",
						"Una pizca de sal",
						"2 cucharadas de azúcar",
						"2 cucharadas de aceite de oliva virgen extra"}),
				new Dish("Filete de ternera a la plancha", 5F, new String[]{
						"4 chuletones de ternera", 
						"4 patatas medianas", 
						"1 cebolla", 
						"1 pimiento verde italiano", 
						"4 pimientos hermosos rojos para asar", 
						"2 tomates hermosos para asar", 
						"Aceite de oliva virgen extra", 
						"Sal"})
				}
			)
		;
		
		while (! exitProgram) {
			while (optionBuffer.length() != 0) {
				option = getBufferOption(optionBuffer);
				
				switch (option) {
					case '0':
						welcome(client);
						optionBuffer += nextOption(inputText, optionBuffer, "¿Desea ver el menú?", "1");
						break;
					case '1':
						showMenu(menu);
						optionBuffer += nextOption(inputText, optionBuffer, "¿Quiere que le tome nota ahora?", "2");
						break;
					case '2':
						//selectMenu
						inProgress();
						client.setMenu(new Menu());
						
						
						inputText = "" + Leer.pedirEntero("¿Qué le gustaría tomar de primero?");
						client.getMenu().addDish(menu.getDish(Integer.parseInt(inputText) - 1));
						
						inputText = "" + Leer.pedirCadena("¿Y de segundo?");
						client.getMenu().addDish(menu.getDish(Integer.parseInt(inputText) - 1));
						
						showMenu(client.getMenu());
						
						break;
						
					//Referentes al menú
					case optionMenu:
						displayMenu(optionMenu, optionExit);
						break;
					case optionExit:
						exitProgram = endProgramProtocol(optionExit);
						break;
					default:
						optionUnknown(optionMenu, optionBuffer);
						break;
				}
				
				optionBuffer = optionBuffer.substring(1);
			}			
			
			optionBuffer = askOptions(inputText, optionBuffer, exitProgram);
		}
		
		endProgram();
	}

	private static void showMenu(Menu menu) {		
		Leer.mostrarEnPantalla(menu.showByConsole());
	}

	private static void welcome(Client client) {
		Leer.mostrarEnPantalla("Bienvenido...");
		
		client.setName(Leer.pedirCadena("\tNombre: "));
		client.setSurnames(Leer.pedirCadena("\tApellidos: "));
		
		Leer.mostrarEnPantalla("Bienvenido señor/a " + client.getSurnames() + ".");
	}

	private static String nextOption(String inputText, String optionBuffer, String ask, String nextOption) {
		inputText = Leer.pedirCadena(ask + " (s/any)");
		
		if (inputText.equalsIgnoreCase("s")) {
			optionBuffer = nextOption;
		} else {
			optionBuffer = "?";
		}
		return optionBuffer;
	}

	private static char getBufferOption(String optionBuffer) {
		String formatStr = "";
		formatStr += optionBuffer.charAt(0);
		formatStr.toLowerCase();
		return formatStr.charAt(0);
	}

	private static void inProgress() {
		Leer.mostrarEnPantalla("Pendiente");
	}

	private static void optionUnknown(final char optionMenu, String optionBuffer) {
		Leer.mostrarEnPantalla("Opción [" + optionBuffer.charAt(0) + "] no definida. [" + optionMenu + "] Para ver las opciones");
	}

	private static String askOptions(String inputText, String optionBuffer, Boolean exitProgram) {
		if (exitProgram != true) {
			inputText = Leer.pedirCadena("Introduce una o varias opciones");
			optionBuffer = inputText;
		}
		return optionBuffer;
	}

	private static void endProgram() {
		Leer.mostrarEnPantalla("Nos vemos ;D !!!!");
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.err.println("[Fin de programa]");
	}

	private static Boolean endProgramProtocol(final char optionExit) {
		Leer.mostrarEnPantalla("[¡Aviso! Fin de programa] Cuando el resto de opciones finalicen el programa se cerrará");
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	private static void displayMenu(final char optionMenu, final char optionExit) {
		Leer.mostrarEnPantalla(
							"+----------------------------+"
		  		   + "\n" + "|          Comedor           |"
		  		   + "\n" + "+----------------------------+"
		  		   + "\n" + "|  Pendiente                 |"
		  		   + "\n" + "|   1- Pendiente             |"
		  		   + "\n" + "+----------------------------+"
		  		   + "\n" + "|     " + optionMenu + "- Menú  "  + optionExit +"- Cerrar     |"
		  		   + "\n" + "+----------------------------+");
	}
}
