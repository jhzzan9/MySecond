package submit01;

public class Submit01 {
	public static void main(String[] args) {
		
		// 1. 정수(int), 실수(double), 문자열(String) 타입의 변수들을 선언하여 각각 출력하시오.
		// 	  (변수명은 자유롭게 사용하시면 됩니다)
		int intVal = 5;
		double doubVal = 1.24;
		String strVal = "Hello World";
		
		System.out.println(intVal);
		System.out.println(doubVal);
		System.out.println(strVal);
		
		System.out.println("\n=========================\n");
		// 2. 위에서 선언한 변수들의 값을 교체하시오.
		intVal = 62;
		doubVal = 2.45;
		strVal = "Hello World!!!";
		
		System.out.println(intVal);
		System.out.println(doubVal);
		System.out.println(strVal);
		
		System.out.println("\n=========================\n");
		// 3. 위에서 선언한 실수형 타입의 변수를 정수로 현변환하여 출력하시오.
		int intDoub = (int) doubVal;
		System.out.println(intDoub);
		
		System.out.println("\n=========================\n");
		// 4. 위에서 선언한 정수형 타입의 변수를 실수로 형변환하여 출력하시오.
		double doubInt = intVal;
		System.out.println(doubInt);
		
		System.out.println("\n=========================\n");
		// 5. 위에서 선언한 정수형 타입의 변수를 문자열로 형변환하여 출력하시오.
		String strInt = Integer.toString(intVal);
		System.out.println(strInt);

		System.out.println("\n=========================\n");
		// 6. 정수로 이루어진 문자열 타입의 변수를 정수로 형변환하여 출력하시오.
		String strString = "17";
		int intStr = Integer.parseInt(strString);
		System.out.println(intStr);
		
		System.out.println("\n=========================\n");
		// 7. 정수(int), 실수(double), 문자열(String) 타입의 상수들을 선언한 후 콘솔창에 각각 출력하시오.
		final int next = 1;
		final double it = 1.25;
		final String daejeon = "대전광역시_중구";
		
		System.out.println(next);
		System.out.println(it);
		System.out.println(daejeon);
		
	}
}
