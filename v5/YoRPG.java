/**********************************************
 * Team MSQ - Tim Marder, Bill Ni, Cheryl Qian *
 * Tim Marder                                  *
 * APCS1 pd02                                  *
 * HW#28 -- Ye Olde Role Playing Game          *
 * 2017-11-08                                  *
 **********************************************/

/**********************************************
 * class YoRPG -- Driver file for Ye Olde Role Playing Game.
 * Simulates monster encounters of a wandering adventurer.
 * Required classes: Protagonist, Monster
 **********************************************/


import java.io.*;
import java.util.*;

public class YoRPG {
    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

    //change this constant to set number of encounters in a game
    public final static int MAX_ENCOUNTERS = 5;

    //each round, a Protagonist and a Monster will be instantiated...
    public static Protagonist pat;   //Is it man or woman?
    private Monster smaug; //Friendly generic monster name?

    private int moveCount;
    private boolean gameOver;
    private int difficulty;
    private int type;
    private int choice;

    private InputStreamReader isr;
    private BufferedReader in;
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
    public YoRPG()
    {
	moveCount = 0;
	gameOver = false;
	isr = new InputStreamReader( System.in );
	in = new BufferedReader( isr );
	newGame();
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~

    /*=============================================
      void newGame() -- gathers info to begin a new game
      pre:  
      post: according to user input, modifies instance var for difficulty 
      and instantiates a Protagonist
      =============================================*/

    public static Protagonist getP() {
	return pat;
    }
    
    public void newGame()
    {
	String s;
	String name = "";
	s = "~~~ Welcome to Ye Olde RPG! ~~~\n";

	s += "\nChoose your difficulty: \n";
	s += "\t1: Easy\n";
	s += "\t2: Not so easy\n";
	s += "\t3: Beowulf hath nothing on me. Bring it on.\n";
	s += "\nSelection: ";
	System.out.print( s );

	try {
	    difficulty = Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }

	s = "\nIntrepid protagonist, what doth thy call thyself? (State your name): ";
	System.out.print( s );

	try {
	    name = in.readLine();
	}
	catch ( IOException e ) { }

	s = "";

	s += "\nChoose your hero type: \n";
	s += "\n\t1: Knight\n";
	s += Knight.about() + "\n";
	s += "\t2: Mage\n";
	s += Mage.about() + "\n";
	s += "\t3: Archer\n";
	s += Archer.about() + "\n";
	s += "Selection: ";
	System.out.print( s );

	try {
	    type = Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }

	if (type == 1){
	    pat = new Knight(name);
	    ((Knight)pat).setAtt();
	} else if (type == 2) {
	    pat = new Mage(name);
	    ((Mage)pat).setAtt();
	} else if (type == 3) {
	    pat = new Archer(name);
	    ((Archer)pat).setAtt();
	}

    }//end newGame()

    public void visitStore() {
	    System.out.println("Visit store?\n\t1. Yes\n\t2. No");
	try {
	    choice = Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }

	if ( choice == 1 ) {
	    Store.run();
	}
    }


    /*=============================================
      boolean playTurn -- simulates a round of combat
      pre:  Protagonist pat has been initialized
      post: Returns true if player wins (monster dies).
      Returns false if monster wins (player dies).
      =============================================*/
    public boolean playTurn()
    {
	int i = 1;
	int d1, d2;

	if ( Math.random() >= ( difficulty / 3.0 ) )
	    System.out.println( "\nNothing to see here. Move along!" );
	else {
	    System.out.println( "\nLo, yonder monster approacheth!" );

	    if (difficulty == 3){
		smaug = new Dragon();
		((Dragon)smaug).setAtt();
		System.out.println(Dragon.about());
	    }else if (difficulty == 2){
		smaug = new Giant();
		((Giant)smaug).setAtt();
		System.out.println(Giant.about());
	    }else{
		smaug = new Dog();
		((Dog)smaug).setAtt();
		System.out.println(Dog.about());
	    }

	    while( smaug.isAlive() && pat.isAlive() ) {

		// Give user the option of using a special attack:
		// If you land a hit, you incur greater damage,
		// ...but if you get hit, you take more damage.
		try {
		    System.out.println( "\nDo you feel lucky?" );
		    System.out.println( "\t1: Nay.\n\t2: Aye!" );
		    i = Integer.parseInt( in.readLine() );
		}
		catch ( IOException e ) { }

		if ( i == 2 )
		    pat.specialize();
		else
		    pat.normalize();

		d1 = pat.attack( smaug );
		d2 = smaug.attack( pat );

		System.out.println( "\n" + pat.getName() + " dealt " + d1 +
				    " points of damage.");

		System.out.println( "\n" + "Ye Olde Monster smacked " + pat.getName() +
				    " for " + d2 + " points of damage.");
	    }//end while

	    //option 1: you & the monster perish
	    if ( !smaug.isAlive() && !pat.isAlive() ) {
		System.out.println( "'Twas an epic battle, to be sure...\n" + 
				    "You cut ye olde monster down, but\n " +
				    "with its dying breath ye olde monster.\n " +
				    "laid a fatal blow upon thy skull.\n" +
				    "You see something glint. The monster dropped 5 coins." +
				    "\nYou have a total of " + pat.coin + " coins.\n");
		visitStore();
		return false;
	    }
	    //option 2: you slay the beast
	    else if ( !smaug.isAlive() ) {
		pat.coin += 10;
		System.out.print( "HuzzaaH! Ye olde monster hath been slain!\n" +
				  " You see something glint. The monster dropped 10 coins." +
				  "\nYou have a total of " + pat.coin + " coins. ");
		visitStore();
		return true;
	    }
	    //option 3: the beast slays you
	    else if ( !pat.isAlive() ) {
		System.out.print("Ye olde self hath expired. You got dead.\n" +
				 "You're dead, but you still have " + pat.coin
				 + " coins.");
		visitStore();
		return false;}
	
	}
	return true;
	
    }
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


public static void main( String[] args )
{
    //As usual, move the begin-comment bar down as you progressively 
    //test each new bit of functionality...

    //loading...
    YoRPG game = new YoRPG();

    int encounters = 0;

    while( encounters < MAX_ENCOUNTERS ) {
	if ( !game.playTurn() )
	    break;
	encounters++;
	System.out.println();
    }
    System.out.println( "Thy game doth be over.");
    

}//end main
}




