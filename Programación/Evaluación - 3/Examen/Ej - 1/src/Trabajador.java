
public class Trabajador extends Persona  {
	private String categoria;
	private Float sueldo;
	
	
	public Trabajador(String nombre, String apellido, String categoria, Float sueldo) {
		super(nombre, apellido);
		this.categoria = categoria;
		this.sueldo = sueldo;
	}


	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Float getSueldo() {
		return sueldo;
	}
	public void setSueldo(Float sueldo) {
		this.sueldo = sueldo;
	}
	
	public int compareTo(Trabajador persona) {
		if (!this.categoria.equals(persona.categoria)) return this.categoria.compareTo(persona.categoria);
		if (!this.apellido.equals(persona.apellido)) return this.apellido.compareTo(persona.apellido);
		else return this.nombre.compareTo(persona.nombre);
	}
	
	@Override
	public String toString() {// formato para la escritura en el archivo
		return nombre + " " + apellido + ": " + categoria + " " + sueldo + '€';
	}
}
