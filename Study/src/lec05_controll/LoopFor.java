package lec05_controll;

public class LoopFor {

	public static void main(String[] args) {
		
		System.out.println("반복문 시작 3");
		System.out.println("반복문 시작 2");
		System.out.println("반복문 시작 1");
		System.out.println("반복문 시작 go");
		
		// 반복문
		// for문
		for(int i = 0; i < 10; i++ ) {
			System.out.println(i);
		}
		
		/*
		 * 디버깅 모드
		 * 코드라인 좌측 부분을 더블 클릭 하면 breakpoint(초록점)이 생깁니다. [단축키 ctrl + shift + B]
		 * 토글 형식이라 더블클릭 혹은 단축키로 생성/삭제 가능
		 * 코드에 한줄 한줄 실행해 보며, 변수에 어떤 값이 담기는지 확인할 때, 주로 사용합니다.
		 * 상단 Run 버튼 좌측 벌레 모양의 아이콘 클릭하면(벌레모양)
		 * 디버깅 모드 실행
		 * 디버깅 모드에 적합한 화면 스타일(Perspective)로 전환
		 * 할 거냐는 메시지 창이 뜹니다.
		 * OK 누르게 되면 디버깅 모드가 실행되어 현재 코드들이
		 * 위에서부터 실행되다가 breakpoint가 있는 지점에 멈춰서
		 * 대기를 합니다.
		 * 이후 상단의 Run - Step over [단축키 F6] 을 실행하면
		 * 한줄 한줄 실행이 됩니다.
		 * 디버깅 모드를 종료하시려면 Terminate [단축키 ctrl + F2]
		 * 이후 원래 화면으로 돌아오려면 우측 상단의 Perspective
		 * 버튼에서 Java를 클 하면 된다.
		 */
		
		// 실수로 ctrl + shift + F11 을 하면 coverage 활성화
		// 코드 검사 기능으로 작성을 잘했으면 녹색, 못했으면 적색
		// 각종 view 들은 상단에 window - show view
		
		// 1부터 20까지 더하기
		int num = 0;
		for(int i=1; i<=20; i++) {
			num += i;
		}
		System.out.println("1부터 20까지 더하면 " + num);
		
		
		for(int i = 0; i < 10; i += 1) {
			System.out.println(i);
		}
		
		for(int i = 0; i < 10; i += 2) {
			System.out.println(i);
		}
		
		for(double j = 0; j < 2; j +=0.2) {
			System.out.println(j);
		}
		
			// 구구단 2단
			// 2 x 1 = 2
			// 2 x 2 = 4
			// 2 x 9 = 18
		
		for(int i = 1; i <= 9; i++) {
			System.out.println("2 x " + i + " = " + (2*i));
		}
		
		
		// 가끔 Console 창이 날라다닐 때,
		// 우측 상단의 Perspective 버튼에서
		// Java Perspective 버튼 마우스 우클릭 -> reset
		// Window - perspective - reset perspective
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("\n==============================\n");
		
		// 1부터 10까지 중 홀수만 출력
		for(int i = 1; i < 10; i++) {
			if(i % 2 == 1) {
				System.out.println(i);
			}
		} // 총 10번 실행 됨
		
		for(int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		} // 총 5번 실행됨 -> 성능 증가 (프로그램 실행 속도 증가)
		
		System.out.println("\n==================================\n");
		
		// 아래의 5층 탑을 for문을 사용하여 만들어 주세요.
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
		
		String star = "";
		for(int i = 0; i < 5; i++) {
			star += "*";
			System.out.println(star);
		}
		
		System.out.println("\n==================================\n");
		
		// % 나머지 연산 주로 사용할 때
		// for문 내에서 순환하는 숫자
		
		System.out.println("\n=============== 오뚜기 ===================\n");
		
		// 국수 공장에서 면을 20cm 뽑고 있는데,
		// 5cm마다 잘라 주는 로직
		
		for(int i = 0; i < 20; i++) {
			System.out.println("||||||||");
			
			// i가 4, 9, 14 일 때 잘라야 함
			if((i == 4) || (i == 9) || (i == 14)) {
				System.out.println("--------");
			}
		}
		
		System.out.println("\n=============== 농심 ===================\n");
		
		// 라면 공장에서 면을 30cm 뽑고 있는데,
		// 6cm 마다 잘라 주어야 함
		
		for(int i = 1; i <= 30; i++) {
			if(i % 2 == 1) {
			System.out.println("////////");
			} else {
				System.out.println("\\\\\\\\\\\\\\\\");	
			}
			
			// i가 6, 12, 18, 24 때 잘라야 함
			// 6으로 나누었을 때, 나머지가 0인 녀석들
			if(i % 6 == 0) {
				System.out.println("--------");
			}
			
//			try {
//				Thread.sleep(300);	// 1초 = 1000밀리초
//				// 현재 프로그램을 실행 중인
//				// 스레드를 괄호 안 시간 (단위 : 밀리초, ms)
//				// 만큼 잠깐 재웠다가 깨워 줍니다.
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
			System.out.println("\n============= 시계 ==============\n");
			
			// 0시를 기준으로 매 시간마다 시간을 콘솔에 출력한다.
			// 100시간
			for(int i = 0; i<100; i++) {
				System.out.println(i%24);
			}
			
			System.out.println("\n======= 조은 시계 ======= \n");
			
			// 시간 뿐만 아니라 일자도 나타나게 합시다.
			
			int currentDay = 18;
			int currentTime = 3;
			
			// 100 시간 후, 며칠, 몇 시가 될까요?
			for(int i = 0; i < 100; i++) {
				// 이 for문은 블록 {} 내에 명령문을 100번 실행시킨다. 
				int day = currentDay + (currentTime/24);
				int time = currentTime%24;
				System.out.println(day + "일 " + time + "시");
				currentTime++;
			}
		
			// % 나머지 연산자 사용 팁 끝~!!
			
			System.out.println("\n========= 유니코드 탐방 ==============\n");
			
			// 유니코드에서 한글 시작 ('가' = 44032) 부터
			// 이후 10개를 출력해 봅시다.
			
			char charNum = 44032;
			for (int i = 0; i < 10; i++) {
				System.out.println((i+1) + ". " + charNum);
				charNum++;
			}
			
			System.out.println("\n======= 거꾸로 for문==========\n");
			
			// 10부터 1까지 출력
			int hiNum = 10;
			for(int i = 0; i < 10; i++) {
				System.out.println(hiNum);
				hiNum--;
			}
			
			for(int i = 10; i > 0; i--) {
				System.out.println(i);
			}
			
			
			star = "*****";
			for(int i = 0; i < 5; i++) {
				System.out.println(star);
				star = star.replaceFirst("\\*", "");
				// *, ?, + 를 문자로 써야 에러가 안 난다.
				// 문자로 쓰려면 특수기호 앞에 \\ 을 붙인다.
				// regex란 정규표현식(Regular Expression)을 의미
				// 정규표현식 사용 ex) 회원가입을 할 때
				// 이름에 숫자 넣었는지 확인하고 경고!!
				// 연락처에 숫자만 넣었는지 확인
				// 아이디에 영어랑 숫자만 넣었는지 확인
				// 비밀번호 패턴 (영어 대소문자, 숫자, 특수기호 각각 1개 이상)
			}
			
			
			System.out.println("\n=========== for문으로 Sting 가지고 놀기 ============\n");
			
			// 숫자 문자열의 각 자리수를 더해서 출력
			
			String example = "3928459324";
			int result = 0; 
			for(int i = 0; i < example.length(); i++) {
//				String strNum = example.substring(i, i+1);
//				int intNum = Integer.parseInt(strNum);
//				result += intNum;
	
			result += Integer.parseInt(example.substring(i, i+1));
			}
			System.out.println("각 자리수를 더한 결과는 " + result);
			
			System.out.println("\n=========== '슈'가 몇개 ============\n");
			String sususu = "슈슈슛ㅅ슛슈슈,.!! 슈슈슉";
			int countSu = 0;
			for(int i = 0; i < sususu.length(); i++) {
				String strNum = sususu.substring(i, i+1);
					if(strNum.equals("슈")) {
//						countSu++;
//						countSu +=
						countSu = countSu + 1;
					}
				}
			System.out.println("슈의 갯수는 " + countSu);
				
			System.out.println("\n=============\n");
				
				countSu = 0;
				for(int i = 0; i < sususu.length(); i++) {
					String strNum = sususu.substring(i, i+1);
					if(strNum.equals("슈")) {
						countSu = countSu + 1;
//						System.err.print(strNum);
					}else {
//						System.out.print(strNum);
					}
				}
			System.out.println();  // 줄 바꿈
			System.out.println("슈의 갯수는 " + countSu);
				
			System.out.println("\n============== break 문 ===========\n");
				
			// i가 0부터 10까지 증가하는 for문에서
			// i가 5보다 커지게 되면 해당 for문을 종료
			for(int i = 0; i <= 10; i++) {
			
				if(i > 5) {
					break;
				}
				System.out.println(i);
			}
			
			// 1부터 n까지 더한다고 했을 때, 100 이상이 되는 n을
			// 구해 봅시다.
			
			System.out.println("\n=======================\n");
			
			int sumNum = 0;
			for(int i = 1; i < 1000; i++) {
				sumNum += i;
				System.out.println(sumNum);
				
				if(sumNum > 100) {
					System.out.println("100 이상이 되는 n은 "
							+ i + "입니다.");
					break;
			
				}
			}
				
			System.out.println("\n=========================\n");
			
			// 구구단 7단
			// 너무 쉬운 2,3,4 는그냥 출력 안 할래요.
			for(int i = 1; i <= 9; i++) {
				if(i < 5) {
					continue;
				}
				System.out.println("7 x " + i + " = " + (7*i));
			}
			
			// 대부분의 경우 굳이 continue문을 쓰지 않아도 됨
			for(int i = 1; i < 9; i++) {
				if(i > 4) {
					System.out.println("7 x " + i + " = " + (7*i));
				}
			}
			
			System.out.println("\n===========================\n");

			// 2 X 1 = 4
			// 2 X 2 = 4
			// 2 x 9 = 18
			// 3 x 1 = 3
			// 3 x 2 = 6
			// 3 x 9 = 27
			
			// 이중 for문 (다중 for문)
			for(int i = 2; i < 9; i++) {
				
				for(int j = 1; j <= 9; j++) {
						System.out.println(i + " x " + j + " = " + (i*j));
					}
					System.out.println();
				}
			
			System.out.println("\n===========================\n");
			
			// 트리 만들기
			//    *
			//   **
			//  ***
			// ****
			//*****
			
			star = "";
			for(int i = 0; i < 5; i++) {		
				String blank = "";
//				for(int j = 5-i; j > 0; j--) {
				for(int j = 0; j < 5-1; j++) {
					blank += " ";
					// i가 0일 때, *는 1개가 되고, 이때 blank는 공백 5개
					// i가 1일 때, *는 2개가 되고, 이때 blank는 공백 4개
					// i가 2일 때, *는 3개가 되고, 이때 blank는 공백 3개
				}
				star += "*";
				System.out.println(blank + star);
				
			}
			
			
				
	}
}

		
