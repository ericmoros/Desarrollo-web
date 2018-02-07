public class Boss extends Employee {
	private String degree;
	private String office;
	
	Boss(String name, Float salary, String degree, String office) {
		super(name, salary);
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
}