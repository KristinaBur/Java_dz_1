// Task_6
// Вводится массив (сначала количество элементов, потом сами элементы). Найдите сумму его элементов с чётными индексами и выведите её. 
// А потом выведите числа, которые суммировались.
// Sample Input:
// 4
// 1, 2, 3, 4
// Sample Output:
// 4
// 1
// 3

import java.util.Scanner;

public class Task_6 {
        public static void main(String[] args) {
            Scanner iScanner = new Scanner(System.in);
            System.out.printf("Введите размер массива: ");
            int l = Integer.parseInt(iScanner.nextLine());
            int[] arr = new int[l];
            int sum_nums = 0;
            for (int i = 0; i < l; i++){
                System.out.printf("Введите элемент массива: ");
                arr[i] = Integer.parseInt(iScanner.nextLine());
                if (i%2==0){
                    sum_nums += arr[i];
                }
            }
            System.out.println(sum_nums);
            for(int i = 0; i < l; i += 2){
                System.out.println(arr[i]);
            }
        }
    }

