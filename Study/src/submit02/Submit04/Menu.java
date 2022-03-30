package submit02.Submit04;

public class Menu {
	
	String name;		// 상품 이름
	int price;			// 상품 가격
	int full;			// 포만감
	
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getFull() {
		return full;
	}

	@Override
	public String toString() {
		return name + " " + price + " /포만감 " + full;
	}
	public Menu(String name, int price, int full) {
		this.name = name;
		this.price = price;
		this.full = full;
	}
}