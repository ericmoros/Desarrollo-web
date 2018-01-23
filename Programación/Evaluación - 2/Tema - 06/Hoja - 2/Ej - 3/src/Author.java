import java.util.ArrayList;

public class Author {
	private static final ArrayList<Character> genreList= new ArrayList<Character>();
	{
		genreList.add('m');
		genreList.add('f');
	};
	
	private static ArrayList<Author> authorList = new ArrayList<Author>();
	
	//
	private String name;
	private String eMail;
	private Character genre;
	
	Author(String name, String eMail, Integer genrePos) {
		this.name	= name;
		this.eMail	= eMail;
		this.genre	= genreList.get(genrePos);
		authorList.add(this);
	}
	
	Author(Integer IDA, String name, String eMail, Integer genrePos) {
		this.name	= name;
		this.eMail	= eMail;
		this.genre	= genreList.get(genrePos);
		
		authorList.set(IDA, this);
	}
	
	
	//
	public String getName() {
		return name;
	}

	public String getEMail() {
		return eMail;
	}

	public void setEMail(String eMail) {
		this.eMail = eMail;
	}

	public Character getGenre() {
		return genre;
	}
	
	
	//
	public static ArrayList<Author> getAuthorList() {
		return authorList;
	}
	public static Author getAuthor(Integer IDA) {
		return authorList.get(IDA);
	}
}
