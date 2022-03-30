package lec10_extends_interface.ramen;
// 추상 메소드를 가지고 있는 클래스는
// 무조건 추상 클래스로 선언해야 한다.
public abstract class Ramen {
	private String name;	// 라면 이름
	private int price;		// 라면 가격
	
	public Ramen(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	// 라면의 례시피를 출력해 주는 함수
	// 라면마다 레시피가 다르기 때문에
	// 추상 메소드로 만든다.
	public abstract void printRecipe();
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Ramen [name=" + name + ", price=" + price + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
