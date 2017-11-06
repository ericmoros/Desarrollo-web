import java.util.Scanner;

public class H4_Ej9 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		String inputText;
		short inputLength;
		
		String checkKey;
		
		short num = 0;
		char sex = 0;
		short course = 0;
		String random = "0";
		
		boolean keyNum = false;
		boolean keySex = false;
		boolean keyRandom = true;
		
		
		do {
			System.out.println("Introduce el codigo (1990M1?@)");
			inputText = keyboard.nextLine();
			
			inputLength = (short) inputText.length();
			
			if (inputLength == 8) {
				//Num
				checkKey = "";
				for (short position = 0; position < 4; position++) {
					checkKey += ((short) inputText.charAt(position) - 48);
				}
				
				if (Short.parseShort(checkKey) >= 1990 && Short.parseShort(checkKey) <= 1995) {
					num = Short.parseShort(checkKey);
					keyNum = true;
				}
				
				
				//Sex
				checkKey = "";
				checkKey += inputText.charAt(4);
				
				if (checkKey.charAt(0) == 'H' || checkKey.charAt(0) == 'M') {
					sex = checkKey.charAt(0);
					keySex = true;
				}
				
				
				//Course
				checkKey = "";
				checkKey += inputText.charAt(5);
				
				if (checkKey.charAt(5) == 1 || checkKey.charAt(5) == 2) {
					course = checkKey.charAt(0);
					keySex = true;
				}
				
				
				//Random
//				checkKey = "";
//				for (short position = 6; position < 8; position++) {
//					checkKey += inputText.charAt(position);
//				}
			}
			
			System.out.println(
				  "\n Num: " + keyNum
				+ "\n Sex: " + keySex
				+ "\n Ran: " + keyRandom
			);
		} while (keyNum != true || keySex != true || keyRandom != true);
		
		
		System.out.print("\n" + num + sex);
	}
}

/*
“1990H1AZ”
“1995M11?”

Escribir un programa que lea códigos de personas de 8 caracteres de modo que los cuatro
primeros sean numéricos y contenidos entre 1990-1995 (un año), el quinto carácter sea solo
(H ó M) sexo, el sexto un numero que representa el curso 1 ó 2 y los caracteres séptimo y
octavo pueden tener cualquier valor. Deben rechazarse los códigos que no cumplan estas
Ejercicios de cadenas
Pagina 2 de 2
condiciones, la finalización de entrada de códigos se produce cuando se introduce el código
“00000000”. Al final el programa debe sacar un informe indicando cuántos hombres y
mujeres
*/