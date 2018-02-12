
public class Employee {
	private String name;
	private Float salaryBase = Main.baseSalaryEmployee;
	private Integer salaryPercentExtra;
	
	Employee(String name, Integer salaryPercentExtra) {
		this.name = name;
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
		this.salaryBase = Main.baseSalaryEmployee;
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
