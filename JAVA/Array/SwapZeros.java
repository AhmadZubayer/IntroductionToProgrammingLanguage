class SwapZeros {

    public void swapZero(int[] array) {
        int nonZeroIndex = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                int temp = array[nonZeroIndex];
                array[nonZeroIndex] = array[i];
                array[i] = temp;
                nonZeroIndex++;
            }
        }
    }

    public void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SwapZeros swap = new SwapZeros();
        int[] array1 = {0, 1, 0, 2, 0, 3, 0, 5};
        swap.swapZero(array1);
        System.out.println("Array 1: ");
        swap.printArray(array1);

        int[] array2 = {1, 3, 5, 7, 9, 10};
        swap.swapZero(array2);
        System.out.println("Array 2: ");
        swap.printArray(array2);

        int[] array3 = new int[0];
        swap.swapZero(array3);
        System.out.println("Array 3: ");
        swap.printArray(array3);
    }
}