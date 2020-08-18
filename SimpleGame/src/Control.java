import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Control {
	Random rd = new Random();
	ArrayList<Room> map = new ArrayList<Room>();
	public void start() {
		addMap(50);
		
		int move;
		Player p = new Player();
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("���� ��ġ "+p.position+"/"+map.size());
			System.out.println("�ֻ����� �������� ����!");
			scan.nextLine();
			
			move = rd.nextInt(6)+1;
			System.out.println("�ֻ����� "+move +"�� ���Խ��ϴ�");
			p.position += move;
			
			if(p.position > map.size()-1) {
				System.out.println("����! ���� ����");
				break;
			}
			
			if(map.get(p.position).eventType !=0) {
				System.out.println("�̺�Ʈ �߻�!!");
			}
			if(map.get(p.position).eventType == 1) {				
				System.out.println(map.get(p.position).value+"��ŭ �̵� �մϴ� ");
				p.position += map.get(p.position).value;
			}else if(map.get(p.position).eventType == 2) {
				System.out.println("������� �̵� �մϴ� ");
				p.position = 0;
			}else if(map.get(p.position).eventType == 3) {
				System.out.println("���� 5�� Ȯ��˴ϴ� ");
				addMap(5);
			}
		}
	}
	
	public void addMap(int num) {
		Random rd = new Random();
		for (int i = 0; i < num; i++) {			 
			int ranNum = rd.nextInt(5);
			int eventType = 0;
			int value = 0;
			if(ranNum == 0) {
				ranNum = rd.nextInt(10);
				if(ranNum < 2 ) {
					eventType = 1;
					value = rd.nextInt(5)+1;
				}else if(ranNum < 4 ) {
					eventType = 1;
					value = (rd.nextInt(5)+1) * -1;
				}else if(ranNum ==7  ) {
					eventType = 2;					
				}else if(ranNum ==9 ) {
					eventType = 3;					
				}
			}
			map.add(new Room(eventType, value));
		}
	}
	
}
