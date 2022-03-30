package submit02.Submit04;

import java.util.ArrayList;

public class Guest {
	
	String name;			// 손님 이름
	int full = 0;			// 포만감
	
	ArrayList<Menu> shoppingCart = new ArrayList<Menu>();
	
	public String getName() {
		return name;
	}

	public int getFull() {
		return full;
	}
	public void setFull(int full) {
		this.full = full;
	}
	@Override
	public String toString() {
		return name + " 님 현재 포만감은 " + full + "입니다.";
	}
	public Guest(String name) {
		super();
		this.name = name;
	}
	
	public void buyShoppingCart(Menu menu) {
		shoppingCart.add(menu);
		this.full += menu.full;
	}
	
	public void showShoppingCart() {
		if(shoppingCart.size() > 0) {
			System.out.println();
			System.out.println(this.name + "님의 먹은 음식");
			for(Menu mu : shoppingCart) {
				System.out.println(mu);
			}
		}
	}
}