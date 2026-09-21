package lab02;
import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;

public class lab05_Course
{
	public String name;
	LinkedList <Student> students = new LinkedList<Student>();
	int size = 0; // current size
	int max = 5; // max size
	Queue<Student> que = new LinkedList<Student>();
	
	public lab05_Course()
	{
		/*Student temp = new Student();
		
		for(int i = 0; i < max; i++)
		{
			students.add(temp);
		}*/
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String Name)
	{
		name = Name;
	}
	public boolean isFull()
	{
		return (size == max);
	}
	public void resize(int newSize)
	{
		//Resize and initialize the new elements of the array
		/*if(newSize > size)
		{
			students = Arrays.copyOf(students, newSize);
		}
		for(int i = size; i < newSize; i++)
		{
			students[i]= new Student();
		}*/
		//change max size
		max = newSize;
		System.out.printf("%s class has been resized to %d \n", name, max);
	}
	public void add(Student student) 
	{
		if(checkque(student)== false)
			JOptionPane.showMessageDialog( null,"Student " + student.getName()+ " "+ student.getID() +" is already on the waiting list/in the class for "+ this.name);
		if(checkque(student) == true)
		{
			que.add(student);
			JOptionPane.showMessageDialog( null,"Student " + student.getName()+ " "+ student.getID() +" has been added to " +name + " waiting list");
		}
		
		//change the size and add student
		if(isFull() == false)
		{
			
			students.add(que.poll());
			size++;
			JOptionPane.showMessageDialog( null,"Student " + student.getName()+ " "+ student.getID() +" has been added to " +name);
			
		}
		
		try{
			save();
		}
		catch(Exception ex)
		{
			System.out.println("error");
		}
		
	}
	public boolean checkque(Student student)
	{
		Iterator<Student> it = que.iterator();
		while(it.hasNext())
		{
			if(it.next().getID() == student.getID())
			{
				return false;
			}
		}
		
		Iterator<Student> it2 = students.iterator();
		while(it.hasNext())
		{
			if(it2.next().getID() == student.getID())
			{
				return false;
			}
			
		}
		return true;
	}
	public void addLoad(Student student) 
	{
		
		que.add(student);
		
		//change the size and add student
		if(isFull() == false)
		{
			
			students.add(que.poll());
			size++;
		}
		
		
	}
	public void drop(int ID) throws lab05_StudentNotFoundException
	{
		//Drops a student if they are in the class
		Student temp = new Student();
		int spot = 99999;
		boolean dropped = false;
		
		Iterator<Student> it = students.iterator();
		int it_count = 0;
		
		while(it.hasNext())
		{
			if(it.next().getID() == ID)
			{
				students.remove(it_count);
		
				size--;
				JOptionPane.showMessageDialog(null,"Student("+ID+") has been dropped from " + name);
				dropped = true;
				
				break;
			}
			it_count++;
		}
		
		/*for(int i = 0; i < size; i++)
		{
			if(students[i].getID() == ID)
			{
				students[i] = new Student();
				spot = i;
				
				
			}
		}*/
	
		//when student is dropped shift, the rest of the students down the array
		/*for(int i = spot; i < max-1; i++)
		{
			temp = students[i];
			students[i] = students[i+1];
			students[i+1] = temp;
		}*/
		
		if(size == 4)
		{
			
			students.add(que.poll());
			size++;
			JOptionPane.showMessageDialog(null,"Student("+students.getLast().getID()+") has been added " + name + " from waiting list");
			
			try{
				save();
			}
			catch(FileNotFoundException ex)
			{
				System.out.println("Error");
			}
			catch(Exception ex)
			{
				System.out.println("Error ding");
			}
			
		}
		
		if(dropped == false && size != 0)
			throw new lab05_StudentNotFoundException();
		if(dropped == false && size ==0)
			JOptionPane.showMessageDialog(null,"No students in this class! Aborting drop");
	}
	
	public void print()
	{
		String	display="";
		display += "List of Students" + "\n";
		display += "Name     ID" + "\n";
		
		//Prints all the students
		Iterator<Student> it2 = students.iterator();
		
		while(it2.hasNext())
		{
			display += it2.next().toString() + "\n";
		}
		
		display += "\n\nWaiting List \n";
		Iterator<Student> it = que.iterator();
		while(it.hasNext())
		{
			display += it.next().toString() + "\n";
		}
		JOptionPane.showMessageDialog( null,display, "List of students in "+ name,JOptionPane.
				INFORMATION_MESSAGE);
	}
	public void save() throws Exception
	{
		File file = new File(this.getName() + "list.txt");
		
		PrintWriter output = new PrintWriter(file);
		Student tempo = new Student();
		Iterator<Student> it2 = students.iterator();
		Queue<Student> saver = new LinkedList<Student>();
		
		
		while(it2.hasNext())
		{
			saver.add(it2.next());
		}
		while(!saver.isEmpty())
		{
			tempo = saver.poll();
			output.print(tempo.getName()+ " ");
			output.println(tempo.getID());
		}
		/*for(int i = 0; i< size; i++)
		{
			if(students[i].getID() != 0)
			{
				output.print(students[i].getName()+ " ");
				output.println(students[i].getID());
			}
		}*/
		
		Queue<Student> temp = new LinkedList<Student>();
		Iterator<Student> it = que.iterator();
		
		while(it.hasNext())
		{
			temp.add(it.next());
		}
		
		
		while (!temp.isEmpty())
		{
			tempo = temp.poll();
			output.print(tempo.getName()+ " ");
			output.println(tempo.getID());
		}
		
		output.close();
	}
	
	public void load() throws FileNotFoundException
	{
		String fileName = this.getName() + "list.txt";
		File file = new File(fileName);
		
		Scanner input = new Scanner(file);
		int count = 0;
		
		while (input.hasNext()) 
		{
			count++;
			input.nextLine();
		}
		input.close();
		
		
		input = new Scanner(file);
		int counter = 0;
		
		while (input.hasNext()) 
		{
			Student temp = new Student();
			temp.setName(input.next());
			temp.setID(input.nextInt());
			
			addLoad(temp);
		}
		input.close();
	}
	public String toString()
	{
		return name;
	}
	
	public void sort()
	{
		
		/*for(int i = 0; i< students.size(); i++)
		{
			students.get(i).RC.add(this);
			students.get(i).RC.generate();
		}*/
		
		Iterator<Student> it = students.iterator();
		while(it.hasNext())
		{
			it.next().setCrs(this.getName());
		}
		
		Collections.sort(students);
		
		String display = "";
		
		int count = 1;
		
		for (int i  = 0 ; i <students.size(); i++)
		{
			display += "#"+count +" "+ students.get(i).getName() + " " + (students.get(i).RC.findBest(this)/4) + "\n";
			count++;
		}
		
		JOptionPane.showMessageDialog( null,display);
	}
	public void shuffle()
	{
		Collections.shuffle(students);
		
		String display = "";
		
		int count = 1;
		
		for (int i  = 0 ; i <students.size(); i++)
		{
			display += "#"+count +" "+ students.get(i).getName() + " " + (students.get(i).RC.findBest(this)/4) + "\n";
			count++;
		}
		
		JOptionPane.showMessageDialog( null,display);
	}
	public void reverse()
	{
		Iterator<Student> it = students.iterator();
		while(it.hasNext())
		{
			it.next().setCrs(this.getName());
		}
		
		Collections.sort(students);
		
		String display = "";
		
		int count = 1;
		
		for (int i  = students.size() -1 ; i >= 0; i--)
		{
			display += "#"+count +" "+ students.get(i).getName() + " " + (students.get(i).RC.findBest(this)/4) + "\n";
			count++;
		}
		
		JOptionPane.showMessageDialog( null,display);
	}
}
