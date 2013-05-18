package whatsthis;

import java.util.Random;
import java.util.Scanner;

public class Noidea{
	
	private static Scanner user_input;

	public static void main(String[] args)
	{
		//System.out.println("Git is awesome");
		Randnum rn 			= new Randnum();
		Scanner user_input 	= new Scanner(System.in);
		
		System.out.println("Adventurer! \n What grandiose days are these that a call to arms hath come across thine days. " +
				"\n To venture forth upon the wildlands and meet many a strange new creature; and murder them. " +
				"\n Pray tell, what is thine name?");
		String hn;
		hn = user_input.next();
		
		System.out.println("Dost thou hast a preferred school of murderous arts, "+hn+"? Mage or perchance Warrior?");
		
		String jobz;
		jobz = user_input.next();
		
		if (jobz.equals("Mage") || jobz.equals("mage")){
			int hl = 35;
			int mg = 100;
			Hero herro = new Hero(hn, hl, mg);
			int health = herro.getHealth();
			int mana = herro.getMana();
			String myheroname = herro.getName();
			System.out.println(myheroname+". A good name. A name they shall rise their glass of mead to in a heros song!");
			System.out.println("----------------------------------");
			System.out.println("Hello, "+myheroname+".");
			System.out.println("You have: "+ health+" health and "+mana+" mana.");
			System.out.println("----------------------------------");
		}else{
			int hl = 85;
		    int mg = 10;
		    Hero herro = new Hero(hn, hl, mg);
			int health = herro.getHealth();
			int mana = herro.getMana();
			String myheroname = herro.getName();
			System.out.println(myheroname+". A good name. A name they shall rise their glass of mead to in a heros song!");
		}
		
		//System.out.println("----------------------------------");
		//System.out.println("Hello, "+myheroname+".");
		//System.out.println("You have: "+ health+" health and "+mana+" mana.");
		//System.out.println("----------------------------------");
		//int health = 50;
		/*
		while( health>0 )
		{	
			//System.out.println(rndNum);
			//System.out.println(rndNum);
			int ii = rn.getRandNum();
			
			//System.out.println(health);
			System.out.println("Attack? Y/N");
			String attack;
			attack = user_input.next();
			
			if (attack.equals("Y") || attack.equals("y")){
				System.out.println("KILL!");
				System.out.println("You've done " + ii + " damage!");
				health = health - ii;
				System.out.println(health);
			
			} else {
				System.out.println("cower..");
			}
		}
		System.out.println("!!!-------------------->DEATH!!!");*/
	}
}
