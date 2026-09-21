package lab02;

public class lab05_HighestMarkAward extends lab05_Scholarship
{
	public lab05_HighestMarkAward()
	{
		super();
	}
	@Override
	double getWinner(Student[] std, lab05_Course crs)
	{
		int highest = 0;
		
		for(int i = 0; i < std.length; i++)
		{
			if(std[i].RC.findHighest(crs) > highest)
			{
				highest = std[i].RC.findHighest(crs);
				this.setName(std[i].getName());
				this.setValue(highest);
				this.setWinner(std[i].getID());
			}	
		}
		return highest;
	}
	
	public String toString()
	{
		return this.getName() + "(" + this.getWinner() + ") scored the highest grade with: "+this.getValue();
		
	}
}
