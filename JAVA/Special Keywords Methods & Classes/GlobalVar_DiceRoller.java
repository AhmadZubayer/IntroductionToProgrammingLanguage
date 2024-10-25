import java.util.Random;

class DiceRoller {
 
 Random random;
 int number;
 
 DiceRoller(){
  random = new Random();
  roll();
 }
 
 /*
  * This method generates a random number between 1 and 6 (inclusive), 
  * simulating a dice roll, and prints the result.
  * The nextInt(6) method of the Random class generates a random number between 0 and 5. 
  * Adding 1 to this result gives a number between 1 and 6, simulating a six-sided die.
  */
 void roll() {
  number = random.nextInt(6)+1;
  System.out.println(number);
 }
}


public class GlobalVar_DiceRoller {
	public static void main(String[] args) {
		  
		  //local =  declared inside a method
		  //   visible only to that method
		  
		  //global  = declared outside a method, but within a class
		  //   visible to all parts of a class
		  
		  DiceRoller diceRoller = new DiceRoller();
	}
}

// https://youtu.be/pSokndJB3Pw?si=tujFs2bSlutD7aCL
	
