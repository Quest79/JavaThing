package whatsthis;

import java.util.Random;

public class Randnum {
	
    public int getRandNum(){
        int Low = 5;                               //Used for lowened number in random
        int High = 25;                              //Used for highend number in random
        Random rndGen = new Random();               //Declare a new 'random' object
        int rn = rndGen.nextInt(High-Low) + Low;    //Proper random between two numbers (high and low)

        return rn;
    }
    
    public static int getRandNum2(int alow, int ahigh){
        int Low = alow;                               //Used for lowened number in random
        int High = ahigh;                              //Used for highend number in random
        Random rndGen = new Random();               //Declare a new 'random' object
        int rn2 = rndGen.nextInt(High-Low) + Low;    //Proper random between two numbers (high and low)

        return rn2;
    }
}
