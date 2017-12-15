import java.util.*;
public class H4_Ej1 {

	public static void main(String[] args) {
		String frase;
		final int MAX_LONGITUD = 80;
		int lineas, caracter;
		Scanner teclado = new Scanner(System.in);
		do{
			System.out.println("Frase de hasta "+ MAX_LONGITUD + " caracteres: ");
			frase = teclado.nextLine();
		}while(frase.length() > MAX_LONGITUD);
		/*for(lineas = 0; lineas < frase.length(); lineas++){
			System.out.println();//escribir una linea
			for (caracter = 0; caracter <= lineas; caracter++){
				System.out.print(frase.charAt(caracter));
			}
		}*/
		for(lineas = 0;lineas < frase.length(); lineas++){
			System.out.println(frase.substring(0, lineas + 1));
		}
	}//main
}//class