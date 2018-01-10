
public class Main {
	public static void main(String[] args) {
		Integer day, month, year;
		Date date1;
		Date date2;
		
		//Fecha...
		Console.print("Introduce el día: ");
		day = Integer.parseInt(Console.readEnter());
		
		Console.print("Introduce el mes: ");
		month = Integer.parseInt(Console.readEnter());
		
		Console.print("Introduce el año: ");
		year = Integer.parseInt(Console.readEnter());
		
		
//		Console.setDate(date1, day, month, year);
		date1 = new Date(day, month, year);
		Console.printDate(date1);
		Console.print("\n");
		
		//Fecha...
		Console.print("Introduce el día: ");
		day = Integer.parseInt(Console.readEnter());
		
		Console.print("Introduce el mes: ");
		month = Integer.parseInt(Console.readEnter());
		
		Console.print("Introduce el año: ");
		year = Integer.parseInt(Console.readEnter());
		
		
//				Console.setDate(date1, day, month, year);
		date2 = new Date(day, month, year);
		Console.printDate(date2);
		Console.print("\n");
		
		
		
		Console.print("Diferencia de " + (Convert.dateToNumber(date1) - Convert.dateToNumber(date2)) + " días");
	}
}
