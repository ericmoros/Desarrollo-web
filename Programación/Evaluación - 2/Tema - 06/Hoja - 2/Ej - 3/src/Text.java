import java.util.ArrayList;

public class Text {
	public static final Character opt1 = '1';
	public static final Character opt2 = '2';
	public static final Character opt3 = '3';
	public static final Character opt4 = '4';
	public static final Character opt5 = '5';
	public static final Character opt6 = '6';
	public static final Character opt8 = '-';
	public static final Character opt9 = 'H';
	public static final Character opt10 = 'X';
	
	public static final String menu   = "+----------------------------+"
					  		   + "\n" + "|        LibroUnAutor        |"
					  		   + "\n" + "+----------------------------+"
					  		   + "\n" + "|  Libros                    |"
					  		   + "\n" + "|   " + opt1 + "- Crear                 |"
					  		   + "\n" + "|   " + opt2 + "- Modificar             |"
					  		   + "\n" + "|   " + opt3 + "- Listar                |"
					  		   + "\n" + "|  Autores                   |"
					  		   + "\n" + "|   " + opt4 + "- Crear                 |"
					  		   + "\n" + "|   " + opt5 + "- Modificar             |"
					  		   + "\n" + "|   " + opt6 + "- Listar                |"
					  		   + "\n" + "+----------------------------+"
					  		   + "\n" + "|     " + opt9 + "- Menú  "  + opt10 +"- Cerrar     |"
					  		   + "\n" + "+----------------------------+";
	
	public static final String askName  = "Nombre de la fecha: ";
	
	public static final String newLine = "\n";
	public static final String noOpt = "Opción no reconocida";
	public static final String pressEnter = "Presiona Enter para continuar...";
	public static final String inProgress = "Pendiente";
	
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
}
