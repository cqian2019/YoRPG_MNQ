import java.io.*;
import java.util.*;

public class Store {
    
    
    private static InputStreamReader isr = new InputStreamReader( System.in );
    private static BufferedReader in = new BufferedReader( isr );
    
    public static void run() {
	
        int i = 0;
	String s = "";
        Protagonist p = YoRPG.getP();
	if ( p.coin > 4 ) {
	
	System.out.println("~~~Welcome to the MNQ Store~~~" +
			   "\nOur products are dedicated to the prevention of death.\n" + "\n---ITEMS---\n" +
			   "(5 COINS) DEFENSE POTION:\n Increases your defense by 20.\n" +
			   "(7 COINS) ATTACK POTION:\n Increases your attack rating by 0.5.\n" +
			   "(10 COINS) HEALTH POTION:\n Increases your HP by 50."
			   );
	    System.out.println("What would you like to purchase?\n" +
			       "\t1. DEF POTION\n\t2. ATT POTION\n\t3. HP POTION\n\t4. Take me back." +
			       "\nSelect: ");
	try {
	    i = Integer.parseInt(in.readLine()); }
	catch ( IOException e ) {};

	if ( i == 1) {
	    System.out.println("You have purchased a DEF POT.");
	    p.defPotNum += 1;
	    p.coin -= 5;
	}
	else if ( i == 2 ) {
	    System.out.println("You have purchased an ATT POT.");
	    p.attPotNum += 1;
	    p.coin -= 7;
	}
	else if ( i == 3 ) {
	    System.out.println("You have purchased an HP POT.");
	    p.hpPotNum += 1;
	    p.coin -= 10;
	}

	else if ( i == 4 ) {}

	System.out.println("Anything else?\nSelect (y/n): ");
	try {
	    s = in.readLine(); }
	catch ( IOException e ) {};



        if (s.equals("y") && p.coin < 5 ) {	System.out.println("You don't have enough coins. See you next time!\nExiting store...");}
	
	else if (s.equals("y")) {
	    Store.run();
	}
	
	else if ( s.equals("n")) {
	    System.out.println("See you next time!");
	}
	}

    }
}


	
	
	    
	
	    
			   
