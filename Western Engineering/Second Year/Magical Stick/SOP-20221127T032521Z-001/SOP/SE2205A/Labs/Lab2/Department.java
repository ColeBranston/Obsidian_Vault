package question1;

public class Department {
	public Course [] courses = new Course[5];
	public Student [] students = new Student[10];
	public Department(){
		
		courses[0] = new Course("AM1413");
		courses[1] = new Course("ES1050");
		courses[2] = new Course("AM1411");
		courses[3] = new Course("ES1021");
		courses[4] = new Course("ES1036");
		
		students[0] = new Student("Larry",1111);
		students[1] = new Student("Jill",2222);
		students[2] = new Student("John",3333);
		students[3] = new Student("Mike",4444);
		students[4] = new Student("Sarah",5555);
		students[5] = new Student("Dan",6666);
		students[6] = new Student("Julia",7777);
		students[7] = new Student("Bradley",8888);
		students[8] = new Student("Rita",9999);
		students[9] = new Student("Bill",1010);
	}
	

}
