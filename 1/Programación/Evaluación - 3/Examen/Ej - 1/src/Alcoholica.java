import java.util.Comparator;

public class Alcoholica extends Bebida {
	private Float graduacion;
	public Float getGraduacion() {
		return graduacion;
	}


	public String getTipo() {
		return tipo;
	}

	private String tipo;
	public Alcoholica(String marca, Float precio, Integer volumen, Integer stock, Float graduacion, String tipo) {
		super(marca, precio, volumen, stock);
		this.graduacion = graduacion;
		this.tipo = tipo;
	}
	
	//alcoholicaTipoGraduacionMarcaComparator
	public static Comparator<Alcoholica> alcoholicaTipoGraduacionMarcaComparator = new Comparator<Alcoholica>() {
		public int compare(Alcoholica alcoholica1, Alcoholica alcoholica2) {
			Integer result;
			String marca1;
			String marca2;
			String tipo1;
			String tipo2;
			Float graduacion1;
			Float graduacion2;
			
			graduacion1 = alcoholica1.getGraduacion();
			graduacion2 = alcoholica2.getGraduacion();
			tipo2 = alcoholica2.getTipo().toUpperCase();
			tipo1 = alcoholica1.getTipo().toUpperCase();
			marca1 = alcoholica1.getMarca().toUpperCase();
			marca2 = alcoholica2.getMarca().toUpperCase();
			
			if (!tipo1.equals(tipo2)) {
				result = tipo1.compareTo(tipo2);
			} else if (!graduacion1.equals(graduacion2)) {
				result = graduacion1.compareTo(graduacion2);
			} else {
				result = marca1.compareTo(marca2);
			}
			
			return result;
		}
	};
	

	@Override
	public String toString() {
		return "Marca: " + this.getMarca() + ", Precio: " + this.getPrecio() + ", Volumen: " + this.getVolumen() + ", Stock: " + this.getStock() + ", Graduación: " + graduacion + ", Tipo: " + tipo;
	}
}
