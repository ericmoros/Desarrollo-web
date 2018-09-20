public class Dish {
	private String name;
	private Float price;
	private String[] ingredient;
	
	Dish (String name, Float price, String[] ingredient) {
		this.name = name;
		this.price = price;
		this.ingredient = ingredient;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	
	public String[] getIngredient() {
		return ingredient;
	}
	public void setIngredient(String[] ingredient) {
		this.ingredient = ingredient;
	}
}