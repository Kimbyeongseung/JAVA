package main;

public class Main {

	public static void main(String[] args) {
		Account ac1 = new Account("A¾¾", "100-88-9999",1000);
		CheckingCard c1 = new CheckingCard("B¾¾", "100-88-9999",1000, "A001");
		
		Account ac2 = new CheckingCard("B¾¾", "100-88-9999",1000, "A001");
		ac2.deposit(1000);
		System.out.println(ac2.balance);
		
		Account ac3 = new CreditCard("B¾¾", "100-88-9999",1000, "A001");
		ac3.deposit(1000);
		System.out.println(ac3.balance);
	}

}
