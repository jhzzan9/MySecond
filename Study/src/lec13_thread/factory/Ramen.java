package lec13_thread.factory;

public class Ramen implements Runnable {
	Factory factory;

	Ramen(Factory packing) {
		this.factory = packing;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			factory.makeRamen();
		}
	}

}
