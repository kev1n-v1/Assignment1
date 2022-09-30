package iVoteSimulator;

public interface Question {
	
	public String questions();
	
	public String answers();
	
	public void getQuestion(String question);
	
	public void getAnswer(String answer);
	
	public boolean isSingleQuestion();
	
}
