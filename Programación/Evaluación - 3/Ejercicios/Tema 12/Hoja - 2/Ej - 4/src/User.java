import java.util.Comparator;

/**
 * @author Eric Moros Pérez
 *
 */
public class User implements Comparable<User> {
	String nickname;
	String password;
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int compareTo(User usr) {
		return nickname.compareTo(usr.nickname);
	}
}
