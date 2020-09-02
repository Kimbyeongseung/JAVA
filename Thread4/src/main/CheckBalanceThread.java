package main;

public class CheckBalanceThread extends Thread {
	ShareArea share;

	@Override
	public void run() {
		for ( ; ;) {
			synchronized (share) {
				share.num++;
				System.out.println("�� ���� "+share.num +"��");
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}
		}
	}
}
