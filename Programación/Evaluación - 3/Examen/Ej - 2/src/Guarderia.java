import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Guarderia {

	public static void main(String[] args) {
		ArrayList<Alumno> lista;
		File f;
		Fichero fichero;
		fichero = new Fichero("guarderia.dat");
		f = new File("guarderia.dat");
		lista = new ArrayList<>();
		
		if (f.exists()){
			lista = leeFichero(fichero);
		}else {
			crearAlumnos(lista);
			escribeFichero(lista, fichero);
		}
		
		int opcion = menu();
		while (opcion != 0) {
			switch (opcion) {
			case 1:
				altaAlumnos(lista);
				escribeFichero(lista, fichero);
				//...
				break;
			case 2:
				bajaAlumnos(lista);
				escribeFichero(lista, fichero);
				//...
				break;
			case 3://listado de alumnos
				listadoApellidoNombre(lista);
				//...
				break;
			case 4://listado de alumnos
				listadoGrupoApellidoNombre(lista);
				//...
				break;
			case 5: //listado de comedor
				listadoDesComMerApellidosNombre(lista);
				//...
			case 6: //listado de comedor
				//cargarDatos(lista);
				//...
			case 7: //listado de comedor
				//escribeDatos(lista);
				//...
			}
			opcion = menu();
		}


	}// main

	private static void listadoApellidoNombre(ArrayList<Alumno> lista) {
		Leer.mostrarEnPantalla("[listadoApellidoNombre]");
		Collections.sort(lista, Alumno.alumnoApellidosNombreComparator);
		for (Alumno alumno : lista) {
			Leer.mostrarEnPantalla(alumno.toString());
		}
	}

	private static void listadoDesComMerApellidosNombre(ArrayList<Alumno> lista) {
		Leer.mostrarEnPantalla("[listadoDesComMerApellidosNombre]");
		Collections.sort(lista, Alumno.alumnoApellidosNombreComparator);
		Leer.mostrarEnPantalla(" - Desayuno");
		for (Alumno alumno : lista) {
			if (alumno.getDesayuno()) Leer.mostrarEnPantalla("   + " + alumno.toString());
		}
		Leer.mostrarEnPantalla(" - Comida");
		for (Alumno alumno : lista) {
			if (alumno.getComida()) Leer.mostrarEnPantalla("   + " + alumno.toString());
		}
		Leer.mostrarEnPantalla(" - Merienda");
		for (Alumno alumno : lista) {
			if (alumno.getMerienda()) Leer.mostrarEnPantalla("   + " + alumno.toString());
		}
	}

	private static void listadoGrupoApellidoNombre(ArrayList<Alumno> lista) {
		Leer.mostrarEnPantalla("[listadoGrupoApellidoNombre]");
		lista.sort(Alumno.alumnoGrupoApellidosNombreComparator);
		for (Alumno alumno : lista) {
			Leer.mostrarEnPantalla(alumno.toString());
		}
	}

	private static void altaAlumnos(ArrayList<Alumno> lista) {
		String input;
		Alumno alumno;
		String nombre;
		String apellidos;
		Integer edad;
		String grupo;
		Boolean desayuno;
		Boolean comida;
		Boolean merienda;
		
		Leer.mostrarEnPantalla("[altaAlumnos]");
		nombre = Leer.pedirCadena("Nombre");
		apellidos = Leer.pedirCadena("Apellidos");
		edad = Leer.pedirEntero("Edad");
		grupo = Leer.pedirCadena("Grupo");
		//Desayuno
		input = Leer.pedirCadena("¿Va ha desayunar? (S/OTRA ENTRADA)");	
		if (input.equalsIgnoreCase("S")) {
			desayuno = true;
		} else {
			desayuno = false;
		}
		//Comida
		input = Leer.pedirCadena("¿Va ha comer? (S/OTRA ENTRADA)");	
		if (input.equalsIgnoreCase("S")) {
			comida = true;
		} else {
			comida = false;
		}
		//Merienda
		input = Leer.pedirCadena("¿Va ha merendar? (S/OTRA ENTRADA)");	
		if (input.equalsIgnoreCase("S")) {
			merienda = true;
		} else {
			merienda = false;
		}
		alumno = new Alumno(nombre, apellidos, edad, grupo, desayuno, comida, merienda);
		lista.add(alumno);
	}

	private static void bajaAlumnos(ArrayList<Alumno> lista) {
		Integer id;
		Alumno alumno;
		Leer.mostrarEnPantalla("[bajaAlumnos]");
		Leer.mostrarEnPantalla(" - Alumnos");
		for (Alumno actualAlumno : lista) {
			Leer.mostrarEnPantalla("   + ID: " + lista.indexOf(actualAlumno) + ", " + actualAlumno.toString());
		}
		
		alumno = null;
		while (alumno == null) {
			id = Leer.pedirEntero("Introduce el \"ID\" del alumno a dar de baja");
			try {
				alumno = lista.get(id);
			} catch (Exception notFound) {
				System.err.print("No hay ningún alumno con el ID '" + id + "'");
			}			
		}
		lista.remove(alumno);
	}

	private static void escribeFichero(ArrayList<Alumno> lista, Fichero fichero) {
		fichero.escribirAlumno(lista);
	}

	private static ArrayList<Alumno> leeFichero(Fichero fichero) {
		ArrayList<Alumno> alumnos;
		alumnos = new ArrayList<Alumno>();
		alumnos = (ArrayList<Alumno>) fichero.leerAlumno();
		return alumnos;
	}

	public static void crearAlumnos(ArrayList<Alumno> lista){
		int i;
		String[] nombres = {"Luis", "Fernando", "Sonia", "Ana"};
		String[] apellidos = {"Pérez", "Fernández", "Flórez", "Fillón"};
		Integer[] edades = {1, 1, 3, 2};
		Boolean[] desayuno = {true, false, true, false};
		Boolean[] comida = {false, false, true, false};
		Boolean[] merienda = {true, true, true, true};
		String[] grupo = {"F1", "F1", "F2", "F1"};
		Alumno alumno;
		
		Leer.mostrarEnPantalla("[crearAlumnos]");
		for (i = 0; i < nombres.length; i++) {
			alumno = new Alumno(nombres[i], apellidos[i], edades[i], grupo[i], desayuno[i], comida[i], merienda[i]);
			lista.add(alumno);
		}

	}// crearAlumnos


	
	public static int menu(){
		int op;
		Leer.mostrarEnPantalla("GESTION DE GUARDERIA");
		Leer.mostrarEnPantalla("-------------------");
		Leer.mostrarEnPantalla("1 - Alta de alumnos");
		Leer.mostrarEnPantalla("2 - Baja de alumnos");
		Leer.mostrarEnPantalla("3 - Listado de alumnos por apellidos y nombre");
		Leer.mostrarEnPantalla("4 - Listado de alumnos por grupo, apellidos y nombre");
		Leer.mostrarEnPantalla("5 - Listado de alumnos por comedor");
		Leer.mostrarEnPantalla("0 - Salir");
		op = Leer.pedirEntero("Elija opcion","[0-5]");
		return op;
	}


}//GestionVideojuegos


