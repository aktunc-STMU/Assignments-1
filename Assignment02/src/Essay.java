
public class Essay extends GradedActivity {
	
	private int grammar;
	private int spelling;
	private int content;
	

	
	public Essay(int grammar, int spelling, int content) {
		
		double numericScore = grammar + spelling + content;	

		this.grammar = grammar;
		this.spelling = spelling;
		this.content = content;
		
		setScore(numericScore);
		
		
	}


	public int getGrammar() {
		return grammar;
	}


	public void setGrammar(int grammar) {
		this.grammar = grammar;
	}


	public int getSpelling() {
		return spelling;
	}


	public void setSpelling(int spelling) {
		this.spelling = spelling;
	}


	public int getContent() {
		return content;
	}


	public void setContent(int content) {
		this.content = content;
	}
	
	

}
