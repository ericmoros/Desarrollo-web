/**
 * 
 */

/**
 * @author Eric Moros Pérez
 *
 */
public class Partido {
	private String nombre;
	private Integer votos;
	private Integer escanyos=0;

	public Partido(String nombre, Integer votos) {
		this.nombre = nombre;
		this.votos = votos;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getVotos() {
		return votos;
	}
	public void setVotos(Integer votos) {
		this.votos = votos;
	}
	public Integer getEscanyos() {
		return escanyos;
	}
	public void addEscanyos() {
		this.escanyos++;
	}
}
