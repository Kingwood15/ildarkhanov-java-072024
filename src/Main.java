import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        example1();
        System.out.println();
        example2();
        System.out.println();
        example3();
    }

    static void example1() {
        System.out.println("Задание 2.1");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = scanner.nextInt();
        System.out.print("Введите число b: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("a > b");
        } else {
            if (a == b) {
                System.out.println("a = b");
            } else {
                System.out.println("a < b");
            }
        }

        System.out.println("a - b = " + (a - b));
        System.out.println("a + b = " + (a + b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("b - a = " + (b - a));
        System.out.println("b + a = " + (b + a));
        System.out.println("b * a = " + (b * a));
        System.out.println("b / a = " + (b / a));

        System.out.println("Конец задания");
    }

    static void example2() {
        System.out.println("Старт задания 2.2");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку a: ");
        String a = scanner.nextLine();
        System.out.print("Введите строку b: ");
        String b = scanner.nextLine();

        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        System.out.println("Конец задания");
    }

    static void example3() {
        System.out.println("Старт задания 2.3");

        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Чётные числа: ");
        for (int i = 0; i<= array.length-1; i++) {
            if ((array[i] % 2) == 0) {
                System.out.print(array[i] + "; ");
            }
        }

        System.out.println();
        System.out.println("Конец задания");
    }
}