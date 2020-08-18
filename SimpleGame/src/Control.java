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
			System.out.println("현재 위치 "+p.position+"/"+map.size());
			System.out.println("주사위를 던지려면 엔터!");
			scan.nextLine();
			
			move = rd.nextInt(6)+1;
			System.out.println("주사위가 "+move +"가 나왔습니다");
			p.position += move;
			
			if(p.position > map.size()-1) {
				System.out.println("도착! 게임 종료");
				break;
			}
			
			if(map.get(p.position).eventType !=0) {
				System.out.println("이벤트 발생!!");
			}
			if(map.get(p.position).eventType == 1) {				
				System.out.println(map.get(p.position).value+"만큼 이동 합니다 ");
				p.position += map.get(p.position).value;
			}else if(map.get(p.position).eventType == 2) {
				System.out.println("출발지로 이동 합니다 ");
				p.position = 0;
			}else if(map.get(p.position).eventType == 3) {
				System.out.println("맵이 5개 확장됩니다 ");
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
