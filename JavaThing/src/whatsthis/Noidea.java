package whatsthis;

import java.util.Scanner;

// import java.lang.Byte;

public class Noidea{

	private static Scanner	user_input;

	public static void main(String[] args) {

		Randnum rn = new Randnum();

		WeaponMath bm = new WeaponMath("Sword", 12, 21, 2.526);
		double crt = bm.getDamageCritRND();
		double avg = bm.getDamageAvg();
		int high = bm.getDamageHigh();
		int low = bm.getDamageLow();
		double mod = bm.getDamageMod();
		double norm = bm.getDamageNormRND();
		String name = bm.getWeaponName();
		System.out.println("Name:	"+name);	
		System.out.println("---------------");
		System.out.println("HIGH:	"+high);
		System.out.println("low:	"+low);
		System.out.println("---------------");
		System.out.println("Mod:	"+mod);
		System.out.println("Avg:	"+avg);
		System.out.println("---------------");
		System.out.println("RNDCrit:"+crt);
		System.out.println("RNDNorm:"+norm);
		
		int dice;
		double critchance = 42.8;
		double supercritchance = 21.8;
		dice = rn.getRandNum2(0, 1000);
		
		if (dice <= supercritchance*10) {
			System.out.println(dice);
			System.out.println("SUPER CRITICAL!" + crt);
		}else if(dice <= critchance*10 ){
			System.out.println(dice);
			System.out.println("YOU CRIT FOR:" + norm);
		}else{
			System.out.println(dice);
			System.out.println("Normal Damage For:" + norm);
		}

/*		Scanner user_input = new Scanner(System.in);

		System.out
				.println("Adventurer! \n What grandiose days are these that a call to arms hath come across thine lands. "
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

		
		 * Make a Hero Object
		 
		Hero herro = new Hero(hn, hl, mg, st);

		
		 * Make some variables easier to read
		 
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
		System.out.println("!!!-------------------->DEATH!!!");*/
	}
}
