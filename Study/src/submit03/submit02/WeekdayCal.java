package submit03.submit02;

import java.util.Calendar;

public class WeekdayCal {
	private int year = 0;
	private int month = 0;
	private int startDay = 0;
	private int lastDay = 0;

	public WeekdayCal(int year, int month) {
		this.year = year;
		this.month = month;

		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);

		this.lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		this.startDay = cal.get(Calendar.DAY_OF_WEEK);
	}

	// 달력 출력

	public void drawWeekDay() {

		System.out.println(year + "년 " + month + "월 달력(주말제외)");
		System.out.println("월\t화\t수\t목\t금");

		int currentDay = 1;

		for (int i = 1; i <= 42; i++) {
			if (i >= startDay) {
				
				if(!(i % 7 == 1 || i % 7 == 0)) {
					System.out.printf("%2d\t", currentDay);					
				}
				
				currentDay++;

				if (currentDay > lastDay) {
					break;
				}
			} else {
				if(i != 1) {
					System.out.print("\t");
				}
			}

			if (i % 7 == 0) {
				System.out.println();

			}

		}

	}

}