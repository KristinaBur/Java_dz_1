/**
Task_1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
Перейти по ссылке, реализовать формулу на Java.
Вывести все простые числа от 1 до 1000
 */

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner iscanner = new Scanner(System.in);

        System.out.print("Введите количество n чисел: ");
        int n = iscanner.nextInt();
        int summ = 0;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
           summ = summ + i;
        }
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.println("сумма треугольного числа = " + summ);
        System.out.println("Факториал = " + factorial);
    }
}