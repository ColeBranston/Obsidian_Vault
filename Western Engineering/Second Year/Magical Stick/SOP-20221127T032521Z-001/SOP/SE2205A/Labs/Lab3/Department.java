package question1;
import java.io.*;
import java.util.Scanner;

public class Department {
	public lab3_Course [] courses = new lab3_Course[12];
	public Student [] students = new Student[15];
	public Department() throws FileNotFoundException{
		File file = new File("Courses.txt");
		File file2 = new File("Students.txt");
		int count = 0;
		if(file.exists()){
			System.out.println("Course File found!");
			Scanner input = new Scanner(file);
			while(input.hasNext()){
				courses[count] = new lab3_Course(input.next());
				count++;
			}
		}
		count = 0;
		if(file2.exists()){
			System.out.println("Student File found!");
			Scanner input2 = new Scanner(file2);
			while(input2.hasNext()){
				String[] line = (input2.next().split(","));
				students[count] = new Student(line[0], Integer.parseInt(line[1]));
				count++;
			}
		}
	}
}
