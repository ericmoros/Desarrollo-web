package p;

import java.util.Scanner;

public class MorosPerezEx3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		String cadena;
		int sumaNumeros = 0;
		String numeros = "0123456789";

		System.out.println("Introduce una cadena que tenga alg�n n�mero...");
		cadena = keyboard.nextLine();
		
		for (int actualChar = 0; actualChar < cadena.length(); actualChar++) {
			int numero = numeros.indexOf(cadena.charAt(actualChar));
			if (numero != -1) {
				sumaNumeros+= numero;
			}
		}
		
		System.out.println("\nSuma de los n�meros de la cadena:\n  " + sumaNumeros);
	}
}

/*
	IMPRIMIR POR PANTALLA
		Que se introduzca una cadena con n�meros
		
	PROGRAMA
		Sumar todos los n�meros que se encuentren en la cadena
 */
