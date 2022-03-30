package submit02.Submit02;

public class Product {

	private String name; // 제품명
	private int price; // 가격
	
	
	Product(){
		
	}
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}


	public int getPrice() {
		return price;
	}


	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
	
	
}
