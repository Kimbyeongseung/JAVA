import java.util.ArrayList;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList <ExampleClass> strArr = new ArrayList<ExampleClass>();
		//ExampleClass strArr = new ExampleClass(String "한국의 수도는?", String "광주", String "서울", String "시흥", String "포항", String "ans");
		
		
		
		
		
//		strArr.add(new ExampleClass("한국의 수도는?", "광주", "서울", "시흥", "포항", "ans"));
		strArr.add(new ExampleClass("1+1 = ?",1 , 2,3,4,2));
		
		System.out.println(strArr.get(0).ques);
		System.out.println(strArr.get(0).A1);
		
				
//		ExampleClass(String question1, String A1, String A2, String A3, String A4, String ans) {
//			this.question1 = "한국의 수도는?";
//			this.A1 = "광주";
//			this.A2 = "서울";
//			this.A3 = "시흥";
//			this.A4 = "포항";
//			this.ans = "ans";
	}

}
