
public class Quiz {

	private String question;
	private String ch1;
	private String ch2;
	private String ch3;
	private String ch4;
	private String ans;
	
	//alt shift s  getter setter 만드는 단축키
	

	public Quiz(String qs, String c1, String c2 , String c3, String c4 , String as) {

		this.question=qs;
		this.ch1=c1;
		this.ch2=c2;
		this.ch3=c3;
		this.ch4=c4;
		this.ans=as;
	}
	
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getCh1() {
		return ch1;
	}
	public void setCh1(String ch1) {
		this.ch1 = ch1;
	}
	public String getCh2() {
		return ch2;
	}
	public void setCh2(String ch2) {
		this.ch2 = ch2;
	}
	public String getCh3() {
		return ch3;
	}
	public void setCh3(String ch3) {
		this.ch3 = ch3;
	}
	public String getCh4() {
		return ch4;
	}
	public void setCh4(String ch4) {
		this.ch4 = ch4;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	
	
	

}


