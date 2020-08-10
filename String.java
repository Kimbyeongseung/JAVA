
public class Main {

	public static void main(String[] args) {
		String str = " 동해물과 동두산이 동";
		System.out.println(str);
		System.out.println(str.length());//문자열 길이
		str = str.trim();//문자열 앞뒤 공백 제거
		System.out.println(str);
		
		int idx = str.indexOf("동");//'동'의 위치 앞에서부터 검색
		idx = str.lastIndexOf("동");//'동'의 위치 뒤에서부터 검색
		System.out.println(idx);
		
		System.out.println(str.charAt(7));//특정위치의 문자
		
		str = "가나다라마";
//		str = str.substring(2);//글자짜르기
//		System.out.println(str);
		str=str.substring(2,4);//글자짜르기
		System.out.println(str);
		
		str=str.replace("라", "개똥이");//글자 바꾸기
		System.out.println(str);
	}

}
