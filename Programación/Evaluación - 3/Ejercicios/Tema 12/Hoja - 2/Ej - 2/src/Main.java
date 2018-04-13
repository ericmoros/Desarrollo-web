/**
 * 
 */

/**
 * @author Eric Moros P�rez
 *
 */
public class Main {

	/**
	 * @param args
	 * 
	 * Este ejercicio  pretende desarrollar el programa de c�lculo
	 * de esca�os en unas elecciones, teniendo como datos de entrada:
	 * 	El n�mero de partidos que se presentan (N), el n�mero de esca�os
	 * 	a repartir (M) y los votos que ha obtenido cada partido 
	 * 	A partir de aqu�, hay que hacer lo siguiente se dividen los votos
	 * 	de cada partido entre 1, 2, 3....M y se obtienen M divisiones y
	 * 	as� sucesivamente para el partido 2,3,...N es decir se obtendr�n
	 * 	NxM cocientes, y de esos cocientes se eligen los M mayores,
	 * 	puesto que hay M diputados a repartir Un ejemplo ser�a el
	 * 	siguiente:
	 *  
	 * PARTIDOS: 4 
	 * ESCA�OS: 5 
	 *  			Esca�os 		
	 * Partidos 	1 	2 	3 	4 	5 
	 * Part1 	10000 	5000 	3333 	2500 	2000 
	 * Part2 	25000 	12500 	8333 	6250 	5000 
	 * Part3 	30000 	15000 	10000 	7500 	6000 
	 * Part4 	12000 	6000 	4000 	3000 	2400 
	 *  	  
	 * Una vez hechos  los c�lculos habr� que ver a qu� partidos le
	 * corresponden los 5 mayores cocientes. 
	 * El listado de resultados debe hacerse ordenado por n�mero de votos. 
	 * Los partidos que no obtengan un 5% de los votos emitidos deben
	 * rechazarse, y no entrar�n en el reparto de esca�os. 
	 * NOTA: Obligatorio el uso de colecciones para resolverlo, se puede
	 * usar un TreeMap  con clave el cociente y valor asociado un TreeSet
	 * que en cada elemento guarda el nombre del partido a quien pertenece
	 * ese cociente. El mapa debe estar ordenado por los valores de los
	 * cocientes de mayor a menor. Si hay M esca�os los M primeros elementos
	 * de los TreeSet que se guardan en el mapa nos indican a quien
	 * corresponden los esca�os. En este ejercicio nos interesa recorrer los
	 * primeros nodos del mapa y llevar la cuenta del n�mero de elementos
	 * recorridos de los TreeSet que van asociados a cada nodo porque
	 * cuando tengamos 5 en total se termina. 
	 * Se pueden utilizar otros enfoques con colecciones para resolverlo.
	 */
	public static void main(String[] args) {
		Integer numPartidos;
		Integer numEscanyos;
		
		numPartidos = Leer.pedirEntero("Numero de partidos");
		numEscanyos = Leer.pedirEntero("Numero de esca�os");
	}
}
