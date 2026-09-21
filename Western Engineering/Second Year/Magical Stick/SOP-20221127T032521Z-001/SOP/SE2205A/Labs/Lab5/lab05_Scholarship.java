package lab02;

abstract class lab05_Scholarship
{
	private String name;
	private int value;
	private int winner;
	
	public lab05_Scholarship()
	{
		
	}
	public lab05_Scholarship(String name, int value, int winner)
	{
		this.name = name;
		this.value = value;
		this.winner = winner;
	}
	public String getName()
	{
		return this.name;
	}
	public int getValue()
	{
		return this.value;
	}
	public int getWinner()
	{
		return this.winner;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setValue(int value)
	{
		this.value = value;
	}
	public void setWinner(int ID)
	{
		this.winner = ID;
	}
	
	abstract double getWinner(Student [] std, lab05_Course crs);
}
