/**
 * @author Eric Moros Pérez
 *
 */
public class User implements Comparable<User> {
	private String nickname;
	private String password;
	private Boolean session = false;
	
	public Boolean getSession() {
		return session;
	}
	public void setSession(Boolean session) {
		this.session = session;
	}
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
