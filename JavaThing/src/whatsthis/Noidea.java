package whatsthis;

import java.util.Scanner;

// import java.lang.Byte;

public class Noidea{

	private static Scanner	user_input;

	public static void main(String[] args) {
		// System.out.println("Git is awesome");
		Randnum rn = new Randnum();
		Battlemath bm = new Battlemath();
		double crt = Battlemath.getDamageCrit();
		System.out.println(crt);
		Scanner user_input = new Scanner(System.in);

		System.out
				.println("Adventurer! \n What grandiose days are these that a call to arms hath come across thine days. "
						+ "\n To venture forth upon the wildlands and meet many a strange new creature; and murder them. "
						+ "\n Pray tell, what is thine name?");
		String hn;
		hn = user_input.next();

		System.out
				.println("Dost thou, having thine name of "
						+ hn
						+ ", hast a preferred school of murderous arts? Mage or perchance Warrior?");

		String jobz;
		jobz = user_input.next();

		int hl;
		int mg;
		int st;
		String lol;
		if (jobz.equals("Mage") || jobz.equals("mage")) {
			hl = 35;
			mg = 100;
			st = 10;
			lol = "magerrific";
		} else {
			hl = 85;
			mg = 10;
			st = 11;
			lol = "warriorlicious";
		}

		/*
		 * Make a Hero Object
		 */
		Hero herro = new Hero(hn, hl, mg, st);

		/*
		 * Make some variables easier to read
		 */
		int health = herro.getHealth();
		int mana = herro.getMana();
		int strength = herro.getStrength();
		String gr8 = herro.getGreatness();
		String myheroname = herro.getName();
		int monsterh = 200;

		System.out.println("----------------------------------");
		System.out.println("Greetings, " + myheroname + ". The " + gr8);
		System.out.println("You have: " + health + " health and " + mana
				+ " mana. Your strength is level: " + strength);
		System.out.println("----------------------------------");

		while (health > 0) {
			// System.out.println(rndNum);
			// System.out.println(rndNum);
			int ii = rn.getRandNum();

			// System.out.println(health);
			System.out.println("Attack? 'A' or Heal? 'H'");
			String action;
			action = user_input.next();

			if (action.equals("A") || action.equals("a")) {
				// System.out.println("KILL!");
				// System.out.println("You've done " + ii + " damage!");
				monsterh -= ii;
				String text = String
						.format("The Monster has sustained %d damage and now has %d health.", ii, monsterh);
				System.out.println(text);
			} else {
				health += ii;
				String text = String
						.format("Your health has gone up by: %d and is now: %d", ii, health);
				System.out.println(text);
				// System.out.println("cower..");
			}
		}
		System.out.println("!!!-------------------->DEATH!!!");
	}
}
