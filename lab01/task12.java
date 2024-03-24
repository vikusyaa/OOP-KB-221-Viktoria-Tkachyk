public class task12 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 8, 12};
        boolean[] resultArray = getSumCheckArray(array);

        // Виведення результату
        for (boolean b : resultArray) {
            System.out.print(b + " ");
        }
    }

    public static boolean[] getSumCheckArray(int[] array) {
        boolean[] resultArray = new boolean[array.length];

        // Перші два елементи завжди false
        resultArray[0] = false;
        resultArray[1] = false;

        // Проходимося по всім елементам масиву, починаючи з третього
        for (int i = 2; i < array.length; i++) {
            if (array[i] == array[i - 1] + array[i - 2]) {
                resultArray[i] = true; // true, якщо поточний елемент є сумою двох попередніх
            } else {
                resultArray[i] = false; // false, якщо не є
            }
        }

        return resultArray;
    }
}