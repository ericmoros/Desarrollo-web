import java.util.ArrayList;
import java.util.Collections;
//import java.util.Collections;

public class GestionPersonas {
	public static void main(String[] args) {
		ArrayList<Persona> personas = new ArrayList<>();
		FicheroTexto fichero = new FicheroTexto("src/data/fichTextoExamen.txt", ";");
		personas = leeFichero(fichero);
		//escribeFicherio (No me da tiempo)
		altaPersona(personas);		
		ListarEstudiantes(personas);
		listarTrabajadores(personas);		
	}
	private static void ListarEstudiantes(ArrayList<Persona> personas) {
		ArrayList<Estudiante> estudiantes = new ArrayList<>();
		Leer.mostrarEnPantalla("\nEstudiantes");
		for (Persona persona : personas) {
			if (persona instanceof Estudiante) {
				estudiantes.add((Estudiante) persona);
			}
		}
		
		Collections.sort(estudiantes);
		for (Estudiante estudiante : estudiantes) {
			System.out.println(estudiante);
		}
	}
	private static void listarTrabajadores(ArrayList<Persona> personas) {
		ArrayList<Trabajador> trabajadores = new ArrayList<>();
		Leer.mostrarEnPantalla("\nTrabajadores");
		for (Persona persona : personas) {
			if (persona instanceof Trabajador) {
				trabajadores.add((Trabajador) persona);
			}
		}
		
		Collections.sort(trabajadores);
		for (Trabajador trabajador : trabajadores) {
			System.out.println(trabajador);
		}
	}
	public static ArrayList<Persona> leeFichero(FicheroTexto fichero) {
		return fichero.getPersonas();
	}
	public static void escribeFichero(FicheroTexto fichero) {
	}
	public static void altaPersona(ArrayList<Persona> personas) {
		ArrayList<Persona> newPersonas = new ArrayList<>();
		Integer personaTipo = 0;
		Persona persona = null;
		String nombre = null;
		String apellido = null;
		//Estudiante
		Integer curso = null;
		String estudios = null;
		//Trabajador
		String categoria = null;
		Float sueldo = null;
		
		while (true) {
			Leer.mostrarEnPantalla("salte los datos ([Enter] o \"-1\") para dejar de dar personas de alta");
			//Nombre
			nombre = Leer.pedirCadena("Nombre");
			if (nombre.equals("") || nombre.equals("-1")) break;
			//Apellido
			apellido = Leer.pedirCadena("Apellido");
			if (apellido.equals("") || apellido.equals("-1")) break;
			
			Leer.mostrarEnPantalla("A partir de los siguientes datos se definira el tipo que registra, salte los datos ([Enter] o \"-1\") si los desconoce");

			//Estudiante
			//Curso
			curso = Leer.pedirEntero("Curso");
			if (curso != -1) {
				//Estudios
				estudios = Leer.pedirCadena("Estudios");
				if (estudios.equals("") || estudios.equals("-1")) break;
				else personaTipo = 1;
			} else {
				//Trabajador
				//Categoria
				categoria = Leer.pedirCadena("Categoría");
				if (!categoria.equals("") && !categoria.equals("-1")) {
					//Sueldo
					sueldo = Leer.pedirFloat("Sueldo");
					if (sueldo == -1F) break;
					else personaTipo = 2;
				}
			}

			if (Leer.pedirCadena("Para no registrar \"-1\"").equals("-1")) break;
			
			//Seleción de tipo ()
			if (personaTipo == 1) {
				persona = new Estudiante(nombre, apellido, estudios, curso);
				System.out.println("Bienvenido estudiante " + apellido);
			}
			else if (personaTipo == 2) {
				persona = new Trabajador(nombre, apellido, categoria, sueldo);
				System.out.println("Bienvenido trabajador/a " + apellido);
			}
			else {
				persona = new Persona(nombre, apellido);
				System.out.println("Bienvenido señor/a " + apellido);
			}
			
			newPersonas.add(persona);
		}
		
		personas.addAll(newPersonas);
	}
}
