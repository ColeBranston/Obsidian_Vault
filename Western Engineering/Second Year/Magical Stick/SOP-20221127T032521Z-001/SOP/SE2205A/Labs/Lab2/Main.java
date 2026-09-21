package question1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String input;
		int chosenClass = 0,chosenStudent = 0;
		boolean classFound = false;
		Department department = new Department();
		System.out.println("**************************");
		System.out.println("SE2205 Lab 2 Q1");
		System.out.println("Evan Hall");
		System.out.println("**************************");
		do{
			printMenu();
			input = scan.nextLine();
			if(input.matches("A") || input.matches("a")){
				System.out.println("List of All Students");
				System.out.println("Name                 ID");
				
				for(int i = 0; i < 10; i++){
					department.students[i].printStudent();
				}
				
			}
			else if (input.matches("b") || input.matches("B")){
				System.out.println("List of Courses");
				System.out.println();
				System.out.println("___________________________");
				for(int i = 0; i < 5; i++){
					System.out.println(department.courses[i].returnName());
				}
			}
			else if (input.matches("c") || input.matches("C")){
				System.out.println("Please enter the course: ");
				input = scan.nextLine();
				classFound = false;
				for(int i = 0; i < 5; i++){
					if((department.courses[i].returnName()).matches(input)){
						classFound = true;
						chosenClass = i;
					}
				}
				if(classFound == false){
					System.out.println("Class not found!");
				}
				else{
					System.out.println("Please enter the ID number of the student: ");
					input = scan.nextLine();
					classFound = false;
					for(int i = 0; i < 10; i++){
						if(Integer.valueOf(input) == department.students[i].returnId()){
							classFound = true;
							chosenStudent = i;
						}	
					}
					if(classFound == true){
						department.courses[chosenClass].addStudent(department.students[chosenStudent]);
					}
					else{
						System.out.println("Student not found!");
					}
				}
			}
			else if(input.matches("d") || input.matches("D")){
				System.out.println("Please enter the course: ");
				input = scan.nextLine();
				classFound = false;
				for(int i = 0; i < 5; i++){
					if((department.courses[i].returnName()).matches(input)){
						classFound = true;
						chosenClass = i;
					}
				}
				if(classFound == false){
					System.out.println("Class not found!");
				}
				else{
					System.out.println("Please enter the ID number of the student: ");
					input = scan.nextLine();
					classFound = false;
					for(int i = 0; i < 10; i++){
						if(Integer.valueOf(input) == department.students[i].returnId()){
							classFound = true;
							chosenStudent = i;
						}	
					}
					if(classFound == true){
						department.courses[chosenClass].removeStudent(department.students[chosenStudent]);
					}
					else{
						System.out.println("Student not found!");
					}
				}
			}
			else if(input.matches("e") || input.matches("E")){
				System.out.println("Please enter the course code:");
				input = scan.nextLine();
				classFound = false;
				for(int i = 0; i < 5; i++){
					if((department.courses[i].returnName()).matches(input)){
						classFound = true;
						chosenClass = i;
					}
				}
				if(classFound == false){
					System.out.println("Class not found!");
				}
				else{
					department.courses[chosenClass].printClass();
				}
			}
			
		}while(!input.matches("F") && !input.matches("f"));

	}
	public static void printMenu(){
		System.out.println("************MENU************");
		System.out.println("A: Print List of All Students.");
		System.out.println("B: Print List of Courses.");
		System.out.println("C: Add a student to a course.");
		System.out.println("D: Drop a student from a course.");
		System.out.println("E: Print a List of Students in a Course");
		System.out.println("F: Exit");
		System.out.println(" Please enter your choice: ");
	}

}
