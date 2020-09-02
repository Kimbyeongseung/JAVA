package main;

public class LifeThreadA extends Thread {
	ShareArea share;

	@Override
	public void run() {
		while (true) {
			if (share.idx % 2 == 0) {
				share.playerB.life += 2;
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
