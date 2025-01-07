package app;

import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import java.util.HashMap;


public class Flashcard extends Label {
	
	private String question;
	private String answer;
	private HashMap<String,String> deck;
	
	//private deck flashcardDeck;	
	
	public Flashcard(String question, String answer) {
		
		this.question = question;
		this.answer = answer;
		
		deck = new HashMap<>();
		deck.put(question, answer);
	}
	
	public Flashcard(String question) {
		
		this.question = question;
		
	}

	/////view flashcard deck
	public void Deck() {
		
		System.out.println(deck);
		
	}
	///////
	
	///////create deck
	public void createDeck() {
		System.out.println("new Deck");
		deck = new HashMap<>();
		deck.put(this.question, this.answer);
	}
	///////

	
	public Label setQuestion(Label lnew) {
		
		lnew.setText(question);
		lnew.setTextFill(Color.RED);
		return lnew;
		
	}
	
	
	public Label setAnswer(Label lnew) {
		
		lnew.setText(answer);
		lnew.setTextFill(Color.GREEN);
		return lnew;
	}
	
	
	

}
