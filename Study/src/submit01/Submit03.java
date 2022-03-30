package submit01;

public class Submit03 {
	public static void main(String[] args) {
		//주어진 문자열을 이용하여, 명함을 만들어보세요. 꼭 제 이름이 아니여도 좋습니다.
		//split 사용

		String info = "정찬웅, 010-7398-7332, akow283@gmail.com";
		String[] infoA = info.split(",");
		System.out.print("\n==============================\n");
		System.out.println("이름    : " + infoA[0]);
		System.out.println("연락처  : " + infoA[1]);
		System.out.print("이메일  : " + infoA[2]);
		System.out.println("\n==============================\n");
		
	}
}
