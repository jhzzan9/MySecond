package lec10_extends_interface.starcratft;

public class SiegeTank extends StarUnit {
	
	public SiegeTank () {
		super("시즈탱크", 35, 120, 7, 2.0, 150, 100);
	}
	
	public void siegeMode() {
		System.out.println("슈웅~");
		super.setDamage(70);
		super.setAttackRange(12);
	}

	@Override
	public String toString() {
		return "SiegeTank " + super.toString();
	}
	
	
	
}
