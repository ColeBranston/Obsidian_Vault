package lab02;

public class lab05_BestStudentAward extends lab05_Scholarship {

	@Override
	double getWinner(Student[] std, lab05_Course crs) {
		double best = 0;
		
		for(int i = 0; i < std.length; i++)
		{
			if(std[i].RC.findBest(crs) > best)
			{
				best = std[i].RC.findBest(crs);
				this.setName(std[i].getName());
				this.setValue((int)(best/4));
				this.setWinner(std[i].getID());
			}	
		}
		return best;
	}
	public String toString()
	{
		return this.getName() + "(" + this.getWinner() + ") scored the best average grade with: "+this.getValue();
		
	}

}
