package main;

public class Main {

	public static void main(String[] args) {		
		ShareArea share  = new ShareArea();
		TrasferThread th1 = new TrasferThread();
		th1.share = share;
		CheckBalanceThread th2 = new CheckBalanceThread();
		th2.share = share;
		th1.start();
		th2.start();
	}

}
