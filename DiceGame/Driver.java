package lab.test.mockup;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		char opt = 'Y';
		do {
			// create a player based on the super/parent class
			Player plyr = null;
			// get the id number of the current player
			int IDNum;
			System.out.print ("\n Please Enter Your ID Number: ");
			IDNum = inp.nextInt();
			// determine the type of player
			int typ;
			System.out.print (" What type of player are you? [1]Player or [2]Gold Player: ");
			typ = inp.nextInt();
			if (typ == 1) {
				plyr = new Player(IDNum);
			} else {
				plyr = new Goldplayer(IDNum);
			}
			// roll the die
			plyr.roll();
			// determine if the player won or not
			if (plyr.win()) {
				System.out.print (" You Won Yayyyy!\n");
			} else {
				System.out.print (" You Lost. Oh No!\n");
			}
			// display the rolls made by the player
			System.out.print ("Player #" + plyr.getIDNumber() + " rolled: " + plyr.getFirstDie().getNumber());
			if (typ != 1) System.out.print (" and " + ((Goldplayer)plyr).getOtherDie().getNumber());
			// ask if they want to play again
			System.out.print ("\n\n Do you wish to play again? [Y/N] ");
			String strOpt = inp.next();
			opt = strOpt.charAt(0);
		} while (opt == 'Y' || opt == 'y');
		inp.close();
		return;
	}

}
