import java.util.Scanner;

public class tres {
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String cadena;
		int posicionCadena = 0;
		int suma = 0;
		
		System.out.println("Introduce una frase que incluya n�meros...");
		cadena = keyboard.nextLine();
		
		for (posicionCadena = 0;posicionCadena < cadena.length();posicionCadena++) {
			int letraActual = cadena.charAt(posicionCadena);
			
			if (letraActual <= 57 && letraActual >= 48) { //Usamos el c�digo ASCII para filtrar los n�meros
				suma += letraActual - 48; //Lo convertimos con esta ecuaci�n y lo a�adimos al resultado
			}									// numero = ASCIIchar - 48
		}
		
		System.out.println("\n" + suma);
		
		keyboard.close();
	}
}


/*
IMPRIMIR POR PANTALLA
	Que se introduzca una cadena con n�meros
	
PROGRAMA
	Sumar todos los n�meros que se encuentren en la cadena
*/