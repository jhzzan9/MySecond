package submit02.Submit04;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingMain {
	public static void main(String[] args) {

		ArrayList<Menu> cart = new ArrayList<Menu>();

		cart.add(new Menu("아메리카노", 3000, 1));
		cart.add(new Menu("조각케이크", 4000, 2));
		cart.add(new Menu("김밥", 3000, 3));
		cart.add(new Menu("떡볶이", 5000, 5));
		cart.add(new Menu("라면", 3000, 2));
		cart.add(new Menu("돈까스", 5500, 4));
		cart.add(new Menu("순두부찌개", 7000, 6));
		cart.add(new Menu("김치볶음밥", 6500, 7));
		cart.add(new Menu("비빔만두", 4500, 4));
		cart.add(new Menu("뼈해장국", 7000, 8));
		cart.add(new Menu("냉면", 4000, 5));
		cart.add(new Menu("쫄면", 4500, 6));
		cart.add(new Menu("제육덮밥", 5000, 6));
		cart.add(new Menu("오징어덮밥", 5500, 6));
		cart.add(new Menu("양푼비빔밥", 5000, 6));
		cart.add(new Menu("포만감 10 대박!", 0, 10));

		System.out.println("딸랑~♪\n");
		System.out.println("어서오세요~");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println();

		System.out.println("============ 메뉴판 ==============");
		for (Menu i : cart) {
			System.out.println(i);
		}
		System.out.println("==================================");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println();

		Guest jihye = new Guest("지혜");
		System.out.println(jihye);
		System.out.println("랜덤으로 음식이 나옵니다! 기회는 5번, 포만감 10을 채워 주세요!");
		System.out.println();
		Scanner sc = new Scanner(System.in);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < 5; i++) {
			int rand = (int) (Math.random() * cart.size());
			System.out.println("==========================");
			System.out.println((i + 1) + "번째 음식");
			System.out.println(cart.get(rand));
			System.out.println("==========================");
			System.out.println();

			System.out.println("음식을 드시겠습니까?");
			System.out.println("1. 먹는다 | 2. 안 먹는다");
			System.out.print(">>> ");

			int select = Integer.parseInt(sc.nextLine());
			if (select == 1) {
				jihye.buyShoppingCart(cart.get(rand));
				jihye.showShoppingCart();
				System.out.println();
				System.out.println(jihye);
				System.out.println();

				if (jihye.full == 10) {
					System.out.println(i + 1 + "트! 성공");
					break;
				} else if (jihye.full > 10) {
					System.out.println("실패!! 배불러요.");
					System.out.println();
					break;
				}

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			} else if (select == 2) {
				if(i != 4) {
					 System.out.println();
					System.out.println("다른 메뉴를 선택해 주세요.");
					jihye.showShoppingCart();
					System.out.println();
					System.out.println(jihye);
				}
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} 
		if(jihye.full < 10) {
			System.out.println();
			System.out.println(jihye);
			System.out.println("\n실패!! 배고파요.");
			System.out.println();
		}
		System.out.println("수고하셨습니다!");
	}

}