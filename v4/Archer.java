public class Archer extends Protagonist{

	public Archer(String str){
		name = str;
	}
    public static String about() {
	return "The coolly level-headed Archer knows how to keep his calm on a battlefield. He deals his attacks strategically, and saves his arrows for when he can deal a near-fatal blow. His attacks are accurate, but are useless on the rare occasion he misses. He's also not a close combat fighter, so he's more vulnerable to unexpected attacks.";
	    }
    public void normalize() {
	defense = 40;
	attRating = 0.9;	
    }

    public void specialize() {
	defense = 20;
	attRating = 1.2;
    }
    public void setAtt() {
	strength += 10;
	attRating += 0.3;
	    }
}
    

