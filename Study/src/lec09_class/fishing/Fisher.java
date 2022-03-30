package lec09_class.fishing;

import java.util.ArrayList;

public class Fisher {
	String name;									// 낚시꾼 이름
	ArrayList<Fish> bag = new ArrayList<Fish>(); 	// 물고기 가방
	
	public Fisher(String name) {
		this.name = name;
	}
	
}
