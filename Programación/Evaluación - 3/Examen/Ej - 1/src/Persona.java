public class Persona implements Comparable<Persona> {
	protected String nombre;
	protected String apellido;

	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	@Override
	public int compareTo(Persona persona) {
		if (!this.nombre.equals(persona.nombre)) return this.nombre.compareTo(persona.nombre);
		else return this.apellido.compareTo(persona.apellido);
	}

	@Override
	public String toString() {// formato para la escritura en el archivo
		return nombre + " " + apellido;
	}
}
