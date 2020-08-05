package variable;

public class ImplicitConversion {

	public static void main(String[] args) {

		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(bNum);
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum;
		
		System.out.println(dNum);



	}

}
