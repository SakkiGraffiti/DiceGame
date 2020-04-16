package lab.test.mockup;

public class Goldplayer extends Player 
{	
	private Die anotherDie;
	
	public Goldplayer()
	{
		this.setIdNum(0);
	}

	public Goldplayer(int IDNum) 
	{
		this.setIdNum(IDNum);
	}
	
	public Die getOtherDie () {
		
		return this.anotherDie;
	}
	
	public boolean win()
	{
		Die fd = this.getFirstDie();
		if (fd.getNumber() == 6 || this.anotherDie.getNumber() == 6 || this.anotherDie.getNumber() == this.fd.getNumber() || this.anotherDie.getNumber() + this.fd.getNumber() > 9)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}
