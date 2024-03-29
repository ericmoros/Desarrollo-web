import java.util.ArrayList;

public class Main {														//main Abajo del todo
	//MEN�
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
	
	private static Boolean askBoolean(String ask) {
		Boolean bool = null;
		Console.print(ask);
		bool = Console.readBoolean(Text.yes, Text.no);
		while (bool == null) {
			Console.printError(Text.errorBoolean);
			Console.print(ask);
			bool = Console.readBoolean(Text.yes, Text.no);
		}
		return bool;
	}
	
	private static String askString(String ask) {
		String str;
		Console.print(ask, 25);
		inputText = Console.readEnter();
		str = inputText;
		return str;
	}
	
	private static Integer askInteger(String ask) {
		Integer nInteger;
		Console.print(ask, 25);
		nInteger = Console.readInteger();
		while (nInteger == null) {
			Console.printError(Text.errorInteger);
			Console.print(ask);
			nInteger = Console.readInteger();
		}
		return nInteger;
	}
	
	private static Float askFloat(String str) {
		Float nFloat;
		Console.print(str, 25);
		nFloat = Console.readFloat();
		while (nFloat == null) {
			Console.printError(Text.errorFloat);
			Console.print(str);
			nFloat = Console.readFloat();
		}
		return nFloat;
	}
	
	//PROGRAMA
	public static String enterprise = Text.nameEnterprise;
	public static Float baseSalaryGeneral = 1200F;
	private static ArrayList<Employee> employeeList = new ArrayList<>();
	private static ArrayList<Boss> bossList = new ArrayList<>();
	
	
	private static void registerEmployee() {
		Employee employee = null;
		String name = null;
		Integer salaryPercentExtra = null;
		Integer employeeIndex = null;
		Integer totalRegisters = null;
		
		totalRegisters = askInteger(Text.askTotalRegisters);
		
		for (Integer actualRegister = 0; actualRegister < totalRegisters; actualRegister++) {
			name = askString(Text.askName);
			salaryPercentExtra = askInteger(Text.askSalaryPercentExtra);
			
			employee = new Employee(name, salaryPercentExtra);
			employeeList.add(employee);
			
			employeeIndex = employeeList.indexOf(employee);
			
			Console.print(Text.registeredEmployeeData(employeeIndex, name, employee.getSalary()));
		}
	}

	
	private static void registerEmployee(Employee employee) {
		employeeList.add(employee);
	}
	
	private static void registerBoss() {
		Boss boss = null;
		String name = null;
		Float salaryPlus = null;
		Integer salaryPercentExtra = null;
		String degree = null;
		String office = null;
		Integer bossIndex = null;
		Integer totalRegisters = null;
		
		totalRegisters = askInteger(Text.askTotalRegisters);
		
		for (Integer actualRegister = 0; actualRegister < totalRegisters; actualRegister++) {
			name = askString(Text.askName);
			salaryPlus = askFloat(Text.askSalaryPlus);
			salaryPercentExtra = askInteger(Text.askSalaryPercentExtra);
			degree = askString(Text.askDegree);
			office = askString(Text.askOffice);
			boss = new Boss(name, salaryPlus, salaryPercentExtra, degree, office);
			registerEmployee(boss);
			bossList.add(boss);
			bossIndex = bossList.indexOf(boss);
			Console.print(Text.registeredBossData(bossIndex, name, boss.getSalary(), degree, office));
		}
	}
	
	private static void listEmployee() {
		Integer employeeIndex = null;
		String name = null;
		Float salary = null;
		
		for (Employee employee: employeeList) {
			employeeIndex = employeeList.indexOf(employee);
			name = employee.getName();
			salary = employee.getSalary();
			Console.print(Text.employeeData(employeeIndex, name, salary));
		}
	}
	
	private static void listBoss() {
		Integer bossIndex = null;
		String name = null;
		Float salary = null;
		String degree = null;
		String office = null;
		
		for (Boss boss: bossList) {
			bossIndex = bossList.indexOf(boss);
			name = boss.getName();
			salary = boss.getSalary();
			degree = boss.getDegree();
			office = boss.getOffice();
			Console.print(Text.bossData(bossIndex, name, salary, degree, office));
		}
	}
	
	private static void modifySalaryBase() {
		Float salaryBase = null;
		Float salaryBaseOld = null;
		Float salaryBaseNew = null;
		Boolean updateEmployees = null;
		
		salaryBaseOld = baseSalaryGeneral;
		
		salaryBaseNew = askFloat(Text.askSalaryBaseNew);
		updateEmployees = askBoolean(Text.askUpdateSalaryBaseEmployees);

		baseSalaryGeneral = salaryBaseNew;
		salaryBase = baseSalaryGeneral;
		Console.print(Text.updatedSalaryBase(salaryBaseOld, salaryBase));
		
		//HERE
		if (updateEmployees) {
			for (Employee employee: employeeList) {
				employee.setSalaryBaseGeneral();
			}
			
			Console.print(Text.updatedSalaryBaseEmployees);
		}
	}

	private static void modifySalaryBaseEmployee() {
		Employee employee = null;
		Float salaryBase = null;
		Float salaryBaseOld = null;
		Float salaryBaseNew = null;
		Integer ide = null;
		
		while (employee == null) {
			try {
				ide = askInteger(Text.askIde);
				employee = employeeList.get(ide);
			} catch (Exception noEmployee) {
				Console.printError(Text.errorNoEmployee);
			}
		}
		
		salaryBaseNew = askFloat(Text.askSalaryBaseNew);
		salaryBaseOld = employee.getSalaryBase();
		
		employee.setSalaryBase(salaryBaseNew);
		
		salaryBase = employee.getSalaryBase();
		Console.print(Text.updatedSalaryBase(salaryBaseOld, salaryBase));
	}
	
	private static void modifyBossPlus() {
		Boss boss = null;
		Float salaryPlus = null;
		Float salaryPlusOld = null;
		Float salaryPlusNew = null;
		Integer idb = null;
		
		while (boss == null) {
			try {
				idb = askInteger(Text.askIdb);
				boss = bossList.get(idb);
			} catch (Exception noEmployee) {
				Console.printError(Text.errorNoEmployee);
			}
		}
		

		salaryPlusNew = askFloat(Text.askSalaryPlusNew);
		salaryPlusOld = boss.getSalaryPlus();
		
		boss.setSalaryPlus(salaryPlusNew);
		
		salaryPlus = boss.getSalaryPlus();
		Console.print(Text.updatedSalaryPlus(salaryPlusOld, salaryPlus));
	}
	/*
	Escribe  un  programa  que  pida  los  datos  de  una  serie  de  empleados  que  no  son  jefes,  tantos 
	como  el  usuario  indique.  Tambi�n  hay  que  pedir  los  datos  de  una  serie  de  jefes  que  son,  al 
	mismo  tiempo,  empleados,  tantos  como  el  usuario  indique.  Una 
	vez  insertados  todos  los 
	datos, hay que visualizarlos.
	De los empleados nos interesa: nombre y sueldo.
	De los jefes nos interesa: nombre, sueldo, t�tulo y nombre del departamento del que es jefe.
	
	DADO EL SIGUIENTE MEN�: 
	1.Modificar el sueldo base de todos los empleados. 
	2.Modificar el plus de todos los jefes. 
	3.Visualizar los datos de todos los empleados.
	*/
	public static void main(String[] args) {
		bossList.add(new Boss("Darth Vader", 2000F, 5000, "Fuerza oscura", "Destructor-45"));
		employeeList.add(bossList.get(0));
		employeeList.add(new Employee("Kylo Ren", 2));
		employeeList.add(new Employee("R3D3", 1));
		
		while (! Check.textChar(inputOption.charAt(0), Text.opt12, true)) {
			for (int posChar = 0; posChar < inputOption.length(); posChar++) {
				char actualChar = inputOption.charAt(posChar);
				
				//REGISTRAR EMPLEDO
				if (Check.textChar(actualChar, Text.opt1, true)) {
					registerEmployee();
					
				//REGISTRAR JEFE
				} else if (Check.textChar(actualChar, Text.opt2, true)) {
					registerBoss();
					
				//LISTAR EMPLEADOS
				} else if (Check.textChar(actualChar, Text.opt3, true)) {
					listEmployee();
					
				//LISTAR JEFES
				} else if (Check.textChar(actualChar, Text.opt4, true)) {
					listBoss();
					
				//MODIFICAR SUELDO BASE EMPLEADOS
				} else if (Check.textChar(actualChar, Text.opt6, true)) {
					modifySalaryBase();
				
				//MODIFICAR SUELDO BASE EMPLEADO
				} else if (Check.textChar(actualChar, Text.opt7, true)) {
					modifySalaryBaseEmployee();
					
				//MODIFICAR PLUS JEFES
				} else if (Check.textChar(actualChar, Text.opt5, true)) {
					modifyBossPlus();
				
					
				//MOSTRAR MEN�
				} else if (Check.textChar(actualChar, Text.opt11, true)) {
					showMenu();
					
				//OPCI�N NO RECONOC�DA
				} else {
					optionUnknown(actualChar);
				}
			}
			
			//Introducir opci�n
			enterOption();
		}
		
		Console.print(Text.seeYouSoon, 200);
		Console.printError(Text.endProgram);
	}
}
