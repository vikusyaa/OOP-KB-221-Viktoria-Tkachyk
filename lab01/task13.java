import java.util.Arrays;

public class task13 {
    public static void main(String[] args) {
        int[] array = {1, 3, 6, 7, -5};
        int[] result = removeLocalMaxima(array);
        System.out.println("Результат виконання: " + Arrays.toString(result));
    }

    public static int[] removeLocalMaxima(int[] array) {
        int count = 0;
        boolean[] isMaxima = new boolean[array.length];

        // Визначення локальних максимумів
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                isMaxima[i] = true;
                count++;
            }
        }

        if (count == 0) {
            return Arrays.copyOf(array, array.length); // Якщо немає локальних максимумів, повертаємо копію вихідного масиву
        }

        int[] result = new int[array.length - count];
        int index = 0;

        // Заповнення результуючого масиву, пропускаючи локальні максимуми
        for (int i = 0; i < array.length; i++) {
            if (!isMaxima[i]) {
                result[index++] = array[i];
            }
        }

        return result;
    }
}