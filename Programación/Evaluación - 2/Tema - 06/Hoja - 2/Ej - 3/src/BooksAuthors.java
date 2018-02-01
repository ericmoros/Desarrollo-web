import java.util.ArrayList;

public class BooksAuthors {
	//Books
	private static ArrayList<Book> bookList = new ArrayList<>();
	
	public static void addBook(Book book) {
		bookList.add(book);
	}
	
	public static void setBook(Integer IDB, Book book) {
		bookList.set(IDB, book);
	}
	
	public static ArrayList<Book> getBookList() {
		return bookList;
	}
	
	public static Book getBook(Integer IDB) {
		return bookList.get(IDB);
	}
	
	//Authors
	private static ArrayList<Author> authorList = new ArrayList<>();
	
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
	
	//BooksAuthors
	
}
