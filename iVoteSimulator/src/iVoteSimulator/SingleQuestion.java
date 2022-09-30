package iVoteSimulator;

public class SingleQuestion implements Question {
	
	private String singleQuest;
	private String singleAnswer;
	
	
	public SingleQuestion (String singleQuest, String singleAnswer) {
		
		this.singleAnswer = singleAnswer;
		this.singleQuest = singleQuest;
	}
	
	@Override
	public String questions() {
		// TODO Auto-generated method stub
		return singleQuest;
	}

	@Override
	public String answers() {
		// TODO Auto-generated method stub
		return singleAnswer;
	}

	public void getQuestion(String question) {
		// TODO Auto-generated method stub
		this.singleQuest = question;
		
	}

	@Override
	public void getAnswer(String answer) {
		// TODO Auto-generated method stub
		this.singleAnswer = answer;
		
	}

	
	@Override
	public boolean isSingleQuestion() {
		// TODO Auto-generated method stub
		return true;
	}


}
