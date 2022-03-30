package submit02.Submit02;

import java.util.ArrayList;
import java.util.Collections;

import lec09_class.school.Student;

public class Himart {
	public static void main(String[] args) {

		// 1.하이마트에 놀러갔더니 전자제품들이 정말 많이 있군요. 전자제품들은 각각 제품명과 가격이 함께 전시되어있습니다. 이를 코드로 구현하기
		// 위해, 필드 변수에 제품명과 가격을 포함하는 전자제품 클래스(Product)를 만들어보세요.
		// (당연히 제품명과 가격을 입력받는 생성자를 포함하며, 필드 변수들은 캡슐화를 해야 겠죠?)
		ArrayList<Product> productList = new ArrayList<Product>();

		// 2. Product 클래스를 이용하여
		// 객체들을 만들어주세요.
		productList.add(new Product("냉장고", 2000000));
		productList.add(new Product("TV", 1000000));
		productList.add(new Product("에어컨", 800000));
		productList.add(new Product("컴퓨터", 1300000));
		productList.add(new Product("선풍기", 100000));

		for (Product List : productList) {
			System.out.println(List);
		}

		System.out.println("====================================");

		// 3. 전자제품들을 ArrayList 객체에 담은 후 가격별로 정렬하여 출력해주세요.
		for (int i = 0; i < productList.size(); i++) {
			boolean max = false;

			for (int j = 0; j < productList.size() - 1; j++) {

				if (productList.get(j).getPrice() > productList.get(j + 1).getPrice()) {
					Product temp = productList.get(j);
					productList.set(j, productList.get(j + 1));
					productList.set(j + 1, temp);
					max = true;
				}
			}
		}
		for (Product List : productList) {
			System.out.println(List);
		}
		
		System.out.println("====================================");

		// 4. 정렬이 완료된 리스트에서 TV가 몇번째 인덱스인지 찾아내어 출력하시오.
		for (int i = 0; i < productList.size(); i++) {
			if (productList.get(i).getName().equals("TV")) {
				System.out.println(i);
			}
		}
	}
}
