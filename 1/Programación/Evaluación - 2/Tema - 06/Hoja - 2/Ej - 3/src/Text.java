import java.util.ArrayList;

public class Text {
	public static final Character opt1 	= '1';
	public static final Character opt2 	= '2';
	public static final Character opt3 	= '3';
	public static final Character opt4 	= '4';
	public static final Character opt5	= '5';
	public static final Character opt6 	= '6';
	public static final Character opt7	= '7';
	public static final Character opt8 	= '8';
	public static final Character opt9	= '9';
	public static final Character opt10	= '0';
	public static final Character opt11	= '?';
	public static final Character opt12	= 'X';
	public static final Character opt13	= '-';
	
	public static final String menu   = "+----------------------------+"
					  		   + "\n" + "|        LibroUnAutor        |"
					  		   + "\n" + "+----------------------------+"
					  		   + "\n" + "|  Libro                     |"
					  		   + "\n" + "|   " + opt1 + "- Crear                 |"
					  		   + "\n" + "|   " + opt2 + "- Modificar             |"
					  		   + "\n" + "|  Autor                     |"
					  		   + "\n" + "|   " + opt3 + "- Crear                 |"
					  		   + "\n" + "|   " + opt4 + "- Modificar             |"
					  		   + "\n" + "+----------------------------+"
   					  		   + "\n" + "|       LibrosAutores        |"
					  		   + "\n" + "+----------------------------+"
					  		   + "\n" + "|  Libros                    |"
					  		   + "\n" + "|   " + opt5 + "- Listar                |"
					  		   + "\n" + "|   " + opt6 + " * por autor            |"
					  		   + "\n" + "|  Autores                   |"
					  		   + "\n" + "|   " + opt7 + "- Listar                |"
					  		   + "\n" + "|   " + opt8 + " * por libro            |"
					  		   + "\n" + "|  Relaciones                |"
					  		   + "\n" + "|   " + opt9 + "- Relacionar            |"
					  		   + "\n" + "|   " + opt10 + "- Listar                |"
					  		   + "\n" + "+----------------------------+"
					  		   + "\n" + "|     " + opt11 + "- Men�  "  + opt12 +"- Cerrar     |"
					  		   + "\n" + "+----------------------------+";
	
	public static final String askIfEmpty    = "(En caso de no introducir un dato se mantendr� el anterior) ";
	
	//Autor
	public static final String askIDA    = "Introduce el IDA del autor: ";
	public static final String askName   = "Introduce el Nombre: ";
	public static final String askEMail  = "Introduce el E-Mail: ";
	public static final String askGenre  = "Introduce el G�nero: "
								  + "\n" + " (1) Hombre"
								  + "\n" + " (2) Mujer";
	public static String authorRegistered(Integer IDA) {
		Author author = BooksAuthors.getAuthor(IDA);
		String name = author.getName();
		return "El autor " + IDA + '-' +'"' + name + '"' + " ha sido registrado";
	}
	public static String authorModified(Integer IDA) {
		Author author = BooksAuthors.getAuthor(IDA);
		String name = author.getName();
		return "El autor " + IDA + '-' +'"' + name + '"' + " ha sido sido modificado";
	}
	
	//libro
	public static final String askIDB	= "Introduce el IDB del libro: ";
	public static final String askTitle = "Introduce el titulo: ";
	public static final String askPrice = "Introduce el precio: ";
	public static final String askStock = "Introduce el stock: ";
	
	public static String bookRegistered(Integer IDB) {
		Book book = BooksAuthors.getBook(IDB);
		String title = book.getTitle();
		return "El libro " + IDB + '-' +'"' + title + '"' + " ha sido registrado";
	}
	public static String bookModified(Integer IDB) {
		Book book = BooksAuthors.getBook(IDB);
		String title = book.getTitle();
		return "El libro " + IDB + '-' +'"' + title + '"' + " ha sido modificado";
	}
	
	//Relacion
	public static String askRelationed(Book book, Author author) {
		String strBook = "" + BooksAuthors.getBookList().indexOf(book) + '-' +'\"' + book.getTitle() + '"';
		String strAuthor = "" +  BooksAuthors.getAuthorList().indexOf(author) + '-' +'\"' + author.getName() + '"';
		return "Relaci�n del libro " + strBook + " y el autor " + strAuthor;
	}
	
	public static final String newLine = "\n";
	public static final String noOpt = "Opci�n no reconocida";
	public static final String pressEnter = "Presiona Enter para continuar...";
	public static final String inProgress = "Pendiente";
	
	//Lista autor
	public static String strAuthor(Author author) {
		return "Nombre: " + author.getName() + ", e-mail: " + author.getEMail() + ", g�nero: " + author.getGenre();
	}
	public static ArrayList<String> strAuthor(ArrayList<Author> authorList) {
		ArrayList<String> strAuthorList = new ArrayList<>();
		for (Author author: authorList) {
			strAuthorList.add("IDA: " + authorList.indexOf(author) + ", " + strAuthor(author) + "\n");
		}
		return strAuthorList;
	}
	
	//Lista libro
	public static String strBook(Book book) {
		return "T�tulo: " + book.getTitle() + ", precio: " + book.getPrice() + ", restantes: " + book.getStock();
	}
	public static ArrayList<String> strBook(ArrayList<Book> bookList) {
		ArrayList<String> strBookList = new ArrayList<>();
		for (Book book: bookList) {
			strBookList.add("IDB: " + bookList.indexOf(book) + ", " + strBook(book) + "\n");
		}
		return strBookList;
	}
	
	//Lista relaciones
	public static String strRelation(Relation IDR) {
		return "IDB: " + IDR.getIDB() + ", IDA: " +  IDR.getIDA();
	}
	
	public static ArrayList<String> strRelation(ArrayList<Relation> relationList) {
		ArrayList<String> strRelationList = new ArrayList<>();
		
		for (Relation relation: relationList) {
			strRelationList.add("IDR: " + relationList.indexOf(relation) + ", " + strRelation(relation) + "\n");
		}
		return strRelationList;
	}
}
