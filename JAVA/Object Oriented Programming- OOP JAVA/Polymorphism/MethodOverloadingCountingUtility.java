
public class MethodOverloadingCountingUtility {
	int count = 0;

    // increments count by given amount and returns count
    public int increment(int amount) {
        this.count += amount;
        return this.count;
    }

    // increments by 1 and returns count
    public int increment() {
        return this.increment(1); // calls the other increment method with default amount of 1
    }

    public static void main(String[] args) {
        MethodOverloadingCountingUtility utility = new MethodOverloadingCountingUtility();

        System.out.println("Initial Count: " + utility.count); // Output: Initial Count: 0

        utility.increment(5); // Increment count by 5
        System.out.println("Count after incrementing by 5: " + utility.count); // Output: Count after incrementing by 5: 5

        utility.increment(); // Increment count by default amount (1)
        System.out.println("Count after default increment: " + utility.count); // Output: Count after default increment: 6
    }
}
