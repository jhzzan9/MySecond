package submit03.submit03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import lec09_class.UtilClass;

public class DateBoardMain {

	public static void main(String[] args) throws ParseException {
		ArrayList<DateBoard> dbList = new ArrayList<DateBoard>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");

		for (int i = 0; i < 30; i++) {
			int randMonth = (int) (Math.random() * 3) + 1; // 1~3
			int randDay = (int) (Math.random() * 28) + 1; // 1~28
			Calendar cal = Calendar.getInstance();
			cal.set(2022, randMonth - 1, randDay);

			String strDate = sdf.format(cal.getTime());
			dbList.add(new DateBoard(i + "번째 생성된 글", strDate));
		}

		for (int i = 0; i < dbList.size(); i++) {
			System.out.println(dbList.get(i));
		}
		System.out.println("\n============================== 날짜 순 =========================\n");

		for (int i = 0; i < dbList.size(); i++) {
			for (int j = 0; j < dbList.size() - 1; j++) {
				Date dateTime = sdf.parse(dbList.get(j).getDate());
				Date dateTime2 = sdf.parse(dbList.get(j + 1).getDate());
				if (dateTime.getTime() > dateTime2.getTime()) {
					DateBoard temp = dbList.get(j);
					dbList.set(j, dbList.get(j + 1));
					dbList.set(j + 1, temp);
				}
			}
		}
		for (int i = 0; i < dbList.size(); i++) {
			System.out.println(dbList.get(i));
		}
		System.out.println("\n=======================================================\n");

		for (int i = 0; i < dbList.size() - 1; i++) {
			for (int j = 0; j < dbList.size() - i - 1; j++) {
				Date prev = sdf.parse(dbList.get(j).getDate());
				Date post = sdf.parse(dbList.get(j + 1).getDate());
				if (prev.getTime() > post.getTime()) {
					DateBoard temp = dbList.get(j);
					dbList.set(j, dbList.get(j + 1));
					dbList.set(j + 1, temp);
				}
			}
		}
		for (DateBoard db : dbList) {
			System.out.println(db);
		}
		System.out.println("\n=======================================================\n");

		System.out.println("\n============================== 최근 한달 내 =========================\n");
		// 최근 한달 내 작성된 게시글만 출력
		// day 30일, 3-14, 2-14
		Date today = new Date();

		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, -30);
		Date dateCal = cal.getTime();

		for (int i = 0; i < dbList.size(); i++) {
			Date dateTime = sdf.parse(dbList.get(i).getDate());
			if (dateTime.getTime() >= dateCal.getTime()) {
				System.out.println(dbList.get(i));
			}
		}

		System.out.println("\n=======================================================\n");

		ArrayList<DateBoard> temp = new ArrayList<DateBoard>();
		long oneMonth = 1000 * 60 * 60 * 24 * 30L;

		for (int i = 0; i < dbList.size(); i++) {
			Date currDate = sdf.parse(dbList.get(i).getDate());

			if (today.getTime() - oneMonth < currDate.getTime()) {
				temp.add(dbList.get(i));
			}
		}
		for (DateBoard db : temp) {
			System.out.println(db);
		}

		System.out.println("\n============================== 이번 달 =========================\n");

		for (int i = 0; i < dbList.size(); i++) {
			Date dateTime = sdf.parse(dbList.get(i).getDate());
			if (dateTime.getMonth() == today.getMonth()) {
				System.out.println(dbList.get(i));
			}
		}
		System.out.println("\n=======================================================\n");

		temp.clear();
		Calendar calToday = Calendar.getInstance();
		int month = calToday.get(Calendar.MONTH);
		int year = calToday.get(Calendar.YEAR);

		for (int i = 0; i < dbList.size(); i++) {
			Date currDate = sdf.parse(dbList.get(i).getDate());
			Calendar currCal = Calendar.getInstance();
			currCal.setTime(currDate);

			if (currCal.get(Calendar.YEAR) == year && currCal.get(Calendar.MONTH) == month) {
				temp.add(dbList.get(i));
			}
		}
		for (DateBoard db : temp) {
			System.out.println(db);
		}

		System.out.println("\n============================== 2월  =========================\n");
		for (int i = 0; i < dbList.size(); i++) {
			Date dateTime = sdf.parse(dbList.get(i).getDate());
			if (dateTime.getMonth() + 1 == today.getMonth()) {
				System.out.println(dbList.get(i));
			}
		}
		System.out.println("\n=======================================================\n");
		temp.clear();
		for (int i = 0; i < dbList.size(); i++) {
			Date currDate = sdf.parse(dbList.get(i).getDate());
			Calendar currCal = Calendar.getInstance();
			currCal.setTime(currDate);

			if (currCal.get(Calendar.MONTH) == (2 - 1)) {
				temp.add(dbList.get(i));
			}
		}
		for (DateBoard db : temp) {
			System.out.println(db);
		}

		System.out.println("\n============================== 2월 14 - 3월 21일  =========================\n");
		String strfe = "2022.02.14 00:00:00";
		Date datefe = sdf.parse(strfe);

		String strma = "2022.03.21 00:00:00";
		Date datema = sdf.parse(strma);

		for (int i = 0; i < dbList.size(); i++) {
			Date dateTime = sdf.parse(dbList.get(i).getDate());
			if (dateTime.getTime() >= datefe.getTime() && dateTime.getTime() <= datema.getTime()) {
				System.out.println(dbList.get(i));
			}
		}
		System.out.println("\n=======================================================\n");
		temp.clear();
		SimpleDateFormat newSdf = new SimpleDateFormat("yyyy.MM.dd");
		Date fromDate = newSdf.parse("2022.02.14");
		Date toDate = newSdf.parse("2022.03.21");

		for (int i = 0; i < dbList.size(); i++) {
			Date currDate = sdf.parse(dbList.get(i).getDate());

			if ((fromDate.getTime() <= currDate.getTime()) && (currDate.getTime() <= toDate.getTime())) {
				temp.add(dbList.get(i));
			}
		}
		for (DateBoard db : temp) {
			System.out.println(db);
		}

	}
}
