public class Boss extends Employee {
	private String degree;
	private String office;
	
	Boss(String name, Integer salaryPercentExtra, String degree, String office) {
		super(name, salaryPercentExtra);
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