package app;


import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;


public class display extends Application{
	
	

	private Group root;
	private Flashcard f1;
	private Flashcard f2;
	private TextField t1;
	private TextField t2;
	private Button submit;
	private Button newFlashcard;
	private Stage primaryStage;
	
	
/////////	
	 public void start (Stage stage) {
			 
			 primaryStage =stage;
			 Group  root = new Group();
			 
			 //////
			 Button showOtherScreen = new Button(" other screen");
			 root.getChildren().add(showOtherScreen);
			 showOtherScreen.setOnAction(this::showDeckstage);
			 //////
			 
			 Scene scene = new Scene(root,400,400);
			 stage.setScene(scene);
			 stage.show();
			 
		 }
	
	public void showDeckstage(ActionEvent event) {
		
		mainScreen(primaryStage);
		
	}
	
	
/////////
	 public void mainScreen (Stage stage) {
		
		 /////// Submit
		 submit = new Button("Create FlashCard");
		 submit.setTranslateX(320);
		 submit.setTranslateY(400);
		 root = new Group(submit);
		 ///////
		 
		 /////// new FlashCard
		 newFlashcard = new Button ("new FlashCard");
		 newFlashcard.setTranslateX(250);
		 newFlashcard.setTranslateY(100);
		 root.getChildren().add(newFlashcard);
		 ///////
		
		 ///////Adding to Deck
		 Button addtoDeck = new Button("Add to Deck");
		 addtoDeck.setAlignment(Pos.CENTER);
		 root.getChildren().add(addtoDeck);
		 addtoDeck.setOnAction(this::AddtoDeck);
		 ///////
		 
		 ///////creating new deck
		 Button newDeck = new Button ("create new deck");
		 newDeck.setTranslateX(400);
		 root.getChildren().add(newDeck);
		 
		 ///////
		 submit.setOnAction(this::createFlashCard);
		 newFlashcard.setOnAction(this::createTexfileds);
		 newDeck.setOnAction(this::createnewDeck);
		 ///////
		 
		 Scene scene = new Scene(root,600,600);
		 stage.setScene(scene);
		 stage.show(); 
	}
	 
/////////	 
	 public void createFlashCard(ActionEvent event) {
		
		 //////// Question
		 f1 = new Flashcard(t1.getText());
		 f1.setQuestion(f1);
		 root.getChildren().add(f1);
		 f1.setTranslateX(150);
		 f1.setTranslateY(300);
		 root.getChildren().remove(t1);
		 //////// 
		 
		 //////// Answer
		 f2 = new Flashcard(t1.getText(),t2.getText());
		 f2.setAnswer(f2);
		 root.getChildren().add(f2);
		 f2.setTranslateX(350);
		 f2.setTranslateY(300);
		 root.getChildren().remove(t2);
		 //////// 
		  
	 }
	 
/////////	 
	 public void createTexfileds(ActionEvent event) {
		 
		 root.getChildren().remove(f1);
		 root.getChildren().remove(f2);
		 
		 //////// Question
		 t1 = new TextField("Question");
		 t1.setTranslateX(150);
		 t1.setTranslateY(300);
		 root.getChildren().add(t1);
		 //////// 
		 
		 //////// Answer
		 t2 = new TextField("Answer");
		 t2.setTranslateX(350);
		 t2.setTranslateY(300);
		 root.getChildren().add(t2);
		 
	 }
	 
/////////	 
		
	public void AddtoDeck(ActionEvent event) {
		
		f2.Deck();
		
	}
	 
/////////
	
	public void createnewDeck(ActionEvent event) {
		
		f2.createDeck();
	}
	
	
	
	

}


