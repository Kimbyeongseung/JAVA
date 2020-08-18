import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		City map[][] = new City[4][5];
		for(int i =0;i< map.length;i++) {
			for(int j =0;j< map[0].length;j++) {
				map[i][j] = new City();
			}
		}
		
		String map_Type[][] = {
				{"무인도","시청","을지로","동대문","봉사활동"},
				{"당산","-","-","-","건대입구"},
				{"신림","-","-","-","잠실"},
				{"출발","서초","강남","선릉","맛집투어"}
		};
		// 1=이동  2=황금열쇠  3=우주여행  4=사회복지기금 5=무인도 6=출발
		map[0][0].isDown = 1;
		map[0][0].isRight = 5;
		map[0][1].isRight = 2;
		map[0][1].isLeft = 1;
		map[0][2].isRight = 1;
		map[0][2].isLeft = 1;
		map[0][3].isRight = 1;
		map[0][3].isLeft = 1;
		map[0][4].isDown = 4;
		map[0][4].isLeft = 2;
		
		map[1][0].isUp = 1;
		map[1][0].isDown = 1;
		map[1][4].isUp = 1;
		map[1][4].isDown = 1;
		
		map[2][0].isUp = 1;
		map[2][0].isDown = 6;
		map[2][4].isUp = 1;
		map[2][4].isDown = 1;
		
		map[3][0].isUp = 1;
		map[3][0].isRight = 1;
		map[3][1].isRight = 2;
		map[3][1].isLeft = 1;
		map[3][2].isRight = 1;
		map[3][2].isLeft = 1;
		map[3][3].isRight = 3;
		map[3][3].isLeft = 1;
		map[3][4].isUp = 1;
		map[3][4].isLeft = 1;
		
		//이벤트 세팅
		map[3][0].eventType= 6;
		map[3][2].eventType= 2;
		map[0][1].eventType= 2;
		map[0][3].eventType= 2;
		map[3][4].eventType= 3;
		map[0][4].eventType= 4;
		map[0][0].eventType= 5;
		
		
		Scanner sc = new Scanner(System.in);
		String input = "";
		while (true) {
			
		}
		

	}

}
