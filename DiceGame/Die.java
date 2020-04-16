package lab.test.mockup;

import java.util.Random;

public class Die {
	private int number;		// the number rolled by the die
	private Random rnd;
	public Die() {
		this.number = 1;
		this.rnd = new Random();
	}
	public int getNumber() {	// return the current die's number - ACCESSOR
		return this.number;
	}
	// *note no mutators used because we can only change the die's number through rolling the die*
	public void roll() {	// makes this die's rolled number be a random number from 1 to 6
		this.number = rnd.nextInt(6) + 1;
	}
}
