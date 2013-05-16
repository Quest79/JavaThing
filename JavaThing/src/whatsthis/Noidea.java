package whatsthis;

import java.util.Random;
import java.util.Scanner;

public class Noidea{
	
	private static Scanner user_input;

	public static void main(String[] args)
	{
		System.out.println("Git is awesome");
		
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String first_name;
		first_name = user_input.next();
		System.out.println("Hello, "+first_name);
		
		int health = 100;
		
		while( health>0 )
		{	
			int Low = 10;					//Used for lowened number in random
			int High = 15;					//Used for highend number in random
			Random rndGen = new Random();	// Declare a new 'random' object
			int rndNum = rndGen.nextInt(High-Low) + Low;	//Proper random between two numbers (high and low)
			//System.out.println(rndNum);
			//System.out.println(rndNum);
			
			System.out.println(health);
			System.out.println("Attack? Y/N");
			String attack;
			attack = user_input.next();
			
			if (attack.equals("Y")){
				System.out.println("KILL!");
				System.out.println("You've done " + rndNum + " damage!");
				health = health - rndNum;
				System.out.println(health);
			
			} else {
				System.out.println("cower..");
			}
		}
	}	
}
