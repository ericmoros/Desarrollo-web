import java.util.ArrayList;
import java.util.HashMap;

public class Ultimate {
	private static HashMap<String, Date> dateList = new HashMap<>();
	
	public static void register(String name, Integer day, Integer month, Integer year) {
		dateList.put(name, new Date(day, month, year));
	}

	public static ArrayList<String> list() {
		ArrayList<String> dateArray = new ArrayList<>();
		
		for (String dateName: dateList.keySet()) {
			dateArray.add(dateName);
		}
		
		return dateArray;
	}
	
	public static Date getDate(String key) {
		Date date = dateList.get(key);
		return date;
	}
}
