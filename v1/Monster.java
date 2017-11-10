/**********************************************
* Team MSQ - Tim Marder, Bill Ni, Cheryl Qian *
* Tim Marder                                  *
* APCS1 pd02                                  *
* HW#28 -- Ye Olde Role Playing Game          *
* 2017-11-08                                  *
**********************************************/

public class Monster {
	
		//Attributes:
		private int health;
		private int strength;
		private int defense;
		private double attRating;
		
		
		//Default Constructor:
		public Monster() {
			health = 150;
			strength = (int)((Math.random() * 45) + 20); //Sets strength of monster 20-65 at random
			defense = 20;
			attRating = 0.8;
		}
		
		
		//Checks to see if monster is still alive
		public boolean isAlive() {
			if (health <= 0) { //if health of monster drops to zero or below
				return false;
			}
			else {
				return true;
			}
		}
		
		
		//Accessor to get defense value of the monster
		public int getDefense() {
			return defense;
		}
		
		
		//Method for the monster taking damage.
		public int lowerHP(int ouch) {
			health = health - ouch;
			return health;
		}
		
		
		//Method for attacking the protagonist.
		public int attack(Protagonist protagonist) {
			int damage;
			damage = (int)((strength * attRating) - protagonist.getDefense());
			protagonist.lowerHP(damage); //lowers hp of protagonist based on value of damage.
			return damage;
		}
		
		
		//Main method to test functionality
		public static void main(String[] args) {
		}
		
}