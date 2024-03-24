import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть послідовність цілих чисел (введіть 0 для завершення):");
        
        int max = Integer.MIN_VALUE;
        int number;

        do {
            number = scanner.nextInt();
            if (number != 0 && number > max) {
                max = number;
            }
        } while (number != 0);

        if (max == Integer.MIN_VALUE) {
            System.out.println("Послідовність містить тільки нульові значення.");
        } else {
            System.out.println("Максимальне число у послідовності: " + max);
        }
    }
}