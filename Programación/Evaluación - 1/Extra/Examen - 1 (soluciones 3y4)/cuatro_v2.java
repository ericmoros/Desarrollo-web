import java.util.Scanner;

public class cuatro {
	public static void main(String[] args) { // Se podría mejorar bastante en algunos detalles pero la idea era almacenar los datos y despues presentarlos
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		final int registros = 30;
		final int dados = 2; //Si cambiamos la cantidad de dados habría que re-orientar el ejercicio 
		int dadoLog[][] = new int [dados][registros]; //[Cantidad de dados] [tamaño total del log]
		int objetivo;
		int result = 0;
		int tirada;
		
		System.out.println("Introduce un número del 2 al 12...");
		objetivo = keyboard.nextInt();		// El problema de este metodo es que si meto una letra el programa saltará con un error 
		
		
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
		sea igual al número introducido
		por el usuario
		
	IMPRIMIR
		Cara de los lados por tirada más los puntos
		Total de tiradas
 */
