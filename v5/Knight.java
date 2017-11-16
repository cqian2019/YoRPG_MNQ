public class Knight extends Protagonist{

	public Knight(String str){
		name = str;
	}
    public static String about() {
	return "The courageous Knight is a strong, chivalrous fighter whose veins run with\nnoble blood. After spending countless years training for the purpose of \nserving you well on the battlefield, he's become a formidable opponent to\n any Monster that may exist. He still lacks real-world battle experience, \nthough, so proceed with caution.\n";
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
    
