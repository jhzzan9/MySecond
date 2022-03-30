package lec09_class;

/**
 * 사전(Dictionary) 느낌으로 프로젝트에서 사용될 상수들을
 * 모아 놓은 클래스
 */
public class Constants {

	public static final String WELCOME_CAFE = "어서오세요. 카페 %s입니다. 주문해 주세요.\n";

	public static final int TYPE_WATER = 123123;
	public static final int TYPE_FIRE = 13123;
	public static final int TYPE_PLANT = 565;
	public static final int TYPE_THUNDER = 5456;
	
	public static String typeToString(int type) {
		// 빨간 줄 남는 이유 리턴 값이 있어야 하는데 없어서
		if(type == TYPE_WATER) return "물";
		if(type == TYPE_FIRE) return "불";
		if(type == TYPE_PLANT) return "풀";
		if(type == TYPE_THUNDER) return "전기";

		return null;
	}
}
