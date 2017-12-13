import java.util.Scanner;

public class tres {
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String cadena;
		int posicionCadena = 0;
		int suma = 0;
		
		System.out.println("Introduce una frase que incluya números...");
		cadena = keyboard.nextLine();
		
		for (posicionCadena = 0;posicionCadena < cadena.length();posicionCadena++) {
			int letraActual = cadena.charAt(posicionCadena);
			
			if (letraActual <= 57 && letraActual >= 48) { //Usamos el código ASCII para filtrar los números
				suma += letraActual - 48; //Lo convertimos con esta ecuación y lo añadimos al resultado
			}									// numero = ASCIIchar - 48
		}
		
		System.out.println("\n" + suma);
		
		keyboard.close();
	}
}


/*
IMPRIMIR POR PANTALLA
	Que se introduzca una cadena con números
	
PROGRAMA
	Sumar todos los números que se encuentren en la cadena
*/