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

		// �̺�Ʈ ����
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

			System.out.println("���� �÷��̾� ��ġ [" + posX + "][" + posY + "]");
			System.out.println("���ҷ�?");
			System.out.println("1.  ��  2. �Ʒ�  3. ��  4. ��");
			input = scan.nextLine();

			if (input.equals("1")) { // ����
				if (posY > 0) { // ��輱�̳�?
					if (map[posX][posY].isUp == 1) { // �Ϲݹ����ֳ�?
						posY--;
					} else if (map[posX][posY].isUp == 2) { // ���������ֳ�?
						if (redKey == true) {
							posY--;
						} else {
							System.out.println("���� Ű�� �ʿ��մϴ�!!");
						}
					} else if (map[posX][posY].isUp == 3) { // �Ķ������ֳ�?
						if (blueKey) {
							posY--;
						} else {
							System.out.println("�Ķ� Ű�� �ʿ��մϴ�!!");
						}
					} else {
						System.out.println("���� ������!!!!");
					}
				} else {
					System.out.println("���� ������!!!!");
				}
			} else if (input.equals("2")) {
				if (posY < map[0].length - 1) {
					if (map[posX][posY].isDown == 1) {
						posY++;
					} else if (map[posX][posY].isDown == 2) {
						if (redKey) {
							posY++;
						} else {
							System.out.println("���� Ű �ʿ�");
						}
					} else if (map[posX][posY].isDown == 3) {
						if (blueKey) {
							posY++;
						} else {
							System.out.println("�Ķ� Ű �ʿ�");
						}
					} else {
						System.out.println("�Ʒ��� ������!!!!");
					}
				} else {
					System.out.println("�Ʒ��� ������!!!!");
				}
			} else if (input.equals("3")) {
				if (posX > 0) {
					if (map[posX][posY].isLeft == 1) {
						posX--;
					} else if (map[posX][posY].isLeft == 2) {
						if (redKey) {
							posX--;
						} else {
							System.out.println("���� Ű �ʿ�");
						}
					} else if (map[posX][posY].isLeft == 3) {
						if (blueKey) {
							posX--;
						} else {
							System.out.println("�Ķ� Ű �ʿ�");
						}
					} else {
						System.out.println("�������� ������!!!!");
					}
				} else {
					System.out.println("�������� ������!!!!");
				}
			} else if (input.equals("4")) {
				if (posX < map.length - 1) {
					if (map[posX][posY].isRight == 1) {
						posX++;
					} else if (map[posX][posY].isRight == 2) {
						if (redKey) {
							posX++;
						} else {
							System.out.println("���� Ű �ʿ�");
						}
					} else if (map[posX][posY].isRight == 3) {
						if (blueKey) {
							posX++;
						} else {
							System.out.println("�Ķ� Ű �ʿ�");
						}
					} else {
						System.out.println("���������� ������!!!!");
					}
				} else {
					System.out.println("���������� ������!!!!");
				}
			} // �̵� �Ϸ�

			if (map[posX][posY].eventType == 1) {
				// ���� Ű ȹ��
				System.out.println("dog ��?");
				input = scan.nextLine();
				if(input.equals("��")) {
					redKey = true;
				}
			} else if (map[posX][posY].eventType == 2) {
				// �Ķ� Ű ȹ��
				blueKey = true;
			} else if (map[posX][posY].eventType == -1) {
				//Ŭ����
				System.out.println("������ Ŭ���� �߽��ϴ�");
				break;
			}else if(map[posX][posY].eventType == 3) {
				int temp = map[posX][posY].targetX;
				posY = map[posX][posY].targetY;
				posX = temp;
			}

		}

	}

}
