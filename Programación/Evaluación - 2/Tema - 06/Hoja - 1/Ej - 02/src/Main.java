
import java.util.Scanner;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Clock clock = new Clock();
		Time time = new Time(clock);
		Thread hands = new Thread(time);
		
		Console.print("Presiona [Enter] para iniciar tu reloj");
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		hands.start();
		
		Console.print("Presiona [Enter] para ver la hora");

		Console.print(clock.getHour() + "" + clock.getMin() + "" + clock.getSec());
		
		for (int loop = 0; loop < -1; loop++) {
			Console.print("Presiona [Enter] para ver la hora");
			keyboard.nextLine();
			Console.print(clock.getHour() + "" + clock.getMin() + "" + clock.getSec());
		}
	}
}

/*
Desarrollar un programa en Java que utilice una clase que se
llame {Horaconmiembros} detipo intpara hora, minutos y segundos.
Deberá tener unconstructor para inicializar la hora a  0  o  a
una  hora  determinada  (hora,  minutos,  segundos).Se  deberá
poder  sumar  y  restar horas,así como imprimir y leer una hora.
El formato de impresión y lectura será hh:mm:ss, todo en modo
24 horas.
 */