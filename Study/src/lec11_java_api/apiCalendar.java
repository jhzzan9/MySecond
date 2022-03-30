package lec11_java_api;

import java.util.Calendar;

public class apiCalendar {

	private int year = 0;
	private int month = 0;
	private int lastDay = 0;
	private int startDay = 0;

	public apiCalendar(int year, int month) {
		this.year = year;
		this.month = month;

		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);

		this.lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		this.startDay = cal.get(Calendar.DAY_OF_WEEK);
	}

	// 달력 출력
	public void drawCal() {
		System.out.println(year + "년 " + month + "월 달력");
		System.out.println("일\t월\t화\t수\t목\t금\t토");

		int currentDay = 1;

		for (int i = 1; i <= 42; i++) {
			if (i >= startDay) {
				System.out.printf("%2d\t", currentDay);
				currentDay++;

				if (currentDay > lastDay) {
					break;
				}
			} else {
				System.out.print("\t");
			}

			if (i % 7 == 0) {
				System.out.println();

			}

		}
	}

}
