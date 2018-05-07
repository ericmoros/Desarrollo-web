import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Eric Moros Pérez
 *
 */
public class Dish {
	private String name;
	private ArrayList<String> ingredients = new ArrayList<>();
	private Float price = 1F;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<String> getIngredients() {
		return ingredients;
	}
	public void setIngredients(ArrayList<String> ingredients) {
		this.ingredients = ingredients;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice() {
		this.price += ingredients.size() * 1.5F;
	}
}
