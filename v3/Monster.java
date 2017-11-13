/**********************************************
* Team MSQ - Tim Marder, Bill Ni, Cheryl Qian *
* Tim Marder                                  *
* APCS1 pd02                                  *
* HW#28 -- Ye Olde Role Playing Game          *
* 2017-11-08                                  *
**********************************************/

public class Monster extends Character{
		
		//Default Constructor:
		public Monster() {
			health = 150;
			strength = (int)((Math.random() * 45) + 20); //Sets strength of monster 20-65 at random
			defense = 20;
			attRating = 0.8;
		}
}