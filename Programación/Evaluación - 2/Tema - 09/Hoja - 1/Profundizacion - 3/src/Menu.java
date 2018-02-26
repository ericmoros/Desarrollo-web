public class Menu {
	private static Integer served = 0;
	private String name;
	private Dish[] dishList;
	
	
	public Menu(String name, Dish[] dish) {
		this.name = name;
		this.dishList = dish;
	}

	
	public static Integer getServed() {
		return served;
	}
	public static void setServed(Integer served) {
		Menu.served = served;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Dish[] getDish() {
		return dishList;
	}
	public void setDish(Dish[] dish) {
		this.dishList = dish;
	}
	
	
	public String showByConsole() {
		String menu = "\n" + name + "_________________________________________(" + (dishList[0].getPrice() + dishList[1].getPrice()) + "€)_";
		
		for (int actualDish = 0; actualDish < dishList.length; actualDish++) {
			menu += "\n" + "  " + (actualDish + 1) + ": " + dishList[actualDish].getName();
			for (int actualIngredient = 0; actualIngredient < dishList[actualDish].getIngredient().length; actualIngredient++) {
				menu += "\n" + "     " + dishList[actualDish].getIngredient()[actualIngredient];
			}
		}
		
		menu += "\n" + "_____________________________________________________"
			  + "\n";
		
		return menu;
	}
}