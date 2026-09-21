package lab02;
import java.lang.String;


public class Student implements Comparable<Student>
{
	private String name;
	private int ID;
	public lab05_ReportCard RC;
	public String crs;
	
	public Student()
	{
		RC = new lab05_ReportCard();
		name = " ";
		ID =0;
	}
	//member function to set name
	public void setName(String Name)
	{
		name = Name;
	}
	//member function to set ID
	public void setID(int ID)
	{
		this.ID = ID;
	}
	
	public String getName()
	{
		return name;
	}
	public int getID()
	{
		return ID;
	}
	public String toString()
	{
		return name + " " + ID;
	}
	public void setCrs(String course)
	{
		crs =course;
	}
	public int compareTo(Student o) 
	{
		// TODO Auto-generated method stub
		
		if(crs == "all")
		{
			int thisHigh = 0;
			int thisBest = 0;
			int compareHigh = 0;
			int compareBest = 0;
			
			for(int i =0 ; i < this.RC.courseList.size(); i++)
			{
				if(this.RC.findBest(this.RC.courseList.get(i)) > thisHigh)
				{
					thisHigh = this.RC.findBest(this.RC.courseList.get(i));
				}
				
				if(this.RC.findHighest(this.RC.courseList.get(i)) > thisBest)
				{
					thisBest = this.RC.findHighest(this.RC.courseList.get(i));
				}
			}
			for(int i =0 ; i < o.RC.courseList.size(); i++)
			{
				if(o.RC.findBest(o.RC.courseList.get(i)) > thisHigh)
				{
					compareHigh = o.RC.findBest(o.RC.courseList.get(i));
				}
				if(o.RC.findHighest(o.RC.courseList.get(i)) > thisBest)
				{
					thisBest = o.RC.findHighest(o.RC.courseList.get(i));
				}
			}
			
			if(thisHigh < compareHigh)
				return 1;
			else if(thisHigh == compareHigh)
			{
				if(this.RC.numOfCourse < o.RC.numOfCourse)
					return 1;
				else if(this.RC.numOfCourse == o.RC.numOfCourse)
				{
					if(thisBest < compareBest)
						return 1;
					else if(thisBest == compareBest)
						return 0;
					else if(thisBest > compareBest)
						return -1;
				}
				else if(this.RC.numOfCourse > o.RC.numOfCourse)
					return -1;
			}
			else if(thisHigh > compareHigh)
				return 0;
		}
		
		
		if(this.RC.findBestcrs(this.crs) < o.RC.findBestcrs(o.crs))
		{
			return 1;
		}
		else if(this.RC.findBestcrs(this.crs) == o.RC.findBestcrs(o.crs))
		{
			if(this.RC.numOfCourse < o.RC.numOfCourse)
				return 1;
			else if(this.RC.numOfCourse == o.RC.numOfCourse)
			{
				if(this.RC.findBestcrs(this.crs) < o.RC.findHighestcrs(o.crs))
					return 1;
				else if(this.RC.findBestcrs(this.crs) == o.RC.findHighestcrs(o.crs))
					return 0;
				else if((this.RC.findBestcrs(this.crs) > o.RC.findHighestcrs(o.crs)))
					return -1;
			}
			else if(this.RC.numOfCourse > o.RC.numOfCourse)
				return -1;
		}
		else if(this.RC.findBestcrs(this.crs) > o.RC.findBestcrs(o.crs))
		{
			return -1;
		}
		
		return 0;
		
	}

}
