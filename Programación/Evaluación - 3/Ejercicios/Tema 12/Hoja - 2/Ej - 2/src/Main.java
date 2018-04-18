import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Integer totalEscanyos;
		Integer totalPartidos;
		Integer porcentajeMin, totalVotos;

		TreeMap<Integer, LinkedList<Partido>> treeVotos = new TreeMap<>(Collections.reverseOrder());

		totalPartidos = Leer.pedirEntero("Introduce el total de partidos");
		totalEscanyos = Leer.pedirEntero("Introduce el total de escaños");
		porcentajeMin = Leer.pedirEntero("Introduce el porcentaje minimo de votos");

		Partido vPartidos[] = new Partido[totalPartidos];

		totalVotos = calcularVotos(treeVotos, vPartidos, totalEscanyos, totalPartidos, porcentajeMin);
		calcularEscanyos(treeVotos, totalEscanyos);
		Leer.mostrarEnPantalla("Arbol optimizado: " + podar(treeVotos) + "%");

		mostrarPartidosVotos(vPartidos, totalVotos);
		mostrarEscanyos(vPartidos);
		
	}

	private static Integer calcularVotos(TreeMap<Integer, LinkedList<Partido>> treeVotos,
		Partido[] vPartidos, Integer totalEscanyos, Integer totalPartidos, Integer porcentajeMin) {
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
		
		for (Partido partido: vPartidos) {
			if (partido.getVotos() <= totalVotosMin) {
				for (Integer key : treeVotos.keySet()) {
					treeVotos.get(key).remove(partido);
				}
			}
		}
		return totalVotos;
	}

	private static void calcularEscanyos(TreeMap<Integer, LinkedList<Partido>> treeVotos, Integer totalEscanyos) {
		Integer contaEscanyos = 0;

		for (Integer votos : treeVotos.keySet()) {
			if (contaEscanyos < totalEscanyos) {
					for (Partido partidos: treeVotos.get(votos)) {
						contaEscanyos++;
						partidos.addEscanyos();
					}
			}else {
				break;
			}
		}
	}

	private static void mostrarPartidosVotos(Partido[] vPartidos, Integer totalVotos) {
		String partidosMostrar = "\nPARTIDOS\tVOTOS\t"+totalVotos;
		String pNombre;
		Integer pVotos;
		Float porcentaje;
		Leer.mostrarEnPantalla(partidosMostrar);
		for (Partido partido : vPartidos) {
			pNombre = partido.getNombre();
			pVotos = partido.getVotos();
			porcentaje = (float)(100 * pVotos) / (float) totalVotos;
			Leer.mostrarEnPantalla(pNombre + "\t" + pVotos + "\t" + porcentaje + "%");
		}
	}

	private static void mostrarEscanyos(Partido[] vPartidos) {
		String pNombre;
		String escanyosMostrar = "\nPARTIDOS\tESCAÑOS";
		Integer pEscanyos;
		Partido winner = vPartidos[0];
		Leer.mostrarEnPantalla(escanyosMostrar);
		for (Partido partido : vPartidos) {
			pNombre = partido.getNombre();
			pEscanyos = partido.getEscanyos();

			Leer.mostrarEnPantalla(pNombre + "\t" + pEscanyos);
		}
		
		for (Partido i: vPartidos) {
			if (winner.getEscanyos() < i.getEscanyos()) {
				winner = i;
			}
		}
		
		Leer.mostrarEnPantalla("\nPartido con más escaños: " + winner.getNombre());
		
	}
	
	private static Float podar(TreeMap<Integer, LinkedList<Partido>> treeVotos) {
		Float optimizacion;
		Integer totalKeys = 0;
		Integer ramasPodadas = 0;
		for (Integer key: new TreeMap<Integer, LinkedList<Partido>>(treeVotos).keySet()) {
			totalKeys++;
			if (treeVotos.get(key).size() == 0) {
				treeVotos.remove(key);
				ramasPodadas++;
			}
		}
		
		optimizacion = (float) (ramasPodadas * 100) / (float) totalKeys;
		
		return optimizacion;
	}
	
}