import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Скільки незнайомців ви хочете зустріти?");
        int numStrangers = scanner.nextInt();
        
        if (numStrangers <= 0) {
            System.out.println("Введіть додатне число більше нуля.");
            return;
        }

        scanner.nextLine(); // Прочитати символ нового рядка після введення числа

        System.out.println("Введіть імена незнайомців:");

        for (int i = 0; i < numStrangers; i++) {
            String name = scanner.nextLine();
            System.out.println("Hello, " + name);
        }
    }
}