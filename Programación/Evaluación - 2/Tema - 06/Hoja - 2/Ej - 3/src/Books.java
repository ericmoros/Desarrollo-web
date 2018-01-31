import java.util.ArrayList;

public class Books {
	private static ArrayList<Author> bookList = new ArrayList<Author>();
	
	public static void addAuthor(Author book) {
		bookList.add(book);
	}
	
	public static void setAuthor(Integer IDA, Author book) {
		bookList.set(IDA, book);
	}
	
	public static ArrayList<Author> getAuthorList() {
		return bookList;
	}
	
	public static Author getAuthor(Integer IDA) {
		return bookList.get(IDA);
	}
}
