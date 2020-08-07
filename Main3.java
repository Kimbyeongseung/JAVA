import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		//문자열 입력 equals
		//숫자 기호 숫자
		Scanner scan = new Scanner(System.in); {
			
			int num1 =1;
			int num2 =2;
			String str;
			
			num1 =Integer.parseInt(scan.nextLine());
		
			System.out.println(num1 + "은(는) 첫번째 숫자입니다.");
			
			num2 =Integer.parseInt(scan.nextLine());
			
			System.out.println(num2 + "은(는) 두번째 숫자입니다.");
			
			System.out.println("다음은 사칙연산입니다.");
			str= scan.nextLine();
			
			
			if(str.equals("+")) {
				
				System.out.println("덧셈을 하겠습니다. ");
				System.out.println("결과값은 " +(num1+num2)+" 입니다.");
			}
			
			
			else if(str.equals("-")) {
				
				System.out.println("뺄셈을 하겠습니다.");
				System.out.println("결과값은" +(num1-num2)+"입니다.");
			}
			else if(str.equals("*")) {
				
				System.out.println("곱셈을 하겠습니다.");
				System.out.println("결과값은" +(num1*num2)+"입니다.");
			}
			else if(str.equals("/")) {
	
				System.out.println("나눗셈을 하겠습니다.");
				System.out.println("결과값은" +(num1/num2)+"입니다.");
}
			else {
				System.out.println("오류입니다.");
			}
			
			
			
			
			
		}
		
	
		

	}

}
