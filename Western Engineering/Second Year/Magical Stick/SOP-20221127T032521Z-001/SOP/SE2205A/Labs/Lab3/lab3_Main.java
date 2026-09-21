package question1;
import java.io.*;
import java.util.*;
public class lab3_Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner (System.in);
		String input;
		int chosenClass = 0,chosenStudent = 0;
		boolean classFound = false;
		Department department = new Department();
		System.out.println("**************************");
		System.out.println("SE2205 Lab 3 Q1");
		System.out.println("Evan Hall");
		System.out.println("**************************");
		do{
			printMenu();
			input = scan.nextLine();
			if(input.matches("A") || input.matches("a")){
				System.out.println("List of All Students");
				System.out.println("Name                 ID");
				
				for(int i = 0; i < 15; i++){
					department.students[i].printStudent();
				}
				
			}
			else if (input.matches("b") || input.matches("B")){
				System.out.println("List of Courses");
				System.out.println();
				System.out.println("___________________________");
				for(int i = 0; i < 12; i++){
					System.out.println(department.courses[i].returnName());
				}
			}
			else if (input.matches("c") || input.matches("C")){
				
				boolean contin = true;
				
				classFound = false;
				while(contin == true){
					try{
						System.out.println("Please enter the course: ");
						input = scan.nextLine();
						for(int i = 0; i < 12; i++){
							if((department.courses[i].returnName()).matches(input.toUpperCase())){
								classFound = true;
								chosenClass = i;
							}
						}
						if(classFound == false){
							throw new CourseNotFoundException();
						}
						else{
							contin = false;
						}
					}
					catch(CourseNotFoundException ex){
						System.out.println("Course Not Found Exception! Please press T to try again or R to abort: ");
						input = scan.nextLine();
						if(input.matches("T")|| input.matches("t")){
							contin = true;
						}
						else{
							contin = false;
						}
					}
				}
				contin = true;
				while(contin == true){
						try{
							System.out.println("Please enter the ID number of the student: ");
							input = scan.nextLine();
							classFound = false;
							for(int i = 0; i < 15; i++){
								if(Integer.valueOf(input) == department.students[i].returnId()){
									classFound = true;
									chosenStudent = i;
								}	
							}
							if(classFound == false){
								throw new StudentNotFoundException();
							}
							else{
								contin = false;
							}
						}
						catch(StudentNotFoundException ex){
							System.out.println("Student Not Found Exception! Please press T to try again or R to abort: ");
							input = scan.nextLine();
							if(input.matches("T")|| input.matches("t")){
								contin = true;
							}
							else{
								contin = false;
								break;
							}
						}
					}
				if(classFound == true){
					department.courses[chosenClass].addStudent(department.students[chosenStudent]);
					System.out.println("Student successfully added!");
				}
			}
			else if(input.matches("d") || input.matches("D")){
				boolean contin = true;
				classFound = false;
				while(contin == true){
					try{
						System.out.println("Please enter the course: ");
						input = scan.nextLine();
						for(int i = 0; i < 12; i++){
							if((department.courses[i].returnName()).matches(input.toUpperCase())){
								classFound = true;
								chosenClass = i;
							}
						}
						if(classFound == false){
							throw new CourseNotFoundException();
						}
						else{
							contin = false;
						}
					}
					catch(CourseNotFoundException ex){
						System.out.println("Course Not Found Exception! Please press T to try again or R to abort: ");
						input = scan.nextLine();
						if(input.matches("T")|| input.matches("t")){
							contin = true;
						}
						else{
							contin = false;
							break;
						}
					}
				}
				contin = true;
				while(contin == true){
					try{
						System.out.println("Please enter the ID number of the student: ");
						input = scan.nextLine();
						classFound = false;
						for(int i = 0; i < 15; i++){
							if(Integer.valueOf(input) == department.students[i].returnId()){
								classFound = true;
								chosenStudent = i;
							}	
						}
						if(classFound == false){
							throw new StudentNotFoundException();
						}
						else{
							contin = false;
						}
					}
					catch(StudentNotFoundException ex){
						System.out.println("Student Not Found Exception! Please press T to try again or R to abort: ");
						input = scan.nextLine();
						if(input.matches("T")|| input.matches("t")){
							contin = true;
						}
						else{
							contin = false;
							break;
						}
					}
				}
					if(classFound == true){
						department.courses[chosenClass].removeStudent(department.students[chosenStudent]);
					}
				
			}
			else if(input.matches("e") || input.matches("E")){
				boolean contin = true;
				classFound = false;
				while(contin == true){
					try{
						System.out.println("Please enter the course: ");
						input = scan.nextLine();
						for(int i = 0; i < 12; i++){
							if((department.courses[i].returnName()).matches(input.toUpperCase())){
								classFound = true;
								chosenClass = i;
							}
						}
						if(classFound == false){
							throw new CourseNotFoundException();
						}
						else{
							contin = false;
						}
					}
					catch(CourseNotFoundException ex){
						System.out.println("Course Not Found Exception! Please press T to try again or R to abort: ");
						input = scan.nextLine();
						if(input.matches("T")|| input.matches("t")){
							contin = true;
						}
						else{
							contin = false;
							break;
						}
					}
				}
				if(classFound == true){
					System.out.println("Would you like to display(D) or save this list (S)? ");
					input = scan.nextLine();
					if(input.matches("D") || input.matches("d")){
						department.courses[chosenClass].printClass();
					}
					else{
						File outFile = new File(department.courses[chosenClass].name);
						PrintWriter output = new PrintWriter(outFile);
						output.println(department.courses[chosenClass].outputClass());
						output.close();
					}
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
