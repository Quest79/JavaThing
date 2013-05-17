package whatsthis;

import java.util.Random;
import java.util.Scanner;

public class Noidea{
	
	private static Scanner user_input;

	public static void main(String[] args)
	{
		System.out.println("Git is awesome");
		
		Scanner user_input = new Scanner(System.in);
		randnum rn = new randnum();
		
		System.out.println("What is your name?");
		String first_name;
		first_name = user_input.next();
		System.out.println("Hello, "+first_name);
		
		int health = 100;
		
		while( health>0 )
		{	
			//System.out.println(rndNum);
			//System.out.println(rndNum);
			int ii = rn.randnum();
			
			System.out.println(health);
			System.out.println("Attack? Y/N");
			String attack;
			attack = user_input.next();
			
			if (attack.equals("Y")){
				System.out.println("KILL!");
				System.out.println("You've done " + ii + " damage!");
				health = health - ii;
				System.out.println(health);
			
			} else {
				System.out.println("cower..");
			}
		}
	}	
}
