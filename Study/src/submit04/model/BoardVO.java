package submit04.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BoardVO {
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
	Date today = new Date();
	String strToday = sdf.format(today);
	
	public int boardNo;
	public String boardTitle;
	public String boardContent;
	public String boardId;
	public String boardDate = strToday;

	public BoardVO() {}
	
	public BoardVO(int boardNo, String boardTitle, String boardContent, String boardId) {
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardId = boardId;
	}

	@Override
	public String toString() {
		return boardNo + ". | " + boardTitle + " | " + boardId + " | " + boardDate;
	}

	
	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public String getBoardId() {
		return boardId;
	}

	public void setBoardId(String boardId) {
		this.boardId = boardId;
	}

	public String getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(String boardDate) {
		this.boardDate = boardDate;
	}
}
	
	