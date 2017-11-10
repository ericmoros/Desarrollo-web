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
		
		boolean keyNum = false;
		boolean keySex = false;
		boolean keyCourse = false;
		boolean keyRandom = true;
		boolean keyExit = false;
		
		int sexH = 0;
		int sexM = 0;
		int course1 = 0;
		int course2 = 0;
		int okTries = 0;
		
		
		do {
			System.out.println("Introduce el codigo (1990M1?@)");
			inputText = keyboard.nextLine();
//			keyboard.nextLine();
//			inputText = "1990M1?@";
			
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
				
				if (Short.parseShort(checkKey) == 1 || Short.parseShort(checkKey) == 2) {
					course = Short.parseShort(checkKey);
					keyCourse = true;
				}
				
				//Random
				checkKey = "";
				for (short position = 6; position < 8; position++) {
					checkKey += inputText.charAt(position);
				}
				
				random = checkKey;
			}
			
			
			System.out.printf(  " Num: %1$-5b -> %2$d", keyNum,    num	 );
			System.out.printf("%n Sex: %1$-5b -> %2$c", keySex,	   sex	 );
			System.out.printf("%n Cou: %1$-5b -> %2$d", keyCourse, course);
			System.out.printf("%n Ran: %1$-5b -> %2$s", keyRandom, random);
			
			
			if (keyNum != true || keySex != true || keyCourse != true || keyRandom != true) {
				switch (sex) {
					case 'H':
						sexH++;
						break;
					case 'M':
						sexM++;
						break;
				}
				
				switch (course) {
					case '1':
						course1++;
						break;
					case '2':
						course2++;
						break;
				}
			} else if (inputText == "00000000") {
				keyExit = true;
				okTries--;
			}
			
			
			okTries++;
			
			
			System.out.println(
					  "\n"
					+ "\n Hombres:   " + sexH
					+ "\n Mujeres:   " + sexM
					+ "\n Curso 1:   " + course1
					+ "\n Curso 2:   " + course2
					+ "\n Registros: " + okTries
					+ "\n"
					+ "\n"
			);
		} while (keyExit != true);
		
		
		System.out.print("\nUsuario: " + num + sex + course + random + " //Añadido a la lista...");
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
“00000000”.  Al  final  el  programa  debe  sacar  un  informe  indicando  cuántos  hombres
y mujeres hay  matriculados  en  primero  y  segundo  y  cuántos  códigos  correctos  han 
sido leídos
*/