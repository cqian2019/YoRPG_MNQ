/**********************************************
* Team MSQ - Tim Marder, Bill Ni, Cheryl Qian *
* Tim Marder                                  *
* APCS1 pd02                                  *
* HW#28 -- Ye Olde Role Playing Game          *
* 2017-11-08                                  *
**********************************************/

public class Protagonist extends Character{
	
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
		public void specialize() {
			attRating = attRating + 0.4;
			defense = defense - 20;
		}
		
		
		//Method for returning to protagonist's regular mode
		public void normalize() {
			attRating = 0.6; //default attack rating
			defense = 40;    //default defense value
		}
}