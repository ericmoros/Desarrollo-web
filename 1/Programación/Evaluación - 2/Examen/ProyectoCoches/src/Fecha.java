/**
 * 
 */

/**
 * @author yo
 *
 */
public class Fecha {
	private Integer dia;
	private Integer mes;
	private Integer anio;
	
	
	/**
	 * @param dia
	 * @param mes
	 * @param anyo
	 */
	public Fecha(Integer dia, Integer mes, Integer anyo) {
		if (esCorrecta(dia, mes, anyo)){
			this.dia = dia;
			this.mes = mes;
			this.anio = anyo;		
		}
	}

	/**
	 * @return Boolean correcta
	 */
	private Boolean esCorrecta(Integer dia, Integer mes, Integer anyo) {
		Boolean correcta=true;
		if (anyo < 1583){// 1 de enero de 1583 fue Martes
			correcta=false;
		} else{
			if(mes < 1 || mes > 12){
				correcta=false;
			} else{
				if (dia < 1 || dia > diasMes(mes, anyo)){
					correcta=false;
				}
			}
		}
		return correcta;
	}
	
	/**
	 * @return boolean bisiesto
	 */
	public Boolean esBisiesto() {		
		return esBisiesto(this.anio);
	}
	/**
	 * @return boolean bisiesto pero sin fecha, con un número para el año
	 */

	private Boolean esBisiesto(Integer anyo) {
		Boolean bisiesto=false;
		if ((anyo % 4 == 0) && ((anyo % 100 != 0) || (anyo % 400 == 0))){
			bisiesto=true;
		};
		return bisiesto;
	}
	/**
	 * @return Integer diasMes
	 */
	public Integer diasMes() {
		return diasMes(this.mes, this.anio);
	}
	
	/**
	 * @return Integer diasMes con un número para mes y año
	 */
	private Integer diasMes(Integer mes, Integer anyo) {
		Integer diasMes;
		Integer [] dias={31,28,31,30,31,30,31,31,30,31,30,31};
		if (esBisiesto(anyo)){
			dias[1]=29;
		}
		diasMes=dias[mes-1];
		return diasMes;
	}
	
	/**
	 * @return Integer dias desde 1-1-1583 
	 */
	private Integer diasDesde() {
		Fecha fecha=new Fecha(1,1,1583);
		int dias=0;
		for (int i= fecha.getAnio(); i<this.anio; i++){
			dias=dias+365;
			if(esBisiesto(i)){
				dias++;
			}
		}
		for (int i= 1; i<this.mes; i++){
			dias=dias+diasMes(i,this.anio);
		}
		dias=dias+this.dia;
		return dias;
	}
	
	/**
	 * @return Integer de AAAAMMDD
	 */

	public int valorFecha(){
		int valor;
		valor=this.anio*10000+this.mes*100+this.dia;
		return valor;
	}
	/**
	 * @return Integer diferencia entre las fechas.
	 * Si la fecha del parámentro es menor que la de invocación, el resultado será negativo
	 * si es mayor que la fecha con la que se invoca, será positivo.
	 */

	public Integer difFechas(Fecha fecha) {
		int diasDesde, diasHasta;
		diasDesde=this.diasDesde();
		diasHasta=fecha.diasDesde();
		return diasHasta-diasDesde;
	}

	/**
	 * @return Fecha suma días a una fecha. El número debe ser > que cero
	 */

	public Fecha sumaDias(int dias) {
		Fecha fecha=new Fecha(this.dia, this.mes, this.anio);
		while (dias>0){
			fecha.setDia(fecha.getDia()+1);
			if(fecha.getDia()>fecha.diasMes()){
				fecha.setDia(1);
				fecha.setMes(fecha.getMes()+1);
				if(fecha.getMes()>12){
					fecha.setMes(1);
					fecha.setAnio(fecha.getAnio()+1);
				}
			}
			dias--;
		}
		return fecha;
	}

	/**
	 * @return the dia
	 */
	public Integer getDia() {
		return dia;
	}


	/**
	 * @param dia the dia to set
	 */
	private void setDia(Integer dia) {
		this.dia = dia;
	}


	/**
	 * @return the mes
	 */
	public Integer getMes() {
		return mes;
	}


	/**
	 * @param mes the mes to set
	 */
	private void setMes(Integer mes) {
		this.mes = mes;
	}


	/**
	 * @return the anyo
	 */
	public Integer getAnio() {
		return anio;
	}


	/**
	 * @param anyo the anyo to set
	 */
	private void setAnio(Integer anyo) {
		this.anio = anyo;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", anio=" + anio + "]";
	}
	/**
	 * @return String fecha en formato texto
	 */

	public String fechaTexto() {
		return "Fecha "+ this.dia + " de " + this.mesTexto() + " de " + this.anio;
	}
	/**
	 * @return String mes en formato texto
	 */

	public String mesTexto() {
		String [] meses={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		return meses[mes-1];
	}

}
