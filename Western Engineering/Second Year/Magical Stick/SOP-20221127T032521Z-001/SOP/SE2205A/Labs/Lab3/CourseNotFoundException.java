package question1;

public class CourseNotFoundException extends Exception{
	public CourseNotFoundException(){
		super();
	}
	public CourseNotFoundException(String mess){
		super(mess);
	}
}