package submit03.submit01;

import java.util.ArrayList;

public class BoardDB {

	private BoardDB() {
	}

	private static BoardDB instance = new BoardDB();

	public static BoardDB getInstance() {
		return instance;
	}

	private ArrayList<Board> boardList = new ArrayList<Board>();

	// 글 쓰기
	public void addBoard(Board board) {
		boardList.add(board);
	}

	// 시퀀스 제공
	public int sizeBoard() {
		return boardList.size() + 1;
	}

	// 글 목록
	public void showBoardList() {
		for (Board list : boardList) {
			System.out.println(list);
		}
	}

}
