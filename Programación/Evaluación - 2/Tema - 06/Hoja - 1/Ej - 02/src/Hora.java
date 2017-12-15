import java.util.concurrent.TimeUnit;

public class Hora extends Thread {
	private static Integer hora, minutos, segundos;
	
	Hora() {
		hora = 0;
		minutos = 0;
		segundos = 0;
	}
	
	public Integer getHour() {
		return hora;
	}
	
	public Integer getMin() {
		return minutos;
	}
	
	public Integer getSec() {
		return segundos;
	}
	
	public void on() {
		while (hora < 23) {
			while (minutos < 59) {
				while (segundos < 59) {
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					segundos++;
				}
				minutos++;
			}
			hora++;
		}
		hora = 24;
		minutos = 0;
		segundos = 0;
	}
}


