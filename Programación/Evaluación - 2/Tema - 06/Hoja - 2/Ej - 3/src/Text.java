import java.util.ArrayList;

public class Text {
	public static final Character opt1 	= '1';
	public static final Character opt2 	= '2';
	public static final Character opt3 	= '3';
	public static final Character opt4 	= '4';
	public static final Character opt5 	= '5';
	public static final Character opt6 	= '6';
	public static final Character opt7 	= '7';
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
					  		   + "\n" + "|   " + opt3 + "- Relacionar            |"
					  		   + "\n" + "|   " + opt4 + "- Listar autores        |"
					  		   + "\n" + "|  Autor                     |"
					  		   + "\n" + "|   " + opt5 + "- Crear                 |"
					  		   + "\n" + "|   " + opt6 + "- Modificar             |"
					  		   + "\n" + "|   " + opt7 + "- Relacionar            |"
					  		   + "\n" + "|   " + opt8 + "- Listar libros         |"
					  		   + "\n" + "+----------------------------+"
   					  		   + "\n" + "|       LibrosAutores        |"
					  		   + "\n" + "+----------------------------+"
					  		   + "\n" + "|  Libros                    |"
					  		   + "\n" + "|   " + opt9 + "- Listar                |"
					  		   + "\n" + "|  Autores                   |"
					  		   + "\n" + "|   " + opt10 + "- Listar                |"
					  		   + "\n" + "+----------------------------+"
					  		   + "\n" + "|     " + opt11 + "- Menú  "  + opt12 +"- Cerrar     |"
					  		   + "\n" + "+----------------------------+";
	
	public static final String askData    = "(En caso de no introducir un dato se mantendrá el anterior) ";
	public static final String askIDA    = "Introduce el IDA del autor a modificar: ";
	public static final String askName   = "Introduce el Nombre: ";
	public static final String askEMail  = "Introduce el E-Mail: ";
	public static final String askGenre  = "Introduce el Género: "
								  + "\n" + " (1) Hombre"
								  + "\n" + " (2) Mujer";
	public static final String authorModified = "El autor ha sido modificado";
	
	public static final String newLine = "\n";
	public static final String noOpt = "Opción no reconocida";
	public static final String pressEnter = "Presiona Enter para continuar...";
	public static final String inProgress = "Pendiente";
	
	//Lista autor
	public static String strAuthor(Author author) {
		return "Nombre: " + author.getName() + ", e-mail: " + author.getEMail() + ", género: " + author.getGenre();
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
		return "Título: " + book.getTitle() + ", precio: " + book.getPrice() + ", restantes: " + book.getStock();
	}
	public static ArrayList<String> strBook(ArrayList<Book> bookList) {
		ArrayList<String> strBookList = new ArrayList<>();
		for (Book book: bookList) {
			strBookList.add("IDB: " + bookList.indexOf(book) + ", " + strBook(book) + "\n");
		}
		return strBookList;
	}
}
