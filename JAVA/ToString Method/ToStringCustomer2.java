
public class ToStringCustomer2 {
	String name;
    int accountNo;
    
    public ToStringCustomer2(String name, int accountNo) {
        this.name = name;
        this.accountNo = accountNo;
    }

    public String toString() {
        return "Name: " + this.name + ", Account No: " + this.accountNo;
    }

    public static void main(String[] args) {
        ToStringCustomer2 customer = new ToStringCustomer2("Ahmad Zubayer", 23547343);
        System.out.println("Customer Details: " + customer);
    }
}
