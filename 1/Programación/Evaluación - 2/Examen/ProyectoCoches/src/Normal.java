public class Normal extends Coche {
	private String parking;

	public Normal(String matricula, String marca, String modelo, Fecha fechaFabricacion, Boolean disponible, Integer precioDiario, String parking) {
		super(matricula, marca, modelo, fechaFabricacion, disponible, precioDiario);
		this.setParking(parking);
	}

	public String getParking() {
		return parking;
	}
	public void setParking(String parking) {
		this.parking = parking;
	}	
}