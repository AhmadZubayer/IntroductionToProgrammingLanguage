
public class FindMaxValueArray {
	public int findMaxElement(int[] array) {
        if(array.length == 0) {
          return -1;
        } else {
            int maximum= array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] > maximum) {
                    maximum = array[i];
            }
          }
         return maximum;
        }
        
    }

    public static void main(String[]args) {
        int[] arr = {1, 2, 1, 5, 5, 3, 9, 9, 2, 3, 7, 2, 6, 7};
        int[] arr2 =  new int[0];
        FindMaxValueArray maxElement = new FindMaxValueArray(); 
        System.out.println(maxElement.findMaxElement(arr)); 
        System.out.println(maxElement.findMaxElement(arr2));
    }
}
