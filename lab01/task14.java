public class task14 {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 7, 4};
        
        // Зсув на 1 позицію
        cycleSwap(array);
        printArray(array);

        // Зсув на 3 позиції
        cycleSwap(array, 3);
        printArray(array);
    }

    // Зсув на 1 позицію
    public static void cycleSwap(int[] array) {
        int temp = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = temp;
    }

    // Зсув на задану кількість позицій
    public static void cycleSwap(int[] array, int shift) {
        for (int s = 0; s < shift; s++) {
            int temp = array[array.length - 1];
            for (int i = array.length - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = temp;
        }
    }

    // Друкує масив
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}