
public class Employee {
	private String name;
	private Float salary;
	
	Employee(String name, Float salary) {
		this.name = name;
		this.salary = salary;
	}
	
	//Rellenar datos (Para porder dejarme preparado el objetocomo null y despues darle los datos)
	public void setEmployee(String name, Float salary) {
		this.name = name;
		this.salary = salary;
	}

	//Nombre
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//Salario
	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}
}
