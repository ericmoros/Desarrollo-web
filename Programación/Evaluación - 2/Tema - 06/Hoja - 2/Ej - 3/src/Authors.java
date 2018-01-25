import java.util.ArrayList;

public class Authors {
	private static ArrayList<Author> authorList = new ArrayList<Author>();
	
	public static void addAuthor(Author author) {
		authorList.add(author);
	}
	
	public static void setAuthor(Integer IDA, Author author) {
		authorList.set(IDA, author);
	}
	
	public static ArrayList<Author> getAuthorList() {
		return authorList;
	}
	
	public static Author getAuthor(Integer IDA) {
		return authorList.get(IDA);
	}
}
