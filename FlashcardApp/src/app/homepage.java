package app;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.event.ActionEvent;
import javafx.geometry.Orientation;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.GridPane;
import java.util.ArrayList;
import javafx.scene.control.Label;


public class homepage  extends Application {
	
	private Group root;
	private Button viewCourses;
	private Button createCourse;
	private Stage homepageStage;
	private TextArea courseName;
	private Stage  AllCourseStage;
	private Button newButton;

	
	////////home page
	public void start(Stage stage) {
		
		homepageStage = stage;
		/////////
		viewCourses = new Button("view courses");
		viewCourses.setTranslateX(90);
		viewCourses.setTranslateY(300);
		//viewCourses.setOnAction(this::viewCoursesP);
		/////////
		
		
		
		/////////
		createCourse = new Button("create a course");
		createCourse.setTranslateX(200);
		createCourse.setTranslateY(300);
		createCourse.setOnAction(this::createCourseWindow);
		/////////
		
		
		root = new Group();
		
		
		root.getChildren().add(viewCourses);
		root.getChildren().add(createCourse);
		
		Scene scene = new Scene(root,400,400);
		stage.setScene(scene);
		stage.show();
	}
	
	////////create course window	
	public void createCourseW (Stage stage) {
		
		AllCourseStage = stage;
		
		/////courseName
		courseName = new TextArea("textArea");
		courseName.setTranslateX(150);
		courseName.setTranslateY(200);
		courseName.setMaxHeight(1);
		courseName.setMaxWidth(200);
		courseName.setWrapText(true);
		/////
		
		/////add course Button
		Button addCourse = new Button("add course");
		addCourse.setTranslateX(150);
		addCourse.setTranslateY(250);
		addCourse.setOnAction(this::addingCourse);
		
		/////view courses button
		Button viewCourses = new Button ("view courses");
		viewCourses.setTranslateX(150);
		viewCourses.setTranslateY(300);
		viewCourses.setOnAction(this::viewCoursesW);
		////
		Group root = new Group();
		root.getChildren().add(courseName);
		root.getChildren().add(addCourse);
		root.getChildren().add(viewCourses);
		////
		
		Scene scene = new Scene(root,400,400);
		
		
		stage.setScene(scene);
		stage.show();
	}
	

	
	///////
	public void createCourseWindow (ActionEvent event) {
		
		createCourseW(homepageStage);
	}
	///////
	
	
	
	public void  addingCourse(ActionEvent event ) {
		
		Course newCourse = new Course(courseName.getText());
		
		
		newCourse.addCourse();
		
		newCourse.printCourses();
	}
	
////////////	
	
	public void viewCoursesW(ActionEvent event ) {
		
		AllCoursesPage(AllCourseStage);
		
	}
	

	
	
	public void AllCoursesPage(Stage stage) {
		
		
	
		Label coursesTitle = new Label("courses");

		
		ToolBar toolBar = new ToolBar(coursesTitle);
		
		
		
			
		for( String c : Course.courses) {
			
			newButton = new Button();
				
			newButton.setText(c);
				
			toolBar.getItems().add(newButton);
				
			}
			
		
		
		
		
		toolBar.setOrientation(Orientation.VERTICAL);
		
		
		
		Group root = new Group(toolBar);
		Scene scene = new Scene(root,400,400);
		stage.setScene(scene);
		stage.show();
	}







}










