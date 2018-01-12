import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		HashMap<String, Date> dateList = new HashMap<>();
		String name;
		Integer day, month, year;
		
		Check.stringNumber("0123456789");
		
		do {
			//Fecha...
			Console.print("Nombre de la fecha: ");
			name = Console.readEnter();
			day = Console.loopAskEnterStrToInt("Introduce el día: ");
			month = Console.loopAskEnterStrToInt("Introduce el mes: ");
			year = Console.loopAskEnterStrToInt("Introduce el año: ");
			
			dateList.put(name, new Date(day, month, year));
			
			for (String dateName: dateList.keySet()) {
				Console.print(dateName + ": ");
				Console.printDate(dateList.get(dateName));
				Console.print("\n");
			}
			Console.print("\n");
		} while (true != false);
		
		
//		Console.print("\n");<
//		
//		//Fecha...
//		day = Console.loopAskEnterStrToInt("Introduce el día: ");
//		month = Console.loopAskEnterStrToInt("Introduce el mes: ");
//		year = Console.loopAskEnterStrToInt("Introduce el año: ");
//		
//		
////				Console.setDate(date1, day, month, year);
//		date2 = new Date(day, month, year);
//		Console.printDate(date2);
//		Console.print("\n");
		
		
		
//		Console.print("Diferencia de " + (Convert.dateToNumber(date1) - Convert.dateToNumber(date2)) + " días");
	}
}
