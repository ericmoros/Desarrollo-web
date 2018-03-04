import java.util.Arrays;

/**
 * @author Eric Moros Pérez
 *
 */
public class Menu {
	private static Integer served = 0;
	private String name;
	private Dish[] dishList;
	
	public Menu() {};
	/**
	 * @param name
	 * @param dish
	 */
	public Menu(String name, Dish[] dish) {
		this.name = name;
		this.dishList = dish;
	}
	/**
	 * @return
	 */
	public static Integer getServed() {
		return served;
	}
	/**
	 * @param served
	 */
	public static void setServed(Integer served) {
		Menu.served = served;
	}
	
	/**
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return
	 */
	public Dish[] getDishList() {
		return dishList;
	}
	/**
	 * @param dishList
	 */
	public void setDishList(Dish[] dishList) {
		this.dishList = dishList;
	}
	/**
	 * @param idD
	 * @return Dish
	 */
	public Dish getDish(Integer idD) {
		return dishList[idD];
	}
	/**
	 * @param dish
	 */
	public void addDish(Dish dish) {
		if (dishList != null) {			
			dishList = Arrays.copyOf(dishList, dishList.length + 1);
			dishList[dishList.length - 1] = dish;
		} else {
			dishList = new Dish[] {dish};
		}
	}
		
	
	/**
	 * @return menu
	 */
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