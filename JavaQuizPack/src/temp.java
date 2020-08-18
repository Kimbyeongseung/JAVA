import java.util.ArrayList;

public class temp {

	public static void main(String[] args) {

		ArrayList<Quiz> deck = new ArrayList<>();

//Quiz qz = new Quiz("한국의 수도는?","광주","부산","서울","인천","3"));

		// deck.add(qz);

		deck.add(new Quiz("한국의 수도는?", "광주", "부산", "서울", "인천", "3"));

		System.out.println(deck.get(0).getQuestion());
		System.out.println(deck.get(0).getCh1());
		System.out.println(deck.get(0).getCh2());
		System.out.println(deck.get(0).getCh3());
		System.out.println(deck.get(0).getCh4());
		System.out.println(deck.get(0).getAns());
		deck.add(new Quiz("1+1=?", "5", "2", "1", "10000", "2"));
		System.out.println(deck.get(1).getQuestion());
		System.out.println(deck.get(1).getCh1());
		System.out.println(deck.get(1).getCh2());
		System.out.println(deck.get(1).getCh3());
		System.out.println(deck.get(1).getCh4());
		System.out.println(deck.get(1).getAns());
	}

}
