import java.util.ArrayList;

public class Main {														//main Abajo del todo
	//MENÚ
	private static String inputText = "";
	private static String inputOption = "" + Text.opt11;
	
	private static void enterOption() {
		inputText = Console.readEnter();
		if (inputText.length() == 0) {
			inputOption += Text.opt13;
		}
		inputOption = inputText;
		inputText = "";
	}
	
	private static void inProgress() {
		Console.print(Text.inProgress);
	}
	
	private static void optionUnknown(char actualChar) {
		Console.print("'" + actualChar + "' " + Text.noOpt + Text.newLine);
	}
	
	private static void showMenu() {
		Console.printMenu();
		Console.print(Text.newLine);
	}
	
	//PROGRAMA
	private static ArrayList<Employee> employeeList = new ArrayList<>();
	
	private static void registerEmployee() {
		Employee employee = null;
		String name = null;
		Float salary = null;
		Console.print(name.toString());
		
		Console.print(Text.askName);
		inputText = Console.readEnter(); 
		name = inputText;
		
		Console.print(Text.askSalary);
		inputText = Console.readEnter();
		salary = Float.parseFloat(inputText);
		
		//employee.setEmployee(name, salary);
		employee = new Employee(name, salary);
		employeeList.add(employee);
	}
	
	/*
	Escribe  un  programa  que  pida  los  datos  de  una  serie  de  empleados  que  no  son  jefes,  tantos 
	como  el  usuario  indique.  También  hay  que  pedir  los  datos  de  una  serie  de  jefes  que  son,  al 
	mismo  tiempo,  empleados,  tantos  como  el  usuario  indique.  Una 
	vez  insertados  todos  los 
	datos, hay que visualizarlos.
	De los empleados nos interesa: nombre y sueldo.
	De los jefes nos interesa: nombre, sueldo, título y nombre del departamento del que es jefe.
	*/
	public static void main(String[] args) {
		while (! Check.textChar(inputOption.charAt(0), Text.opt12, true)) {
			for (int posChar = 0; posChar < inputOption.length(); posChar++) {
				char actualChar = inputOption.charAt(posChar);
				
				//REGISTRAR EMPLEDO
				if (Check.textChar(actualChar, Text.opt1, true)) {
					registerEmployee();
					
				//MODIFICAR LIBRO
				} else if (Check.textChar(actualChar, Text.opt2, true)) {
					inProgress();

				
				//MOSTRAR MENÚ
				} else if (Check.textChar(actualChar, Text.opt11, true)) {
					showMenu();
					
				//OPCIÓN NO RECONOCÍDA
				} else {
					optionUnknown(actualChar);
				}
			}
			
			//Introducir opción
			enterOption();
		}
	}
}
