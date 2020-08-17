import java.util.ArrayList;
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

		int turnIdx = 0;
		ArrayList<Player> pArr = new ArrayList<Player>();
		pArr.add(new Player(2, 2, "�տ���"));
		pArr.add(new Player(2, 3, "���ݷ�"));
		
		Player p = null;

		Scanner scan = new Scanner(System.in);
		String input = "";
		while (true) {
			p = pArr.get(turnIdx);
			System.out.println(p.name + " �÷��̾� ��ġ [" + p.posX + "][" + p.posY + "]");
			System.out.println("���ҷ�?");
			System.out.println("1.  ��  2. �Ʒ�  3. ��  4. ��");
			input = scan.nextLine();

			if (input.equals("1")) { // ����
				if (p.posY > 0) { // ��輱�̳�?
					if (map[p.posX][p.posY].isUp == 1) { // �Ϲݹ����ֳ�?
						p.posY--;
					} else if (map[p.posX][p.posY].isUp == 2) { // ���������ֳ�?
						if (p.redKey == true) {
							p.posY--;
						} else {
							System.out.println("���� Ű�� �ʿ��մϴ�!!");
						}
					} else if (map[p.posX][p.posY].isUp == 3) { // �Ķ������ֳ�?
						if (p.blueKey) {
							p.posY--;
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
				if (p.posY < map[0].length - 1) {
					if (map[p.posX][p.posY].isDown == 1) {
						p.posY++;
					} else if (map[p.posX][p.posY].isDown == 2) {
						if (p.redKey) {
							p.posY++;
						} else {
							System.out.println("���� Ű �ʿ�");
						}
					} else if (map[p.posX][p.posY].isDown == 3) {
						if (p.blueKey) {
							p.posY++;
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
				if (p.posX > 0) {
					if (map[p.posX][p.posY].isLeft == 1) {
						p.posX--;
					} else if (map[p.posX][p.posY].isLeft == 2) {
						if (p.redKey) {
							p.posX--;
						} else {
							System.out.println("���� Ű �ʿ�");
						}
					} else if (map[p.posX][p.posY].isLeft == 3) {
						if (p.blueKey) {
							p.posX--;
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
				if (p.posX < map.length - 1) {
					if (map[p.posX][p.posY].isRight == 1) {
						p.posX++;
					} else if (map[p.posX][p.posY].isRight == 2) {
						if (p.redKey) {
							p.posX++;
						} else {
							System.out.println("���� Ű �ʿ�");
						}
					} else if (map[p.posX][p.posY].isRight == 3) {
						if (p.blueKey) {
							p.posX++;
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
			

			if (map[p.posX][p.posY].eventType == 1) {
				// ���� Ű ȹ��
				System.out.println("dog ��?");
				input = scan.nextLine();
				if (input.equals("��")) {
					p.redKey = true;
				}
			} else if (map[p.posX][p.posY].eventType == 2) {
				// �Ķ� Ű ȹ��
				p.blueKey = true;
			} else if (map[p.posX][p.posY].eventType == -1) {
				// Ŭ����
				System.out.println("������ Ŭ���� �߽��ϴ�");
				break;
			} else if (map[p.posX][p.posY].eventType == 3) {
				int temp = map[p.posX][p.posY].targetX;
				p.posY = map[p.posX][p.posY].targetY;
				p.posX = temp;
			}

			turnIdx++;
			if (turnIdx == pArr.size()) {
				turnIdx = 0;
			}
		}

	}

}
