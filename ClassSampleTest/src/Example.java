import java.util.ArrayList;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList <ExampleClass> strArr = new ArrayList<ExampleClass>();
		//ExampleClass strArr = new ExampleClass(String "�ѱ��� ������?", String "����", String "����", String "����", String "����", String "ans");
		
		
		
		
		
//		strArr.add(new ExampleClass("�ѱ��� ������?", "����", "����", "����", "����", "ans"));
		strArr.add(new ExampleClass("1+1 = ?",1 , 2,3,4,2));
		
		System.out.println(strArr.get(0).ques);
		System.out.println(strArr.get(0).A1);
		
				
//		ExampleClass(String question1, String A1, String A2, String A3, String A4, String ans) {
//			this.question1 = "�ѱ��� ������?";
//			this.A1 = "����";
//			this.A2 = "����";
//			this.A3 = "����";
//			this.A4 = "����";
//			this.ans = "ans";
	}

}
