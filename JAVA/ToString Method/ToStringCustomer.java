
public class ToStringCustomer {
	
	    
	    String name;
	    
	    public ToStringCustomer(String name) {
	        this.name = name;
	    }

	    public String toString() {
	        return this.name;
	    }

	    public static void main(String [] args) {
	        ToStringCustomer customer = new ToStringCustomer("Ahmad Zubayer");
	        System.out.println("Name of ToStringCustomer: " + customer );
	    }
	
}
