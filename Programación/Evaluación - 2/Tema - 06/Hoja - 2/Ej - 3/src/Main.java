
public class Main {
	public static void main(String[] args) {
		String inputText = "" + Text.opt9;
		
		new Author("Rosa10", "anonymous@privateserver.local", 0);
		
		while (! Check.textChar(inputText.charAt(0), Text.opt10, true)) {
			for (int posChar = 0; posChar < inputText.length(); posChar++) {
				char actualChar = inputText.charAt(posChar);
				
				//CREAR AUTOR
				if (Check.textChar(actualChar, Text.opt4, true)) {
					String name = null;
					String eMail = null;
					Integer genre = null;
					
					//
					Console.print(Text.askName);
					inputText = Console.readEnter();
					while (name != inputText) {
						name = inputText;
					}
					
					//
					Console.print(Text.askEMail);
					inputText = Console.readEnter();
					while (eMail != inputText) {
						eMail = inputText;
					}
					
					//No me gusta
					Console.print(Text.askGenre + Text.newLine);
					inputText = Console.readEnter();
					while (! (genre.equals(0) && genre.equals(1))) {
						switch (inputText.charAt(0)) {
							case 'm':
								genre = 0;
								break;
							case 'f':
								genre = 1;
								break;
							default:
								genre = 0;
								break;
						}
					}
				
					//
					new Author(name, eMail, genre);
					Console.print(Text.newLine + Text.authorModified);
				}
				//MODIFICAR AUTOR
				else if (Check.textChar(actualChar, Text.opt5, true)) {
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
					inputText = Console.readEnter();
					if (inputText != "") {
						name = inputText;
					} else {
						name = authorOld.getName();
					}
					
					//
					Console.print(Text.askEMail);
					inputText = Console.readEnter();
					if (inputText != "") {
						eMail = inputText;
					} else {
						eMail = authorOld.getEMail();
					}
					
					//No me gusta
					Console.print(Text.askGenre + Text.newLine);
					inputText = Console.readEnter();
					if (inputText != "") {
						switch (inputText.charAt(0)) {
							case 'm':
								genre = 0;
								break;
							case 'f':
								genre = 1;
								break;
							default:
								genre = 0;
								break;
						}
					} else {
						switch (authorOld.getGenre()) {
							case 'm':
								genre = 0;
								break;
							case 'f':
								genre = 1;
								break;
							default:
								genre = 0;
								break;
						}
					}
				
					//
					new Author(IDA, name, eMail, genre);
					Console.print(Text.newLine + Text.authorModified);
					
				//MOSTRAR AUTORES
				} else if (Check.textChar(actualChar, Text.opt6, true)) {
					Console.print(Text.strAuthor(Authors.getAuthorList()));
				
				//MOSTRAR MENÚ
				} else if (Check.textChar(actualChar, Text.opt9, true)) {
					Console.printMenu();
					Console.print(Text.newLine);
					
				//OPCIÓN NO RECONOCÍDA
				} else {
					Console.print("'" + actualChar + "' " + Text.noOpt + Text.newLine);
				}
			}
			
			inputText = Console.readEnter();
			if (inputText.length() == 0) {
				inputText += Text.opt8;
			}
		}
	}
}
