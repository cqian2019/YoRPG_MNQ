/**********************************************
* Team MSQ - Tim Marder, Bill Ni, Cheryl Qian *
* Tim Marder                                  *
* APCS1 pd02                                  *
* HW#28 -- Ye Olde Role Playing Game          *
* 2017-11-08                                  *
**********************************************/

public abstract class Protagonist extends Character{
	
    //Attributes:
    protected String name;
		
    //Default Constructor:
    public Protagonist() {
	name = "";
	health = 250;
	strength = 100;
	defense = 40;
	attRating = 0.6;
    }
		
		
    //Overloaded Constructor:
    public Protagonist(String n) {
	this();
	name = n; //Sets the chosen name as the value of the name variable
    }

    //Accessor for getting the name of the protagonist 
    public String getName() {
	return name;
    }

    //Method for protagonist's special attack mode
    public abstract void specialize();
		
		
    //Method for returning to protagonist's regular mode
    public abstract void normalize();

    public static void defPot() {
	defense += 20;
    }

    public static void attPot() {
	attRating += 0.5;
    }

    public static void hpPot() {
	health += 50;
    }
}
