public class Text {
	public static final Character opt1 	= '1';
	public static final Character opt2 	= '2';
	public static final Character opt3 	= '3';
	public static final Character opt4 	= '4';
	public static final Character opt5	= '5';
	public static final Character opt6 	= '6';
	public static final Character opt7	= '7';
	public static final Character opt8 	= '8';
	public static final Character opt9	= '9';
	public static final Character opt10	= '0';
	public static final Character opt11	= '?';
	public static final Character opt12	= 'X';
	public static final Character opt13	= '-';
	
	public static final String menu   = "+----------------------------+"
					  		   + "\n" + "|        EmpleadoJefe        |"
					  		   + "\n" + "+----------------------------+"
					  		   + "\n" + "|  Empleado                  |"
					  		   + "\n" + "|   " + opt1 + "- Registrar             |"
					  		   + "\n" + "|   " + opt2 + " * como jefe            |"
					  		   + "\n" + "+----------------------------+"
					  		   + "\n" + "|     " + opt11 + "- Menú  "  + opt12 +"- Cerrar     |"
					  		   + "\n" + "+----------------------------+";
	
	public static final String askIfEmpty    = "(En caso de no introducir un dato se mantendrá el anterior) ";
	
	public static final String askName = "Introduce el nombre: ";
	public static final String askSalary = "Introduce el sueldo: ";
	
	public static final String askDegree = "Introduce el título: ";
	public static final String askOffice = "Introduce el departamento: ";
	
	
	public static final String newLine = "\n";
	public static final String noOpt = "Opción no reconocida";
	public static final String wtf = "¿Lechuga?";
	public static final String pressEnter = "Presiona Enter para continuar...";
	public static final String inProgress = "Pendiente";
	public static final String askTotalRegisters = "¿Cúantos desea registrar? ";
	public static final String money = "€";
	
	public static final String errorInteger = "[ERROR] El dato a de ser un número entero (0)";
	public static final String errorFloat = "[ERROR] El dato a de ser un número flotante (0.0)";
	
	public static String employeeData(Integer IDE, String name, Float salary) {
		return "IDE: " + IDE + ", nombre: " + name + ", salario: " + salary;
	}
	
	public static String registeredEmployeeData(Integer IDE, String name, Float salary) {
		return "Registrado empleado(IDE"+ IDE +") con el nombre: " + name + " y un salario de: " + salary + money  + newLine + newLine;
	}
}
