package lec05_controll;

import java.util.Scanner;

public class LoopWhile {
	public static void main(String[] args) {
		// While문
		
		int i = 2;			// 초기화식
		while(i <= 9) {		// 조건식
			System.out.println("2 x " + i + " = " + (i*2));	// 실행문
			i++; 			// 증감식
		}
		
		// for문의 향기가..
		
		System.out.println("\n=======================\n");
		
		i = 2;
		// 못생긴 for문은 쓰지 말자
		for(;i <= 9;) {	//조건식
			System.out.println("2 x " + i + " = " + (i*2)); // 실행문
			i++;		// 증감식
		}
		
		
		// level 1
		boolean isRunning = true;
		Scanner sc = new Scanner(System.in);
		
//		while(isRunning) {
//			System.out.print("콘솔에 출력할 내용 입력[종료 q 또는 Q] : ");
//			
//			String inputText = sc.nextLine();
//			
//			if(inputText.equals("q") || inputText.equals("Q")) {
//				System.out.println("프로그램이 종료되었습니다.");
//				isRunning = false;
//			}else
//				System.out.println(inputText);
//		}
		
		// level 2
//		while(true) {
//			System.out.print("콘솔에 출력할 내용 입력[종료 q 또는 Q] : ");
//			String inputText = sc.nextLine();
//			
//			// .toLowecase() 해당 앞파벳을 소문자로 바꾸어 준다.
//			if(inputText.toLowerCase().equals("q")) {
//				System.out.println("프로그램이 종료되었습니다.");
//				break;
//			}else {
//				System.out.println(inputText);
//			}
//		}
		System.out.println("\n=======================\n");
	
		// do-while문
//		isRunning = false;
//		do {
//			System.out.println("프로그램이 시작되었습니다.");
//		} while(isRunning);
//		
//		String inputString = "";
//		do {
//			System.out.print("콘솔에 출력할 내용 입력[종료 q 또는 Q] : ");
//			inputString = sc.nextLine();
//			System.out.println(inputString);
//		} while(!inputString.toUpperCase().equals("@"));
//	
	
		// 이중(다중) while 문
		// 구구단
		int intVal = 2;
		while(intVal <= 9) {
			System.out.println();
			int rightVal = 2;
			while(rightVal <= 9) {
				System.out.println(intVal + " x " + rightVal + " = " + (intVal*rightVal));
				rightVal++;
			}
			intVal++;
		}
		
		System.out.println("\n======================\n");
		
		// 포켓몬스터
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("야생의 단데리를 만났습니다." + " 행동을 선택해 주세요.");
			System.out.println("1. 공격 | 2. 도망");
			System.out.print(">> ");
			
			String inputText = scan.nextLine();
			
			if(inputText.equals("1")) {
				while(true) {
					System.out.println("공격 방법은?");
					System.out.println("1. 백만볼트 | 2. 전광석화 | 3. 취소");
					System.out.print(">> ");
					
					String attack = sc.nextLine();
					if(attack.equals("1")) {
						System.out.println("피카츄 백만볼트!!");
					}else if(attack.equals("2")) {
						System.out.println("피카츄 전광석화!!");
					}else if(attack.equals("3")) {
						break;  // 내부 while문은 더이상 실행되지 않음
								// 외부 while문은 계속 실행
					}else {
						System.out.println("잘못 입력하셨습니다.");
					}
				}
			}else if(inputText.equals("2")) {
				System.out.println("단데리를 상대로 도망쳤습니다");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		
		scan.close();	// 사용자로부터 값을 입력받는
						// Scanner 객체를 종료한다.
		
		String inputText = scan.nextLine();
		// scanner를 닫은 이후 입력 받으려 하면 에러가 난다
		// 즉 더 이상 입력 받을 일이 없을 때 close() 를 해 준다.
		
		// 사실 Scanner는 autoCloseable을 구현하고 있기 대문에
		// 자동으로 close 되고 있지만, 명시적으로 clase 를 해 주면 좋다.
		
		// Ctrl + 마우스 클릭 -> 해당 변수가 선언된 위치나
		// 해당 클래스가 있는 위치 등등을 찾아갑니다.
	
	}
}
