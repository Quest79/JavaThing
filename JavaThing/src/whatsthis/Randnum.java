package whatsthis;

import java.util.Random;

public class Randnum {
	
    public int getRandNum(){
        int Low = 10;                               //Used for lowened number in random
        int High = 15;                              //Used for highend number in random
        Random rndGen = new Random();               //Declare a new 'random' object
        int rn = rndGen.nextInt(High-Low) + Low;    //Proper random between two numbers (high and low)

        return rn;
    }
}
