public class Main {
	public static void main(String[] args) {
		Clock clock = new Clock();
		Time time = new Time(clock);
		Thread thread = new Thread(time);
		
		Console.print("Presiona [Enter] para iniciar tu reloj");
		Console.readEnter();
		thread.start();
		
		Console.print("Presiona [Enter] para ver la hora");
		for (int loop = 0; loop > -1; loop++) {
			Console.readEnter();
			Console.printTime(clock);
		}
	}
}

/*
Desarrollar un programa en Java que utilice una clase que se
llame {Horaconmiembros} detipo intpara hora, minutos y segundos.
Deber� tener unconstructor para inicializar la hora a  0  o  a
una  hora  determinada  (hora,  minutos,  segundos).Se  deber�
poder  sumar  y  restar horas,as� como imprimir y leer una hora.
El formato de impresi�n y lectura ser� hh:mm:ss, todo en modo
24 horas.
 */