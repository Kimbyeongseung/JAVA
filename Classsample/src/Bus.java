
public class Bus {
	// 버스 이름 ,버스 색깔, 버스 무게, 버스 번호 요런거
	String name;
	int weight;
	String color;
	int num;

	Bus(String name, int weight, int num, String color) {
		this.name = name; //생성자 main을 좀더 간편하게~~ 생성자 연습1
		this.color = color;
		this.weight = weight;
		this.num = num;
		System.out.println("실행");
	}

	void move() {
		System.out.println(name + "이(가) 움직인다");
	}

	String slow() {

		// System.out.println("++임시++"); 임시는 메쏘드

		return "느리다."; // 얘는 변수

	}

	void fast() { // 이상태로 sysout에 못넘
		System.out.println("빠르다");
	}
}
