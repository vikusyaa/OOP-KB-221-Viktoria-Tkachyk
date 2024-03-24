public class task10 {
    public static void main(String[] args) {
        int[] array = {10, 55, 7, 15, 3};
        int max = max(array);
        System.out.println("Максимальне значення в масиві: " + max);
    }

    public static int max(int[] array) {
        int max = Integer.MIN_VALUE; // Ініціалізуємо максимум найменшим можливим значенням int

        // Проходимося по всім елементам масиву
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // Оновлюємо максимум, якщо поточний елемент більший
            }
        }

        return max;
    }
}