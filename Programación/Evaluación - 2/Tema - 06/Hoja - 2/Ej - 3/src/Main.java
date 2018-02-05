public class Main {														//main Abajo del todo
	private static String inputText = "" + Text.opt11;
	
	private static void enterOption() {
		inputText = Console.readEnter();
		if (inputText.length() == 0) {
			inputText += Text.opt13;
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
		if (! inputText.equals("")) {
			name = inputText;
		} else {
			name = authorOld.getName();
		}
		
		//E-Mail
		Console.print(Text.askEMail);
		inputText = Console.readEnter();
		if (! inputText.equals("")) {
			eMail = inputText;
		} else {
			eMail = authorOld.getEMail();
		}
		
		//Género | No me gusta
		Console.print(Text.askGenre + Text.newLine);
		inputText = Console.readEnter();
		if (! inputText.equals("")) {
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
		Console.print(Text.newLine + Text.authorModified(IDA) + Text.newLine);
		
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
		Console.print(Text.newLine + Text.authorRegistered(IDA) + Text.newLine);
		
		inputText = "";
	}
	
	private static void listBooksByAuthor() {
		Integer IDB;
		Integer IDA;
		inputText = "";
		
		//ID del autor (IDA)
		Console.print(Text.askIDA);
		inputText = Console.readEnter();
		IDA = Integer.parseInt(inputText);
		
		for (Relation relation: BooksAuthors.getRelationList()) {
			if (IDA == relation.getIDA()) {
				IDB = relation.getIDB();
				Console.print(Text.strBook(BooksAuthors.getBook(IDB)) + Text.newLine);
			}
		}
	}
	
	private static void listAuthorsByBook() {
		Integer IDB;
		Integer IDA;
		inputText = "";
		
		//ID del libro (IDB)
		Console.print(Text.askIDB);
		inputText = Console.readEnter();
		IDB = Integer.parseInt(inputText);
		
		for (Relation relation: BooksAuthors.getRelationList()) {
			if (IDB == relation.getIDB()) {
				IDA = relation.getIDA();
				Console.print(Text.strAuthor(BooksAuthors.getAuthor(IDA)) + Text.newLine);
			}
		}
	}
	
	private static void listBooks() {
		Console.print(Text.strBook(BooksAuthors.getBookList()));
	}
	
	private static void relateBookAuthor() {
		Book book;
		Author author;
		Integer IDB;
		Integer IDA;
		inputText = "";
		
		//ID del libro (IDB)
		Console.print(Text.askIDB);
		inputText = Console.readEnter();
		IDB = Integer.parseInt(inputText);
		book = BooksAuthors.getBook(IDB);
		
		//ID del autor (IDA)
		Console.print(Text.askIDA);
		inputText = Console.readEnter();
		IDA = Integer.parseInt(inputText);
		author = BooksAuthors.getAuthor(IDA);
		
		
		BooksAuthors.addRelation(book, author);
		Console.print(Text.askRelationed(book, author) + Text.newLine);
							
		inputText = "";
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
		if (! inputText.equals("")) {
			title = inputText;
		} else {
			title = bookOld.getTitle();
		}
		
		//Precio
		Console.print(Text.askPrice);
		inputText = Console.readEnter();
		if (! inputText.equals("")) {
			price = Float.parseFloat(inputText);
		} else {
			price = bookOld.getPrice();
		}
		
		//Stock
		Console.print(Text.askStock);
		inputText = Console.readEnter();
		if (! inputText.equals("")) {
			stock = Integer.parseInt(inputText);
		} else {
			stock = bookOld.getStock();
		}

		//Modificación (Re-creación y re-asignación)
		new Book(IDB, title, price, stock);
		Console.print(Text.newLine + Text.bookModified(IDB) + Text.newLine);
		
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
		Console.print(Text.newLine + Text.bookRegistered(IDB) + Text.newLine);
							
		inputText = "";
	}
	
	public static void main(String[] args) {
		//Unos cuantos libros por defecto para probrar (Borrar)		 // IDB
		new Book("Kaliop", 10F, 15);									//0
		new Book("No te lo vas a creer", 1F, 5);						//1
		new Book("Germán: Mi pelirroja no me quiere...", 50F, 35);		//2
		new Book("Microsoft rules", 7.5F, 100);							//3
		
		//Unos cuantos autores por defecto para probrar (Borrar)	 // IDA
		new Author("Anonymous", "anonymous@privateserver.local", 0);	//0
		new Author("Lechuga", "lechuga@lechuguinos.es", 0);				//1
		new Author("Rosa10", "rosa10@flores.net", 1);					//2
		new Author("Pepa", "pepa1989@gmail.com", 1);					//3
		new Author("Bill", "billgates@applerules.yeah", 0);				//4
																						//IDB   IDA
		BooksAuthors.addRelation(BooksAuthors.getBook(0), BooksAuthors.getAuthor(0)); //   0     0
		BooksAuthors.addRelation(BooksAuthors.getBook(1), BooksAuthors.getAuthor(0)); //   1     0
		BooksAuthors.addRelation(BooksAuthors.getBook(1), BooksAuthors.getAuthor(1)); //   1     1
		
		while (! Check.textChar(inputText.charAt(0), Text.opt12, true)) {
			for (int posChar = 0; posChar < inputText.length(); posChar++) {
				char actualChar = inputText.charAt(posChar);
				
				//CREAR LIBRO
				if (Check.textChar(actualChar, Text.opt1, true)) {
					createBook();
					
				//MODIFICAR LIBRO
				} else if (Check.textChar(actualChar, Text.opt2, true)) {
					modifyBook();
					
				//CREAR AUTOR
				} else if (Check.textChar(actualChar, Text.opt3, true)) {
					createAuthor();
					
				//MODIFICAR AUTOR
				} else if (Check.textChar(actualChar, Text.opt4, true)) {
					modifyAuthor();
					
				//LISTAR LIBROS
				} else if (Check.textChar(actualChar, Text.opt5, true)) {
					listBooks();
					
				//LISTAR LIBROS POR AUTOR
				} else if (Check.textChar(actualChar, Text.opt6, true)) {
					listBooksByAuthor();
					
				//LISTAR AUTORES
				} else if (Check.textChar(actualChar, Text.opt7, true)) {
					listAuthors();
					
				//LISTAR AUTORES POR LIBRO
				} else if (Check.textChar(actualChar, Text.opt8, true)) {
					listAuthorsByBook();
					
				//RELACIONAR
				} else if (Check.textChar(actualChar, Text.opt9, true)) {
					relateBookAuthor();
					
				//LISTAR RELACIONES
				} else if (Check.textChar(actualChar, Text.opt10, true)) {
					listRelations();
				
				//MOSTRAR MENÚ
				} else if (Check.textChar(actualChar, Text.opt11, true)) {
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
