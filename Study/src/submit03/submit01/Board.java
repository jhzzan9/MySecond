package submit03.submit01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Board {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
	Date today = new Date();
	String strToday = sdf.format(today);
	
	private int no;
	private String name;
	private String date = strToday;
	private String content;
	
	public Board(int no, String name, String content) {
		super();
		this.no = no;
		this.name = name;
		this.content = content;
	}
	
	Board(){}

	@Override
	public String toString() {
		return "[" + this.no + ". | " + this.name + " | " + this.date + "]";
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	
}
