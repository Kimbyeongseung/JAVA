import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
	public void createFiles() {
		
		
//		FileOutputStream output = null;
//		String data = "가나다라 대한민국";
//		/****************** 첫 번째 방법 ***********************/
//		/** 생성할 파일 이름을 지정 **/
//		try {
//			output = new FileOutputStream("c:/my/test1.txt");
//		
//			data = "개구리 소년\r\n";
//			output.write(data.getBytes()); // 파일에 저장
//
//			data = "빰빠밤\r\n";
//			output.write(data.getBytes()); // 파일에 저장
//
//			data = "즐즐즈릊릊릊르즐\r\n";
//			output.write(data.getBytes()); // 파일에 저장
//			output.close();
//			System.out.println("정상종료");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		/****************** 두 번째 방법 ***********************/
//		File tempFile = new File("c:/java작업/trycatch.txt");
//		if(tempFile.exists()== true) {			//파일 존재 여부 확인
//		}
//		 FileWriter fw;		
//		 try {
//			fw = new FileWriter("c:/java작업/trycatch.txt", false); //덮어쓰기 , true 붙여쓰기
//			String data = "티라노\r\n";			
//			 fw.write(data);		
//			 data = "어떤 맛일까? 냠냠\r\n";
//			 fw.write(data);			
//			 fw.close();
//			 System.out.println("정상종료");
//		} catch (IOException e) {		
//			e.printStackTrace();
//		}
		
	

		//
		// /** 붙여쓰기 하는 방법 **/
		// FileWriter fw2 = new FileWriter("c:/test2.txt", true);
		//
		// data = "밸로시\r\n";
		// fw2.write(data);
		//
		// data = "랩터\r\n";
		// fw2.write(data);
		//
		// data = "못 생겼다\r\n";
		// fw2.write(data);
		//
		// fw2.close();
		//
		/**************** 파일 읽는 방법 ********************/
		// 바이트로 읽기
		// byte[] b = new byte[1024];
		// FileInputStream input;
		// try {
		// input = new FileInputStream("c:/test2.txt");
		// input.read(b);
		// String str = new String(b);
		// System.out.println(str);
		// input.close();
		// } catch (FileNotFoundException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
//		try {
//			// 한 줄씩 읽기
//			BufferedReader br = new BufferedReader(new FileReader("c:/java작업/trycatch/test2.txt"));
//			while (true) {
//				String line = br.readLine();
//				if (line == null)
//					break;
//				System.out.println(line);
//			}
//			br.close();
//
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}
}
