import java.util.Scanner;

public class H4_Ej9 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		String inputText;
		short inputLength;
		
		String checkKey;
		
		short num = 0000;
		char sex = '0';
		short course = 0;
		String random = "00";
		
		boolean keyNum;
		boolean keySex;
		boolean keyCourse;
		boolean keyRandom;
		boolean keyExit;
		
		int sexH = 0;
		int sexM = 0;
		int course1 = 0;
		int course2 = 0;
		int tries = 0;
		int triesOk = 0;
		int triesBad = 0;
		
		
		do {
			keyNum = false;
			keySex = false;
			keyCourse = false;
			keyRandom = true;
			keyExit = false;
			
			
			System.out.println("Introduce el codigo (1990M1?@)");
			inputText = keyboard.nextLine();
//			keyboard.nextLine();
//			inputText = "1990M1?@";
			
			inputLength = (short) inputText.length();
			
			
			//No me gusta mucho como he dejado los try catch
			if (inputLength == 8) {
				//Num
				checkKey = "";
				for (short position = 0; position < 4; position++) {
					checkKey += ((short) inputText.charAt(position) - 48);
				}
				
				try {
					num = Short.parseShort(checkKey);
					if (num >= 1990 && num <= 1995) {
						keyNum = true;
					}
					System.out.printf(  " Num: %1$-5b -> %2$d", keyNum,    num	 );
				} catch (Exception eNum) {
					System.out.printf(  " Num: %1$-5b -> (1990 - 1995)", keyNum);
				}
					
				//Sex
				checkKey = "";
				checkKey += inputText.charAt(4);
				
				try {
					sex = checkKey.charAt(0);
					if (sex == 'H' || sex == 'M') {
						keySex = true;
					}
					System.out.printf("%n Sex: %1$-5b -> %2$c", keySex,	   sex	 );
				} catch (Exception eSex) {
					System.out.printf("%n Sex: %1$-5b -> (H / M)", keySex);
				}
				
				//Course
				checkKey = "";
				checkKey += inputText.charAt(5);
				
				try {
					course = Short.parseShort(checkKey);
					if (course == 1 || course == 2) {
						keyCourse = true;
					}
					System.out.printf("%n Cou: %1$-5b -> %2$d", keyCourse, course);
				} catch (Exception eCourse) {
					System.out.printf("%n Cou: %1$-5b -> (1 / 2)", keyCourse);
				}
				
				//Random
				checkKey = "";
				for (short position = 6; position < 8; position++) {
					checkKey += inputText.charAt(position);
				}
				
				try {
					random = checkKey;
					System.out.printf("%n Ran: %1$-5b -> %2$s", keyRandom, random);
				} catch (Exception eRandom) {
					System.out.printf("%n Ran: %1$-5b -> (??)", keyRandom);
				}
				
			}
			
			
			if (keyNum == true && keySex == true && keyCourse == true && keyRandom == true) {
				switch (sex) {
					case 'H':
						sexH++;
						break;
					case 'M':
						sexM++;
						break;
				}
				
				switch (course) {
					case 1:
						course1++;
						break;
					case 2:
						course2++;
						break;
				}
				
				triesOk++;
			} else if (inputText.equals("00000000")) {
				keyExit = true;
				tries--;
			} else {
				triesBad++;
			}
			
			
			tries++;
			
			
			System.out.println(
					  "\n"
					+ "\n Hombres:   " + sexH
					+ "\n Mujeres:   " + sexM
					+ "\n Curso 1:   " + course1
					+ "\n Curso 2:   " + course2
					+ "\n Registros: " + tries
					+ "\n   - Bien: " + triesOk
					+ "\n   - Mal:  " + triesBad
					+ "\n"
					+ "\n"
			);
		} while (keyExit != true);
		
		
		System.out.print("Fin del programa...");
	}
}

/*
â€œ1990H1AZâ€�
â€œ1995M11?â€�

Escribir un programa que lea cÃ³digos de personas de 8 caracteres de modo que los cuatro
primeros sean numÃ©ricos y contenidos entre 1990-1995 (un aÃ±o), el quinto carÃ¡cter sea solo
(H Ã³ M) sexo, el sexto un numero que representa el curso 1 Ã³ 2 y los caracteres sÃ©ptimo y
octavo pueden tener cualquier valor. Deben rechazarse los cÃ³digos que no cumplan estas
Ejercicios de cadenas
Pagina 2 de 2
condiciones, la finalizaciÃ³n de entrada de cÃ³digos se produce cuando se introduce el cÃ³digo
â€œ00000000â€�.  Al  final  el  programa  debe  sacar  un  informe  indicando  cuÃ¡ntos  hombres
y mujeres hay  matriculados  en  primero  y  segundo  y  cuÃ¡ntos  cÃ³digos  correctos  han 
sido leÃ­dos
*/