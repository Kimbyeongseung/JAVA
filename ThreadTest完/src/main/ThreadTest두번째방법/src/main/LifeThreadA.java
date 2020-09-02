package main;

public class LifeThreadA extends Thread {
	ShareArea share;

	@Override
	public void run() {
		while (true) {
			for (int i = 0; i < share.playerArr.size(); i++) {
				Player tempP = share.playerArr.get(i);
				if(share.idx != i) {
					tempP.life += 2;
				}
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
