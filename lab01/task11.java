public class task11 {
    public static void main(String[] args) {
        int[] array = {10, 5, 7, 15, 1};
        int sumOfEven = sum(array);
        System.out.println("Сума парних чисел в масиві: " + sumOfEven);
    }

    public static int sum(int[] array) {
        int sum = 0;

        // Проходимося по всім елементам масиву
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i]; // Додаємо до суми парні числа
            }
        }

        return sum;
    }
}