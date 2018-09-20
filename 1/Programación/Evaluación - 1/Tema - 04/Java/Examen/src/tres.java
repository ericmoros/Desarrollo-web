import java.util.Scanner;

public class tres {
//	public static void main(String[] args) {
//		@SuppressWarnings("resource")
//		Scanner keyboard = new Scanner(System.in);
//		String cadena;
//		int sumaNumeros = 0;
//		String numeros = "0123456789";
//
//		System.out.println("Introduce una cadena que tenga algún número...");
//		cadena = keyboard.nextLine();
//		
//		for (int actualChar = 0; actualChar < cadena.length(); actualChar++) {
//			int numero = numeros.indexOf(cadena.charAt(actualChar)); // Si el número se encuentra en la cadena 				| En caso de que no me devolverá -1
//			if (numero != -1) {				 						 // me dara la posicion del vector en la que se ubica
//				sumaNumeros+= numero;								 // y luego como coincidirá la posición y el número (Revisar linea 9),
//			}														 // lo sumaré al resultado (Revisar linea 8)
//		}
//		
//		System.out.println("\nSuma de los números de la cadena:\n  " + sumaNumeros);
//	}
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