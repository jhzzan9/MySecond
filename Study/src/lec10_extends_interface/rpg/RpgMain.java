package lec10_extends_interface.rpg;

import java.util.ArrayList;
import java.util.Scanner;

public class RpgMain {
	public static void main(String[] args) {
		Warrior minwoo = new Warrior("민우", 100, 200, Warrior.Jobs.BERSERKER);

//		minwoo.attack(chanung);
//		System.out.println(chanung.getHp());
//	
//		minwoo.skill(chanung);
//		
		// Magician 을 만들어 주세요
		// Character를 상속 받고, attack 해도 Character와 같음
		// enum 클래스로 FIRE, ICE를 가지는 필드변수 job 똑같이 생성

		Magician jihye = new Magician("지혜", 100, 200, Magician.Jobs.FIRE);


		ArrayList<Character> party = new ArrayList<Character>();
		party.add(jihye);
		party.add(minwoo);

		Creep creep = new Creep("잡몹", 30, 200);
		Boss boss = new Boss("데블몬", 100, 1000);

		// 모든 클래스들은 기본적으로 Object라는 클래스를
		// 상속받고 있습니다. 다만 생략되어서 extends에 표출되지 않았을 뿐.

		ArrayList<Object> battleGround = new ArrayList<Object>();
		battleGround.add(jihye);
		battleGround.add(minwoo);
		battleGround.add(creep);
		battleGround.add(boss);

		for (int i = 0; i < battleGround.size(); i++) {
			System.out.println(battleGround.get(i).toString());
		}

		System.out.println(battleGround.get(0).getClass());
		Object ob = battleGround.get(0);

		minwoo.battle = new Battle() {

			@Override
			public void outOfBattle() {
				battleGround.remove(minwoo);
			}
		};

		jihye.battle = new Battle() {
			@Override
			public void outOfBattle() {
				battleGround.remove(jihye);
			}
		};

		creep.battle = new Battle() {
			@Override
			public void outOfBattle() {
				battleGround.remove(creep);
			}
		};

		boss.battle = new Battle() {
			@Override
			public void outOfBattle() {
				battleGround.remove(boss);
			}
		};

		jihye.skill(creep);

		for (int i = 0; i < battleGround.size(); i++) {
			System.out.println(battleGround.get(i).toString());
		}

		Scanner sc = new Scanner(System.in);

		while (true) {
			for (int i = 0; i < battleGround.size(); i++) {
				// 각각의 battleGround.get(i) 요소들은
				// Object로 형변환 된 상태

				// instanceof 로 Character인지 체크 후에
				// 행동을 입력 받는다.

				if (battleGround.get(i) instanceof Character) {
					// 해당 객체를 Character로 변환
					Character player = (Character) battleGround.get(i);
					System.out.println(player.getName() + "의 턴입니다. " + "행동을 선택해 주세요.");
					System.out.println("1. 공격 | 2. 스킬");
					System.out.print(">>> ");

					int select = Integer.parseInt(sc.nextLine());

					if (select == 1) {
						player.attack(boss);
					} else if (select == 2) {
						player.skill(boss);
					}
				}

			}
			
			if(!battleGround.contains(boss)) {
				System.out.println("전투에서 승리하였습니다.");
				break;
			}
			
			if(!battleGround.contains(minwoo) && !battleGround.contains(jihye)) {
				System.out.println("전투에서 패배하였습니다.");
				break;
			}
		}

	}
}