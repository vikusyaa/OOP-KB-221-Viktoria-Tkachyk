import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Зчитування загальної суми рахунку
        System.out.println("Введіть загальну суму рахунку:");
        double totalBill = scanner.nextDouble();

        // Перевірка на від'ємну суму рахунку
        if (totalBill < 0) {
            System.out.println("Сума рахунку не може бути від'ємною.");
            return;
        }

        // Зчитування кількості друзів
        System.out.println("Введіть кількість друзів:");
        int numFriends = scanner.nextInt();

        // Перевірка на нульову кількість друзів
        if (numFriends <= 0) {
            System.out.println("Кількість друзів має бути додатнім числом.");
            return;
        }

        // Розрахунок розміру частини оплати на кожного друга
        double perPersonPayment = (totalBill + totalBill * 0.10) / numFriends;

        // Виведення результату
        System.out.printf("Розмір частини оплати на кожного друга: %.2f%n", perPersonPayment);
    }
}