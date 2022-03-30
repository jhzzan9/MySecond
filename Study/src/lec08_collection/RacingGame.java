//package lec08_collection;
//
//import java.util.ArrayList;
//
//public class RacingGame {
//	
//	static ArrayList<Team> teamList = new ArrayList<Team>();
//	
//	public static void main(String[] args) {
//		// 경마게임
//		
//		teamList.add(new Team("1팀", 100, 0, 0));
//		teamList.add(new Team("2팀", 100, 0, 0));
//		teamList.add(new Team("3팀", 100, 0, 0));
//		teamList.add(new Team("4팀", 100, 0, 0));
//		
//		Scanner sc = new Scanner(System.in);
//		
//		for(int i = 0; i < 5; i++) {
//			
//		}
//		
//		
//		String lane1 = "1. ";
//		String lane2 = "2. ";
//		String lane3 = "3. ";
//		String lane4 = "4. ";
//		
//		while(true) {
//			int random = (int)(Math.random() * 8);
//			
//			// 8분의 1 확률로 한칸 전진
//			if(random == 1) {
//				lane1 += "=";
//			}else if(random == 2) {
//				lane2 += "=";
//			}else if(random == 3) {
//				lane3 += "=";
//			}else if(random == 4) {
//				lane4 += "=";
//			}
//			
//			for(int j = 0; j < 20; j++) {
//				System.out.println();
//			}
//			
//			System.out.println(lane1);
//			System.out.println(lane2);
//			System.out.println(lane3);
//			System.out.println(lane4);
//			
//			if(lane1.length() == 40) {
//				System.out.println("첫 번째 말 승리!!");
//				break;
//			}
//			
//			if(lane2.length() == 40) {
//				System.out.println("두 번째 말 승리!!");
//				break;
//			}
//			
//			if(lane3.length() == 40) {
//				System.out.println("세 번째 말 승리!!");
//				break;
//			}
//			
//			if(lane4.length() == 40) {
//				System.out.println("네 번째 말 승리!!");
//				break;
//			}
//			try {
//				Thread.sleep(100);
//			
//		}
//}
//}