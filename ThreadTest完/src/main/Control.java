package main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Control {
	ArrayList<Voca> vocaArr = new ArrayList<Voca>();
	
	public void init() {
		ShareArea share  = new ShareArea();
		Player playerA = new Player(100, 10, "개똥이");		
		Player playerB = new Player(100, 10, "소똥이");
		share.playerA = playerA;
		share.playerB = playerB;
		LifeThreadA lifeA = new LifeThreadA();
		lifeA.share = share;
		LifeThreadB lifeB = new LifeThreadB();
		lifeB.share = share;
		lifeA.start();
		lifeB.start();
		
		String input = "";
		Scanner scan  = new Scanner(System.in);
		vocaArr.add(new Voca("dog", "개"));
		vocaArr.add(new Voca("cat", "고양이"));
		share.idx = 0;
		while(true) {
			Player attP = null;
			Player defP = null;
			if(share.idx %2 == 0) {
				attP = playerA;
				defP = playerB;
			}else  {
				attP = playerB;
				defP = playerA;
			}
			
			int ranNum = new Random().nextInt(vocaArr.size());
			String question = vocaArr.get(ranNum).getKor();
			String answer = vocaArr.get(ranNum).getEng();
			System.out.println("문제: "+question);			
			input = scan.nextLine();
			if(input.equals(answer)) {
				//정답
				attP.attack(defP);		
				System.out.println(attP.name +" 공격! ");
				System.out.println(defP.name+": "+defP.life +" 남음 ");
			}else {
				//오답
				defP.life += 20;
				System.out.println(attP.name +" 공격 실패! ");
				System.out.println(defP.name+": "+defP.life +" 남음 ");
			}
			
			share.idx++;
			System.out.println();
			System.out.println();
		}
	}
}
