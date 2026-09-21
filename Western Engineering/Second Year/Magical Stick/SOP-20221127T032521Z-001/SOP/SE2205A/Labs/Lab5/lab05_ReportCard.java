package lab02;

import java.util.*;

public class lab05_ReportCard
{
	List<lab05_Course> courseList = new LinkedList<lab05_Course>();
	
	int [][] grade;
	int numOfCourse = 0;
	int numGrades = 4;
	boolean generate = false;
	public lab05_ReportCard()
	{
		numOfCourse = 0;
	}
	public void add(lab05_Course course)
	{
		if(generate == false)
		{
			courseList.add(course);
			numOfCourse++;
		}
		
		/*for(int i = 0; i <4; i++)
		{
			grade[numOfCourse][i] = (int)(Math.random()*100 +1);
		}*/
		
	}
	public void generate()
	{
		if(generate == false)
		{
			grade = new int[numOfCourse][4];
			
			for(int i = 0; i <grade.length; i++)
			{
				for(int j = 0; j < grade[i].length; j++)
				{
					grade[i][j] = (int)(Math.random()*100 +1);
				}
			}
		}
		generate = true;
	}
	public String display()
	{
		if(numOfCourse == 0)
			return null;;
		
		String display = "";
		
		Iterator<lab05_Course> it = courseList.iterator();
		int count = 0;
		
		while(it.hasNext())
		{
			display += "[" + it.next().getName()+ "]" + "[ ";
			
			for(int i = 0; i < 4; i++)
			{
				display += grade[count][i] + ", ";
			}
			display += "]\n";
			count ++;
		}
		display += "\n";
		return display;
	}
	public int findHighest(lab05_Course crs)
	{
		//finds highest single mark
		Iterator<lab05_Course> it = courseList.iterator();
		int count = 0;
		int highest = 0;
		
		while(it.hasNext())
		{
			if(it.next().getName() == crs.getName())
			{
				break;
			}
			count++;
		}
		if(count < numOfCourse)
		{
			for(int i = 0; i < 4; i++)
			{
				if(grade[count][i] > highest)
				{
					highest = grade[count][i];
				}
			}
		}
		
		return highest;
		
	}
	public int findBest(lab05_Course crs)
	{
		//finds best average
		Iterator<lab05_Course> it = courseList.iterator();
		int count = 0;
		int best = 0;
		
		while(it.hasNext())
		{
			if(it.next().getName() == crs.getName())
			{
				break;
			}
			count++;
		}
		if(count < numOfCourse)
		{
			for(int i = 0; i < 4; i++)
			{
				
				best += grade[count][i];

			}
		}
		
		return best;
		
	}
	public int findHighestcrs(String crs)
	{
		//finds highest single mark
		Iterator<lab05_Course> it = courseList.iterator();
		int count = 0;
		int highest = 0;
		
		while(it.hasNext())
		{
			if(it.next().getName() == crs)
			{
				break;
			}
			count++;
		}
		if(count < numOfCourse)
		{
			for(int i = 0; i < 4; i++)
			{
				if(grade[count][i] > highest)
				{
					highest = grade[count][i];
				}
			}
		}
		
		return highest;
		
	}
	public int findBestcrs(String crs)
	{
		//finds best average
		Iterator<lab05_Course> it = courseList.iterator();
		int count = 0;
		int best = 0;
		
		while(it.hasNext())
		{
			if(it.next().getName() == crs)
			{
				break;
			}
			count++;
		}
		if(count < numOfCourse)
		{
			for(int i = 0; i < 4; i++)
			{
				
				best += grade[count][i];

			}
		}
		
		return best;
		
	}
}

