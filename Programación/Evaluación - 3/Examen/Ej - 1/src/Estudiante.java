
public class Estudiante extends Persona {
	private String estudios;
	private Integer curso;
	
	
	public Estudiante(String nombre, String apellido, String estudios, Integer curso) {
		super(nombre, apellido);
		this.estudios = estudios;
		this.curso = curso;
	}
	
	
	public String getEstudios() {
		return estudios;
	}
	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}
	
	public Integer getCurso() {
		return curso;
	}
	public void setCurso(Integer curso) {
		this.curso = curso;
	}
	
	public int compareTo(Estudiante persona) {
		if (!this.estudios.equals(persona.estudios)) return this.estudios.compareTo(persona.estudios);
		if (!this.curso.equals(persona.curso)) return this.curso.compareTo(persona.curso);
		if (!this.apellido.equals(persona.apellido)) return this.apellido.compareTo(persona.apellido);
		else return this.nombre.compareTo(persona.nombre);
	}

	@Override
	public String toString() {// formato para la escritura en el archivo
		return nombre + " " + apellido + ": " + estudios + " " + curso + 'º';
	}
}
