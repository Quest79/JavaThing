package whatsthis;

public class Hero{
	
	   private String name;
	   private int health;
	   private int mana;
	   
	   public Hero(String name, int health, int mana){
	      System.out.println("Herro the Hero Construction Begins");
	      this.name = name;
	      this.health = health;
	      this.mana = mana;
	   }
	   
	   public void mailCheck(){
	      System.out.println("Mailing a check to " + this.name
	       + " " + this.health);
	   }
	   
	   public String toString(){
	      return name + " " + health + " " + mana;
	   }
	   
	   public String getName(){
	      return name;
	   }
	   
	   public int getHealth(){
	      return health;
	   }
	   
	   public void setHealth(int newHealth){
		   health = newHealth;
	   }
	   
	   public int getMana(){
	     return mana;
	   }
	   
}
