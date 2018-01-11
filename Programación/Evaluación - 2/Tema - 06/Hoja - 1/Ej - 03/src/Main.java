
public class Main {
	public static void main(String[] args) {
		Integer day, month, year;
		Date date1;
		Date date2;
		
		Check.stringNumber("0123456789");
		
		//Fecha...
		day = Console.loopAskEnterStrToInt("Introduce el día: ");
		month = Console.loopAskEnterStrToInt("Introduce el mes: ");
		year = Console.loopAskEnterStrToInt("Introduce el año: ");
		
		
//		Console.setDate(date1, day, month, year);
		date1 = new Date(day, month, year);
		Console.printDate(date1);
		Console.print("\n");
		
		//Fecha...
		day = Console.loopAskEnterStrToInt("Introduce el día: ");
		month = Console.loopAskEnterStrToInt("Introduce el mes: ");
		year = Console.loopAskEnterStrToInt("Introduce el año: ");
		
		
//				Console.setDate(date1, day, month, year);
		date2 = new Date(day, month, year);
		Console.printDate(date2);
		Console.print("\n");
		
		
		
		Console.print("Diferencia de " + (Convert.dateToNumber(date1) - Convert.dateToNumber(date2)) + " días");
	}
}
