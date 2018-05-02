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
		String options = "1";
		Boolean exit = false;

		while (true) {
			for (Character option : options.toCharArray()) {
				switch (option) {
					case '1':
						Leer.mostrarEnPantalla("_ Menu __________________\n"
											 + " 1 - Mostrar menu\n"
											 + " 2 - Registrar usuario/s \n"
											 + " 2 - Modificar contraseña \n"
											 + "_________________________\n");
						break;
					case '2':
						signupUsers(usrPassList);
						break;
					case '3':
						modifyUserPassword(usrPassList);
						break;
					case '0':
						exit = true;
						break;
					default:
						options += '1';
				}

			}
			
			if (exit) break;

			options = Leer.pedirCadena("Introduce una de las opciones");
			
		}
	}

	/**
	 * @param usrPassList 
	 * 
	 */
	private static void modifyUserPassword(TreeMap<User, String> usrPassList) {
		User user = null;
		String name;
		String password;
		Integer security;
		String encryptedPass;
		Leer.mostrarEnPantalla("[Modificar contraseña]");
		name = Leer.pedirCadena("Nombre del usuario");
		
		for (User tmpUser : usrPassList.keySet()) {
			if (tmpUser.getNickname().equals(name)) {
				user = tmpUser;
				break;
			}
		}
		
		if (user != null) {
			password = Leer.pedirCadena("Introduce la nueva contraseña");
			security = Leer.pedirEntero("Nivel de seguridad");
			encryptedPass = encryptPass(password, security);
			user.setPassword(encryptedPass);
			usrPassList.put(user, encryptedPass);
		} else {
			Leer.mostrarEnPantalla("El usuario" + name + " no existe");
		}
		
	}

	private static void signupUsers(TreeMap<User, String> usrPassList) {
		ArrayList<User> users = new ArrayList<>();
		users = createUsers();
		signup(usrPassList, users);
		printUsers(usrPassList);
	}

	private static ArrayList<User> createUsers() {
		ArrayList<User> users = new ArrayList<>();
		String exit = "0";
		User user = new User();
		String nickname = "";
		String password = "";
		String encryptedPass = "";
		Integer moveNumber = 0;
		
		Leer.mostrarEnPantalla("[Registrar usuario/s]");

		while (true) {
			Leer.mostrarEnPantalla("(0 para salir)");
			nickname = Leer.pedirCadena("Nombre de usuario:");
			if (nickname.equals(exit)) break;
			password = Leer.pedirCadena("Contraseña:");
			if (password.equals(exit)) break;
			moveNumber = Leer.pedirEntero("Seguridad de encriptado");
			if (moveNumber == Integer.parseInt(exit)) break;
			// String passwordConfirm;
			encryptedPass = encryptPass(password, moveNumber);
			user.setNickname(nickname);
			user.setPassword(encryptedPass);
			users.add(user);
		}
		return users;
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

	private static void signup(TreeMap<User, String> usrPassList, ArrayList<User> users) {
		for (User user : users) {		
			usrPassList.put(user, user.getPassword());
		}
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
