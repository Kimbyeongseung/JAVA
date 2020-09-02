package main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Control {
	ArrayList<Voca> vocaArr = new ArrayList<Voca>();
	
	public void init() {
		Player playerA = new Player(100, 10, "개똥이");
		Player playerB = new Player(100, 10, "소똥이");
		String input = "";
		Scanner scan  = new Scanner(System.in);
		vocaArr.add(new Voca("dog", "개"));
		vocaArr.add(new Voca("cat", "고양이"));
		
		while(true) {
			int ranNum = new Random().nextInt(vocaArr.size());
			String question = vocaArr.get(ranNum).getKor();
			String answer = vocaArr.get(ranNum).getEng();
			System.out.println("문제: "+question);			
			input = scan.nextLine();
			if(input.equals(answer)) {
				//정답
			}else {
				//오답
			}
			
		}
	}
}
