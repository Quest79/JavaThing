package whatsthis;

public class Hero {

	private String name;
	private int health;
	private int mana;
	private int strength;

	public Hero(String name, int health, int mana, int strength) {
		// System.out.println("Hero Construction Begins! The power... IS YOURS");
		this.name = name;
		this.health = health;
		this.mana = mana;
		this.strength = strength;
	}

	public void mailCheck() {
		System.out.println("Mailing a check to " + this.name + " "
				+ this.health);
	}

	public String toString() {
		return name + " " + health + " " + mana;
	}

	public String getName() {
		return name;
	}

	public String getGreatness() {
		if (strength < 10) {
			return "tiny.";
		} else if (strength == 10) {
			return "petite.";
		} else if (strength == 11) {
			return "small.";
		} else if (strength == 12) {
			return "average.";
		} else {
			return "healthy.";
		}
	}

	/*
	 * Lets set some methods to be able to get out heros current health and to
	 * set it to a new number if needed..
	 */
	public int getHealth() {
		return health;
	}

	public void setHealth(int newHealth) {
		health = newHealth;
	}

	/*
	 * Lets set some methods to be able to get out heros current mana and to set
	 * it to a new number if needed..
	 */
	public int getMana() {
		return mana;
	}

	public void setMana(int newHealth) {
		health = newHealth;
	}

	/*
	 * Lets set some methods to be able to get out heros current strength and to
	 * set it to a new number if needed..
	 */
	public int getStrength() {
		return strength;
	}

	public void setStrength(int newStrength) {
		strength = newStrength;
	}

}
