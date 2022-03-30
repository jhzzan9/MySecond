package submit01;

import java.util.Scanner;

public class Submit05 {
	public static void main(String[] args) {
		// 1~50 사이의 랜덤한 수를 5번 안에 맞춰야하는 업다운 게임을 만들어보세요.
		// Run 실행 시 1~50 사이의 랜덤한 수가 생성되며, 사용자가 입력한 숫자에 대해 업, 다운을 알려준다.
		// 5번의 기회 동안 사용자가 정답을 맞추지 못한다면 "실패하였습니다" 문구 출력 후
		// 프로그램이 종료, 사용자가 정답을 맞춘다면 "정답입니다" 문구 출력 후 프로그램이 종료된다.

		Scanner scan = new Scanner(System.in);
		boolean result = false;
					
		while(true) {
				int intNum = (int) ((Math.random() * 49) + 1);
				for(int i = 4; i >= 0; i--) {
					System.out.print("숫자를 입력해 주세요 : ");
					int user = Integer.parseInt(scan.nextLine());
					if(intNum > user) {
						System.out.println("업!! 기회가 " + i + "번 남았습니다.");
					}else if(intNum < user) {
						System.out.println("다운!! 기회가 " + i + "번 남았습니다.");
					}else {
						System.out.println("정답입니다.");
						result = true;
						break;
					}
				}
				if(result == false) {
					System.out.println("실패하였습니다. 정답은 " + intNum  + "입니다" );
					break;
				}else{
					break;
				}
		} // while 

		
		
	} // main 끝
}
