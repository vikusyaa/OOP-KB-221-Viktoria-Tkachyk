import java.util.Scanner;

public class task5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Зчитування значень a, b, h
        System.out.println("Введіть кількість футів, які равлик піднімається на день (a):");
        int a = scanner.nextInt();
        System.out.println("Введіть кількість футів, які равлик сповзає вниз за ніч (b):");
        int b = scanner.nextInt();
        System.out.println("Введіть висоту дерева в футах (h):");
        int h = scanner.nextInt();
        
        // Розрахунок кількості днів
        int days = (h - b + (a - b - 1)) / (a - b); // Додано (a - b - 1), щоб забезпечити правильне округлення вверх
        
        // Перевірка, чи може равлик дістатися до вершини дерева
        if (h - b <= 0) {
            System.out.println("Impossible");
        } else {
            System.out.println("Кількість днів, необхідних равлику для досягнення вершини дерева: " + days);
        }
    }
}