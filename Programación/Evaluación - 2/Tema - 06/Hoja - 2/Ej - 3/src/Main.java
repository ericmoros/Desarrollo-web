
public class Main {
	public static void main(String[] args) {
		String inputText = "" + Text.opt9;
		
		new Author("Rosa10", "anonymous@privateserver.local", 0);
		
		while (! Check.textChar(inputText.charAt(0), Text.opt10, true)) {
			for (int posChar = 0; posChar < inputText.length(); posChar++) {
				char actualChar = inputText.charAt(posChar);
				if (Check.textChar(actualChar, Text.opt5, true)) {
					Author authorOld;
					Integer IDA;
					String name;
					String eMail;
					Integer genre;
					//
					Console.print(Text.askData);
					Console.print(Text.newLine);
					
					//
					Console.print(Text.askIDA);
					inputText = Console.readEnter();
					IDA = Integer.parseInt(inputText);
					authorOld = Authors.getAuthor(IDA);
					
					//
					Console.print(Text.askName);
					name = Console.readEnter();
					if (inputText != "") {
						name = inputText;
					} else {
						name = authorOld.getName();
					}
					
					//
					Console.print(Text.askEMail);
					eMail = Console.readEnter();
					if (inputText != "") {
						eMail = inputText;
					} else {
						eMail = authorOld.getEMail();
					}
					
					//
					Console.print(Text.askGenre);
					if (inputText != "") {
						genre = Integer.parseInt(Console.readEnter());
					} else {
						switch (authorOld.getGenre()) {
							case 'm':
								genre = 0;
								break;
							case 'f':
								genre = 1;
								break;
							default://Esto no haría
								genre = 0;
								break;
						}
					}
				
					//
					new Author(IDA, name, eMail, genre);
					
					Console.print(Text.newLine);
					Console.print(Text.authorModified);
					
				} else if (Check.textChar(actualChar, Text.opt6, true)) {
					Console.print(Text.strAuthor(Authors.getAuthorList()));
				} else if (Check.textChar(actualChar, Text.opt9, true)) {
					Console.printMenu();
					Console.print(Text.newLine);
				} else {
					Console.print("'" + actualChar + "' " + Text.noOpt);
					Console.print(Text.newLine);
				}
			}
			
			inputText = Console.readEnter();
			if (inputText.length() == 0) {
				inputText += Text.opt8;
			}
		}
	}
}
