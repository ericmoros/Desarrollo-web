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
		
		Menu menu = new Menu("Lunes", new Dish[] {
				new Dish("Pasta rellena", 5F, new String[]{
						"1 calabac�n",
						"1 berenjena",
						"1 puerro",
						"1 pimiento rojo",
						"1 pimiento verde",
						"1 cebolla",
						"1 tomate",
						"1 manzana reineta",
						"Una pizca de sal",
						"2 cucharadas de az�car",
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
		);
		
		while (! exitProgram) {
			while (optionBuffer.length() != 0) {
				option = getBufferOption(optionBuffer);
				
				switch (option) {
					case '0':
						optionBuffer += welcome(inputText, optionBuffer, client);
						break;
					case '1':
						Leer.mostrarEnPantalla(menu.showByConsole());
						break;
						
					//Referentes al men�
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

	private static String welcome(String inputText, String optionBuffer, Client client) {
		Leer.mostrarEnPantalla("Bienvenido...");
		
		client.setName(Leer.pedirCadena("\tNombre: "));
		client.setSurnames(Leer.pedirCadena("\tApellidos: "));
		
		Leer.mostrarEnPantalla("Bienvenido se�or/a " + client.getSurnames() + ".");
		inputText = Leer.pedirCadena("�Le gustar�a ver la carta? (s/any)");
		
		if (inputText.equalsIgnoreCase("s")) {
			optionBuffer = "1";
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
		Leer.mostrarEnPantalla("Opci�n [" + optionBuffer.charAt(0) + "] no definida. [" + optionMenu + "] Para ver las opciones");
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
		Leer.mostrarEnPantalla("[�Aviso! Fin de programa] Cuando el resto de opciones finalicen el programa se cerrar�");
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
		  		   + "\n" + "|     " + optionMenu + "- Men�  "  + optionExit +"- Cerrar     |"
		  		   + "\n" + "+----------------------------+");
	}
}
