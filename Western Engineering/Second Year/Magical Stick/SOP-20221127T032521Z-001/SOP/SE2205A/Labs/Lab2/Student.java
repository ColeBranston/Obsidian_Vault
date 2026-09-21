package question1;

public class Student {
	private String name;
	private int id;
	public Student(){
		name = null;
		id = 0;
	}
	public Student(String n_name, int n_id){
		name = n_name;
		id = n_id;
	}
	public Student(Student newStudent){
		name = newStudent.returnName();
		id = newStudent.returnId();
	}
	public void printStudent(){
		System.out.println(name + "\t" + id);
	}
	public int returnId(){
		return id;
	}
	public String returnName(){
		return name;
	}
}
