import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.TreeMap;

/**
 * @author Eric Moros Pérez
 *
 */
public class Main {

	/**
	 * @param args
	 * 
	 *            Deseamos realizar una aplicación para la gestión de usuarios y
	 *            claves de acceso a un sistema (red, base de datos, programa de
	 *            gestión etc.) Para ello vamos a utilizar mapas (TreeMap) donde el
	 *            par de datos será:  <usuario, clave de acceso>, los usuarios no
	 *            pueden repetirse (TreeMap).  Además para mayor seguridad las
	 *            claves no se guardan tal y como la tecleamos sino que se guardan
	 *            codificadas con un sencillo algoritmo que consiste en desplazar
	 *            los caracteres un número fijo entero, p. ej. si la clave es ABC y
	 *            el número fijo es 2 la clave será ABC pero en el mapa guardamos
	 *            CDE, de forma que si nos pillan el fichero de claves, dicho
	 *            fichero no sería el real sino el codificado.  Las claves deben
	 *            ser de tal forma que solo admitan mayúsculas, minúsculas y números
	 *            y ningún otro carácter debe ser admitido. Crear la aplicación para
	 *            que se pueda:  Insertar usuario, clave  Borrar usuarios 
	 *            Modificar claves de un usuario  Validar a un usuario si su clave
	 *            es correcta
	 *
	 *
	 */
	public static void main(String[] args) {
		TreeMap<User, String> usrPassList = new TreeMap<>();
		User user = new User();
		user = createUser();
		signup(usrPassList, user);
		printUsers(usrPassList);
		
	}

	private static User createUser() {
		User user = new User();
		String nickname;
		String password;
		String encryptedPass;
		Integer moveNumber;

		
		nickname = Leer.pedirCadena("Nombre de usuario:");
		password = Leer.pedirCadena("Contraseña:");
		moveNumber = Leer.pedirEntero("Seguridad de encriptado");
		//String passwordConfirm;
		encryptedPass = encryptPass(password, moveNumber);
		user.setNickname(nickname);
		user.setPassword(encryptedPass);
		return user;
	}

	private static void printUsers(TreeMap<User, String> usrPassList) {
		String nickname;
		String password;
		for (User usr : usrPassList.keySet()) {
			nickname = usr.getNickname();
			password = usrPassList.get(usr);
			
			Leer.mostrarEnPantalla("Usuario: " + nickname + " Encriptada: " + password);
		}
	}

	private static void signup(TreeMap<User, String> usrPassList, User user) {
		usrPassList.put(user, user.getPassword());
	}
	
	public static String encryptPass(String password, Integer moveNumber) {
		Character charPass;
		String encryptedPass = "";
		for (Integer charPos = 0; charPos < password.length(); charPos++) {
			charPass = (char) (password.charAt(charPos) + moveNumber);
			encryptedPass += charPass;
		}
		
		return encryptedPass;
	}
	
}
