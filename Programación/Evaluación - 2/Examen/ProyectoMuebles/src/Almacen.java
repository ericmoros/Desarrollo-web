/**
 * @author Eric Moros Pérez
 *
 */
public class Almacen {
	private String nombre;
	private String direccion;
	private Mueble[] muebles;
	
	/**
	 * Constructor del almacen
	 * 
	 * @param nombre
	 * @param direccion
	 * @param muebles
	 */
	public Almacen(String nombre, String direccion, Mueble[] muebles) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.muebles = muebles;
	}

	/**
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * edita el nombre del objeto
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * edita la dirección del objeto
	 * 
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Da una lista de muebles
	 * (AVISO: Puede contener nulos)
	 * 
	 * @return muebles[]
	 */
	public Mueble[] getMuebles() {
		return muebles;
	}
	/**
	 * Edita la lista de muebles
	 * 
	 * @param muebles
	 */
	public void setMuebles(Mueble[] muebles) {
		this.muebles = muebles;
	}
	
	/**
	 * Formato: "Nombre: " +  nombre + ", Dirección: " + direccion
	 * 
	 * @return cadenaAlmacen
	 */
	public String muestraAlmacen() {
		return "Nombre: " +  nombre + ", Dirección: " + direccion;
	}
}