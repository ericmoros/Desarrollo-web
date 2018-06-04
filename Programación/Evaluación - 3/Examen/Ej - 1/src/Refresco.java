import java.util.Comparator;

public class Refresco extends Bebida {
	private Integer porcentajeAzucar;
	public String getSabor() {
		return sabor;
	}

	private String sabor;
	public Refresco(String marca, Float precio, Integer volumen, Integer stock, Integer porcentajeAzucar, String sabor) {
		super(marca, precio, volumen, stock);
		this.porcentajeAzucar = porcentajeAzucar;
		this.sabor = sabor;
	}
	
	public static Comparator<Refresco> refrescoSaborMarcaComparator = new Comparator<Refresco>() {
		public int compare(Refresco bebida1, Refresco bebida2) {
			Integer result; 
			String marca1;
			String marca2;
			String sabor1;
			String sabor2;
			
			marca1 = bebida1.getMarca().toUpperCase();
			marca2 = bebida2.getMarca().toUpperCase();
			sabor1 = bebida1.getSabor().toUpperCase();
			sabor2 = bebida2.getSabor().toUpperCase();
			
			if (!marca1.equals(marca2)) {
				result = marca1.compareTo(marca2);
			} else {
				result = sabor1.compareTo(sabor2);
			}
			
			return result;
		}
	};

	@Override
	public String toString() {
		return "Marca: " + this.getMarca() + ", Precio: " + this.getPrecio() + ", Volumen: " + this.getVolumen() + ", Stock: " + this.getStock() + ", Porcentaje de Azucar: " + porcentajeAzucar + ", Sabor: " + sabor;
	}
}
