
public class Transportation2 {

	public static void main(String[] args) {
		Bus bus = new Bus("����", 500, 02, "����");
		Train subway = new Train();
		Car car = new Car("��", "����", 300, 777);
		Shoes shoes = new Shoes();

//		bus.name = "����";
//		bus.color = "�ʷ�";
//		bus.weight = 30;  //�����ڷ� ���� ���� ���~~
//		bus.num = 02;	//�����ε��̶�� �޼ҵ� ���� 
		bus.move();
		bus.slow();

		subway.name = "��ö";
		subway.color = "�ʷ�";
		subway.weight = 2000;
		subway.num = 2;
		subway.move();
		subway.slow();
		subway.amount();

//		car.name = "��";
//		car.color = "����";
//		car.weight = 1;
//		car.num = 7777;
		car.move();
		car.slow();

		shoes.name = "�Ź�";
		shoes.color = "������";
		shoes.weight = 500;
		shoes.num = 10;
		shoes.move();
		shoes.slow();

		System.out.println("������� " + bus.weight + "��¥�� " + bus.num + "��" + bus.color + bus.name + "�� 100�ð� �ɸ���.");
		System.out.println(subway.num + "ȣ�� " + subway.name + " ��� �ʹ�" + subway.amount());
		System.out.println(shoes.color + shoes.name);
		System.out.println(car.num + "��" + car.name);

	}

}
