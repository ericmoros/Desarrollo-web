public class Lujo extends Coche{
	private Integer codigo;
	private static Integer siguiente = 10001;
	
	public Lujo(String matricula, String marca, String modelo, Fecha fechaFabricacion, Boolean disponible, Integer precioDiario) {
		super(matricula, marca, modelo, fechaFabricacion, disponible, precioDiario);
		this.codigo = siguiente;
		siguiente++;
	}

	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public static Integer getSiguiente() {
		return siguiente;
	}
	public static void setSiguiente(Integer siguiente) {
		Lujo.siguiente = siguiente;
	}	
}