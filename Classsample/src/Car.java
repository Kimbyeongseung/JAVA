
public class Car {
	
		String name;
		String color;
		int weight;
		int num;
	Car(String name, String color, int weight, int num) {
		this.name = name;
		this.color = color;  //////������ ���� 2
		this.weight = weight;
		this.num = num;
		System.out.println("����");
	}
		
		void move() {
			System.out.println(name + "��(��) �����δ�");
		}
		void slow() {
			System.out.println("������");
		}
		void fast() {
			System.out.println("������");
		}
	}
