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
	ArrayList<Float> mark = new ArrayList<>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public ArrayList<Float> getMarks() {
		return mark;
	}
	public void setMarks(ArrayList<Float> mark) {
		this.mark = mark;
	}
	
}
