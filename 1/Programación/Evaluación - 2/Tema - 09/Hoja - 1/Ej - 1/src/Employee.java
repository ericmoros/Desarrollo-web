
public class Employee {
	private String name;
	protected Float salaryBase = Main.baseSalaryGeneral;
	protected Integer salaryPercentExtra;
	
	Employee(String name, Integer salaryPercentExtra) {
		this.name = name;
		this.salaryPercentExtra = salaryPercentExtra;
	}
	
	Employee(String name, Float salaryBase, Integer salaryPercentExtra) {
		this.name = name;
		this.salaryBase = salaryBase;
		this.salaryPercentExtra = salaryPercentExtra;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getSalaryBase() {
		return salaryBase;
	}

	public void setSalaryBase(Float salaryBase) {
		this.salaryBase = salaryBase;
	}

	public void setSalaryBaseGeneral() {
		this.salaryBase = Main.baseSalaryGeneral;
	}

	public Integer getSalaryPercentExtra() {
		return salaryPercentExtra;
	}

	public void setSalaryPercentExtra(Integer salaryPercentExtra) {
		this.salaryPercentExtra = salaryPercentExtra;
	}
	
	public Float getSalary() {
		Float salary = salaryBase + (salaryBase * (salaryPercentExtra / 100));
		return salary;
	}
}
