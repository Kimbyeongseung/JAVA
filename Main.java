
public class Main {

	public static void main(String[] args) {
		String str = " ���ع��� ���λ��� ��";
		System.out.println(str);
		System.out.println(str.length());//���ڿ� ����
		str = str.trim();//���ڿ� �յ� ���� ����
		System.out.println(str);
		
		int idx = str.indexOf("��");//'��'�� ��ġ �տ������� �˻�
		idx = str.lastIndexOf("��");//'��'�� ��ġ �ڿ������� �˻�
		System.out.println(idx);
		
		System.out.println(str.charAt(7));//Ư����ġ�� ����
		
		str = "�����ٶ�";
//		str = str.substring(2);//����¥����
//		System.out.println(str);
		str=str.substring(2,4);//����¥����
		System.out.println(str);
		
		str=str.replace("��", "������");//���� �ٲٱ�
		System.out.println(str);
	}

}
