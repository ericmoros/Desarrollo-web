public class Boss extends Employee {
	private Float salaryPlus;
	private String degree;
	private String office;
	
	Boss(String name, Float salaryPlus, Integer salaryPercentExtra, String degree, String office) {
		super(name, salaryPercentExtra);
		this.salaryPlus = salaryPlus;
		this.degree = degree;
		this.office = office;
		
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public Float getSalaryPlus() {
		return salaryPlus;
	}

	public void setSalaryPlus(Float salaryPlus) {
		this.salaryPlus = salaryPlus;
	}
	
	public Float getSalary() {
		Float salary = salaryBase + (salaryBase * (salaryPercentExtra / 100) + salaryPlus);
		return salary;
	}
}