import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = "";
		int kor = 100;
		int eng = 100;
		int math = 100;
		int sci = 100;
		boolean isExit = false;

		// 1ȸ
		System.out.println("���� �Է�");
		input = scan.nextLine();
		if (input.equals("����")) {
			System.out.println("���� ���� ����: " + kor);
			System.out.println("������ ������ �Է��� �ּ���");
			kor = Integer.parseInt(scan.nextLine());
		} else if (input.equals("����")) {
			System.out.println("���� ���� ����: " + eng);
			System.out.println("������ ������ �Է��� �ּ���");
			eng = Integer.parseInt(scan.nextLine());
		} else if (input.equals("exit")) {
			isExit = true;
		}

		// ������ ��� �����ֱ�
		System.out.println("����: " + (kor + eng) + " ��");

		if (isExit == false) {
			// 2ȸ
			System.out.println("���� �Է�");
			input = scan.nextLine();
			if (input.equals("����")) {
				System.out.println("���� ���� ����: " + kor);
				System.out.println("������ ������ �Է��� �ּ���");
				kor = Integer.parseInt(scan.nextLine());
			} else if (input.equals("����")) {
				System.out.println("���� ���� ����: " + eng);
				System.out.println("������ ������ �Է��� �ּ���");
				eng = Integer.parseInt(scan.nextLine());
			} else if (input.equals("exit")) {
				isExit = true;
			}

			// ������ ��� �����ֱ�
			System.out.println("����: " + (kor + eng) + " ��");
		}

		if (isExit == false) {
			// 3ȸ
			System.out.println("���� �Է�");
			input = scan.nextLine();
			if (input.equals("����")) {
				System.out.println("���� ���� ����: " + kor);
				System.out.println("������ ������ �Է��� �ּ���");
				kor = Integer.parseInt(scan.nextLine());
			} else if (input.equals("����")) {
				System.out.println("���� ���� ����: " + eng);
				System.out.println("������ ������ �Է��� �ּ���");
				eng = Integer.parseInt(scan.nextLine());
			} else if (input.equals("exit")) {
				isExit = true;
			}

			// ������ ��� �����ֱ�
			System.out.println("����: " + (kor + eng) + " ��");
		}
	}

}
