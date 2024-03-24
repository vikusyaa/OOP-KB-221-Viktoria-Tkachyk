import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть послідовність цілих чисел (введіть 0 для завершення):");
        
        int sum = 0;
        int count = 0;
        int number;

        do {
            number = scanner.nextInt();
            if (number != 0) {
                sum += number;
                count++;
            }
        } while (number != 0);

        double average = (double) sum / count;

        System.out.println("Середнє значення у послідовності: " + average);
    }
}