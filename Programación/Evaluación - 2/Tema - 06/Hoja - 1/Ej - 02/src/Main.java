import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Hora clock = new Hora();
		Scanner keyboard = new Scanner(System.in);
		Useful.print("Presiona para iniciar el reloj");
		keyboard.nextLine();
		clock.on();
		
		for (int loop = 0; loop < -1; loop++) {
			Useful.print("Presiona para ver la hora");
			keyboard.nextLine();
			Useful.print(clock.getHour() + "" + clock.getMin() + "" + clock.getSec());
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