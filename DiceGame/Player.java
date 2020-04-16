package lab.test.mockup;

public class Player 
{
	private int IDNumber;
	private Die firstDie;

	public Player() 
	{
		this.IDNumber = 0;
	}

	public Player(int IDNum) 
	{
		this.IDNumber = IDNum;
	}
  
	public void setIdNum (int IDNum) 
	{
		this.IDNumber = IDNum;
 	}

	public int getIDNumber() 
	{
		return this.IDNumber;
	}

	public Die getFirstDie() 
	{
		return firstDie;
	}
	
	public void roll()
	{
		this.firstDie.roll();
		System.out.println(this.firstDie.getNumber());
	}
	
	public boolean win()
	{
		if (this.firstDie.getNumber() == 6)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
}