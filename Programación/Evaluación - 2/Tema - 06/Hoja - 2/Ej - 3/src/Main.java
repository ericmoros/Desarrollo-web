
public class Main {
	public static void main(String[] args) {
		String inputText = "" + Text.opt9;
		
		//Unos cuantos libros por defecto para probrar (Borrar)
		new Book("Kaliop", 10F, 15);
		new Book("No te lo vas a creer", 1F, 5);
		new Book("Germ�n: Mi pelirroja no me quiere...", 50F, 35);
		new Book("Microsoft rules", 7.5F, 100);
		
		
		//Unos cuantos autores por defecto para probrar (Borrar)
		new Author("Anonymous", "anonymous@privateserver.local", 0);
		new Author("Lechuga", "lechuga@lechuguinos.es", 0);
		new Author("Rosa10", "rosa10@flores.net", 1);
		new Author("Pepa", "pepa1989@gmail.com", 1);
		new Author("Bill", "billgates@applerules.yeah", 0);
		
		while (! Check.textChar(inputText.charAt(0), Text.opt10, true)) {
			for (int posChar = 0; posChar < inputText.length(); posChar++) {
				char actualChar = inputText.charAt(posChar);
				
				//LISTAR LIBROS
				if (Check.textChar(actualChar, Text.opt3, true)) {
					Console.print(Text.strBook(BooksAuthors.getBookList()));
					
				//CREAR AUTOR
				} else if (Check.textChar(actualChar, Text.opt4, true)) {
					String name = null;
					String eMail = null;
					Integer genre = null;
					
					//Nombre
					Console.print(Text.askName);
					inputText = Console.readEnter();
					while (name != inputText) {
						name = inputText;
					}
					
					//E-Mail
					Console.print(Text.askEMail);
					inputText = Console.readEnter();
					while (eMail != inputText) {
						eMail = inputText;
					}
					
					//G�nero (No me gusta)
					Console.print(Text.askGenre + Text.newLine);
					inputText = Console.readEnter();
					while (genre == null || genre != 0 && genre != 1) {
						switch (inputText.charAt(0)) {
							case '1':
								genre = 0;
								break;
							case '2':
								genre = 1;
								break;
						}
					}
				
					//Creaci�n
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
					
					//ID del autor (IDA)
					Console.print(Text.askIDA);
					inputText = Console.readEnter();
					IDA = Integer.parseInt(inputText);
					authorOld = BooksAuthors.getAuthor(IDA);
					
					//Nombre
					Console.print(Text.askName);
					inputText = Console.readEnter();
					if (inputText != "") {
						name = inputText;
					} else {
						name = authorOld.getName();
					}
					
					//E-Mail
					Console.print(Text.askEMail);
					inputText = Console.readEnter();
					if (inputText != "") {
						eMail = inputText;
					} else {
						eMail = authorOld.getEMail();
					}
					
					//G�nero | No me gusta
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
				
					//Modificaci�n (Re-creaci�n y re-asignaci�n)
					new Author(IDA, name, eMail, genre);
					Console.print(Text.newLine + Text.authorModified);
					
				//MOSTRAR AUTORES
				} else if (Check.textChar(actualChar, Text.opt6, true)) {
					Console.print(Text.strAuthor(BooksAuthors.getAuthorList()));
				
				//MOSTRAR MEN�
				} else if (Check.textChar(actualChar, Text.opt9, true)) {
					Console.printMenu();
					Console.print(Text.newLine);
					
				//OPCI�N NO RECONOC�DA
				} else {
					Console.print("'" + actualChar + "' " + Text.noOpt + Text.newLine);
				}
			}
			
			//Introducir opci�n
			inputText = Console.readEnter();
			if (inputText.length() == 0) {
				inputText += Text.opt8;
			}
		}
	}
}
