package whatsthis;

import java.util.Random;
import java.util.Scanner;

public class Noidea{
	
	private static Scanner user_input;

	public static void main(String[] args)
	{
		//System.out.println("Git is awesome");
		
		Scanner user_input 	= new Scanner(System.in);
		
		System.out.println("What is your name?");
		String heroname;
		heroname = user_input.next();
		
		Randnum rn 			= new Randnum();
		Hero herro			= new Hero(heroname, 53, 100);
		
		int health = herro.getHealth();
		int mana = herro.getMana();
		
		System.out.println("----------------------------------");
		System.out.println("Hello, "+herro.getName()+".");
		System.out.println("You have: "+ health+" health and "+mana+" mana.");
		System.out.println("----------------------------------");
		//int health = 50;
		
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
		System.out.println("!!!-------------------->DEATH!!!");
	}
}
