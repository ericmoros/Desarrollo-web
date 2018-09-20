package p;

import java.util.Scanner;

public class MorosPerezEx3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		String cadena;
		int sumaNumeros = 0;
		String numeros = "0123456789";

		System.out.println("Introduce una cadena que tenga algún número...");
		cadena = keyboard.nextLine();
		
		for (int actualChar = 0; actualChar < cadena.length(); actualChar++) {
			int numero = numeros.indexOf(cadena.charAt(actualChar));
			if (numero != -1) {
				sumaNumeros+= numero;
			}
		}
		
		System.out.println("\nSuma de los números de la cadena:\n  " + sumaNumeros);
	}
}

/*
	IMPRIMIR POR PANTALLA
		Que se introduzca una cadena con números
		
	PROGRAMA
		Sumar todos los números que se encuentren en la cadena
 */
