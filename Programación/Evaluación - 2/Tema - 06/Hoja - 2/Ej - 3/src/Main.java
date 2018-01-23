
public class Main {
	public static void main(String[] args) {
		String inputText = "" + Text.opt9;
		new Author("Rosa10", "anonymous@privateserver.local", 0);
		while (! Check.textChar(inputText.charAt(0), Text.opt10, true)) {
			for (int posChar = 0; posChar < inputText.length(); posChar++) {
				char actualChar = inputText.charAt(posChar);
				if (Check.textChar(actualChar, Text.opt5, true)) {
					Console.print(Text.askIDA);
					Integer IDA = Integer.parseInt(Console.readEnter());
					Author authorOld = Author.getAuthor(IDA);
					new Author(IDA, authorOld.getName(), authorOld.getEMail(), 1);
				} else if (Check.textChar(actualChar, Text.opt6, true)) {
					Console.print(Text.strAuthor(Author.getAuthorList()));
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
