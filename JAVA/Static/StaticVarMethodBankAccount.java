
public class StaticVarMethodBankAccount {
	// Static variable: same for all instances of StaticVarMethodBankAccount
    static final double SALES_TAX = 0.06;

    // Instance variable: different for every instance of StaticVarMethodBankAccount
    double balance;

    // Constructor to initialize the balance
    public StaticVarMethodBankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to simulate a purchase
    public void purchase(double amount) {
        // Reference the static variable using the class name
        this.balance -= ((StaticVarMethodBankAccount.SALES_TAX * amount) + amount);
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.println("Balance: $" + this.balance);
    }

    public static void main(String[] args) {
        // Create instances of StaticVarMethodBankAccount
        StaticVarMethodBankAccount account1 = new StaticVarMethodBankAccount(1000);
        StaticVarMethodBankAccount account2 = new StaticVarMethodBankAccount(2000);

        // Perform purchases
        account1.purchase(100);
        account2.purchase(200);

        // Display balances after purchases
        account1.displayBalance(); // Balance: $894.0
        account2.displayBalance(); // Balance: $1788.0

        // Display the sales tax rate using the class name
        System.out.println("Sales Tax: " + StaticVarMethodBankAccount.SALES_TAX); // Sales Tax: 0.06
    }
}
