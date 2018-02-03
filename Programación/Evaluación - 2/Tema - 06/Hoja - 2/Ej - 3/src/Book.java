public class Book {
	private String 	title;
	private Float 	price;
	private Integer stock;
	
//	private Integer[] authorsPos;
	
//	Book(String title, Integer stock, Float price, Integer[] authorsPos) {
	Book(String title, Float price, Integer stock) {
		this.title = title;
		this.price = price;
		this.stock = stock;
//		this.authorsPos = authorsPos;
		BooksAuthors.addBook(this);
	}
	
	Book(Integer IDB, String title, Float price, Integer stock) {
		this.title = title;
		this.price = price;
		this.stock = stock;
		BooksAuthors.setBook(IDB, this);
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
}
