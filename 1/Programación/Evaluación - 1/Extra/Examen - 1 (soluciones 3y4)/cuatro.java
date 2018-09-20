import java.util.Scanner;

public class cuatro {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
        Scanner keyboard = new Scanner(System.in);
		String cadena;
		String numeros = "0123456789";
		boolean ok = false;
		short objetivo = 0;
		short dadoA = -1;	// Pongo una variable a los dados para			|
		short dadoB = -1;	// almacenar sus resutados conforme los lance.	| Todo será modificado 
		short result = -1; 	// Preparo la variable del resultado			| constantemente en un bucle
		short tiradas = 0;	// 												|
		
		do {
			System.out.println("Introduce un número del 2 al 12...");
			cadena = keyboard.nextLine();
			
			if (numeros.indexOf(cadena) != -1) {		//Compruebo que toda está formada por números
				int numero = Integer.parseInt(cadena);	//Tranformo la cadena a entero
				if (numero <= 12 && numero >= 2) {		//Compruebo que el entero esté etre las posibilidaes de resultado de la suma de ambos dados
					objetivo = (short) numero;			//Me lo guardo
					ok = true;							//pongo la variable de control a true para que no vuelva al bucle
				}
			}
			
		} while (ok != true);
		System.out.println(" __________ __________ __________ __________"); // |
		System.out.print("|__TIRADA__|__DADO A__|__DADO B__|__PUNTOS__|");  // | Atributos de la tabla para que se entiendan los datos al presentarlos
		for (int tirada = 1;objetivo != dadoA + dadoB; tirada++) {
			dadoA = (short) (Math.random() * (6 - 1 + 1) + 1);		// | (De 6 caras)
			dadoB = (short) (Math.random() * (6 - 1 + 1) + 1);		// | El mínimo de un dado siempre será 1 y el máximo 6
			result = (short) (dadoA + dadoB);		// Almaceno el resultado (Pero en cuanto el bucle de la vuelta se verá modificado, igual en un caso más habitual se almacenarían en un vector) 
			System.out.printf( "\n|___ %0$02d ___|___ %0$02d __ + __ %0$02d __ = __ %0$02d ___|",tirada, dadoA, dadoB, result); //Presento los datos
			tiradas++;
		}
		
		System.out.println( " <--- GG (Tiradas totales: " + tiradas + ")"); // Destaco que hemos alcanzado el objetivo
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
