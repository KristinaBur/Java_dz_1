import java.util.Scanner;

// Реализовать простой калькулятор
// Минимум -- > Условия + Цикл
// Введите число, Введите число, Выберите операцию
// 1 - сложить
// 2 - умножить



public class Task_2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int a = Integer.parseInt(iScanner.nextLine());
        System.out.printf("Выберите действие: +-*/: ");
        String o = iScanner.nextLine();
        System.out.printf("Введите второе число: ");
        int b = Integer.parseInt(iScanner.nextLine());
        switch (o) {
            case "+":
                System.out.println(sum_nums(a, b));
                break;
            case "-":
                System.out.println(minus_nums(a, b));
                break;
            case "*":
                System.out.println(mult_nums(a, b));
                break;
            case "/":
                System.out.println(division_nums(a, b));
                break;
        }
    }
    static Integer sum_nums(int a, int b) {
        return a + b;
    }

    static Integer minus_nums(int a, int b) {
        return a - b;
    }

    static Integer mult_nums(int a, int b) {
        return a * b;
    }

    static Double division_nums(double a, double b) {
        return a / b;
    }
}
