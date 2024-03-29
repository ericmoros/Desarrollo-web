import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @author Eric Moros P�rez
 *
 */
public class Main {

	/**
	 * @param args
	 * 
	 *            En este ejercicio se generan los datos a partir de dos vectores de
	 *            10 nombres y 10 apellidos combin�ndolos al azar. Hay que generar
	 *            un ArrayList de 50 alumnos para guardar el nombre, el apellido y
	 *            las notas obtenidas en tres ex�menes parciales que se punt�an
	 *            entre 0 y 100.
	 * 
	 *            El programa debe: 1. Generar al azar los datos de 50 alumnos. Cada
	 *            alumno se almacenar� en un elemento del ArrayList. Los datos que
	 *            queremos guardar de cada alumno son: string nombre; string
	 *            apellido; int nota1; int nota2; int nota3; 2. Despu�s generar tres
	 *            mapas (TreeMap), uno para cada nota, donde la key ser� la nota por
	 *            la que ordenamos y el dato asociado un ArrayList con los �ndices
	 *            del vector donde aparece esa nota (puede haber varios alumnos que
	 *            tengan la misma nota). 3. Presentar un men� para poder listar la
	 *            clase por cualquiera de las tres notas en orden ascendente, es
	 *            decir ascen1�, ascen2�, ascen3�. 4. Presentar en pantalla el
	 *            listado requerido
	 * 
	 *            De esta forma no hay que reordenar el ArrayList cada vez que se
	 *            pide un tipo de listado pues el ArrayList, aunque este
	 *            desordenado, es accesible en el orden de las notas seg�n el mapa
	 *            que se recorra.
	 *
	 */
	public static void main(String[] args) {
		final String[] NAMES = { "Ciara", "Sarah", "Joy", "Tobias", "Leigh", "James", "Sawyer", "Veda", "Susan", "Lara",
				"Sophie", "Toby" };
		final String[] SURNAMES = { "Marshall", "Blankenship", "Sheppard", "Morse", "Calderon", "Palmer", "Nolan",
				"Silva", "Moore", "Martin" };
		final Integer TOTALPEOPLE = 50;
		final Integer TOTALEXAMS = 3;
		final Integer MAXPOINTS = 100;
		final Integer MINPOINTS = 0;
		ArrayList<Student> students = new ArrayList<>();

		students = generateStudents(NAMES, SURNAMES, TOTALPEOPLE, TOTALEXAMS, MAXPOINTS, MINPOINTS);
		consolePrintStudents(students, TOTALEXAMS);

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
	 *         Genera la cantidad de personas que quieras, con los nombres y
	 *         apellidos que pases por parametros
	 */
	private static ArrayList<Student> generateStudents(final String[] NAMES, final String[] SURNAMES,
			final Integer TOTALPEOPLE, Integer TOTALEXAMS, Integer MAXPOINTS, Integer MINPOINTS) {
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
				mark = (random.nextFloat() * (MAXPOINTS - MINPOINTS) + MINPOINTS);
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
	 * @param students
	 * @param TOTALEXAMS
	 * 
	 *            Imprime por consola las personas.
	 */
	private static void consolePrintStudents(ArrayList<Student> students, Integer TOTALEXAMS) {
		DecimalFormat format = new DecimalFormat("00.00");
		String formatColumns = "";
		String columnName = "Nombre";
		String columnSurname = "Apellido";
		String columnMark = "Nota ";
		String tmpcm;
		Integer columnMarkLength;

		Integer nameMaxLenght = columnName.length() + 1;
		Integer surnameMaxLenght = columnSurname.length() + 1;
		ArrayList<Integer> marksFormatedMaxLength = new ArrayList<>(Collections.nCopies(TOTALEXAMS, 0));
		Integer result = 0;

		String name;
		String surname;

		ArrayList<Float> marks;
		String markFormated;
		Float mark;
		Integer markFormatedLenght;

		Integer nameLength = 0;
		Integer surnameLength = 0;

		//
		Leer.mostrarEnPantalla("Personas");
		for (Student student : students) {
			name = student.getName();
			surname = student.getSurname();
			marks = student.getMarks();

			nameLength = name.length() + 1;
			surnameLength = surname.length() + 1;

			if (nameMaxLenght < nameLength) {
				nameMaxLenght = nameLength;
			}

			if (surnameMaxLenght < surnameLength) {
				surnameMaxLenght = surnameLength;
			}

			for (Integer markPos = 0; markPos < TOTALEXAMS; markPos++) {
				mark = marks.get(markPos);
				markFormated = format.format(mark);
				markFormatedLenght = markFormated.length();

				if (marksFormatedMaxLength.get(markPos) < markFormatedLenght) {
					marksFormatedMaxLength.set(markPos, markFormatedLenght);
				}
			}

		}

		//
		formatColumns = "%-" + nameMaxLenght + "s%-" + surnameMaxLenght + "s";

		System.out.printf(formatColumns, columnName, columnSurname);

		for (Integer mfmlPos = 0; mfmlPos < marksFormatedMaxLength.size(); mfmlPos++) {
			tmpcm = columnMark;
			tmpcm += (mfmlPos + 1);
			columnMarkLength = tmpcm.length();
			if (marksFormatedMaxLength.get(mfmlPos) < columnMarkLength) {
				marksFormatedMaxLength.set(mfmlPos, columnMarkLength);
			}
			result = marksFormatedMaxLength.get(mfmlPos) + 1;
			formatColumns = "%-" + result.toString() + 's';
			System.out.printf(formatColumns, tmpcm);
		}
		System.out.println();

		//
		for (Student student : students) {
			formatColumns = "%-" + nameMaxLenght + "s%-" + surnameMaxLenght + "s";
			name = student.getName();
			surname = student.getSurname();
			marks = student.getMarks();

			System.out.printf(formatColumns, name, surname);

			for (Integer markPos = 0; markPos < TOTALEXAMS; markPos++) {
				mark = marks.get(markPos);
				markFormated = format.format(mark);
				result = marksFormatedMaxLength.get(markPos) + 1;
				formatColumns = "%-" + result.toString() + 's';
				System.out.printf(formatColumns, markFormated);

			}
			System.out.println();
		}
	}
}
