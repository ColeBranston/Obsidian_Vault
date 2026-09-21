package lab02;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class lab05_GUImanager
{
	public lab05_Department myDepartment = new lab05_Department();
	
	private JButton butt;
	
	public lab05_GUImanager() throws Exception
	{
		
		
		JFrame frame = new JFrame("Lab04_GUI_Frame");
		frame.setSize(500, 400);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pan = new JPanel();
		frame.add(pan);
		pan.setLayout(new GridLayout(0,2));
		
		JButton [] button = new JButton[9];
		button[0] = new JButton("Print List of Students");
		button[1] = new JButton("Print List of Courses");
		button[2] = new JButton("Add Student to a Course");
		button[3] = new JButton("Remove Student from a course");
		button[4] = new JButton("Print list of students from a course");
		button[5] = new JButton("Generate Report Card");
		button[6] = new JButton("Validate files");
		button[7] = new JButton("Sort/Shuffle/Reverse");
		button[8] = new JButton("Letter Grade");
		butt = new JButton("Award Scholarship");
		butt.setVisible(false);
		
		Listener listener = new Listener();
		
		button[0].addActionListener(listener);
		button[1].addActionListener(listener);
		button[2].addActionListener(listener);
		button[3].addActionListener(listener);
		button[4].addActionListener(listener);
		button[5].addActionListener(listener);
		butt.addActionListener(listener);
		button[6].addActionListener(listener);
		button[7].addActionListener(listener);
		button[8].addActionListener(listener);
		
		pan.add(button[0]);
		pan.add(button[1]);
		pan.add(button[2]);
		pan.add(button[3]);
		pan.add(button[4]);
		pan.add(button[5]);
		pan.add(butt);
		pan.add(button[6]);
		pan.add(button[7]);
		pan.add(button[8]);
		frame.revalidate();
	}
	
	
	
	class Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			boolean valid = true;
			
			if(e.getActionCommand() == "Print List of Students")
				myDepartment.printStudents();
			if(e.getActionCommand() == "Print List of Courses")
				myDepartment.printCourses();
			if(e.getActionCommand() == "Add Student to a Course")
				do{
					valid = true;
					try {
						myDepartment.addStudent();
					} catch (lab05_CourseNotFoundException e1) {
						// TODO Auto-generated catch block
						valid = false;
						JOptionPane.showMessageDialog( null,"Invalid course Entered!","Course Not Found",JOptionPane.
								INFORMATION_MESSAGE);
					}
				}while(valid == false);
			if(e.getActionCommand() == "Remove Student from a course")
				do{
					valid = true;
					try {
						myDepartment.dropStudent();
					} catch (lab05_CourseNotFoundException ex) {
						valid = false;
						JOptionPane.showMessageDialog( null,"Invalid course Entered!","Course Not Found",JOptionPane.
								INFORMATION_MESSAGE);
					
					}
					catch(NullPointerException e2)
					{

					}
					catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}while(valid == false);
			if(e.getActionCommand() == "Print list of students from a course")
				try {
					myDepartment.Print();
				} catch (Exception e1) {
					JOptionPane.showMessageDialog( null,"Invalid course Entered!","Course Not Found",JOptionPane.
							INFORMATION_MESSAGE);
				}
			if(e.getActionCommand() == "Generate Report Card")
			{
				myDepartment.generateReport();
				butt.setVisible(true);
			}
			if(e.getActionCommand() == "Award Scholarship")
				try {
					myDepartment.award();
				} catch (lab05_CourseNotFoundException e1) {
					JOptionPane.showMessageDialog( null,"Invalid course Entered!","Course Not Found",JOptionPane.
							INFORMATION_MESSAGE);
				}
			if(e.getActionCommand() == "Validate files")
			{
				try{
					myDepartment.readFile();
				}
				catch(Exception ex)
				{
					
				}
			}
			if(e.getActionCommand() == "Sort/Shuffle/Reverse")
			{
				myDepartment.Shuffler();
			}
			if(e.getActionCommand() == "Letter Grade")
			{
				LetterGrade letter = new LetterGrade();
			}
	    }
	}
	
	public static void main(String[] args) throws Exception
	{
		
		lab05_GUImanager GUI = new lab05_GUImanager();
	}
}



