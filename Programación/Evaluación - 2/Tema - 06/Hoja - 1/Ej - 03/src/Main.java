
public class Main {
	public static void main(String[] args) {
		Integer day, month, year;
		Date date1;
		
		//Fecha...
		Console.print("Introduce el d�a: ");
		day = Integer.parseInt(Console.readEnter());
		
		Console.print("Introduce el mes: ");
		month = Integer.parseInt(Console.readEnter());
		
		Console.print("Introduce el a�o: ");
		year = Integer.parseInt(Console.readEnter());
		
		
//		Console.setDate(date1, day, month, year);
		date1 = new Date(day, month, year);
		
		
		Console.printDate(date1);
	}
}
