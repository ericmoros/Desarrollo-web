import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @author Eric Moros Pérez
 *
 */
public class Main {

	/**
	 * @param args
	 * 
	 *	En este ejercicio se generan los datos a partir de dos vectores
	 *	de 10 nombres y 10 apellidos combinándolos al azar. Hay que generar
	 *	un ArrayList de 50 alumnos para guardar el nombre, el apellido y las
	 *	notas obtenidas en tres exámenes parciales que se puntúan entre 0 y 100.
	 * 
	 *	El programa debe: 
	 *	1.	Generar al azar los datos de 50 alumnos. Cada alumno se almacenará
	 *		en un elemento del ArrayList. Los datos que queremos guardar de cada
	 *		alumno son: 
	 *				string  nombre; string apellido; int nota1; int nota2; int nota3; 
	 *	2.	Después generar tres mapas (TreeMap), uno para cada nota, donde la
	 *		key será la nota por la que ordenamos y el dato asociado un ArrayList
	 *		con los índices del vector donde aparece esa nota (puede haber varios
	 *		alumnos que tengan la misma nota). 
	 *	3.	Presentar un menú para poder listar la clase por cualquiera de las
	 *		tres notas en orden ascendente, es decir ascen1ª, ascen2ª, ascen3ª. 
	 *	4.	Presentar en pantalla el listado requerido
	 *  
	 *	De esta forma no hay que reordenar el ArrayList cada vez que se pide un
	 *	tipo de listado pues el ArrayList, aunque este desordenado, es accesible en
	 *	el orden de las notas según el mapa que se recorra. 
	 *
	 */
	public static void main(String[] args) {
		final String[] NAMES = { "Ciara", "Sarah", "Joy", "Tobias", "Leigh", "James", "Sawyer", "Veda", "Susan", "Lara", "Sophie", "Toby" };
		final String[] SURNAMES = { "Marshall", "Blankenship", "Sheppard", "Morse", "Calderon", "Palmer", "Nolan", "Silva", "Moore", "Martin" };
		final Integer TOTALPEOPLE = 50;
		final Integer TOTALEXAMS = 3;
		final Integer MAXPOINTS = 100;
		final Integer MINPOINTS = 0;
		ArrayList<Student> students = new ArrayList<>();
		
		students = generateStudents(NAMES, SURNAMES, TOTALPEOPLE, TOTALEXAMS, MAXPOINTS, MINPOINTS);
		consolePrintStudents(students);
		
		
	}

	/**
	 * @param NAMES
	 * @param SURNAMES
	 * @param TOTALPEOPLE
	 * @param TOTALEXAMS
	 * @param MAXPOINTS
	 * @param MINPOINTS
	 * @return Students (ArrayList<Student>)
	 * 
	 * Genera la cantidad de personas que quieras, con los nombres y apellidos que pases por parametros
	 */
	private static ArrayList<Student> generateStudents(final String[] NAMES, final String[] SURNAMES, final Integer TOTALPEOPLE, Integer TOTALEXAMS, Integer MAXPOINTS, Integer MINPOINTS) {
		ArrayList<Student> students = new ArrayList<>(); 
		Student student;
		
		ArrayList<Float> marks;
		Integer markPos;
		
		Random random = new Random();
		Integer namePosRandom;
		Integer surnamePosRandom;
		
		String name;
		String surname;

		for (Integer personPos = 0; personPos < TOTALPEOPLE; personPos++) {
			student = new Student();
			marks = new ArrayList<>(Collections.nCopies(TOTALEXAMS, 0F));
			
			for (Float mark : new ArrayList<Float>(marks)) {
				markPos = marks.indexOf(mark);
				mark = (random.nextInt(MAXPOINTS - MINPOINTS + 1) + MINPOINTS) - random.nextFloat();
				marks.set(markPos, mark);
			}
			namePosRandom = random.nextInt(NAMES.length);
			surnamePosRandom = random.nextInt(SURNAMES.length);
			
			name = NAMES[namePosRandom];
			surname = SURNAMES[surnamePosRandom];
			
			student.setName(name);
			student.setSurname(surname);
			student.setMarks(marks);
			
			students.add(student);
		}
		
		return students;
	}
	
	/**
	 * @param people
	 * 
	 * Imprime por consola las personas.
	 */
	private static void consolePrintStudents(ArrayList<Student> people) {
		String name;
		String surname;
		ArrayList<Float> marks;
		String marksStr = "";
		
		Leer.mostrarEnPantalla("Personas");
		System.out.printf("%-10s%-12s%9s\n", "Nombre", "Apellido", "Nota");
		for (Student person : people) {
			name = person.getName();
			surname = person.getSurname();
			marks = person.getMarks();
			marksStr = "";
			
			for (Float mark : marks) {
				marksStr += "\t" + mark;
			}
			
			System.out.printf("%-10s%-12s%" + marksStr.length() +"s\n", name, surname, marksStr);
		}
	}
}
