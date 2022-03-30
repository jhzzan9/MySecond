package submit02.Submit03;

public class Book {
	private int no; 	   			// 도서 번호
	private String name;   			// 도서 제목
	private boolean bring = false;  // 대여 여부
	
	public Book(int no, String name) {
		this.no = no;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Book [no=" + no + ", name=" + name + ", bring=" + bring + "]";
	}

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}
	
	private Book() {
		
	}
	
}
