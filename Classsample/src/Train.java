
public class Train {

		String name;
		String color;
		int weight;
		int num;
		
		void move() {
			System.out.println(name + "이(가) 움직인다");
		}
		void slow() {
			System.out.println("느리다");
		}
		void fast() {
			System.out.println("빠르다");
		}
		String amount() {
			return "많다";
		}
	}
