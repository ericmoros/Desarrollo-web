import java.util.Scanner;

/**
 * Desarrollar un programa en Java que utilice una clase que se llame Indicador
 * que sea la representación de un indicador de la vida real (indicadores de
 * nivel, de velocidad, tacómetros, etc). Deberá tener los mínimos elementos
 * para representar valores, ajustarlos con un valor de inicio, imprimir el
 * valor, modificarlosa un valor determinado e incrementar y disminuir el valor
 * con el que cuentan.
 *
 * @return Presenta la velocidad actual de un coche virtual
 * @see Indicador.java
 * @author Elferic
 */

public class Main {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String action;

		do {
			Useful.print("Velociodad: " + Indicador.getSpeed() + "Km/h\n");
			Useful.print("Acelerador [true], Mano [X]");
			action = keyboard.nextLine();

			if (action.equals("true")) {
				Indicador.treadle(true);
			} else {
				Indicador.treadle(false);
			}
		} while (!action.equals("X"));
	}
}

/*
 * 
 * TACOMETRO, VELOCIMETRO, NIVEL(VIDEOJUEGO)
 */