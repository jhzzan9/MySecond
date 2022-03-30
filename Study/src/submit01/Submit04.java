package submit01;

import java.util.Scanner;

public class Submit04 {
	public static void main(String[] args) {
		// 사용자로부터 현재신장(cm)과 현재체중(kg)을 입력받아 비만도를 표기 해주는 프로그램을 작성하시오.

		// 표준체중(kg) = (현재신장 - 100) * 0.9
		// 비만도(%) = (현재체중 / 표준체중) * 100

		// 비만도가 80미만은 저체중
		// 비만도가 80이상 110미만은 정상체중
		// 비만도가 110이상 130미만은 과체중
		// 비만도가 130이상은 비만

		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 신장(cm)을 입력해주세요 : ");
		String cm = sc.nextLine();
		System.out.print("현재 체중(kg)을 입력해주세요 : ");
		String kg = sc.nextLine();
		
		int intKg = Integer.parseInt(kg);
		int intCm = Integer.parseInt(cm);
		
		double standardKg = (intCm - 100) * 0.9;	
		double obesity = (intKg / standardKg) * 100;
		
		if(obesity < 80) {
			System.out.println("저체중 입니다.");
		}else if(obesity < 110) {
			System.out.println("정상체중 입니다.");
		}else if(obesity < 130) {
			System.out.println("과체중 입니다.");
		}else {
			System.out.println("비만 입니다.");
		}
		
		sc.close();
	}
}
