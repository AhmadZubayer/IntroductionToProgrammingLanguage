
public class MethodOverloadingMyResults {
	double total = 0.0;
    double average = 0.0;

    // prints total and average
    public void printResults() {
        System.out.println("total = " + this.total + ", average = " + this.average);
    }

    // prints given message and prints results
    public void printResults(String message) {
        System.out.println(message + ": ");
        this.printResults();
    }

    public static void main(String[] args) {
        MethodOverloadingMyResults results = new MethodOverloadingMyResults();

        // Set some sample values
        results.total = 100.0;
        results.average = 25.0;

        // Print results without message
        results.printResults();

        // Print results with a message
        results.printResults("Results for the year");
    }
}
