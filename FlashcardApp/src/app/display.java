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

import javafx.scene.control.TextArea;
import javafx.scene.control.Label;

public class display extends Application{
	
	

	private Group root;
	private Flashcard f1;
	private Flashcard f2;
	//private TextField t1;
	private TextArea t1;
	private TextArea t2;
	private Button submit;
	private Button newFlashcard;
	private Stage primaryStage;
	
	private Label term;
	private Label Defination;
	

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
		 submit = new Button("Add to Deck");
		 submit.setTranslateX(190);
		 submit.setTranslateY(400);
		 root = new Group(submit);
		 
	//styling
		 submit.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
		 ///////
		 
		 /////// new FlashCard
		 newFlashcard = new Button ("new FlashCard");
		 newFlashcard.setTranslateX(370);
		 newFlashcard.setTranslateY(400);
		 root.getChildren().add(newFlashcard);
		 ///////
		//styling
		 newFlashcard.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
		
		 
		 ///////creating new deck
		 Button newDeck = new Button ("create new deck");
		 newDeck.setTranslateX(400);
		 newDeck.setTranslateY(550);
		 root.getChildren().add(newDeck);
		 
		 ///////
		 submit.setOnAction(this::createFlashCard);
		 newFlashcard.setOnAction(this::createTexfileds);
		 newDeck.setOnAction(this::createnewDeck);
		 ///////
		 
		 Scene scene = new Scene(root,600,600);
		 scene.setFill(Color.rgb(203, 228, 233));
		 stage.setScene(scene);
		 stage.show(); 
	}
	 
/////////	 
	 public void createFlashCard(ActionEvent event) {
		
		 //////// Question
		 f1 = new Flashcard(t1.getText());
		 f1.setQuestion(f1);
		 root.getChildren().remove(t1);
		 root.getChildren().add(f1);
		 f1.setTranslateX(150);
		 f1.setTranslateY(300);
		
		 //////// 
		 
		 //////// Answer
		 f2 = new Flashcard(t1.getText(),t2.getText());
		 f2.setAnswer(f2);
		 root.getChildren().remove(t2);
		 root.getChildren().add(f2);
		 f2.setTranslateX(350);
		 f2.setTranslateY(300);
		 
		 
			f2.Deck();
		 
		 //////// 
		  
	 }
	 
/////////	 
	 public void createTexfileds(ActionEvent event) {
		 
		 root.getChildren().remove(f1);
		 root.getChildren().remove(f2);
		 
		 
		 term = new Label("Term");
		 term.setTranslateX(150);
		 term.setTranslateY(280);
		 root.getChildren().add(term);
		 
		 //////// Question
		 t1 = new TextArea("Question");
		 t1.setTranslateX(150);
		 t1.setTranslateY(300);
		 root.getChildren().add(t1);
		 t1.setWrapText(true);
		 t1.setMaxWidth(160);
		 t1.setMaxHeight(5);
		 //////// 
		 
		 
		 
		 Defination = new Label ("Defination");
		 Defination.setTranslateX(350);
		 Defination.setTranslateY(280);
		 root.getChildren().add(Defination);
		 //////// Answer
		 t2 = new TextArea("Answer");
		 t2.setTranslateX(350);
		 t2.setTranslateY(300);
		 root.getChildren().add(t2);
		 t2.setWrapText(true);
		 t2.setMaxWidth(160);
		 t2.setMaxHeight(5);
		 
	 }

	
	public void createnewDeck(ActionEvent event) {
		
		f2.createDeck();
	}
	
	
	
	

}


