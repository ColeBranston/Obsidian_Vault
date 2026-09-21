package lab02;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.io.*;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class lab05_Department
{
	private lab05_Course []courses;
	private LinkedList <Student>students = new LinkedList<Student>();
	
	//
	JButton	jbtSort	=	new	JButton("Sort");	
	JButton	jbtShuffle	=   new	JButton("Shuffle");	
	JButton	jbtReverse	=	new	JButton("Reverse");
	JTextField	jtfNumber	=	new	JTextField(8);
	
	public lab05_Department() throws FileNotFoundException
	{
		
		try{
			
			ReadFileCourses();
		}
		catch (FileNotFoundException ex)
		{
			System.out.println("No files found");
		}
		try{
			ReadFileStudents();
		}
		catch (FileNotFoundException ex)
		{
			System.out.println("No files found stud");
		}
	}
	
	public void printStudents()
	{
		
		String	display="";
		display += "List of Students" + "\n";
		display += "Name     ID" + "\n";
		
		//Prints all the students
		ListIterator<Student> it = students.listIterator();
		
		while(it.hasNext())
		{
			display += it.next().toString() + "\n";
		}
		/*
				for(int i = 0; i < students.length; i++)
				{
					display+=students[i].toString()+"\n";	

				}
		*/
		JOptionPane.showMessageDialog( null,display);
	
	}
	
	public void printCourses()
	{
		String	display="";
		display += "List of Courses"+ "\n";
		
		//Prints all the students
				for(int i = 0; i < courses.length; i++)
				{
					display+=courses[i].toString()+"\n";	

				}
		
		JOptionPane.showMessageDialog( null,display);
	}
	public void addStudent() throws lab05_CourseNotFoundException
	{
		String course = JOptionPane.showInputDialog(null, "Enter Course Code: ", "Enter a Course");
		char choice = 'k';
		int newSize = 0;
		boolean foundCourse = false;
		boolean added = false;
		
		//Go through the database of courses to see if its valid
		for(int i = 0; i < courses.length ; i++)
		{
			try{
			//check the name for the course
			if(courses[i].getName().equals(course.toUpperCase()))
			{
				foundCourse = true;
				
					
					//Enter the student number 
				String str_ID = " ";
				int ID = 0;
		
				
				while(str_ID != null){
					
					added = false;
					try{
						str_ID = JOptionPane.showInputDialog(null, "Enter Student ID: ", "Enter a student");
						ID = Integer.parseInt(str_ID);
					}
					catch(NumberFormatException ex)
					{
						JOptionPane.showMessageDialog( null,"Going back to main menu");
						break;
					}
					
					
					try{
						//add the student into the course
						
						for(int k = 0; k < students.size(); k++)
						{
							if(students.get(k).getID() == ID)
							{
								courses[i].students.add(students.get(k));
								added = true;
							}
						}
						/*
						for(int k = 0; k < students.length; k++)
						{
							if(students[k].getID() == ID)
							{
								courses[i].add(students[k]);
								added = true;
							}
						}*/
						if (added == false)
							throw new lab05_StudentNotFoundException();
					}
					catch(lab05_StudentNotFoundException e2){
						JOptionPane.showMessageDialog( null,"Invalid Student("+ID+") Entered!","Student Not Found",JOptionPane.
								INFORMATION_MESSAGE);
							break;
					}
				}
			}
			//output message when no course is found
			else if(i == courses.length-1 && foundCourse == false && course != null)
				throw new lab05_CourseNotFoundException();
			}
			catch(NullPointerException ex)
			{
				
			}
			
		}
	}
	public void dropStudent() throws Exception
	{
		Scanner Scan = new Scanner(System.in);
		
		boolean foundCourse = false;
		
		int ID =0;
		//Gets and valids the course
		
		String course =  JOptionPane.showInputDialog(null, "Enter Course Code: ", "Enter a Course");
		
		for(int i = 0; i < courses.length; i++)
		{
			if(courses[i].getName().equals(course.toUpperCase()))
			{
				String str_ID = " ";
				foundCourse = true;
				while(str_ID != null)
				{
					try
					{
						str_ID = JOptionPane.showInputDialog(null, "Enter Student ID: ", "Enter a student");;
						ID = Integer.parseInt(str_ID);
					}
					catch(NumberFormatException ex)
					{
						JOptionPane.showMessageDialog( null,"invalid student entry. Going back to main menu");
						break;
					}
					try
					{
						foundCourse = true;
						//Function for a course to drop a student
						courses[i].drop(ID);
						
					}
					catch(lab05_StudentNotFoundException ex)
					{
						JOptionPane.showMessageDialog( null,"Invalid Student("+ID+") Entered!","Student Not Found",JOptionPane.
								INFORMATION_MESSAGE);
							break;
					}
					
				
				}
			}
			else if(i == courses.length-1 && foundCourse == false && course != null)
				throw new lab05_CourseNotFoundException();
		}
	}
	
	public void Print() throws Exception
	{
		Scanner Scan = new Scanner(System.in);
		
		String course = JOptionPane.showInputDialog(null, "Enter Course Code: ", "Enter a Course");
		
		boolean found = false;
		
		for(int i = 0; i < courses.length; i++)
		{
			if(courses[i].getName().equals(course.toUpperCase()))
			{
				found = true;
				courses[i].print();
				
			}
		}
		if(found == false)
			throw new lab05_CourseNotFoundException();
	}
	
	public void ReadFileStudents() throws FileNotFoundException
	{
		File file = new File("Student.txt");
		Scanner input = new Scanner(file);
		int count = 0;
		/*
		while (input.hasNext()) 
		{
			count++;
			input.nextLine();
		}
		input.close();
		*/
		
		
		input = new Scanner(file);

		Student temp  = new Student();
		while (input.hasNext()) 
		{
			temp  = new Student();
			temp.setName(input.next());
			temp.setID(input.nextInt());
			students.add(temp);
		}
		input.close();
		
	}
	public void ReadFileCourses() throws FileNotFoundException
	{
		File file = new File("src/Courses.txt");
	
		Scanner input = new Scanner(file);
		int count = 0;
		
		while (input.hasNext()) 
		{
			count++;
			input.nextLine();
		}
		input.close();
		courses = new lab05_Course[count];
		
		
		input = new Scanner(file);
		int counter = 0;
		while (input.hasNext()) 
		{
			courses[counter] = new lab05_Course();
			courses[counter].setName(input.next());

			counter++;
		}
		
		for(int i = 0; i < courses.length; i++)
		{
			courses[i].load();
		}
		input.close();
		
	}
	public boolean askAbort()
	{
		char choice = 'j';
		Scanner scan = new Scanner(System.in);
		
		System.out.println("No Course Found Exception! Press T to continue or R to abort");
		choice = scan.next().charAt(0);
		choice = Character.toUpperCase(choice);
		
		while (!(choice == 'R' || choice == 'T'))
		{
			System.out.println("No Course Found Exception! Press T to continue or R to abort");
			choice = scan.next().charAt(0);
			choice = Character.toUpperCase(choice);
		}
		
		if(choice == 'R')
			return true;
		else if(choice == 'T')
			return false;
		
		return false;
	}
	/*
	public boolean askPrint()
	{
		char choice = 'j';
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Would you like to display (D) or save this list (S)?");
		choice = scan.next().charAt(0);
		choice = Character.toUpperCase(choice);
		
		while (!(choice == 'D' || choice == 'S'))
		{
			System.out.println("Would you like to display (D) or save this list (S)?");
			choice = scan.next().charAt(0);
			choice = Character.toUpperCase(choice);
		}
		
		if(choice == 'D')
			return true;
		else if(choice == 'S')
			return false;
		
		return false;
	}*/
	
	public void generateReport()
	{
		String display="";
		
		//ListIterator<Student> it = students.listIterator();
		for (int i = 0; i < students.size(); i++)
		{
			for(int k = 0; k < courses.length; k++)
			{
				//Iterator<Student> it2 = courses[k].students.iterator();
				for (int j = 0; j < courses[k].students.size(); j++)
				{
					if(students.get(i).getID() == courses[k].students.get(j).getID())
					{
						students.get(i).RC.add(courses[k]);
						
					}
				}
			}
		}
		ListIterator<Student> it3 = students.listIterator();
		while(it3.hasNext())
		{
			it3.next().RC.generate();
			
			if(it3.previous().RC.display() != null)
			{
				display += it3.next().getName() + "\n";
				display += it3.previous().RC.display();
				
				
			}
			it3.next();
		}
		
		JOptionPane.showMessageDialog(null, display);
	}
	public void award() throws lab05_CourseNotFoundException
	{
		lab05_BestStudentAward best = new lab05_BestStudentAward();
		lab05_HighestMarkAward high = new lab05_HighestMarkAward();
		
		int highestBest = 0;
		int highestHigh = 0;
		
		double bestWin = 0;
		double highWin = 0;
		
		String course = " ";
		
		try{
		course = JOptionPane.showInputDialog(null, "Enter Course Code: ", "Enter a Course");
		}
		catch(NullPointerException ex)
		{
			
		}
		boolean foundCourse = false;
		
		for(int i = 0; i < courses.length; i++)
		{
			if(course != null)
			if(courses[i].getName().equals(course.toUpperCase()))
			{
				Student[] student = new Student[students.size()];
				
				students.toArray(student);
				
				foundCourse = true;
				bestWin =best.getWinner(student,courses[i]);
				highWin =high.getWinner(student,courses[i]);
			}
			
			else if(i == courses.length-1 && foundCourse == false && course != null)
				throw new lab05_CourseNotFoundException();
			
		}
		if(course != null)
		JOptionPane.showMessageDialog( null, high.toString()+ "\n" + best.toString());
	}
	
	public void readFile()
	{
		
		Keyword frame = new Keyword();
	

	}
	public void Shuffler()
	{
	
		JFrame frame = new JFrame();
		frame.setSize(400, 350);
		frame.setTitle("Validate files"); 
		frame.setLocationRelativeTo(null); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setVisible(true);
		
		jbtSort.setVisible(false);
		jbtShuffle.setVisible(false);
		jbtReverse.setVisible(false);
		
		JPanel	panel1	=	new	JPanel();	
		panel1.add(new	JLabel("Ente a Course:	"));	
		panel1.add(jtfNumber);	

		JPanel	panel2	=	new	JPanel();	
		panel2.add(jbtSort);	
		panel2.add(jbtShuffle);	
		panel2.add(jbtReverse);	
		
		frame.add(panel1,BorderLayout.NORTH);	
		frame.add(panel2,	BorderLayout.SOUTH);
		
		
		jtfNumber.addActionListener(new ActionListener(){

        public void actionPerformed(ActionEvent e){
        	for(int i = 0; i < courses.length; i++)
        	{
        		if(jtfNumber.getText().toUpperCase().equals(courses[i].getName()) ||jtfNumber.getText().toUpperCase().equals("ALL") )
        		{
		        	jbtSort.setVisible(true);
		    		jbtShuffle.setVisible(true);
		    		jbtReverse.setVisible(true);
		    		break;
        		}
    		}

        }});
		
		for (int i = 0; i < students.size(); i++)
		{
			for(int k = 0; k < courses.length; k++)
			{
				//Iterator<Student> it2 = courses[k].students.iterator();
				for (int j = 0; j < courses[k].students.size(); j++)
				{
					if(students.get(i).getID() == courses[k].students.get(j).getID())
					{
						students.get(i).RC.add(courses[k]);
						
					}
				}
			}
		}
		ListIterator<Student> it3 = students.listIterator();
		while(it3.hasNext())
		{
			it3.next().RC.generate();
		}
		
		jbtSort.addActionListener(new ActionListener() 
		{ 
			 public void actionPerformed(ActionEvent e) 
			 { 
				for(int i = 0; i < courses.length; i++)
	        	{
	        		if(jtfNumber.getText().toUpperCase().equals(courses[i].getName()))
	        		{
	        			for(int k = 0 ; k < students.size(); k++)
	        			{
	        				for(int j = 0; j < courses[i].students.size(); j++)
	        				{
	        					if(students.get(k).getID() == courses[i].students.get(j).getID())
	        					{
	        						courses[i].students.get(j).RC = students.get(k).RC;
	        					}
	        				}
	        			}
	        			courses[i].sort();
        			}
        			
	        	}
				
				if(jtfNumber.getText().toUpperCase().equals("ALL"))
				{
					sortAll();
				}
			 } 
		 }); 

		
		jbtShuffle.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{ 
				for(int i = 0; i < courses.length; i++)
	        	{
	        		if(jtfNumber.getText().toUpperCase().equals(courses[i].getName()))
	        		{
	        			for(int k = 0 ; k < students.size(); k++)
	        			{
	        				for(int j = 0; j < courses[i].students.size(); j++)
	        				{
	        					if(students.get(k).getID() == courses[i].students.get(j).getID())
	        					{
	        						courses[i].students.get(j).RC = students.get(k).RC;
	        					}
	        				}
	        			}
	        			courses[i].shuffle();
        			}
        			
	        	}
				if(jtfNumber.getText().toUpperCase().equals("ALL"))
				{
					shuffleAll();
				}
			}
		 }); 
		jbtReverse.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{ 
				for(int i = 0; i < courses.length; i++)
	        	{
	        		if(jtfNumber.getText().toUpperCase().equals(courses[i].getName()))
	        		{
	        			for(int k = 0 ; k < students.size(); k++)
	        			{
	        				for(int j = 0; j < courses[i].students.size(); j++)
	        				{
	        					if(students.get(k).getID() == courses[i].students.get(j).getID())
	        					{
	        						courses[i].students.get(j).RC = students.get(k).RC;
	        					}
	        				}
	        			}
	        			courses[i].reverse();
        			}
        			
	        	}
				if(jtfNumber.getText().toUpperCase().equals("ALL"))
				{
					reverseAll();
				}
			}
		});
		

	}
	public void sortAll()
	{
		Iterator<Student> it = students.iterator();
		while(it.hasNext())
		{
			it.next().setCrs("all");
		}
		
		Collections.sort(students);
		
		String display = "";
		
		int count = 1;
		
		for (int i  = 0 ; i <students.size(); i++)
		{
			display += "#"+count +" "+ students.get(i).getName()+ "\n";
			count++;
		}
		
		JOptionPane.showMessageDialog( null,display);
	}
	public void shuffleAll()
	{
		Iterator<Student> it = students.iterator();
		while(it.hasNext())
		{
			it.next().setCrs("all");
		}
		
		Collections.shuffle(students);
		
		String display = "";
		
		int count = 1;
		
		for (int i  = 0 ; i <students.size(); i++)
		{
			display += "#"+count +" "+ students.get(i).getName()+ "\n";
			count++;
		}
		
		JOptionPane.showMessageDialog( null,display);
	}
	public void reverseAll()
	{
		Iterator<Student> it = students.iterator();
		while(it.hasNext())
		{
			it.next().setCrs("all");
		}
		
		Collections.reverse(students);
		
		String display = "";
		
		int count = 1;
		
		for (int i  = 0 ; i <students.size(); i++)
		{
			display += "#"+count +" "+ students.get(i).getName()+ "\n";
			count++;
		}
		
		JOptionPane.showMessageDialog( null,display);
	}
}
