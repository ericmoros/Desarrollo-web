import java.util.concurrent.TimeUnit;

import utilidades.Leer;

public class Comedor {
	public static void main(String[] args) {
		final char optionMenu = '?';
		final char optionExit = 'x';
		
		String inputText = null;
		String optionBuffer = "?";
		Boolean exitProgram = false;
		Character option = null;
		
		
		Leer.mostrarEnPantalla("Bienvenido");
		
		
		while (exitProgram != true) {
			while (optionBuffer.length() != 0) {
				option = getBufferOption(optionBuffer);
				
				switch (option) {
					case '1':
						inProgress();
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
