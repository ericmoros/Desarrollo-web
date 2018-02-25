public class Client {
	private String name;
	private String surnames;
	private Menu[] order;
	
	public Client() {}
	public Client(String name, String surnames, Menu[] order) {
		super();
		this.name = name;
		this.surnames = surnames;
		this.order = order;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSurnames() {
		return surnames;
	}
	public void setSurnames(String surnames) {
		this.surnames = surnames;
	}

	public Menu[] getOrder() {
		return order;
	}
	public void setOrder(Menu[] order) {
		this.order = order;
	}
}