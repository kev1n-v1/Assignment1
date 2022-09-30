package iVoteSimulator;

public class MultiQuestion implements Question {
	
	private String multQuest;
	private String multAnswer;

	@Override
	public String questions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String answers() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void MultQuestion (String multQuest, String multAnswer) {
		
		this.multAnswer = multAnswer;
		this.multQuest = multQuest;
	}

	public void getQuestion(String question) {
		// TODO Auto-generated method stub
		this.multQuest = question;
		
	}

	@Override
	public void getAnswer(String answer) {
		// TODO Auto-generated method stub
		this.multAnswer = answer;
		
	}

	
	@Override
	public boolean isSingleQuestion() {
		// TODO Auto-generated method stub
		return true;
	}

	
}
