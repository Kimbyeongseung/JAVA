package control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import model.Voca;

public class Control {
	String input = "";
	Scanner scan = new Scanner(System.in);
	ArrayList<Voca> vocaArr = new ArrayList<>();

	private void saveData() {
		FileWriter fw;
		try {
			fw = new FileWriter("c:/my/voca.txt"); // 덮어쓰기 , true 붙여쓰기
			for (int i = 0; i < vocaArr.size(); i++) {
				String eng = vocaArr.get(i).getEng();
				String kor = vocaArr.get(i).getKor();
				String data = eng + "," + kor+"\r\n";
				fw.write(data);
			}
			fw.close();
			System.out.println("저장 완료");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void readData() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("c:/my/voca.txt"));
			while (true) {
				String line = br.readLine();
				if (line == null) // 읽어올 데이터가 없다
					break;			
				String[] temp = line.split(",");
				vocaArr.add(new Voca(temp[0], temp[1]));
			}
			br.close();
			System.out.println("총 "+vocaArr.size() +"개 단어 로드");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void showVoca() {
		System.out.println("[ 현 단어장 " + vocaArr.size() + "개 ]");
		for (int i = 0; i < vocaArr.size(); i++) {
			System.out.println((i + 1) + ". " + vocaArr.get(i).getEng() + " : " + vocaArr.get(i).getKor());
		}
	}

	private void addVoca() {
		System.out.println();
		System.out.println("추가할 단어 입력하셈");
		input = scan.nextLine();
		System.out.println("한글 뜻?");
		String kor = scan.nextLine();
		vocaArr.add(new Voca(input, kor));
	}

	private void deleteVoca() {
		System.out.println();
		System.out.println("삭제할 단어를 선택해 주세요");
		input = scan.nextLine();
		int temp = Integer.parseInt(input);
		vocaArr.remove(temp - 1);
	}

	private void updateVoca() {
		System.out.println();
		System.out.println("수정할 단어를 선택해 주세요");
		input = scan.nextLine();
		int temp = Integer.parseInt(input);
		System.out.println("수정할 단어 입력하셈");
		input = scan.nextLine();
		vocaArr.get(temp - 1).setEng(input);
//		engArr.set(temp - 1, input);
		System.out.println("수정할 한글뜻 입력하셈");
		input = scan.nextLine();
		vocaArr.get(temp - 1).setKor(input);
//		korArr.set(temp - 1, input);
	}

	private void scrambleGame() {
		Random rd = new Random();
		int ranNum = rd.nextInt(vocaArr.size());
		String answer = vocaArr.get(ranNum).getEng();

		String question = "";

		ArrayList<String> tempArr = new ArrayList<String>();
		for (int i = 0; i < answer.length(); i++) {
			tempArr.add(answer.substring(i, i + 1));
		}

		while (tempArr.size() > 0) {
			ranNum = rd.nextInt(tempArr.size());
			question = question + tempArr.get(ranNum);
			tempArr.remove(ranNum);
		}

		String temp = answer;
//		while(temp.length() > 0) {
//			ranNum = rd.nextInt(temp.length());
//			question = question + temp.substring(ranNum, ranNum+1);
//			temp = temp.substring(0, ranNum) + temp.substring(ranNum+1);					
//			System.out.println("ranNum: "+ ranNum +",  question: "+question +", temp: "+ temp);
//		}
		System.out.println("문제: " + question);
		input = scan.nextLine();
		if (input.equals(answer)) {
			// 정답
		} else {
			// 오답
		}
	}

	public void init() {
		//파일로딩
		File file = new File("c:/my/voca.txt");
		if(file.exists()) {
			readData();
		}
		
		while (true) {
			System.out.println("길이: " + vocaArr.size());
			System.out.println("----------------------");
			System.out.println("|  뭐할래?");
			System.out.println("|  1. 추가    2. 삭제    3. 수정   4. 게임   5. 끝내기");
			System.out.println("----------------------");

			String input = scan.nextLine();

			if (input.equals("1")) {
				showVoca();
				addVoca();
				saveData();
			} else if (input.equals("2")) {
				showVoca();
				deleteVoca();
				saveData();
			} else if (input.equals("3")) {
				showVoca();
				updateVoca();
				saveData();
			} else if (input.equals("4")) {
				scrambleGame();

			} else if (input.equals("5")) {
				break;
			} else {
				System.out.println("또이 또이 안 치냐??");
			}
			showVoca();

			System.out.println();
			System.out.println();
		}
	}
}
