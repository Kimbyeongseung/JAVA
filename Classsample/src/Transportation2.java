
public class Transportation2 {

	public static void main(String[] args) {
		Bus bus = new Bus("버스", 500, 02, "빨강");
		Train subway = new Train();
		Car car = new Car("차", "빨강", 300, 777);
		Shoes shoes = new Shoes();

//		bus.name = "버스";
//		bus.color = "초록";
//		bus.weight = 30;  //생성자로 생략 가능 깔끔~~
//		bus.num = 02;	//오버로딩이라는 메소드 성향 
		bus.move();
		bus.slow();

		subway.name = "전철";
		subway.color = "초록";
		subway.weight = 2000;
		subway.num = 2;
		subway.move();
		subway.slow();
		subway.amount();

//		car.name = "차";
//		car.color = "빨강";
//		car.weight = 1;
//		car.num = 7777;
		car.move();
		car.slow();

		shoes.name = "신발";
		shoes.color = "무지개";
		shoes.weight = 500;
		shoes.num = 10;
		shoes.move();
		shoes.slow();

		System.out.println("서울까지 " + bus.weight + "톤짜리 " + bus.num + "번" + bus.color + bus.name + "로 100시간 걸린다.");
		System.out.println(subway.num + "호선 " + subway.name + " 사람 너무" + subway.amount());
		System.out.println(shoes.color + shoes.name);
		System.out.println(car.num + "번" + car.name);

	}

}
