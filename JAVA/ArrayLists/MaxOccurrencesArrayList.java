import java.util.ArrayList;

public class MaxOccurrencesArrayList {
	public ArrayList<Integer> findMax(int[] array) {
        if (array.length == 0) {
            return null;
        } else {
            int maximum = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > maximum) {
                    maximum = array[i];
                }
            }
            ArrayList<Integer> maxOccurrences = new ArrayList<Integer>();
            for (int i = 0; i < array.length; i++) {
                if (array[i] == maximum) {
                    maxOccurrences.add(array[i]);
                }
            }
            return maxOccurrences;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
        int[] array2 = {2, 4, 8, 12, 12, 4};
        int[] array3 = new int[0];

        MaxOccurrencesArrayList maximumValue = new MaxOccurrencesArrayList ();

        System.out.println(maximumValue.findMax(array1)); // Should print [9]
        System.out.println(maximumValue.findMax(array2)); // Should print [12, 12]
        System.out.println(maximumValue.findMax(array3)); // Should print null
    }
}
