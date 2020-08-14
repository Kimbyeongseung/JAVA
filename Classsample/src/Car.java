
public class Car {
	
		String name;
		String color;
		int weight;
		int num;
	Car(String name, String color, int weight, int num) {
		this.name = name;
		this.color = color;  //////생성자 연습 2
		this.weight = weight;
		this.num = num;
		System.out.println("실행");
	}
		
		void move() {
			System.out.println(name + "이(가) 움직인다");
		}
		void slow() {
			System.out.println("느리다");
		}
		void fast() {
			System.out.println("빠르다");
		}
	}
