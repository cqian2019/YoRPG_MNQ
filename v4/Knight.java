public class Knight extends Protagonist{

	public Knight(String str){
		name = str;
	}
    public static String about() {
	return "The courageous Knight is a strong, chivalrous fighter whose veins run with noble blood. After spending countless years training for the purpose of serving you well on the battlefield, he's become a formidable opponent to any Monster that may exist. He still lacks real-world battle experience, though, so proceed with caution.";
	    }

    public void normalize() {
	defense = 40;
	attRating = 0.6;	
    }

    public void specialize() {
	defense = 20;
	attRating = 0.9;
    }
    
    public void setAtt() {
	strength += 20;
	    }
}
    
