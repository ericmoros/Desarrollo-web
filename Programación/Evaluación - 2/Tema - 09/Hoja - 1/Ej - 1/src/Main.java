import java.util.ArrayList;

public class Main {														//main Abajo del todo
	//MENÚ
	private static String inputText = "";
	private static String inputOption = "" + Text.opt11;
	
	private static void enterOption() {
		inputText = Console.readEnter();
		if (inputText.length() > 0) {
			inputOption = inputText;
		} else {
			inputOption = "" + Text.opt13;
		}
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
	private static ArrayList<Boss> bossList = new ArrayList<>();
	
	private static String askString(String ask) {
		String str;
		Console.print(ask);
		inputText = Console.readEnter();
		str = inputText;
		return str;
	}
	
	private static Integer askInteger(String ask) {
		Integer totalRegisters;
		Console.print(ask);
		totalRegisters = Console.readInteger();
		while (totalRegisters == null) {
			Console.printError(Text.errorInteger);
			Console.print(ask);
			totalRegisters = Console.readInteger();
		}
		return totalRegisters;
	}
	
	private static Float askFloat(String str) {
		Float salary;
		Console.print(str);
		salary = Console.readFloat();
		while (salary == null) {
			Console.printError(Text.errorFloat);
			Console.print(str);
			salary = Console.readFloat();
		}
		return salary;
	}
	
	private static void registerEmployee() {
		Employee employee = null;
		String name = null;
		Float salary = null;
		Integer employeeIndex = null;
		Integer totalRegisters = null;
		
		totalRegisters = askInteger(Text.askTotalRegisters);
		
		for (Integer actualRegister = 0; actualRegister < totalRegisters; actualRegister++) {
			name = askString(Text.askName);
			salary = askFloat(Text.askSalary);
			
			employee = new Employee(name, salary);
			employeeList.add(employee);
			
			employeeIndex = employeeList.indexOf(employee);
			
			Console.print(Text.registeredEmployeeData(employeeIndex, name, salary));
		}
	}

	
	private static void registerEmployee(Employee employee) {
		String name = employee.getName();
		Float salary = employee.getSalary();
		Integer employeeIndex = employeeList.indexOf(employee);
		employeeList.add(employee);
		Console.print(Text.registeredEmployeeData(employeeIndex, name, salary));
	}
	
	private static void registerBoss() {
		Boss boss = null;
		String name = null;
		Float salary = null;
		String degree = null;
		String office = null;
		Integer bossIndex = null;
		Integer totalRegisters = null;
		
		totalRegisters = askInteger(Text.askTotalRegisters);
		
		for (Integer actualRegister = 0; actualRegister < totalRegisters; actualRegister++) {
			name = askString(Text.askName);
			salary = askFloat(Text.askSalary);
			degree = askString(Text.askDegree);
			office = askString(Text.askOffice);
			boss = new Boss(name, salary, degree, office);
			registerEmployee(boss);
			bossList.add(boss);
			bossIndex = bossList.indexOf(boss);
		}
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
					
				//REGISTRAR JEFE
				} else if (Check.textChar(actualChar, Text.opt2, true)) {
					registerBoss();
				
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
