import java.util.Scanner;

public class cuatro {//LUEGO...
//	public static void main(String[] args) {
//		@SuppressWarnings("resource")
//        Scanner keyboard = new Scanner(System.in);
//		String cadena;
//		String numeros = "0123456789";
//		boolean ok = false;
//		short objetivo = 0;
//		short dadoA = -1;	// Pongo una variable a los dados para			|
//		short dadoB = -1;	// almacenar sus resutados conforme los lance.	| Todo ser� modificado 
//		short result = -1; 	// Preparo la variable del resultado			| constantemente en un bucle
//		short tiradas = 0;	// 												|
//		
//		do {
//			System.out.println("Introduce un n�mero del 2 al 12...");
//			cadena = keyboard.nextLine();
//			
//			if (numeros.indexOf(cadena) != -1) {		//Compruebo que toda est� formada por n�meros
//				int numero = Integer.parseInt(cadena);	//Tranformo la cadena a entero
//				if (numero <= 12 && numero >= 2) {		//Compruebo que el entero est� etre las posibilidaes de resultado de la suma de ambos dados
//					objetivo = (short) numero;			//Me lo guardo
//					ok = true;							//pongo la variable de control a true para que no vuelva al bucle
//				}
//			}
//			
//		} while (ok != true);
//		System.out.println(" __________ __________ __________ __________"); // |
//		System.out.print("|__TIRADA__|__DADO A__|__DADO B__|__PUNTOS__|");  // | Atributos de la tabla para que se entiendan los datos al presentarlos
//		for (int tirada = 1;objetivo != dadoA + dadoB; tirada++) {
//			dadoA = (short) (Math.random() * (6 - 1 + 1) + 1);		// | (De 6 caras)
//			dadoB = (short) (Math.random() * (6 - 1 + 1) + 1);		// | El m�nimo de un dado siempre ser� 1 y el m�ximo 6
//			result = (short) (dadoA + dadoB);		// Almaceno el resultado (Pero en cuanto el bucle de la vuelta se ver� modificado, igual en un caso m�s habitual se almacenar�an en un vector) 
//			System.out.printf( "\n|___ %0$02d ___|___ %0$02d __ + __ %0$02d __ = __ %0$02d ___|",tirada, dadoA, dadoB, result); //Presento los datos
//			tiradas++;
//		}
//		
//		System.out.println( " <--- GG (Tiradas totales: " + tiradas + ")"); // Destaco que hemos alcanzado el objetivo
//	}
	public static void main(String[] args) { // Se podr�a mejorar bastante en algunos detalles pero la idea era almacenar los datos y despues presentarlos
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		final int registros = 30;
		final int dados = 2; //Si cambiamos la cantidad de dados habr�a que re-orientar el ejercicio 
		int dadoLog[][] = new int [dados][registros]; //[Cantidad de dados] [tama�o total del log]
		int objetivo;
		int result = 0;
		int tirada;
		
		System.out.println("Introduce un n�mero del 2 al 12...");
		objetivo = keyboard.nextInt();		// El problema de este metodo es que si meto una letra el programa saltar� con un error 
		
		
		for (tirada = 0; objetivo != result; tirada++) {					// De esta manera en lugar de tirar los datos por
			dadoLog[0][tirada] = (int) (Math.random() * (6 - 1 + 1) + 1);	// pantalla, los almaceno
			dadoLog[1][tirada] = (int) (Math.random() * (6 - 1 + 1) + 1);
			result = dadoLog[0][tirada] + dadoLog[1][tirada];
		}
		
		System.out.println(" __________ __________ __________ __________");
		System.out.print("|__TIRADA__|__DADO A__|__DADO B__|__PUNTOS__|");
		for (int indexTirada = 0; indexTirada != tirada; indexTirada++) {	// Y ahora los presento
			result = dadoLog[0][indexTirada] + dadoLog[1][indexTirada];
			System.out.printf( "\n|___ %0$02d ___|___ %0$02d __ + __ %0$02d __ = __ %0$02d ___|",(indexTirada + 1), dadoLog[0][indexTirada], dadoLog[1][indexTirada], result); //Presento los datos
		}
		
		System.out.println( " <--- GG (Tiradas totales: " + tirada + ")");
	}
}

/*
	USUARIO
		Introducir 2-12 (numero) [Listo!]
		
	GENERAR
		Tirar 2 dados hasta que la salida
		sea igual al n�mero introducido
		por el usuario
		
	IMPRIMIR
		Cara de los lados por tirada m�s los puntos
		Total de tiradas
 */
