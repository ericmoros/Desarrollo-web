public class Client {
	private String name;
	private String surnames;
	private Menu menu;
	
	public Client() {}
	public Client(String name, String surnames, Menu menu) {
		this.name = name;
		this.surnames = surnames;
		this.menu = menu;
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

	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu2) {
		this.menu = menu2;
	}
}