import java.util.Scanner;

public class HelloJava {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력해주세요");
		String numStr1 = scan.nextLine();

		System.out.println("연산기호를 입력해주세요");
		String opStr = scan.nextLine();

		System.out.println("두 번째 숫자를 입력해주세요");
		String numStr2 = scan.nextLine();

		// 연산 기호에 따라 결과 보여주기
		int num1 = Integer.parseInt(numStr1);
		int num2 = Integer.parseInt(numStr2);
		
		if (opStr.equals("*")) {		
			int result = num1 * num2;
			System.out.println("두 수의 곱: "+ result);
		} else if (opStr.equals("+")) {			
			int result = num1 + num2;
			System.out.println("두 수의 합: "+ result);
		} else if (opStr.equals("-")) {			
			int result = num1 - num2;
			System.out.println("두 수의 차: "+ result);
		}
	}

}
