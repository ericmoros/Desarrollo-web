
public class Main {
	private static String inputText = "" + Text.opt12;
	
	private static void enterOption() {
		inputText = Console.readEnter();
		if (inputText.length() == 0) {
			inputText += Text.opt14;
		}
	}
	
	private static void optionUnknown(char actualChar) {
		Console.print("'" + actualChar + "' " + Text.noOpt + Text.newLine);
	}
	
	private static void showMenu() {
		Console.printMenu();
		Console.print(Text.newLine);
	}
	
	private static void listRelations() {
		Console.print(Text.strRelation(BooksAuthors.getRelationList()));
	}
	
	private static void listAuthors() {
		Console.print(Text.strAuthor(BooksAuthors.getAuthorList()));
	}
	
	private static void modifyAuthor() {
		Author authorOld;
		Integer IDA;
		String name;
		String eMail;
		Integer genre;
		inputText = "";
		
		//Norma de uso
		Console.print(Text.askIfEmpty);
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
		
		//Género | No me gusta
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
					genre = -1;
					break;
			}
		}

		//Modificación (Re-creación y re-asignación)
		new Author(IDA, name, eMail, genre);
		Console.print(Text.newLine + Text.authorModified(IDA));
		
		inputText = "";
	}
	
	private static void createAuthor() {
		Author author;
		Integer IDA;
		String name = null;
		String eMail = null;
		Integer genre = null;
		inputText = "";
		
		//Nombre
		Console.print(Text.askName);
		inputText = Console.readEnter();
		name = inputText;
		
		//E-Mail
		Console.print(Text.askEMail);
		inputText = Console.readEnter();
		eMail = inputText;
		
		//Género (No me gusta)
		Console.print(Text.askGenre + Text.newLine);
		while (genre == null || genre != 0 && genre != 1) {
			inputText = Console.readEnter();
			if (inputText.length() == 1) {
				switch (inputText.charAt(0)) {
				case '1':
					genre = 0;
					break;
				case '2':
					genre = 1;
					break;
				default:
					Console.print("'" + inputText.charAt(0) + "'" + Text.noOpt);
				}
			} else {
				Console.print(Text.noOpt);
			}	
		}

		//Creación
		author = new Author(name, eMail, genre);
		IDA = BooksAuthors.getIDA(author);
		Console.print(Text.newLine + Text.authorRegistered(IDA));
		
		inputText = "";
	}
	
	private static void listBooks() {
		Console.print(Text.strBook(BooksAuthors.getBookList()));
	}
	
	private static void modifyBook() {
		Book bookOld;
		Integer IDB;
		String title;
		Float price;
		Integer stock;
		inputText = "";
		
		//Norma de uso
		Console.print(Text.askIfEmpty);
		Console.print(Text.newLine);
		
		//ID del libro (IDB)
		Console.print(Text.askIDB);
		inputText = Console.readEnter();
		IDB = Integer.parseInt(inputText);
		bookOld = BooksAuthors.getBook(IDB);
		
		//Título
		Console.print(Text.askTitle);
		inputText = Console.readEnter();
		if (inputText != "") {
			title = inputText;
		} else {
			title = bookOld.getTitle();
		}
		
		//Precio
		Console.print(Text.askPrice);
		inputText = Console.readEnter();
		if (inputText != "") {
			price = Float.parseFloat(inputText);
		} else {
			price = bookOld.getPrice();
		}
		
		//Stock
		Console.print(Text.askStock);
		inputText = Console.readEnter();
		if (inputText != "") {
			stock = Integer.parseInt(inputText);
		} else {
			stock = bookOld.getStock();
		}

		//Modificación (Re-creación y re-asignación)
		new Book(IDB, title, price, stock);
		Console.print(Text.newLine + Text.bookModified(IDB));
		
		inputText = "";
	}
	
	private static void createBook() {
		Book book;
		String title = null;
		Float price = null;
		Integer stock = null;
		inputText = "";
		
		//Título
		Console.print(Text.askTitle);
		inputText = Console.readEnter();
		title = inputText;
		
		//Precio
		Console.print(Text.askPrice);
		inputText = Console.readEnter();
		price = Float.parseFloat(inputText);
		
		//Stock
		Console.print(Text.askStock);
		inputText = Console.readEnter();
		stock = Integer.parseInt(inputText);
		
		//Creación
		book = new Book(title, price, stock);
		Integer IDB = BooksAuthors.getIDB(book);
		Console.print(Text.newLine + Text.bookRegistered(IDB));
							
		inputText = "";
	}
	
	public static void main(String[] args) {
		//Unos cuantos libros por defecto para probrar (Borrar)
		new Book("Kaliop", 10F, 15);
		new Book("No te lo vas a creer", 1F, 5);
		new Book("Germán: Mi pelirroja no me quiere...", 50F, 35);
		new Book("Microsoft rules", 7.5F, 100);
		
		//Unos cuantos autores por defecto para probrar (Borrar)
		new Author("Anonymous", "anonymous@privateserver.local", 0);
		new Author("Lechuga", "lechuga@lechuguinos.es", 0);
		new Author("Rosa10", "rosa10@flores.net", 1);
		new Author("Pepa", "pepa1989@gmail.com", 1);
		new Author("Bill", "billgates@applerules.yeah", 0);
		
		BooksAuthors.addRelation(BooksAuthors.getBook(0), BooksAuthors.getAuthor(0));
		BooksAuthors.addRelation(BooksAuthors.getBook(1), BooksAuthors.getAuthor(0));
		BooksAuthors.addRelation(BooksAuthors.getBook(2), BooksAuthors.getAuthor(1));
		
		while (! Check.textChar(inputText.charAt(0), Text.opt13, true)) {
			for (int posChar = 0; posChar < inputText.length(); posChar++) {
				char actualChar = inputText.charAt(posChar);
				
				//CREAR LIBRO
				if (Check.textChar(actualChar, Text.opt1, true)) {
					createBook();
					
				//MODIFICAR LIBRO
				} else if (Check.textChar(actualChar, Text.opt2, true)) {
					modifyBook();
					
				//CREAR AUTOR
				} else if (Check.textChar(actualChar, Text.opt5, true)) {
					createAuthor();
					
					//MODIFICAR AUTOR
				} else if (Check.textChar(actualChar, Text.opt6, true)) {
					modifyAuthor();
					
				//LISTAR LIBROS
				} else if (Check.textChar(actualChar, Text.opt9, true)) {
					listBooks();
					
				//LISTAR AUTORES
				} else if (Check.textChar(actualChar, Text.opt10, true)) {
					listAuthors();
					
				//LISTAR RELACIONES
				} else if (Check.textChar(actualChar, Text.opt11, true)) {
					listRelations();
				
				//MOSTRAR MENÚ
				} else if (Check.textChar(actualChar, Text.opt12, true)) {
					showMenu();
					
				//OPCIÓN NO RECONOCÍDA
				} else {
					optionUnknown(actualChar);
				}
			}
			
			//Introducir opción
			enterOption();
		}
	}
}
