package whatsthis;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// import java.lang.Byte;

public class Noidea{

	private static Scanner	user_input;

	public static void main(String[] args) {

		Randnum rn = new Randnum();

		Weapon bm = new Weapon("Sword", 12, 21, 1.526, 3.0);
		double crt = bm.getDamageCritRND();
		double scrt = bm.getDamageSupCritRND();
		double avg = bm.getDamageAvg();
		int high = bm.getDamageHigh();
		int low = bm.getDamageLow();
		double mod = bm.getDamageMod();
		double norm = bm.getDamageNormRND();
		String name = bm.getWeaponName();
		System.out.println("Name:	" + name);
		System.out.println("---------------");
		System.out.println("HIGH:	" + high);
		System.out.println("low:	" + low);
		System.out.println("---------------");
		System.out.println("Mod:	" + mod);
		System.out.println("Avg:	" + avg);
		System.out.println("---------------");
		System.out.println("RNDCrit:" + crt);
		System.out.println("RNDNorm:" + norm);

		int dice;
		int dice2;
		int dicesides = 1000;
		double misschance = 25.0;
		double critchance = 50.0;
		double supercritchance = 25.0;
		dice = rn.getRandNum2(0, dicesides);
		dice2 = rn.getRandNum2(0, dicesides);

		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("outfilename"));
			out.write("aStfdgdding");
			out.close();
		} catch (IOException e) {
			System.out.println("Error: Unable to write to file.");
		}

		// System.out.println("DICE1:" + dice);
		// System.out.println("DICE2:" + dice2);

		/*
		 * Damage method #2.
		 * In order to crit you must first succeffully roll a hit.
		 * When a hit is successful, a second roll will determine if
		 * the hit is a normal hit or a critical hit.
		 */
		if (dice <= misschance * 10) {
			System.out.println("Dice1 Rolled: " + dice);
			System.out.println("YOU MISSED :|");
		} else if (dice < (dicesides - misschance * 10)) {
			if (dice2 <= critchance * 10) {
				System.out.println("Dice1 Rolled: " + dice);
				System.out.println("Dice2 Rolled: " + dice2);
				System.out.println("YOU CRIT FOR: " + crt);
			} else {
				System.out.println("Dice1 Rolled: " + dice);
				System.out.println("Dice2 Rolled: " + dice2);
				System.out.println("YOU HIT! " + norm);
			}
		} else {
			System.out.println("Dice1 Rolled: " + dice);
			System.out.println("WTF " + norm);
		}

		/*
		 * Damage method #1.
		 * Simple damage method. One roll determines if a roll is
		 * a hit, miss or critical hit.
		 */

		/*
		 * if (dice >= (1000 - misschance * 10)) {
		 * System.out.println(dice);
		 * System.out.println("YOU MISSED :|");
		 * } else if (dice <= supercritchance * 10) {
		 * System.out.println(dice);
		 * System.out.println("SUPER CRITICAL! " + scrt);
		 * } else if (dice <= critchance * 10) {
		 * System.out.println(dice);
		 * System.out.println("YOU CRIT FOR: " + crt);
		 * } else {
		 * System.out.println(dice);
		 * System.out.println("Normal Damage For: " + norm);
		 * }
		 */

		/*
		 * Scanner user_input = new Scanner(System.in);
		 * System.out
		 * .println(
		 * "Adventurer! \n What grandiose days are these that a call to arms hath come across thine lands. "
		 * +
		 * "\n To venture forth upon the wildlands and meet many a strange new creature; and murder them. "
		 * + "\n Pray tell, what is thine name?");
		 * String hn;
		 * hn = user_input.next();
		 * System.out
		 * .println("Dost thou, having thine name of "
		 * + hn
		 * +
		 * ", hast a preferred school of murderous arts? Mage or perchance Warrior?"
		 * );
		 * String jobz;
		 * jobz = user_input.next();
		 * int hl;
		 * int mg;
		 * int st;
		 * String lol;
		 * if (jobz.equals("Mage") || jobz.equals("mage")) {
		 * hl = 35;
		 * mg = 100;
		 * st = 10;
		 * lol = "magerrific";
		 * } else {
		 * hl = 85;
		 * mg = 10;
		 * st = 11;
		 * lol = "warriorlicious";
		 * }
		 * Make a Hero Object
		 * Hero herro = new Hero(hn, hl, mg, st);
		 * Make some variables easier to read
		 * int health = herro.getHealth();
		 * int mana = herro.getMana();
		 * int strength = herro.getStrength();
		 * String gr8 = herro.getGreatness();
		 * String myheroname = herro.getName();
		 * int monsterh = 200;
		 * System.out.println("----------------------------------");
		 * System.out.println("Greetings, " + myheroname + ". The " + gr8);
		 * System.out.println("You have: " + health + " health and " + mana
		 * + " mana. Your strength is level: " + strength);
		 * System.out.println("----------------------------------");
		 * while (health > 0) {
		 * // System.out.println(rndNum);
		 * // System.out.println(rndNum);
		 * int ii = rn.getRandNum();
		 * // System.out.println(health);
		 * System.out.println("Attack? 'A' or Heal? 'H'");
		 * String action;
		 * action = user_input.next();
		 * if (action.equals("A") || action.equals("a")) {
		 * // System.out.println("KILL!");
		 * // System.out.println("You've done " + ii + " damage!");
		 * monsterh -= ii;
		 * String text = String
		 * .format("The Monster has sustained %d damage and now has %d health."
		 * , ii, monsterh);
		 * System.out.println(text);
		 * } else {
		 * health += ii;
		 * String text = String
		 * .format("Your health has gone up by: %d and is now: %d", ii,
		 * health);
		 * System.out.println(text);
		 * // System.out.println("cower..");
		 * }
		 * }
		 * System.out.println("!!!-------------------->DEATH!!!");
		 */
	}
}
