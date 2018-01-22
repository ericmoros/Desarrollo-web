
public class Text {
	public static final Character opt1 = '1';
	public static final Character opt2 = '2';
	public static final Character opt3 = '3';
	public static final Character opt4 = '4';
	public static final Character opt5 = '5';
	public static final Character opt8 = '-';
	public static final Character opt9 = 'H';
	public static final Character opt10 = 'X';
	
	public static final String menu   = "+-----------------------------+"
					  		   + "\n" + "|        ULTIMATEDATES        |"
					  		   + "\n" + "+-----------------------------+"
					  		   + "\n" + "|  " + opt1 + "- Registra una fecha.     |"
					  		   + "\n" + "|  " + opt2 + "- Mostrar las fechas.     |"
					  		   + "\n" + "|  " + opt3 + "- Imprimir fecha/s.       |"
					  		   + "\n" + "|  " + opt4 + "- Imprimir fecha en días. |"
					  		   + "\n" + "|  " + opt5 + "- Comparar dos fechas.    |"
					  		   + "\n" + "|  " + opt9 + "- Mostrar menú.           |"
					  		   + "\n" + "|  " + opt10 +"- Cerrar el programa.     |"
					  		   + "\n" + "+-----------------------------+";
	
	public static final String askName  = "Nombre de la fecha: ";
	public static final String askDay   = "Introduce el día: ";
	public static final String askMonth = "Introduce el mes: ";
	public static final String askYear  = "Introduce el año: ";
	public static final String askDate = "Introduce la fecha: ";
	
	public static final String newLine = "\n";
	
	public static final String noOpt = "Opción no reconocida";
	
	public static final String pressEnter = "Presiona Enter para continuar...";
	public static final String inProgress = "Pendiente";
	
	public static String noDate(String dateName) {
		return "La fecha " + dateName + " no existe";
	}
	public static String dateDifference(String dateName, Integer days, String dateName2) {
		return "" + dateName + " se lleva " + days + " días con " + dateName2;
	}
}
