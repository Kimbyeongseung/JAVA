package main;

public class LifeThreadB extends Thread {
	ShareArea share;

	@Override
	public void run() {
		while (true) {
			if (share.idx % 2 == 1) {
				share.playerA.life += 2;
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
