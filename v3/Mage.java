public class Mage extends Protagonist{

	public Mage(String str){
		name = str;
	}
    public String about() {
	return "The quick-witted and deceitful Mage has the brains over any Monster's brawn. He's a battle veteran, and knows his enemies well. After suffering through his master, the Great Mage's training, he can predict their attacks before they're dealt, though due to his cautious nature he prefers tiring out his enemies before making a move.";
	    }
    public void setAtt() {
	defense += 20;
	    }
}
    
