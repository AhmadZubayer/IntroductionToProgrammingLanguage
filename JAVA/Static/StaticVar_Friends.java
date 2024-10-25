class Friends{
	static int HOWMANYFRIENDS;
	
	public Friends() {
		HOWMANYFRIENDS++;
	}
	
	public static void display() {
		System.out.println("You have " + HOWMANYFRIENDS + " friends." );
	}
}
public class StaticVar_Friends {
	public static void main(String[] args) {
		Friends friend1 = new Friends();
		Friends friend2 = new Friends();
		Friends friend3 = new Friends();
		Friends friend4 = new Friends();
		Friends friend5 = new Friends();
		
		System.out.println(Friends.HOWMANYFRIENDS);
		Friends.display();  
		
		// friend1.display(); can't be used. Static keyword used.  
	}

}
