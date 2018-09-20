
public class Ej2 {
	int contar_letra(String cadena, char letra) {
		int contador, n, longitud;
		n = 0;
		contador = 0;
		longitud = cadena.length();
		if (longitud > 0) {
			do {
				if (cadena.charAt(contador) == letra) {
					n++;
				}
				contador++;
				longitud--;
			} while (longitud > 0);
		}
		return n;
	}
}
