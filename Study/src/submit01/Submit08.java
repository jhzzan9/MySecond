package submit01;

public class Submit08 {
	public static void main(String[] args) {
		// 다음 문자열을 중복된 숫자와 함께 출력하시오
		// aaabbcdddaeefffffgg -> a3b2c1d3a1e2f5g2

		String example = "aaabbcdddaeefffffgg";
		
		String anw = "";
		int count = 1;
		for (int i = 0; i < example.length(); i++) {
			if (example.equals(i) == example.equals(i + 1)) {
				count++;
			}else {
				anw += example.equals(i) + (count + "");
				count = 1;
			}
		}
		System.out.println(anw);

	} // main

}
