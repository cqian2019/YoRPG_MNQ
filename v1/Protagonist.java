/**********************************************
* Team MSQ - Tim Marder, Bill Ni, Cheryl Qian *
* Tim Marder                                  *
* APCS1 pd02                                  *
* HW#28 -- Ye Olde Role Playing Game          *
* 2017-11-08                                  *
**********************************************/

public class Protagonist {
	
		//Attributes:
		private String name;
		private int health;
		private int strength;
		private int defense;
		private double attRating;
		
		
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
		
		
		//Check to see if the character is still alive
		public boolean isAlive() {
			if (health <= 0) { //If Health drops to 0 or below
				return false;
			}
			else {
				return true;
			}
		}
		
		
		//Accessor for getting the defense of the protagonist
		public int getDefense() {
			return defense;
		}
		
		
		//Accessor for getting the name of the protagonist 
		public String getName() {
			return name;
		}
		
		
		//Method for taking damage
		public int lowerHP(int ouch) {
			health = health - ouch;
			return health;
		}
		
		
		//Method for attacking monsters
		public int attack(Monster monster) {
			int damage;
			damage = (int)((strength * attRating) - monster.getDefense());
			monster.lowerHP(damage); //Lowers HP of monster based on value of damage.
			return damage;
		}
		
		
		//Method for protagonist's special attack mode
		public void specialize() {
			attRating = attRating + 0.4;
			defense = defense - 20;
		}
		
		
		//Method for returning to protagonist's regular mode
		public void normalize() {
			attRating = 0.6; //default attack rating
			defense = 40;    //default defense value
		}
		
		
		//Main method for testing functionality
		public static void main(String[] args) {
		}
		
}