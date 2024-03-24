import java.util.Scanner;

public class task3 {
    private final static int PASSWORD = 6543210; // Замініть це значення на ваш секретний пароль

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть пароль:");
        int inputPassword = scanner.nextInt();

        if (inputPassword == PASSWORD) {
            System.out.println("Hello, Agent");
        } else {
            System.out.println("Access denied");
        }
    }
}