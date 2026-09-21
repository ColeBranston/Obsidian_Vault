package question1;

import java.util.*;

public class lab3_Course {
	public String name;
	private int capacity = 5;
	private Student[] listOfStudents = new Student[capacity];	
	private int numberOfStudents = 0;
	public void Course(){
		name = "hold";
	}
	public lab3_Course(String newName){
		name = newName;
		
	}
	public void createName(String newName){
		name = newName;
	}
	public void addStudent(Student newStudent){
		boolean alreadyIn = false;
		for(int i = 0; i < numberOfStudents; i++){
			if(newStudent.returnId() == listOfStudents[i].returnId()){
				alreadyIn = true;
			}
		}
		if(alreadyIn == false){
			if(numberOfStudents < capacity){
					listOfStudents[numberOfStudents] = new Student(newStudent);
					numberOfStudents += 1;
					System.out.println("Student added successfully");
			}
			else{
				System.out.println("Class is full! Do you want to increase the capacity? (Yes/No)");
				Scanner scan = new Scanner (System.in);
				String input = scan.nextLine();
				if(input.matches("Yes") || input.matches("Yes")){
					do{
						System.out.println("Please enter a new greater capacity:");
						input = scan.nextLine();
					}while(Integer.valueOf(input) <= capacity);
					Student[] hold = new Student[capacity];
					for(int i = 0; i < capacity; i++){
						hold[i] = new Student(listOfStudents[i]);
					}
					capacity = Integer.valueOf(input);
					listOfStudents= new Student[capacity];
					for(int i = 0; i < numberOfStudents; i++){
						listOfStudents[i] = new Student(hold[i]);
					}
					addStudent(newStudent);
				}
				else{
					System.out.println("Returning to menu");
				}
			
			}
		}
		else{
			System.out.println("Student already enrolled!");
		}
	}
	public String returnName(){
		return name;
	}
	public void printClass(){
		if(numberOfStudents == 0){
			System.out.println("Class is empty!");
		}
		else{
			System.out.println("Class List for " + name);
			System.out.println("Number of Students in the course = " + numberOfStudents);
			System.out.println("Class List");
			System.out.println("Student Name          ID");
			for(int i = 0; i < numberOfStudents; i ++){
				listOfStudents[i].printStudent();
			}
		}
	}
	public String outputClass(){
		String output = null;
		if(numberOfStudents == 0){
			return "Class is empty!";
		}
		else{
			for(int i = 0; i < numberOfStudents; i ++){
				output = listOfStudents[i].returnAll();
			}
			return output;
		}
	}
	public void removeStudent(Student removeStudent){
		boolean found = false;
		for(int i = 0; i < numberOfStudents; i++){
			if(removeStudent.returnId() == listOfStudents[i].returnId()){
				if( i == (numberOfStudents-1)){
					listOfStudents[i] = new Student();
				}
				else{
					listOfStudents[i] = new Student(listOfStudents[numberOfStudents -1]);
					listOfStudents[numberOfStudents-1] = new Student();
				}
				numberOfStudents--;
				found = true;
			}
		}
		if(found == false){
			System.out.println("Student not found in class!");
		}
		else{
			System.out.println("Student removed successfully!");
		}
	}
	
}
