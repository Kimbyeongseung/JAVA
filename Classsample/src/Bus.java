
public class Bus {
	// ���� �̸� ,���� ����, ���� ����, ���� ��ȣ �䷱��
	String name;
	int weight;
	String color;
	int num;

	Bus(String name, int weight, int num, String color) {
		this.name = name; //������ main�� ���� �����ϰ�~~ ������ ����1
		this.color = color;
		this.weight = weight;
		this.num = num;
		System.out.println("����");
	}

	void move() {
		System.out.println(name + "��(��) �����δ�");
	}

	String slow() {

		// System.out.println("++�ӽ�++"); �ӽô� �޽��

		return "������."; // ��� ����

	}

	void fast() { // �̻��·� sysout�� ����
		System.out.println("������");
	}
}
