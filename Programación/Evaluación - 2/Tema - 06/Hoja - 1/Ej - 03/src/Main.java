public class Main {
	public static void main(String[] args) {
		String inputText;
		do {
			Console.printMenu();
			Console.print(Text.newLine);
			inputText = Console.readEnter();
				
			for (int posChar = 0; posChar < inputText.length(); posChar++) {
				char actualChar = inputText.charAt(posChar);
				
				if (Check.textChar(actualChar, Text.opt1, true)) {
					String  name;
					Integer day;
					Integer month;
					Integer year;
					
					Console.print(Text.askName);
					name = Console.readEnter();
					do {
						day   = Console.loopAskEnterStrToInt(Text.askDay);
						month = Console.loopAskEnterStrToInt(Text.askMonth);
						year  = Console.loopAskEnterStrToInt(Text.askYear);
					} while (! Check.date(day, month, year));
					
					Ultimate.register(name, day, month, year);
				} else if (Check.textChar(actualChar, Text.opt2, true)) {
					for (String dateName: Ultimate.list()) {
						Console.print(dateName + Text.newLine);
					}
				} else if (Check.textChar(actualChar, Text.opt3, true)) {/////////
					Console.print(Text.askDate);
					String inputDate = Console.readEnter();
					if (Check.dateInList(inputDate)) {
						Date date = Ultimate.getDate(inputDate);
						Console.printDate(date);
					} else {
						Console.print(Text.noDate(inputDate));
					}
					Console.print(Text.newLine);
				} else if (Check.textChar(actualChar, Text.opt4, true)) { ////////
					Console.print(Text.askDate);
					String inputDate = Console.readEnter();
					if (Check.dateInList(inputDate)) {
						Date date = Ultimate.getDate(inputDate);
						Console.printDateDay(date);
					} else {
						Console.print(Text.noDate(inputDate));
					}
					Console.print(Text.newLine);
				} else if (Check.textChar(actualChar, Text.opt5, true)) {////////
					Console.print(Text.askDate);
					String inputDate = Console.readEnter();
					Console.print(Text.askDate);
					String inputDate2 = Console.readEnter();
					
					if (Check.dateInList(inputDate) && Check.dateInList(inputDate2)) {
						Date date = Ultimate.getDate(inputDate);
						Date date2 = Ultimate.getDate(inputDate2);
						Integer differeceDays = Convert.dateToNumber(date) - Convert.dateToNumber(date2);
						Console.print(Text.dateDifference(inputDate, differeceDays, inputDate2));
					} else {
						Console.print(Text.noDate("[" + inputDate + "/" + inputDate2 + "]"));
					}
					Console.print(Text.newLine);
				}
			}
			Console.print(Text.pressEnter);
			Console.readEnter();
		} while (! Check.textChar(inputText.charAt(0), Text.opt10, true));
		
		
		
//		HashMap<String, Date> dateList = new HashMap<>();
//		String name;
//		Integer day, month, year;
//		
//		//Fecha...
//		do {
//			Console.print("Nombre de la fecha: ");
//			name = Console.readEnter();
//			do {
//				day = Console.loopAskEnterStrToInt("Introduce el día: ");
//				month = Console.loopAskEnterStrToInt("Introduce el mes: ");
//				year = Console.loopAskEnterStrToInt("Introduce el año: ");
//				
//			} while (! Check.date(day, month, year));
//			
//			dateList.put(name, new Date(day, month, year));
//			
//			for (String dateName: dateList.keySet()) {
//				Console.print(dateName + ": ");
//				Console.printDate(dateList.get(dateName));
//				Console.print("\n");
//			}
//			Console.print("\n");
//			
//			
//		} while (true != false);
		
		
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
