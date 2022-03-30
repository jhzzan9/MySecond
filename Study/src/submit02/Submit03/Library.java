package submit02.Submit03;

import java.util.ArrayList;

public class Library {
	
	private Library(){
	}
	
	private static Library instance = new Library();
	
	public static Library getInstance() {
		return instance;
	}
	
	ArrayList<Book> bookList = new ArrayList<Book>();
	
}
