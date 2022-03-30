package submit04;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import submit04.model.BoardVO;
import submit04.model.MemberVO;
import submit04.service.HomepageService;

public class HomepageMain {
	public static void main(String[] args) {

		HomepageService service = HomepageService.getInstance();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 회원가입 | 2. 로그인 | 3. 종료");
			System.out.print(">>> ");

			int select = 0;

			try {
				select = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("숫자만 입력해 주세요.");
				continue;
			}

			if (select == 1) {
				// 회원가입
				System.out.println("아이디를 입력해 주세요.");
				System.out.print(">>> ");
				String id = sc.nextLine();
				System.out.println("비밀번호를 입력해 주세요.");
				System.out.print(">>> ");
				String pw = sc.nextLine();

				// 아이디 중복 체크
				MemberVO mem = service.getMem(id);

				if (mem.getMemId() != null) {
					System.out.println("중복된 아이디 입니다.");
				} else {
					int resultCnt = service.registMem(id, pw);

					if (resultCnt > 0) {
						System.out.println("회원가입 완료");
					} else {
						System.out.println("오류가 발생했습니다.");
					}
				}

			} else if (select == 2) {
				// 로그인
				System.out.println("아이디를 입력해 주세요.");
				System.out.print(">>> ");
				String id = sc.nextLine();
				System.out.println("비밀번호를 입력해 주세요.");
				System.out.print(">>> ");
				String pw = sc.nextLine();

				MemberVO mem = service.getMem(id);

				if (mem.getMemId() == null) {
					System.out.println("일치하는 회원이 없습니다.");
				} else if (mem.getMemPw().equals(pw)) {
					System.out.println("로그인 되었습니다.");

					// 로그인 이후
					while (true) {
						ArrayList<BoardVO> showBoard = service.showBoard();
						for (int i = 0; i < showBoard.size(); i++) {
							System.out.println(showBoard.get(i));
						}

						System.out.println("1. 글쓰기 | 2. 글조회 | 3. 로그아웃");
						System.out.print(">>> ");

						select = 0;

						try {
							select = Integer.parseInt(sc.nextLine());
						} catch (Exception e) {
							System.out.println("숫자만 입력해 주세요.");
							continue;
						}

						if (select == 1) {
							// 글쓰기
							System.out.print("글 제목을 입력해주세요: ");
							String title = sc.nextLine();
							System.out.print("글 내용 입력해주세요: ");
							String content = sc.nextLine();
							System.out.println("글이 작성되었습니다.");

							BoardVO board = new BoardVO();
							board.setBoardTitle(title);
							board.setBoardContent(content);
							board.setBoardId(id);

							service.saveBoard(board);

						} else if (select == 2) {
							// 글조회
							System.out.print("글 번호를 입력해주세요: ");
							int boardNo = Integer.parseInt(sc.nextLine());

							BoardVO temp = service.getBoard(boardNo);
							System.out.println("====================================");
							System.out.println("제목: " + temp.boardTitle);
							System.out.println("작성자: " + temp.boardId);
							System.out.println("작성일: " + temp.boardDate);
							System.out.println("글내용: " + temp.boardContent);
							System.out.println("====================================");

						} else if (select == 3) {
							// 로그아웃
							System.out.println("로그아웃 하였습니다.");
							break;
						} else {
							System.out.println("잘못 입력하셨습니다.");
						}
					}
				} else {
					System.out.println("일치하는 회원이 없습니다.");
				}

			} else if (select == 3) {
				// 종료
				System.out.println("종료합니다.");
				break;
			}
		}

	}
}
