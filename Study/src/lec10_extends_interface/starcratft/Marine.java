package lec10_extends_interface.starcratft;

public class Marine extends StarUnit {

	
	public Marine(String name, int damage, int hp, int attackRange, double attackSpeed, int mineral, int gas) {
		super("마린", 6, 40, 4, 1.0, 50, 0);
	}
	
	public void stimPack() {
		super.setAttackSpeed(0.5);
		super.setHp(super.getHp() - 10);
	}

	@Override
	public String toString() {
		return "Marine [name=" + getName() + ", damage=" + getDamage() + ", hp=" + getHp() + ", attackRange=" + getAttackRange()
				+ ", attackSpeed=" + getAttackSpeed() + ", mineral=" + getMineral() + ", gas=" + getGas() + "]";
	}
}
