import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		//���ڿ� �Է� equals
		//���� ��ȣ ����
		Scanner scan = new Scanner(System.in); {
			
			int num1 =1;
			int num2 =2;
			String str;
			
			num1 =Integer.parseInt(scan.nextLine());
		
			System.out.println(num1 + "��(��) ù��° �����Դϴ�.");
			
			num2 =Integer.parseInt(scan.nextLine());
			
			System.out.println(num2 + "��(��) �ι�° �����Դϴ�.");
			
			System.out.println("������ ��Ģ�����Դϴ�.");
			str= scan.nextLine();
			
			
			if(str.equals("+")) {
				
				System.out.println("������ �ϰڽ��ϴ�. ");
				System.out.println("������� " +(num1+num2)+" �Դϴ�.");
			}
			
			
			else if(str.equals("-")) {
				
				System.out.println("������ �ϰڽ��ϴ�.");
				System.out.println("�������" +(num1-num2)+"�Դϴ�.");
			}
			else if(str.equals("*")) {
				
				System.out.println("������ �ϰڽ��ϴ�.");
				System.out.println("�������" +(num1*num2)+"�Դϴ�.");
			}
			else if(str.equals("/")) {
	
				System.out.println("�������� �ϰڽ��ϴ�.");
				System.out.println("�������" +(num1/num2)+"�Դϴ�.");
}
			else {
				System.out.println("�����Դϴ�.");
			}
			
			
			
			
			
		}
		
	
		

	}

}
