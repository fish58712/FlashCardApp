package app;

import java.util.ArrayList;

import javafx.scene.control.TextArea;

public class Course {
	
	private String cName;
	
	static ArrayList<String> courses  = new ArrayList<String>();;
	

	
	public Course (String courseName) {
		
		this.cName = courseName;
	}
	

	
	public TextArea setCourse(TextArea t) {
		
		t.setText(cName);
		t.setWrapText(true);
	
		return t;
	}
	
	
	public void  addCourse() {
	 courses.add(this.cName);
		
	}
	
	
	
	public void deleteCourse() {
		courses.remove(this.cName);
	}
	
	public void printCourses() {
		
		
	
		System.out.print(courses);
			
	}
	
	
	
	
	
	
	
}


