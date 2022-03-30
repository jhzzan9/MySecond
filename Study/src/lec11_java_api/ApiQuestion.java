package lec11_java_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;

import lec09_class.UtilClass;

public class ApiQuestion {
	public static void main(String[] args) throws ParseException {
		// 다양한 날짜 포맷 적용
		// 시계방에 놀러갔더니 다양한 디지털 시계들이 있군요.
		// 1. 2022/03/17 14:17:20
		// 2. 2022-03-17 오후 02:17:20
		// 3. 2022.03.17 PM 02:17:20
		// 4. 목 오후 02:17:20
		// 5. 목요일 14:17:20
		// 6. Thu PM 02:17:20
		// 이 디지털 시계들을 여러분도 만드실 수 있으면 참 좋겠죠.

		// 1.
		SimpleDateFormat one = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		String time = one.format(date);
		System.out.println("1. " + time);

		// 2.
		SimpleDateFormat two = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		Date date1 = new Date();
		String time1 = two.format(date1);
		System.out.println("2. " + time1);

		// 3.
		SimpleDateFormat three = new SimpleDateFormat("yyyy.MM.dd a hh:mm:ss", Locale.ENGLISH);
		Date date2 = new Date();
		String time2 = three.format(date2);
		System.out.println("3. " + time2);

		// 4.
		SimpleDateFormat four = new SimpleDateFormat("E a hh:mm:ss");
		Date date3 = new Date();
		String time3 = four.format(date3);
		System.out.println("4. " + time3);

		// 5.
		SimpleDateFormat five = new SimpleDateFormat("EEEE HH:mm:ss");
		Date date4 = new Date();
		String time4 = five.format(date4);
		System.out.println("5. " + time4);

		// 6.
		SimpleDateFormat six = new SimpleDateFormat("E a hh:mm:ss", Locale.ENGLISH);
		Date date5 = new Date();
		String time5 = six.format(date5);
		System.out.println("6. " + time5);

		// 현재 미국 날짜는?
//		SimpleDateFormat seven = new SimpleDateFormat("yyyy/MM/dd E a hh:mm:ss", Locale.ENGLISH);
//		TimeZone timeZone = TimeZone.getTimeZone("America/New_york");
//		seven.setTimeZone(timeZone);
//		strDay = seven.format(date);
//		System.out.println("7. " + strDay);

		// 디데이 계산기
		// 파라미터로 날짜를 입력받으면(String, yyyy.MM.dd 포맷)
		// 오늘 날짜와 해당 날짜의 차이를 비교하여
		// 차이 리턴 (10일 남았으면 10, 10일 지났으면 -10)

		// 2022.04.01 개원기념일 며칠 남았는지
		// 2022.02.14 처음 온 날부터 며칠 지났는지

		System.out.println("개원기념일까지 D-day = " + calDday("2022.04.01"));
		System.out.println("학원 처음 온 날부터 " + calDday("2022.02.14") + "일 지남");

		// 달력을 만들어 주는 클래스를 만들어 주세요.
		apiCalendar apiCal = new apiCalendar(1998, 1);
		apiCal.drawCal();

		System.out.println("\n===================================================\n");

		// 유니크 ID 생성
		// Guest20220318143141412321 님 환영합니다.
		// 6자리의 랜덤 숫자를 이용해서 만든다?

		// yyyyMMddHHmmssSSS + 랜덤수 6

		System.out.println("Guest" + UtilClass.makeUniqueId() + "님 환영합니다.");

	} // main 끝

	
	static long calDday(String dday) throws ParseException {

		// 오늘 날짜 구하기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date today = new Date(); // 2022.03.17 16:33:30
		// 2022.03.18 - 2022.03.17 16:33:30 = 8시간
		// 2022.03.17 00:00:00 만들어 주어야 날짜(일) 계산 용이
		String strToday = sdf.format(today);
		// strToday = 2022.03.17 문자
		Date sdfToday = sdf.parse(strToday);
		// sdfToday = 2022.03.17 00:00:00 세팅된 Date 객체

		Date inputDay = sdf.parse(dday);

		long diffMillSec = inputDay.getTime() - sdfToday.getTime();
		long diffDay = diffMillSec / (1000 * 60 * 60 * 24);

		return diffDay;

	}

}
