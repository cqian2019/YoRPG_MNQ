public class Character{

		public int health;
		public int strength;
		public int defense;
		public double attRating;

		public boolean isAlive(){
			return (health > 0);
		}

		public int getDefense(){
			return defense;
		}

		public void lowerHP(int lwrAmt){
			health -= lwrAmt;
		}

		public int attack(Character targetChar) {
			int damage = (int)((strength * attRating) - targetChar.getDefense());
			targetChar.lowerHP(damage);
			return damage;
		}
}