import java.util.*;
public class Bar {

	public static void main(String[] args) {
		int opcion;
		ArrayList<Bebida> lista = new ArrayList<>();//Lista para guardar las bebidas
		cargaDatos(lista);
		opcion = menu();
		while (opcion != 0) {
			switch (opcion) {
			case 1:
				altaBebidas(lista);
				break;
			case 2://listado de bebidas por sabor y marca
				InventarioPorMarca(lista);
				break;
			case 3://listado de bebidas por tipo, graduación y marca
				listarRefrescos(lista);
				break;
			case 4: //listado de bebidas por marca
				listarAlcoholes(lista);
			}
			opcion = menu();
		}
		
	}// main

	private static void listarAlcoholes(ArrayList<Bebida> lista) {
		ArrayList<Alcoholica> alcoholicas;
		
		Leer.mostrarEnPantalla("[listarAlcoholes]");
		alcoholicas = new ArrayList<>();
		for (Bebida bebida : lista) {
			if (bebida instanceof Alcoholica) alcoholicas.add((Alcoholica) bebida);
		}		
		Collections.sort(alcoholicas, Alcoholica.alcoholicaTipoGraduacionMarcaComparator);
		for (Alcoholica alcoholica : alcoholicas) {
			Leer.mostrarEnPantalla(alcoholica.toString());
		}
	}

	private static void listarRefrescos(ArrayList<Bebida> lista) {
		ArrayList<Refresco> refrescos;
		
		Leer.mostrarEnPantalla("[listarRefrescos]");
		refrescos = new ArrayList<>();
		for (Bebida bebida : lista) {
			if (bebida instanceof Refresco) refrescos.add((Refresco) bebida);
		}		
		Collections.sort(refrescos, Refresco.refrescoSaborMarcaComparator);
		for (Refresco refresco : refrescos) {
			Leer.mostrarEnPantalla(refresco.toString());
		}
	}

	private static void InventarioPorMarca(ArrayList<Bebida> lista) {
		Leer.mostrarEnPantalla("[InventarioPorMarca]");
		Collections.sort(lista, Bebida.bebidaMarcaComparator);
		for (Bebida bebida : lista) {
			Leer.mostrarEnPantalla(bebida.toString());
		}
	}

	private static void altaBebidas(ArrayList<Bebida> lista) {
		Integer opcion;
		//Bebida
		String marca;
		Float precio;
		Integer volumen;
		Integer stock;
		//Refresco
		Refresco refresco;
		Integer porcentajeAzucar;
		String sabor;
		//Alcoholica
		Alcoholica alcoholica;
		Float graduacion;
		String tipo;
		
		Leer.mostrarEnPantalla("[AltaBebidas]");
		opcion = 0;
		while (opcion != 1 && opcion != 2) {			
			opcion = Leer.pedirEntero("¿Crear [1]refresco o [2]bebida alcoholica?");
		}
		marca = Leer.pedirCadena("Marca");
		precio = Leer.pedirFloat("Precio");
		volumen = Leer.pedirEntero("Volumen");
		stock = Leer.pedirEntero("Stock");
		switch (opcion) {
			case 1:
				porcentajeAzucar = Leer.pedirEntero("Porcentaje de azucar");
				sabor = Leer.pedirCadena("Sabor");
				refresco = new Refresco(marca, precio, volumen, stock, porcentajeAzucar, sabor);
				lista.add(refresco);
				break;
			case 2:
				graduacion = Leer.pedirFloat("Graduación");
				tipo = Leer.pedirCadena("Tipo");
				alcoholica = new Alcoholica(marca, precio, volumen, stock, graduacion, tipo);
				lista.add(alcoholica);
				break;
		}
		
	}

	private static int menu() {
		Integer opcion;
		
		System.out.println("___Menu_________________" + "\n"
				+ "1- AltaBebidas" + "\n"
				+ "2- InventarioPorMarca" + "\n"
				+ "3- ListarRefrescos" + "\n"
				+ "4- ListarAlcoholes" + "\n"
				+ "0- Salir" + "\n"
				+ "_______________________");
		opcion = Leer.pedirEntero("Introduce una de las opciones");
		
		return opcion;
	}

	public static void cargaDatos(ArrayList<Bebida> lista){
		lista.add(new Refresco("Fanta", 3.2f, 33, 12, 15, "Naranja"));
		lista.add(new Refresco("Fanta",3.2f,33,12,15, "Limón"));
		lista.add(new Refresco("Trinaranjus",3.2f,33,12,15, "Naranja"));
		lista.add(new Refresco("Trinaranjus",3.2f,33,12,15, "Limón"));
		lista.add(new Refresco("Coca Cola",3.2f,33,12,20, "Cola"));
		lista.add(new Refresco("Coca Cola",3.2f,33,12,2, "Cola"));
		lista.add(new Alcoholica("Ambar",3.2f,33,12,10.f,"Cerveza"));
		lista.add(new Alcoholica("Ambar",3.2f,33,12,3.f,"Cerveza"));
		lista.add(new Alcoholica("Larios",13.2f,75,12,20.f,"Ginebra"));
		lista.add(new Alcoholica("Smirnoff",23.2f,75,12,22.f,"Vodka"));
		lista.add(new Alcoholica("Bombay",15.2f,75,12,20.f,"Ginebra"));
		lista.add(new Alcoholica("La Navarra",21.2f,75,12,32.f,"Pacharán"));
	}
	
}// GestionPersonasExamen
