
public abstract class BaseBoard {
	/** 
	 * - 추상 메소드 - 
	 * 상속 받은 클래스에서 
	 * 무조건 오버라이드 하게해서 
	 * 이름 규칙을 만든다 
	 * 
	 * 기능을 물려받기 위한 것이 아님
	 * **/
	
	abstract void post();  // 글등록 입니다
	abstract void deletePost();  // 글삭제 입니다
}
