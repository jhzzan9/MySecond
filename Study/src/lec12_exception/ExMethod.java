package lec12_exception;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

// 에러 처리할 메소드들을 가지는 클래스
public class ExMethod {

	// 입력받은 두 숫자를 나눈 값 리턴
	public static double divide(int numA, int numB) throws BizException {
		if (numB == 0) {
			throw new BizException("numB는 0 이외에 숫자를 입력해");
		} else {
			return numA / numB;
		}
	}

	// 입력받은 이름을 콘솔에 출력하는 메소드
	// 만약 입력받은 이름이 숫자거나, empty면 throw BizException
	public static void showName(String name) throws BizException {
		String regex = "[a-zA-Z가-힣]*";
		if(name.length() == 0) {
			throw new BizException(ErrConstants.API_0001, "이름을 한 글자 이상 입력해 주세요. 입력한 값: " + name);
		}else if(!Pattern.matches(regex, name)) {
			throw new BizException(ErrConstants.API_0002, "숫자를 입력하지 마세요. 입력한 값: " + name);
		}else {
			System.out.println(name);	
		}
	}

	// 날자 문자열을 입력하면 밀리초로 바꿔서 리턴
	// yyyy.MM.dd
//	public static long dateMillsec(String date) throws ParseException {
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
//		Date temp = sdf.parse(temp);
//		return temp.getTime();
//	}
	
}

