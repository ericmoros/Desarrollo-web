/**
 * Desarrollar un  programa  en  Java  que  utilice una  clase  que  se  llame 
 * Indicador que  sea  la representación  de  un  indicador  de
 * la  vida  real  (indicadores  de  nivel,  de  velocidad, tacómetros,   etc).
 * Deberá tener los mínimos elementos   para   representar   valores, 
 * ajustarlos con un valor de  inicio, imprimir el valor, modificarlosa un
 * valor determinado e incrementar y disminuir el valor con el que cuentan.
 *
 * @return      Sube y baja la velocidad  del coche virtual
 * @see         Indicador.java
 * @author 		Elferic
 */

public class Indicador {
	private static Integer speed = 0;
	
	public static void treadle(Boolean treadle) {
		if (treadle) {
			speed++;
		} else {
			speed--;
		}
	}
	
	public static Integer getSpeed() {
		return speed;
	}
}
