import java.util.ArrayList;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

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
						Leer.mostrarEnPantalla("_ Menu ___________________________\n"
											 + " 1 - Mostrar menu\n"
											 + " 2 - Registrar usuario/s\n"
											 + " 3 - Dar de baja usuario/s\n"
											 + " 4 - Modificar contraseña\n"
											 + " 5 - Imprimir usuarios contraseñas \n"
											 + " 6 - Iniciar sesión\n"
											 + "__________________________________\n");
						break;
					case '2':
						signupUsers(usrPassList);
						break;
					case '3':
						dropUsers(usrPassList);
						break;
					case '4':
						modifyUserPassword(usrPassList);
						break;
					case '5':
						showUsersPasswords(usrPassList);
						break;
					case '6':
						login(usrPassList);
						break;
					case '0':
						exit = true;
						break;
					default:
						options += '1';
				}

			}
			
			if (exit) break;

			options = Leer.pedirCadena("Introduce una o varias opciones");
			
		}
		
		Leer.mostrarEnPantalla("Nos vemooos! :D");
		try {
			TimeUnit.MILLISECONDS.sleep(750);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.err.println("{Fin de programa}");
	}

	/**
	 * @param usrPassList
	 * 
	 * Iniciar sesión
	 */
	private static void login(TreeMap<User, String> usrPassList) {
		String name;
		String password;
		Integer moveNumber;
		
		System.err.println("\n[Iniciar sesión]");
		
		name = Leer.pedirCadena("Introduce el nombre del usuario");
		password = Leer.pedirCadena("Introduce la contraseña");
		moveNumber = Leer.pedirEntero("Introduce el nivel de seguridad");
		password = encryptPass(password, moveNumber);
		
		for (User user: usrPassList.keySet()) {
			if (user.getNickname().equals(name)) {
				if (password.equals(usrPassList.get(user))) user.setSession(true);
				break;
			}
		}
	}

	/**
	 * @param usrPassList
	 * 
	 * Borrar usuario
	 */
	private static void dropUsers(TreeMap<User, String> usrPassList) {
		User user = null;
		String name;
		String nameToDelete = "";
		ArrayList<String> deleteName = new ArrayList<>();
		
		System.err.println("\n[Dar usuario de baja]");
		
		name = Leer.pedirCadena("Introduce el nombre del usuario");
		
		for (Integer charPos = 0; charPos < name.length(); charPos++) {
			if(name.charAt(charPos) != ' ') {
				nameToDelete += name.charAt(charPos);
			}else if(name.charAt(charPos) == ' ') {
				deleteName.add(nameToDelete);
				nameToDelete = "";
			}
		}
		if(name.charAt(name.length()-1)!=' ') {
			deleteName.add(nameToDelete);
		}
		
		for (String string: deleteName) {
			for (User tmpUser: usrPassList.keySet()) {
				if (tmpUser.getNickname().equals(string)) {
					user = tmpUser;
					if (user != null) usrPassList.remove(user);
					break;
				}
			}
		}
	}

	/**
	 * @param usrPassList
	 * 
	 * Mostrar los datos almacenados de los usuarios
	 */
	private static void showUsersPasswords(TreeMap<User, String> usrPassList) {
		String name;
		String password;
		Boolean session;
		String str;
		
		System.err.println("\n[Usuarios]");
		
		for (User user : usrPassList.keySet()) {
			name = user.getNickname();
			password = usrPassList.get(user);
			session = user.getSession();
			str = "Nombre: " + name + ", " + "contraseña: " + password;
			if (session) str += " [Conectado]";
			Leer.mostrarEnPantalla(str);
		}
	}

	/**
	 * @param usrPassList 
	 * 
	 * Modificar la contraseña de un usuario
	 */
	private static void modifyUserPassword(TreeMap<User, String> usrPassList) {
		User user = null;
		String name;
		String password;
		Integer security;
		String encryptedPass;
		
		System.err.println("\n[Modificar contraseña]");
		
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

	/**
	 * @param usrPassList
	 * 
	 * Registrar listas de usuarios
	 */
	private static void signupUsers(TreeMap<User, String> usrPassList) {
		ArrayList<User> users = new ArrayList<>();
		
		System.err.println("\n[Registrar usuario/s]");
		
		users = createUsers();
		
		for (User user : users) {		
			usrPassList.put(user, user.getPassword());
		}
	}

	/**
	 * @return ArrayList<User>
	 * 
	 * Crear listas de usuarios
	 */
	private static ArrayList<User> createUsers() {
		ArrayList<User> users = new ArrayList<>();
		String exit = "0";
		User user;
		String nickname = "";
		String password = "";
		Integer moveNumber = 0;

		while (true) {
			user = new User();
			Leer.mostrarEnPantalla("(0 para salir)");
			nickname = Leer.pedirCadena("Nombre de usuario:");
			if (nickname.equals(exit)) break;
			password = Leer.pedirCadena("Contraseña:");
			if (password.equals(exit)) break;
			moveNumber = Leer.pedirEntero("Seguridad de encriptado");
			if (moveNumber == Integer.parseInt(exit)) break;
			// String passwordConfirm;
			password = encryptPass(password, moveNumber);
			user.setNickname(nickname);
			user.setPassword(password);
			users.add(user);
		}
		return users;
	}
	
	/**
	 * @param password
	 * @param moveNumber
	 * @return encryptedPass
	 * 
	 * Modifica los caracteres de la cadena introducida en funcion del número que se introduzca
	 */
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
