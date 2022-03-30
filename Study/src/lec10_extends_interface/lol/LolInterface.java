package lec10_extends_interface.lol;

// 인터페이스는 꼭 구현해야 하는 메소들을 정의만 해 놓는다.
public interface LolInterface {
	// 인터페이스는 추상 클래스의 추상 메소드처럼
	// 추상 메소드에 abstract를 붙이지 않아도 된다.
	public void skillQ();
	public void skillW();
	public void skillE();
	public void skillR();
}