import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[][] map = new int[5][4];
//		map.length  // 5
//		map[0].length  //4
		int posX = 2;
		int posY = 2;
		Scanner scan = new Scanner(System.in);
		String input = "";
		while (true) {
			System.out.println("���� �÷��̾� ��ġ [" + posX + "][" + posY + "]");
			System.out.println("���ҷ�?");
			System.out.println("1.  ��  2. �Ʒ�  3. ��  4. ��");
			input = scan.nextLine();

			if (input.equals("1")) {
				if (posY > 0) {
					posY--;
				}else {
					System.out.println("���� ������!!!!");
				}
			}else if (input.equals("2")) {
				if (posY < map[0].length-1) {
					posY++;
				}else {
					System.out.println("�Ʒ��� ������!!!!");
				}
			}
		}

	}

}
