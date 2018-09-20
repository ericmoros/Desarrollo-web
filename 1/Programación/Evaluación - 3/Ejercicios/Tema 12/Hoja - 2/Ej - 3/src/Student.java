import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Eric Moros Pérez
 *
 */
public class Student {
	String name;
	String surname;
	ArrayList<Float> marks = new ArrayList<>();

	/**
	 * @return name
	 * 
	 *         Devuelve el nombre
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 * 
	 *            Establece el nombre
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return surname
	 * 
	 *         Devuelve el apellido
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname
	 *            Establece el apellido
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return marks
	 * 
	 *         Devuelve una ArrayList de notas
	 */
	public ArrayList<Float> getMarks() {
		return marks;
	}

	/**
	 * @param marks
	 * 
	 *            Establece un ArrayList de notas
	 */
	public void setMarks(ArrayList<Float> marks) {
		this.marks = marks;
	}

}
