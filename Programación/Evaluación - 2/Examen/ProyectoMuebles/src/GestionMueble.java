/**
 * Solución al ejercicio 1 del examen: problemas, 2ª ev.
 * 
 * @author Eric Moros Pérez
 */
public class GestionMueble {
	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Almacen[] almacenes = instanciarAlmacenes(4, 4, 15);
		imprimirDetallesMuebles(almacenes);
		imprimirDetallesAlmacenes(almacenes);
		imprimirAlmacenesMuebles(almacenes);
	}

	/**
	 * Imprime por consola los detalles de los muebles registrados
	 * 
	 * @param almacenes
	 */
	private static void imprimirDetallesMuebles(Almacen[] almacenes) {
		Leer.mostrarEnPantalla("{detallesMuebles}");
		for (Integer actualAlmacen = 0; actualAlmacen < almacenes.length; actualAlmacen++) {
			Mueble[] muebles = almacenes[actualAlmacen].getMuebles();
			for (Integer actualMueble = 0; actualMueble < muebles.length; actualMueble++) {
				Mueble mueble;
				mueble = muebles[actualMueble];
				
				if (mueble != null) {
					Leer.mostrarEnPantalla(mueble.muestraMueble());
				}
			}
		}
		Leer.mostrarEnPantalla("\n");
	}

	/**
	 * Imprime por consola los detalles de los almacenes registrados
	 * 
	 * @param almacenes
	 */
	private static void imprimirDetallesAlmacenes(Almacen[] almacenes) {
		Leer.mostrarEnPantalla("{Detalles almacenes}");
		for (Integer actualAlmacen = 0; actualAlmacen < almacenes.length; actualAlmacen++) {
			Leer.mostrarEnPantalla(almacenes[actualAlmacen].muestraAlmacen());
		}
		Leer.mostrarEnPantalla("\n");
	}

	/**
	 * Imprime por consola los detalles de los almacenes en relación con los detalles de los muebles
	 * 
	 * @param almacenes
	 */
	private static void imprimirAlmacenesMuebles(Almacen[] almacenes) {
		Mueble[] tmpMuebles;
		Mueble mueble;

		Leer.mostrarEnPantalla("{detallesAlmacenesMuebles}");
		for (Integer actualAlmacen = 0; actualAlmacen < almacenes.length; actualAlmacen++) {
			Leer.mostrarEnPantalla("[Almacen " + (actualAlmacen + 1) + "]");
			Leer.mostrarEnPantalla(almacenes[actualAlmacen].muestraAlmacen());
			tmpMuebles = almacenes[actualAlmacen].getMuebles();
			for (Integer actualMueble = 0; actualMueble < tmpMuebles.length; actualMueble++) {
				mueble = tmpMuebles[actualMueble];

				if (mueble != null) {
					Leer.mostrarEnPantalla("\t[Mueble " + (actualMueble + 1) + "]");
					Leer.mostrarEnPantalla("\t " + mueble.muestraMueble());
				}
			}
			Leer.mostrarEnPantalla("\n");
		}
	}

	/**
	 * Genera y proporciona los almacenes y los muebles
	 * 
	 * @param almacenesTotal
	 * @param almacenesMaxMuebles
	 * @param mueblesTotal
	 * @return almacenes
	 */
	private static Almacen[] instanciarAlmacenes(Integer almacenesTotal, Integer almacenesMaxMuebles,
			Integer mueblesTotal) {
		Almacen[] almacenes = new Almacen[almacenesTotal];

		for (Integer actualAlmacen = 0; actualAlmacen < almacenesTotal; actualAlmacen++) {
			almacenes[actualAlmacen] = new Almacen("Almacen rosa" + actualAlmacen,
					"Avenida rosa 45, nave" + actualAlmacen, new Mueble[almacenesMaxMuebles]);

			for (Integer actualMueble = 0; mueblesTotal > 0 && actualMueble < almacenesMaxMuebles; actualMueble++) {
				Mueble tmp = new Mueble("Esto es un mueble rosa muy bonito", (int) (Math.random() * 50),
						(int) (Math.random() * 25), (int) (Math.random() * 15));
				almacenes[actualAlmacen].getMuebles()[actualMueble] = tmp;
				mueblesTotal--;
			}
		}

		return almacenes;
	}
}
