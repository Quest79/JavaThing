package whatsthis;

public class Hero{
	
	   private String name;
	   private int health;
	   private int number;
	   
	   public Hero(String name, int health, int number){
	      System.out.println("Constructing an Hero");
	      this.name = name;
	      this.health = health;
	      this.number = number;
	   }
	   
	   public void mailCheck(){
	      System.out.println("Mailing a check to " + this.name
	       + " " + this.health);
	   }
	   
	   public String toString(){
	      return name + " " + health + " " + number;
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
	   
	   public int getNumber(){
	     return number;
	   }
	   
}
