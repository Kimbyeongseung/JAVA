# JAVA
JAVAGOSU

## 국비지원 Java 안드로이드 웹 & 앱 개발자 (A)

### Ex/ 1. 20.08.05 (수))
- 자바 연산자
  - boolean
  - integer
  - String
  
  ### 2. 20.08.06 (목)
  -자바 안드로이드 웹 & 앱 개발자
    - 1교시 OT
    - 자바설치 & 윈도우 실행키로 컴파일하는 법 javac.XXX.java > java XXX
    - \\172.16.146.1 공유파일접근
    - :d 에 kbs파일
    
    -변수
      -기본자료형
        - main, sysout >> ctrl + space >> 
        - boolean true false
        - 정수형 byte, short, int, long
        - 실수형 float, double
        - int 선언 >> int라는 선언에 계속 대입할 수 있음 
        
        
        
#형변환         
public class Main3 {

	public static void main(String[] args) {
		/**형변환**/
		int num1 = 100;
		float num2 = 10.9f;
		//num1 = (int)num2://float -> 형변환
		num1 = (int)num2;
		System.out.println(num1);
		num2 = (float)num1; //int >> float 형변환
		System.out.println(num2);
		
		
		num1 = 5;
		num2 = num1; //자동 형변환 >> 실수는 정수를 포함하기 때문
		System.out.println(num2);
		
		String str = "";
		str = String.valueOf(num1); // String >> int
		System.out.println(str);// String >> int 
		str = "30";
		num1 = Integer.parseInt(str); // int >> String
		System.out.println(num1);
	}

}

