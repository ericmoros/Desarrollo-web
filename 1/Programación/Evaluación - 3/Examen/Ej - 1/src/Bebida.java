import java.util.Comparator;

public class Bebida implements Comparable<Bebida> {
	private String marca;
	private Float precio;
	private Integer volumen;
	private Integer stock;

	public Bebida(String marca, Float precio, Integer volumen, Integer stock) {
		this.marca = marca;
		this.precio = precio;
		this.volumen = volumen;
		this.stock = stock;
	}

	public String getMarca() {
		return marca;
	}

	public Float getPrecio() {
		return precio;
	}

	public Integer getVolumen() {
		return volumen;
	}

	public Integer getStock() {
		return stock;
	}

	public static Comparator<Bebida> bebidaMarcaComparator = new Comparator<Bebida>() {
		public int compare(Bebida bebida1, Bebida bebida2) {
			String marca1;
			String marca2;
			
			marca1 = bebida1.getMarca().toUpperCase();
			marca2 = bebida2.getMarca().toUpperCase();
			
			return marca1.compareTo(marca2);
		}
	};

	@Override
	public int compareTo(Bebida bebida) {
		return this.marca.compareTo(bebida.marca);
	}

	@Override
	public String toString() {
		return "Marca: " + marca + ",\t Precio: " + precio + ",\t Volumen: " + volumen + ",\t Stock: " + stock;
	}
}
