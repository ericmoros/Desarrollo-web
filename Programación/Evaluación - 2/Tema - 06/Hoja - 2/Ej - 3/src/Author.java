import java.util.ArrayList;

public class Author {
	private static final ArrayList<Character> genreList= new ArrayList<Character>();
	{
		genreList.add('m');
		genreList.add('f');
	};
	
	//
	private String name;
	private String eMail;
	private Character genre;
	
	Author(String name, String eMail, Integer genrePos) {
		this.name	= name;
		this.eMail	= eMail;
		this.genre	= genreList.get(genrePos);
		Authors.addAuthor(this);
	}
	
	Author(Integer IDA, String name, String eMail, Integer genrePos) {
		this.name	= name;
		this.eMail	= eMail;
		this.genre	= genreList.get(genrePos);
		Authors.setAuthor(IDA, this);
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
}
