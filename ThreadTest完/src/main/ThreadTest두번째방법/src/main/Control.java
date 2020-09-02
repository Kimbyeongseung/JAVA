package main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Control {
	ArrayList<Voca> vocaArr = new ArrayList<>();
	ArrayList<Player> playerArr = new ArrayList<>();

	public void init() {
		ShareArea share = new ShareArea();
		playerArr.add(new Player(100, 10, "개똥이"));
		playerArr.add(new Player(100, 10, "소똥이"));

		share.playerArr = playerArr;

		LifeThreadA lifeA = new LifeThreadA();
		lifeA.share = share;
		lifeA.start();

		String input = "";
		Scanner scan = new Scanner(System.in);
		vocaArr.add(new Voca("dog", "개"));
		vocaArr.add(new Voca("cat", "고양이"));
		share.idx = 0;
		while (true) {
			Player attP = playerArr.get(share.idx);

			int ranNum = new Random().nextInt(vocaArr.size());
			String question = vocaArr.get(ranNum).getKor();
			String answer = vocaArr.get(ranNum).getEng();
			System.out.println("문제: " + question);
			input = scan.nextLine();
			if (input.equals(answer)) {
				// 정답
				attP.attack(playerArr);
				System.out.println(attP.name + " 공격! ");
			} else {
				// 오답
				for (int i = 0; i < playerArr.size(); i++) {
					Player tempP = playerArr.get(i);
					if (!tempP.name.equals(attP.name)) {
						tempP.life += 20;
					}
				}

				System.out.println(attP.name + " 공격 실패! ");
			}

			share.idx++;
			if (share.idx == playerArr.size()) {
				share.idx = 0;
			}

			System.out.println();
			System.out.println();
		}
	}
}
