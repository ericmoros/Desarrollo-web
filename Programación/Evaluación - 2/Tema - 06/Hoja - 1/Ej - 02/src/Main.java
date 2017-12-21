public class Main {
	public static void main(String[] args) {
		Clock clock = new Clock();
		Time time = new Time(clock);
		Thread thread = new Thread(time);
		
		Console.print("Presiona [Enter] para iniciar tu reloj");
		Console.readEnter();
		thread.start();
		
		Console.printHelp();
		for (int loop = 0; loop > -1; loop++) {
			String inputText = Console.readEnter();
<<<<<<< HEAD
			
			for (int posChar = 0; posChar < inputText.length(); posChar++) {
				char actualChar = inputText.charAt(posChar);
				
				if (Check.textChar(actualChar, 'S', true)) {
					Console.setTime(clock, "Introduce la nueva hora");
				}
				
				if (Check.textChar(actualChar, 'C', true)) {
					Console.print("Pendiente\n");
				}
				
				if (Check.textChar(actualChar, 'H', true)) {
					Console.printHelp();
				}
=======
			if (inputText.length() != 0 && Check.textChar(inputText.charAt(0), "S")) {
				Console.setTime(clock, "Introduce la nueva hora");
>>>>>>> 6fbd630ea04ab6d9c134a8721d644833b26fbaeb
			}
			
			Console.printTime(clock);
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