import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeMap;

/**
 * 
 */

/**
 * @author Eric Moros Pérez
 *
 */
public class Main {

	/**
	 * @param args
	 * 
	 *            Este ejercicio pretende desarrollar el programa de cálculo de
	 *            escaños en unas elecciones, teniendo como datos de entrada: El
	 *            número de partidos que se presentan (N), el número de escaños a
	 *            repartir (M) y los votos que ha obtenido cada partido A partir de
	 *            aquí, hay que hacer lo siguiente se dividen los votos de cada
	 *            partido entre 1, 2, 3....M y se obtienen M divisiones y así
	 *            sucesivamente para el partido 2,3,...N es decir se obtendrán NxM
	 *            cocientes, y de esos cocientes se eligen los M mayores, puesto que
	 *            hay M diputados a repartir Un ejemplo sería el siguiente:
	 * 
	 *            PARTIDOS: 4 ESCAÑOS: 5 Escaños Partidos 1 2 3 4 5 Part1 10000 5000
	 *            3333 2500 2000 Part2 25000 12500 8333 6250 5000 Part3 30000 15000
	 *            10000 7500 6000 Part4 12000 6000 4000 3000 2400
	 * 
	 *            Una vez hechos los cálculos habrá que ver a qué partidos le
	 *            corresponden los 5 mayores cocientes. El listado de resultados
	 *            debe hacerse ordenado por número de votos. Los partidos que no
	 *            obtengan un 5% de los votos emitidos deben rechazarse, y no
	 *            entrarán en el reparto de escaños. NOTA: Obligatorio el uso de
	 *            colecciones para resolverlo, se puede usar un TreeMap con clave el
	 *            cociente y valor asociado un TreeSet que en cada elemento guarda
	 *            el nombre del partido a quien pertenece ese cociente. El mapa debe
	 *            estar ordenado por los valores de los cocientes de mayor a menor.
	 *            Si hay M escaños los M primeros elementos de los TreeSet que se
	 *            guardan en el mapa nos indican a quien corresponden los escaños.
	 *            En este ejercicio nos interesa recorrer los primeros nodos del
	 *            mapa y llevar la cuenta del número de elementos recorridos de los
	 *            TreeSet que van asociados a cada nodo porque cuando tengamos 5 en
	 *            total se termina. Se pueden utilizar otros enfoques con
	 *            colecciones para resolverlo.
	 */
	public static void main(String[] args) {
		Integer totalEscanyos;
		Integer totalPartidos;
		Integer porcentajeMin;

		TreeMap<Integer, LinkedList<Partido>> treeVotos = new TreeMap<>(Collections.reverseOrder());

		totalPartidos = Leer.pedirEntero("Introduce el total de partidos");
		totalEscanyos = Leer.pedirEntero("Introduce el total de escaños");
		porcentajeMin = Leer.pedirEntero("Introduce el porcentaje minimo de votos");

		Partido vPartidos[] = new Partido[totalPartidos];

		calcularVotos(treeVotos, vPartidos, totalEscanyos, totalPartidos, porcentajeMin);
		calcularEscanyos(treeVotos, totalEscanyos);
		podar(treeVotos);

		mostrarPartidosVotos(vPartidos);
		mostrarEscanyos(vPartidos);

	}

	private static void calcularVotos(TreeMap<Integer, LinkedList<Partido>> treeVotos, Partido[] vPartidos,
			Integer totalEscanyos, Integer totalPartidos, Integer porcentajeMin) {
		Integer totalVotos = 0;
		Integer votos;
		Partido pPartido = null;
		Integer totalVotosMin = null;

		for (Integer i = 0; i < totalPartidos; i++) {
			votos = (int) Math.floor(Math.random() * (30000 - 50 + 1) + (50));
			pPartido = new Partido("Partido " + (i + 1), votos);
			totalVotos += votos;

			vPartidos[i] = pPartido;
			for (Integer j = 1; j <= totalEscanyos; j++) {
				if (treeVotos.get((votos / j)) == null) {
					treeVotos.put((votos / j), new LinkedList<>());
				}
				treeVotos.get((votos / j)).add(pPartido);
			}
		}

		totalVotosMin = totalVotos * porcentajeMin / 100;

		for (Partido partido : vPartidos) {
			if (partido.getVotos() <= totalVotosMin) {
				for (Integer key : treeVotos.keySet()) {
					treeVotos.get(key).remove(partido);
				}
			}
		}
	}

	private static void calcularEscanyos(TreeMap<Integer, LinkedList<Partido>> treeVotos, Integer totalEscanyos) {
		Integer contaEscanyos = 0;

		for (Integer votos : treeVotos.keySet()) {
			if (contaEscanyos < totalEscanyos) {
				for (Partido partidos : treeVotos.get(votos)) {
					contaEscanyos++;
					partidos.addEscanyos();
				}
			} else {
				break;
			}

		}
	}

	private static void mostrarPartidosVotos(Partido[] vPartidos) {
		String partidosMostrar = "\nPARTIDOS\tVOTOS";
		String pNombre;
		Integer pVotos;
		Leer.mostrarEnPantalla(partidosMostrar);
		for (Partido partido : vPartidos) {
			pNombre = partido.getNombre();
			pVotos = partido.getVotos();
			// pEscanyos = par
			Leer.mostrarEnPantalla(pNombre + "\t" + pVotos);
		}
	}

	private static void mostrarEscanyos(Partido[] vPartidos) {
		String pNombre;
		String escanyosMostrar = "\nPARTIDOS\tESCAÑOS";
		Integer pEscanyos;
		Leer.mostrarEnPantalla(escanyosMostrar);
		for (Partido partido : vPartidos) {
			pNombre = partido.getNombre();
			pEscanyos = partido.getEscanyos();

			Leer.mostrarEnPantalla(pNombre + "\t" + pEscanyos);
		}
	}

	private static Integer podar(TreeMap<Integer, LinkedList<Partido>> treeVotos) {
		for (Integer key: new TreeMap<Integer, LinkedList<Partido>>(treeVotos).keySet()) {
			if (treeVotos.get(key).size() == 0) {
				treeVotos.remove(key);
				System.out.println("Arbol optimizado!");

			}
		}

		return null;
	}

}
