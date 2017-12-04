package p;

import java.util.Scanner;

public class MorosPerezEx4 {//LUEGO...
	public static void main(String[] args) {
		@SuppressWarnings("resource")
        Scanner keyboard = new Scanner(System.in);
		String cadena;
		String numeros = "0123456789";
		boolean ok = false;
		short objetivo = 0;
		short dadoA = -1;
		short dadoB = -1;
		short result = -1;
		short tiradas = 0;
		
		do {
			System.out.println("Introduce un número del 2 al 12...");
			cadena = keyboard.nextLine();
			
			if (numeros.indexOf(cadena) != -1) {
				int numero = Integer.parseInt(cadena);
				if (numero <= 12 && numero >= 2) {
					objetivo = (short) numero;
					ok = true;
				}
			}
			
		} while (ok != true);
		System.out.println(" __________ __________ __________ __________");
		System.out.print("|__TIRADA__|__DADO A__|__DADO B__|__PUNTOS__|");
		for (int tirada = 1;objetivo != dadoA + dadoB; tirada++) {
			dadoA = (short) (Math.random() * (6 - 1 + 1) + 1);
			dadoB = (short) (Math.random() * (6 - 1 + 1) + 1);
			result = (short) (dadoA + dadoB);
			System.out.printf( "\n|___ %0$02d ___|___ %0$02d __ + __ %0$02d __ = __ %0$02d ___|",tirada, dadoA, dadoB, result);
			tiradas++;
		}
		
		System.out.println( " <--- GG (Tiradas totales: " + tiradas + ")");
	}
}

/*
	USUARIO
		Introducir 2-12 (numero) [Listo!]
		
	GENERAR
		Tirar 2 dados hasta que la salida
		sea igual al número introducido
		por el usuario
		
	IMPRIMIR
		Cara de los lados por tirada más los puntos
		Total de tiradas
 */
