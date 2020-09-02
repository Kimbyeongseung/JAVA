package main;

import java.util.Scanner;

public class TrasferThread extends Thread {
	ShareArea share;

	@Override
	public void run() {
		int total = 0;
		Scanner scan = new Scanner(System.in);
		while (true) {
			scan.nextLine();
			synchronized (share) {
				total += share.num;
				share.num = 0;
				System.out.println("´Þ°¿ È¸¼ö Áß...");				
				try {
					Thread.sleep(7000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("ÇöÀç ´Þ°¿ ¼ö: "+ total);
			}

		}
	}
}
