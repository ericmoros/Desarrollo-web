/**
 * @author Eric Moros Pérez
 *
 */
public class Mueble {
	private static Integer siguiente = 0; //No acabo de ver para que quiero ver el siguiente aquí
	private Integer codigo;
	private String descripcion;
	private Integer alto;
	private Integer ancho;
	private Integer fondo;
	
	/**
	 * Constructor del Mueble
	 * 
	 * @param descripcion
	 * @param alto
	 * @param ancho
	 * @param fondo
	 */
	public Mueble(String descripcion, Integer alto, Integer ancho, Integer fondo) {
		this.descripcion = descripcion;
		this.alto = alto;
		this.ancho = ancho;
		this.fondo = fondo;
		codigo = siguiente;
		siguiente++;
	}

	/**
	 * @return codigo
	 */
	public Integer getCodigo() {
		return codigo;
	}
	/**
	 * Edita el codigo del objeto
	 * 
	 * @param codigo
	 */
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return siguiente
	 */
	public Integer getSiguiente() {
		return siguiente;
	}
	/**
	 * Edita el siguiente código del objeto
	 * 
	 * @param siguiente
	 */
	@SuppressWarnings("static-access")
	public void setSiguiente(Integer siguiente) {
		this.siguiente = siguiente;
	}

	/**
	 * @return descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * Edita la descripcion del objeto
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return alto
	 */
	public Integer getAlto() {
		return alto;
	}
	/**
	 * Edita el alto del objeto
	 * 
	 * @param alto
	 */
	public void setAlto(Integer alto) {
		this.alto = alto;
	}

	/**
	 * @return ancho
	 */
	public Integer getAncho() {
		return ancho;
	}
	/**
	 * Edita el ancho del objeto
	 * 
	 * @param ancho
	 */
	public void setAncho(Integer ancho) {
		this.ancho = ancho;
	}

	/**
	 * @return fondo
	 */
	public Integer getFondo() {
		return fondo;
	}
	/**
	 * Edita el fondo del objeto
	 * 
	 * @param fondo
	 */
	public void setFondo(Integer fondo) {
		this.fondo = fondo;
	}
	
	/**
	 * Formato: "Código: " + codigo + ", Siguiente: " + siguiente + ", Descripción: " + descripcion + ", Alto: " + alto + ", Ancho: " + ancho + ", Fondo: " +  fondo
	 * 
	 * @return cadenaMueble
	 */
	public String muestraMueble() {
		return "Código: " + codigo + ", Siguiente: " + siguiente + ", Descripción: " + descripcion + ", Alto: " + alto + ", Ancho: " + ancho + ", Fondo: " +  fondo;
	}
}