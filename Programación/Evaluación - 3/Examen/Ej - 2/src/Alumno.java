import java.io.Serializable;
import java.util.Comparator;

public class Alumno implements Comparable<Alumno>, Separable, Serializable {
	public String nombre;
	public String apellidos;
	public Integer edad;
	public String grupo;
	public Boolean desayuno;
	public Boolean comida;
	public Boolean merienda;
	
	public Alumno(String nombre, String apellidos, Integer edad, String grupo, Boolean desayuno, Boolean comida,
			Boolean merienda) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.grupo = grupo;
		this.desayuno = desayuno;
		this.comida = comida;
		this.merienda = merienda;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getGrupo() {
		return grupo;
	}
	
	public Boolean getComida() {
		return comida;
	}
	
	public Boolean getDesayuno() {
		return desayuno;
	}
	
	public Boolean getMerienda() {
		return merienda;
	}
	
	
	
	public static Comparator<Alumno> alumnoApellidosNombreComparator = new Comparator<Alumno>() {
		public int compare(Alumno alumno1, Alumno alumno2) {
			Integer result;
			String apellidos1;
			String apellidos2;
			String nombre1;
			String nombre2;
			
			apellidos1 = alumno1.getApellidos().toUpperCase();
			apellidos2 = alumno2.getApellidos().toUpperCase();
			nombre1 = alumno1.getNombre().toUpperCase();
			nombre2 = alumno2.getNombre().toUpperCase();
			
			if (! apellidos1.equals(apellidos2)) {
				result = apellidos1.compareTo(apellidos2);
			} else {
				result = nombre1.compareTo(nombre2);
			}
			
			return result;
		}
	};

	public static Comparator<Alumno> alumnoGrupoApellidosNombreComparator = new Comparator<Alumno>() {
		public int compare(Alumno alumno1, Alumno alumno2) {
			Integer result;
			String grupo1;
			String grupo2;
			String apellidos1;
			String apellidos2;
			String nombre1;
			String nombre2;
			
			
			grupo1 = alumno1.getGrupo().toUpperCase();
			grupo2 = alumno2.getGrupo().toUpperCase();
			apellidos1 = alumno1.getApellidos().toUpperCase();
			apellidos2 = alumno2.getApellidos().toUpperCase();
			nombre1 = alumno1.getNombre().toUpperCase();
			nombre2 = alumno2.getNombre().toUpperCase();
			
			if (! grupo1.equals(grupo2)) {
				result = grupo1.compareTo(grupo2);
			} else if (! apellidos1.equals(apellidos2)) {
				result = apellidos1.compareTo(apellidos2);
			} else {
				result = nombre1.compareTo(nombre2);
			}
			
			return result;
		}
	};

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Apellidos: " + apellidos + ", edad: " + edad + ", grupo: " + grupo + ", desayuno: " + desayuno + ", comida: " + comida + ", merienda: " + merienda;
	}

	@Override
	public int compareTo(Alumno alumno) {
		return this.nombre.compareTo(nombre);
	}
}
