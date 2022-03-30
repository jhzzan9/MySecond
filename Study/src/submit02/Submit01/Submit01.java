package submit02.Submit01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Submit01 {
	public static void main(String[] args) {

		System.out.println("================= 1번 ===================");

		// 1. 정수를 담을 수 있는 ArrayList 객체를 생성하고,
		// 10부터 20 사이의 랜덤 숫자를 10개 담으시오.
		ArrayList<Integer> numRand = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			int num = (int) ((Math.random() * 11) + 10);
			numRand.add(num);
			System.out.println(num);
		}

		System.out.println("================= 2번 ===================");

		// 2. 해당 정수형 리스트를 한 줄로 출력하시오.
		System.out.println(numRand);

		System.out.println("================= 3번 ===================");

		// 3. 해당 정수형 리스트에서 중복된 숫자들을 제거한 후 출력하시오.
		HashSet<Integer> tempSet = new HashSet<Integer>();
		tempSet.addAll(numRand);
		System.out.println(tempSet);

		numRand.clear();
		numRand = new ArrayList<Integer>();
		numRand.addAll(tempSet);
		System.out.println(numRand);

		System.out.println("================= 4번 ===================");

		// 4. 중복을 제거한 정수형 리스트를 오름차순으로 정렬하여 출력하시오.
		Collections.sort(numRand);
		System.out.println(numRand);

		System.out.println("================= 5번 ===================");

		// 5. 중복을 제거한 정수형 리스트를 내림차순으로 정렬하여 출력하시오.
		Collections.sort(numRand, Collections.reverseOrder());
		System.out.println(numRand); // 내림차순

	}
}
