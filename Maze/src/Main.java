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
			System.out.println("현재 플레이어 위치 [" + posX + "][" + posY + "]");
			System.out.println("뭐할래?");
			System.out.println("1.  위  2. 아래  3. 왼  4. 오");
			input = scan.nextLine();

			if (input.equals("1")) {
				if (posY > 0) {
					posY--;
				}else {
					System.out.println("위로 못간다!!!!");
				}
			}else if (input.equals("2")) {
				if (posY < map[0].length-1) {
					posY++;
				}else {
					System.out.println("아래로 못간다!!!!");
				}
				
			}else if (input.equals("3")) {
				if (posX < map.length-1) {
					posX--;
				}else {
					System.out.println("왼쪽으로 못간다!!!!");
				}
			}else if (input.equals("3")) {
				if (posX < map.length-1) {
					posY++
				}
			}
			
		}

	}

}
