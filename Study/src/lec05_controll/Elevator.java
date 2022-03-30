package lec05_controll;

import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

public class Elevator {
	public static void main(String[] args) {
	
		// 엘리베이터가 두 대 있는 빌딩에서 엘리베이터 버튼을
		// 눌렀을 때, 한 대의 엘리베이터가 이동하는 프로그램 구현
		
		// 1. 사용자의 현재 위치를 Scanner로 입력하면
		//    사용자의 위치와 더 가까운 엘리베이터가 이동한다.
		// 2. 사용자의 위치와 두 엘리베이터의 위치 차이가 동일하다면
		//    둘 중 위 층의 엘레베이터가 내려온다.
		// 3. 사용자가 입력한 위치로 엘리베이터의 위치를 바꿔 준다.
		// 4. 엘리베이터 프로그램을 종료하려면 q, Q, exit, EXIT, Exit을 입력한다.
		
		// 너무 쉽다면
		// @. 사용자가 엘리베이터에 탑승하고 층을 입력하면,
		//    탑승 중인 엘리베이터가 해당 층으로 이동하도록 만들어 보기.
		// @. 사용자가 숫자가 아닌 다른 값을 입력하였을 때,
		//    "잘못 입력하셨습니다." 출력 후 다시 입력할 수 있도록 만드세요.
		
		int elevatorA = 10; // 엘리베이터 A의 위치
		int elevatorB = 4;  // 엘리베이터 B의 위치
		
		Scanner sc = new Scanner(System.in);
		
		// 움직인 엘리베이터가 A면 1, B면 2
		final int ACTIVE_ELEVATOR_A = 1;
		final int ACTIVE_ELEVATOR_B = 2;
		int activeElevator = 0;
		
		while(true) {
			System.out.println("\n============= 희영빌딩 엘리베이터 ================\n");
			System.out.println("승강기 A의 현재 위치: " + elevatorA + "층");
			System.out.println("승강기 B의 현재 위치: " + elevatorB + "층");
			System.out.print("몇 층에 계시나요?[종료하시려면 q 또는 exit 입력]: ");
			String inputText = sc.nextLine();
			
			// 종료를 입력했는지 확인하고 종료 시킴
			if(inputText.toLowerCase().equals("q") || inputText.toLowerCase().equals("exit")) {	// 조건으로 q, Q, exit, EXIT, Exit,이 맞는지?
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			// 숫자만 입력했는지 확인
			// regex
			// 단축키 [Ctrl + H] 핵 꿀팁!
			String regex = "^[0-9]+$";
			// 문자열의 시작(^)과 끝($) 사이에 숫자[0-9]가
			// 한 개 이상(+) 존재하는지 체크하기 위한 정규표현
	

			System.out.println(inputText + "층에서 엘리베이터를 호출합니다.");
				int userFloor = Integer.parseInt(inputText);	// 아니라면 문자를 숫자로 변환
				int eleGapA = elevatorA - userFloor;
				if(eleGapA < 0) {
					eleGapA = eleGapA * -1;	// 음수이면 양수로 바꿔 줌
				}
				int eleGapB = elevatorB - userFloor;
				if(eleGapB < 0) {
					eleGapB = eleGapB * -1;	// 음수이면 양수로 바꿔 줌
				}
				if(eleGapA < eleGapB) {	// 양수인 상태에서 비교해 B가 더 높다면 A가 이동
					System.out.println("승강기 A가 " + inputText + "층으로 이동하였습니다.");
					elevatorA = userFloor;
				}
				else if(eleGapA == eleGapB) {	// 차이가 똑같다면
					if(elevatorA > elevatorB) {	// A의 엘리베이터 층이 높다면 A가 이동
						System.out.println("승강기 A가 " + inputText + "층으로 이동하였습니다.");
						elevatorA = userFloor;
					}
					else if(elevatorB > elevatorA) {// B의 엘리베이터 층이 높다면 B가 이동
						System.out.println("승강기 B가 " + inputText + "층으로 이동하였습니다.");
						elevatorB = userFloor;
					}
				}
			else {	// 양수인 상태에서 비교해 A가 더 높다면 B가 이동
				System.out.println("승강기 B가 " + inputText + "층으로 이동하였습니다.");
				elevatorB = userFloor;
			}
		}
		}
}