import java.util.Scanner;

public class HelloJava {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ù ��° ���ڸ� �Է����ּ���");
		String numStr1 = scan.nextLine();

		System.out.println("�����ȣ�� �Է����ּ���");
		String opStr = scan.nextLine();

		System.out.println("�� ��° ���ڸ� �Է����ּ���");
		String numStr2 = scan.nextLine();

		// ���� ��ȣ�� ���� ��� �����ֱ�
		int num1 = Integer.parseInt(numStr1);
		int num2 = Integer.parseInt(numStr2);
		
		if (opStr.equals("*")) {		
			int result = num1 * num2;
			System.out.println("�� ���� ��: "+ result);
		} else if (opStr.equals("+")) {			
			int result = num1 + num2;
			System.out.println("�� ���� ��: "+ result);
		} else if (opStr.equals("-")) {			
			int result = num1 - num2;
			System.out.println("�� ���� ��: "+ result);
		}
	}

}
