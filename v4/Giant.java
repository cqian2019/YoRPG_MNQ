public class Giant extends Monster{

    public String about() {
	return "A very ugly giant, probably with some troll blood in him. He's at least 15 feet tall, and lumbers around aimlessly with a giant bat. He seems eager to use it on unsuspecting visitors to his lair. Should you challenge him?";
	    }
    public void setAtt() {
        health += 50;
	strength += 20;
	attRating += 0.4;
	    }
}
    

