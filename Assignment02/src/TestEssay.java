import java.util.Scanner;

public class TestEssay {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		// Essay Object
		Essay e	= new Essay (0,0,0);
		
		// User Input
		System.out.println("Enter a score for Grammar");
		e.setGrammar(keyboard.nextInt());
		
		System.out.println("Enter a score for Spelling");
		e.setSpelling(keyboard.nextInt());
		
		System.out.println("Enter a score for Content");
		e.setContent(keyboard.nextInt());
		
		
		// Printing out the Individual Scores
		System.out.println("Points for Grammar: "+e.getGrammar());
		
		System.out.println("Points for Spelling: "+e.getSpelling());
		
		System.out.println("Points for Content: "+e.getContent());
		
		// I cannot get it to print the total score
		System.out.println("Total Score for this essay is: "+e.getScore());
		
		System.out.println("Your Letter Grade is: "+e.getGrade());
		
		
		
		
		
		

	}

}
