import java.util.HashMap;

public class Ultimate {
	private static HashMap<String, Date> dateList = new HashMap<>();
	
	public static void register(String name, String day, String month, String year) {
		do {
			day = ;
			month = Console.loopAskEnterStrToInt("Introduce el mes: ");
			year = Console.loopAskEnterStrToInt("Introduce el año: ");
			
		} while (! Check.date(day, month, year));
		
		dateList.put(name, new Date(day, month, year));
	}
}
