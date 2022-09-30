package iVoteSimulator;

public class Student {
	
	private String studID;
	private String answersID;
	
	public Student() {
		this.studID = "fill";
		this.answersID = "fill";
	}
	
	public void setID(String sID) {
		this.studID = sID;
	}
	
	public void setAnswer(String ans) {
		this.answersID = ans;
	}
	
	public String getID() {
		return studID;
	}
	
	public String getAnswers() {
		return answersID;
	}
}
