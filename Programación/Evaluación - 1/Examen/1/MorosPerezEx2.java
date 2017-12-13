package p;

import java.util.Scanner;

public class MorosPerezEx2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
        Scanner keyboard = new Scanner(System.in);
		String cadena;
		String cadenaGenerada = "";
		
		System.out.println("Introduce una cadena...");
		cadena = keyboard.nextLine();
		for (int actualLetra = 0;actualLetra < cadena.length(); actualLetra++) {
			cadenaGenerada += cadena.charAt(actualLetra);
			cadenaGenerada += cadena.charAt(actualLetra);
		}
		
		System.out.println(cadenaGenerada);
	}
}

/*
	TECLADO
		Cadena
		
	GENERAR Y MOSTRAR
		CCaaddeennaa
*/
