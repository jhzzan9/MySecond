package lec06_method;

public class MethodQuestion {
	public static void main(String[] args) {
		// 명함 만들기
		// 사용자가 이름, 연락처, 이메일을 입력했을 때
		// 콘솔에
		// ==================================
		// 이름 : [사용자가 입력한 이름]
		// 연락처 : [사용자가 입력한 연락처]
		// 이메일 : [사용자가 입력한 이메일]
		// ==================================
		// 와 같은 형태로 출력해 주는 함수를 만들어 보세요.
		
		makeCard("최지혜", "010-4393-2513", "jee-o-v@hanmail.net");
	
		System.out.println("\n===============================\n");
		
		// 성적표 만들기
		// 두근두근 성적표가 나왔습니다.
		// 국어, 영어, 수학 점수를 입력했을 경우,
		// 국어, 영어, 수학, 총점, 평균, 등급을 출력하는 성적표
		// 평균은 소수 둘째자리에서 반올림하여 출력
		// 90점 이상 A, 80점 이상 B, 70점 이상 C, 60점 이상 D, 나머지 F
		
		// 국어:
		// 영어:
		// 수학:
		// 총점:
		// 평균:
		// 등급:
		
		makeScore(80, 40, 20);
		
		makeCard(80, 40, 20);
		
		System.out.println("\n===========================\n");
		
		// LoopFor에서 했던 각 자리수 더하기를 함수화 해 보세요.
		
		eachAdd("2839845");
		
		int intVal = 30;
		String binaryString = Integer.toBinaryString(intVal);
		System.out.println(binaryString);
		
		String myBinaryStr = makeBinary(intVal);
		System.out.println(myBinaryStr);
		
		System.out.println("\n====================================\n");
		
		// for문을 배울 때, 트리를 참 많이 만들었죠?
		// 근데 항상 5층짜리 트리여서 아쉬웠을 거예요.
		
		// 사용자가 층 (int n)을 입력 받아,
		// n층짜리 트리를 출력할 수 있는 메소드를 만들어서
		// 실행 시켜 보세요.
		
		makeTree(20);
		
		
	} // main

	public static void makeTree(int num) {
		
		String star = "*";
		String blank = "";
		for(int i = 0; i <= num; i++) {
			
			if(i > 0){
				star += "**";
			}
			blank = "";
			for(int j = 1; j <= num-i; j++) {
				blank += " ";
			}
			
			System.out.println(blank + star);
		}
	}
	
	public static String makeBinary(int num) {
		// 30이 들어왔다 ㅎㄷㄷ
		// 30을 2로 나눠서 나머지 0 / 몫은 15
		// 15를 2로 나눠서 나머지 1 / 몫은 7
		// 7을 2로 나눠서 나머지는 1 / 몫은 3
		// 3을 2로 나눠서 나머지는 1 / 몫은 1
		
		String result = "";
		while(true) {
			result += (num % 2);
			if(num == 1) {
				break;
			}
			num /= 2;
		}
		return reverseString(result);
	}
	
	public static String reverseString(String str) {
		String reverse = "";
		for(int i = str.length(); i > 0; i--) {
			reverse += str.substring(i-1, i);
		}
		return reverse;		// 리턴시 메소드 종료
	}
	
	public static void makeCard(String name, String phone, String email) {
		System.out.println("==============================");
		System.out.println("이름 : " + name);
		System.out.println("연락처 : " + phone);
		System.out.println("이메일 : " + email);
		System.out.println("==============================");
	}
	
	public static void makeScore(int kor, int eng, int mat) {
		System.out.println("===========");
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + mat);
		
		int sum = (kor+eng+mat);
		double avg = Math.round((sum/3*100)/100.0);
		
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
		
		if(avg >= 90) {
			System.out.println("등급: A등급");
		}else if(avg >= 80) {
			System.out.println("등급: B등급");
		}else if(avg >= 70) {
			System.out.println("등급: C등급");
		}else if(avg >= 60) {
			System.out.println("등급: D등급");
		}else {
			System.out.println("등급: F등급");
		}
		System.out.println("===========");		
	}

	// 메소드 오버로딩 해서, int도 받고, String도 받아야 해요.
	public static int eachAdd(String a) {
		int result = 0;
		for(int i = 0; i < a.length(); i++) {
			result += Integer.parseInt(a.substring(i, i+1));
		}
		return result;	
	}
	
	
	/**
	 * 입력한 실수를 소수 n번째 자리로 리턴해 주는 함수
	 * @param douNum 반올림 하고 싶은 실수
	 * @param n 반올림 하고 싶은 자리
	 * @return 반올림 된 실수
	 */
	public static double round(double douNum, int n) {
		// 소수 두번째 자리에서 반올림해서
		// 소수 첫번째 자리를 만들고 싶다. (n = 1)
		// 3.141592 에서 10을 곱한 뒤, Math.round를 적용하고
		// 다시 10.0으로 나누면 됨
		
		// 소수 세번째 자리에서 반올림해서
		// 소수 두번째 자리를 만들고 싶다. (n = 2)
		// 3.141592 에서 100으로 곱한 뒤, Math.round를 적용하고
		// 다시 100.0으로 나누면 됨
		
		// douNum = 3.141592, n = 2를 넣었다면
		int one = 1;
		for(int i = 0; i < n; i++) {
			one *= 10;
		}
		// mul = 314.1592
		double mul = douNum * one;
		// longNum = 314
		long longNum = Math.round(mul);
		// douVal = 3.14
		double douVal = (double)longNum / one;
		
		return douVal;
		
	}
	
	/**
	 * 
	 * @param a 국어
	 * @param b 영어
	 * @param c 수학
	 */
	public static void makeCard(int a, int b, int c) {
		System.out.println("국어: " + a);
		System.out.println("영어: " + b);
		System.out.println("수학: " + c);
		
		// 총점
		int sum = a + b + c;
		System.out.println("총점: " + sum);
		
		// 평균
		double avg = sum / 3.0;
		System.out.println("평균: " + round(avg, 1));
		
		// 등급
		String grade = "F";
		if(avg >= 90) {
			grade = "A";
		}else if(avg >= 80) {
			grade = "B";
		}else if(avg >= 70) {
			grade = "C";
		}else if(avg >= 60) {
			grade = "D";
		}
		System.out.println("등급 : " + grade);
		
		
	}
}
