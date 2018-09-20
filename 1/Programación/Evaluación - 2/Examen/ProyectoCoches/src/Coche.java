public class Coche {
	private String matricula;
	private String marca;
	private String modelo;
	private Fecha fechaFabricacion;
	private Boolean disponible;
	private Integer precioDiario;
	
	public Coche(String matricula, String marca, String modelo, Fecha fechaFabricacion, Boolean disponible, Integer precioDiario) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.fechaFabricacion = fechaFabricacion;
		this.disponible = disponible;
		this.precioDiario = precioDiario;
	}

	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Fecha getFechaFabricacion() {
		return fechaFabricacion;
	}
	public void setFechaFabricacion(Fecha fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}

	public Boolean getDisponible() {
		return disponible;
	}
	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}

	public Integer getPrecioDiario() {
		return precioDiario;
	}
	public void setPrecioDiario(Integer precioDiario) {
		this.precioDiario = precioDiario;
	}
	
	public String cadenaCoche() {
		return "Matricula: " + matricula + ", Marca: " + marca + ", Modelo: " + modelo + ", Fecha de fabricación: " + fechaFabricacion + ", Boolean: " +  disponible + ", Precio diario: " + precioDiario;
	}
}
