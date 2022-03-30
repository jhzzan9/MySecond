package lec02_Variable_type;

public class VariableMain {

	public static void main(String[] args) {
			int money = 900;
			// 상수명 이름 짓기
			// 단어는 전부 대문자, 단어와 단어 사이는 언더바로 이어준다.
			final String NEXT_IT_ADDRESS = "대전광역시 중구 희영빌딩";
			
			
			System.out.println(NEXT_IT_ADDRESS);
		
			
			char charVal = 'a';
			System.out.println(charVal+1);
			
			// 변수를 선언하면서 값을 부여한다.
			// 값을 초기화한다(Initialization -> Init)
			int numOne = 1;
			System.out.println(numOne);
			
			// 변수를 선언만 하고, 값을 부여하지 않을 수도 있다.
			int numTwo;		// 변수를 선언
			numTwo = 2;		// 변수에 값을 저장
			System.out.println(numTwo);		// 변수 사용
			
			// 변수의 다중 선언
			int numThree, numFour;
			numThree = 3;
			numFour = 4;
			
			// 변수의 다중 선언은 되지만, 값을 넣어 주면서 선언할 수는 없다.
//			int numFive, numSix = 5, 6;
			
			System.out.println("=======================================");
			
			// 문자열(string)
			// string 은 클래스이므로 다양한 함수를 내장하고 있다.
			String fruits = "Apple, Banana, Carrot";
			
			System.out.println(fruits);
			// .length()
			// 해당 문자열의 길이를 리턴
			System.out.println(fruits.length());
			
			// .charAt(인덱스)
			// 인덱스는 문자열에서 몇 번째에 해당하는 숫자를 말한다.
			// 인덱스는 0부터 시작한다.
			// 해당 문자열에서 인덱스에 해당하는 문자(char)를 리턴
			System.out.println(fruits.charAt(0));
			
			// .indexOf(문자열)
			// 해당 문자열에서 괄호 안에 있는 문자의 인덱r스 위치를 리턴
			// 해당 문자열을 포함하지 않는다면 -1를 리턴
			System.out.println(fruits.indexOf("Banana"));
			System.out.println(fruits.indexOf("banana"));
			
			// .substring(시작 인덱스, 끝 인덱스)
			// 해당 문자열은 시작 인덱스에서 끝 인덱스까지 자릅니다.
			System.out.println(fruits.substring(7,14));		//인덱스 7부터 13까지를 리턴
		
			// .replace(바뀔 문자열, 바꾸고 싶은 문자열)
			// 해당 문자열에서 바뀔 문자열을 바꾸고 싶은 문자열로 교체
			System.out.println(fruits.replace("Carrot", "Coconut"));
			System.out.println(fruits.replace(" ", ""));
			
			// .trim()
			// 해당 문자열의 양끝에 존재하는 모든 공백을 제거해 준다.
			String strWorld = "      The World  !!  ";
			System.out.println(strWorld.trim());

			// .toUpperCase()
			// 해당 문자열에 존재하는 알파벳들은 전부 대문자로 바꿔 준다.
			System.out.println(fruits.toUpperCase());
			System.out.println(fruits.toLowerCase());		// 전부 소문자로 바꿔 준다.
			// appleBanana, applebanana, AppleBanana
			
			// .concat(문자열)
			// 해당 문자열에 괄호 안에 있는 문자열 뒤에 붙인다.
			System.out.println(fruits.concat(", DDankong"));		// 굳이 쓰지 않음
			System.out.println(fruits + ", DDankong");		// 이걸 사용
			
			// String은 참조 타입이므로 null 값을 가질 수 있다.
			String anything = null;
			String notthing = "";		// 둘 다 빈 값이지만, 데이터가 없는 null과 빈 데이터인
										// "" (empty)는 엄연히 다르다.
			System.out.println(anything);			
			System.out.println(notthing);	
			
			System.out.println("=====================================");
			
			System.out.println(fruits);
			
			// "=" 오른쪽에 있는 값을 왼쪽에 있는 변수로 넣겠다는 의미 
			fruits = fruits.substring(7);		// 괄호안의 인덱스 전까지 해당 문자열을 자른다.
			System.out.println(fruits);
			
			// byte 는 -128부터 127까지만 담을 수 있대!!
			byte byteNum = 127;
			byteNum++;	// 1을 더한다.
			byteNum += 1;		// 1을 더한다.
			System.out.println(byteNum);		// -128부터 127이기 때문에 127에서 1을 더하면
												// -128이 되고, 거기서 1을 더했으니 -127이 나온다.
			
			// 형 변환(Casting)
			int intVal = 17;
			double doubVal = 1.24;
			
			// int 곱하기 double 은 double 타입으로 자동 형변환이 된다.
			double doubmulVal = intVal * doubVal;		
			// (타입) (값) 을 이용하여 강제 형변환이 가능하다.
			int intMulval = (int) (intVal * doubVal);
			
			System.out.println(doubmulVal);		// 값이 실수로 잘 나옵니다.
			System.out.println(intMulval);		// 강제로 int(정수)로 형변환을 하니 소수가 사라진다.
			
			
			float floatMulval = intVal * 1.24f;
			System.out.println(floatMulval);


			long longVar = 20000L;		
			int intVar = 20000;			// L를 붙이기 싫어서 int를 많이 쓴다.
			
			float fVar = 0.111f;		
			double dVar = 0.222;		// f를 붙이기 싫어서 double를 많이 쓴다.
			
			
			// 강제 형변환 (숫자 <-> 문자열)
			String countingStar = "17";
			String countStar = countingStar + 1;
			
			System.out.println(countStar);
			
			// 문자열을 숫자로
			// Integer.parseInt(문자열)
			int intCountStar = Integer.parseInt(countingStar);	//문자열 "17"이 정수 17로 잘 바뀌었다면
			intCountStar = intCountStar + 1;	// 17 + 1 = 18
			System.out.println(intCountStar);
			
			// 숫자를 문자열로 형변환
			String strCountStar = Integer.toString(intCountStar);
			String strCountStar2 = intCountStar + "";	// 보통 숫자를 문자열로 바꿀 때 사
			strCountStar = strCountStar + 1;
			strCountStar2 = strCountStar2 + 1;
			System.out.println(strCountStar);
			System.out.println(strCountStar2);
			
			
			String example = "2784935";
			// 위의 example을 이용하여 2+7+8+4+9+3+5 = ? 결과를 출력하시오

			// example 문자열을 substring을 이용하여 한글자씩 자른다.
			// 각 글자들을 int 타입으로 변환하여 더한다.
			
			String str1 = example.substring(0,1);	// "2"
			String str2 = example.substring(1,2);	// "7"
			String str3 = example.substring(2,3);	// "8"
			String str4 = example.substring(3,4);	// "4"
			
			int int1 = Integer.parseInt(str1);
			int int2 = Integer.parseInt(str2);
			int int3 = Integer.parseInt(str3);
			int int4 = Integer.parseInt(str4);
			
			int result = int1 + int2 + int3 + int4;
			System.out.println("결과는 : " + result);
			
			
			char ch1 = example.charAt(0);
			char ch2 = example.charAt(1);
			char ch3 = example.charAt(2);
			char ch4 = example.charAt(3);
			char ch5 = example.charAt(4);
			char ch6 = example.charAt(5);
			char ch7 = example.charAt(6);
			
			
			
			String example2 = "456236";
			// 4+5+6+2+3+6 = ?
			
		
			
	}

}