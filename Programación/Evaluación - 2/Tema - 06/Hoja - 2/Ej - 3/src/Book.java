public class Book {
	private String 	title;
	private Integer stock;
	private Float 	price;
//	private Integer[] authorsPos;
	
//	Book(String title, Integer stock, Float price, Integer[] authorsPos) {
	Book(String title, Integer stock, Float price) {
		this.title = title;
		this.stock = stock;
		this.price = price;
//		this.authorsPos = authorsPos;
	}

	public String getTitle() {
		return title;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}
	
	//set precio, cantidad y visualizar datos por lo demás todo
	
}
