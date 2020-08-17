import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Room[][] map = new Room[5][4];
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				map[i][j] = new Room();
			}
		}

		map[0][0].isRight = 1;
		map[1][0].isLeft = 1;
		map[1][0].isRight = 1;
		map[2][0].isRight = 1;
		map[2][0].isLeft = 1;
		map[2][0].isDown = 1;
		map[3][0].isLeft = 1;
		map[3][0].isRight = 1;
		map[4][0].isLeft = 1;

		map[2][1].isDown = 1;
		map[2][1].isUp = 1;

		map[0][2].isDown = 2;
		map[2][2].isDown = 1;
		map[2][2].isUp = 1;
		map[2][2].isRight = 1;
		map[3][2].isLeft = 1;
		map[4][2].isDown = 1;

		map[0][3].isUp = 2;
		map[0][3].isRight = 1;
		map[1][3].isRight = 1;
		map[1][3].isLeft = 1;
		map[2][3].isUp = 1;
		map[2][3].isRight = 1;
		map[2][3].isLeft = 1;
		map[3][3].isRight = 1;
		map[3][3].isLeft = 1;
		map[4][3].isLeft = 1;
		map[4][3].isUp = 3;

		// 이벤트 세팅
		map[4][0].eventType = 1;
		map[0][2].eventType = 2;
		map[4][2].eventType = -1;
		map[0][0].eventType = 3;
		map[0][0].targetX = 4;
		map[0][0].targetY = 3;

//		map.length  // 5
//		map[0].length  //4
		int posX = 2;
		int posY = 2;
		boolean redKey = false;
		boolean blueKey = false;
		Scanner scan = new Scanner(System.in);
		String input = "";
		while (true) {

			System.out.println("현재 플레이어 위치 [" + posX + "][" + posY + "]");
			System.out.println("뭐할래?");
			System.out.println("1.  위  2. 아래  3. 왼  4. 오");
			input = scan.nextLine();

			if (input.equals("1")) { // 위로
				if (posY > 0) { // 경계선이냐?
					if (map[posX][posY].isUp == 1) { // 일반문이있냐?
						posY--;
					} else if (map[posX][posY].isUp == 2) { // 빨간문이있냐?
						if (redKey == true) {
							posY--;
						} else {
							System.out.println("레드 키가 필요합니다!!");
						}
					} else if (map[posX][posY].isUp == 3) { // 파란문이있냐?
						if (blueKey) {
							posY--;
						} else {
							System.out.println("파란 키가 필요합니다!!");
						}
					} else {
						System.out.println("위로 못간다!!!!");
					}
				} else {
					System.out.println("위로 못간다!!!!");
				}
			} else if (input.equals("2")) {
				if (posY < map[0].length - 1) {
					if (map[posX][posY].isDown == 1) {
						posY++;
					} else if (map[posX][posY].isDown == 2) {
						if (redKey) {
							posY++;
						} else {
							System.out.println("빨간 키 필요");
						}
					} else if (map[posX][posY].isDown == 3) {
						if (blueKey) {
							posY++;
						} else {
							System.out.println("파란 키 필요");
						}
					} else {
						System.out.println("아래로 못간다!!!!");
					}
				} else {
					System.out.println("아래로 못간다!!!!");
				}
			} else if (input.equals("3")) {
				if (posX > 0) {
					if (map[posX][posY].isLeft == 1) {
						posX--;
					} else if (map[posX][posY].isLeft == 2) {
						if (redKey) {
							posX--;
						} else {
							System.out.println("빨간 키 필요");
						}
					} else if (map[posX][posY].isLeft == 3) {
						if (blueKey) {
							posX--;
						} else {
							System.out.println("파란 키 필요");
						}
					} else {
						System.out.println("왼쪽으로 못간다!!!!");
					}
				} else {
					System.out.println("왼쪽으로 못간다!!!!");
				}
			} else if (input.equals("4")) {
				if (posX < map.length - 1) {
					if (map[posX][posY].isRight == 1) {
						posX++;
					} else if (map[posX][posY].isRight == 2) {
						if (redKey) {
							posX++;
						} else {
							System.out.println("빨간 키 필요");
						}
					} else if (map[posX][posY].isRight == 3) {
						if (blueKey) {
							posX++;
						} else {
							System.out.println("파란 키 필요");
						}
					} else {
						System.out.println("오른쪽으로 못간다!!!!");
					}
				} else {
					System.out.println("오른쪽으로 못간다!!!!");
				}
			} // 이동 완료

			if (map[posX][posY].eventType == 1) {
				// 퀴즈 키 획득
				System.out.println("dog 뜻?");
				input = scan.nextLine();
				if(input.equals("개")) {
					redKey = true;
				}
			} else if (map[posX][posY].eventType == 2) {
				// 파란 키 획득
				blueKey = true;
			} else if (map[posX][posY].eventType == -1) {
				//클리어
				System.out.println("게임을 클리어 했습니다");
				break;
			}else if(map[posX][posY].eventType == 3) {
				int temp = map[posX][posY].targetX;
				posY = map[posX][posY].targetY;
				posX = temp;
			}

		}

	}

}
