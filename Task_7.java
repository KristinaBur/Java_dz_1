// * Task_7
// Дан список. Выведите те его элементы, которые встречаются в списке только один раз. Элементы нужно выводить в том порядке, 
// в котором они встречаются в списке.
// Входные данные
// Вводится список чисел. Все числа списка находятся на одной строке.
// Выходные данные
// Выведите ответ на задачу.

// import java.util.Scanner;
// public class Task_7 {
//     public static void main(String[] args) {
//         Scanner iscanner = new Scanner(System.in);
//         System.out.print("Введите размер массива: ");
//         int l = Integer.parseInt(iscanner.nextLine());
//         int[] arr = new int[l];
//         for (int i = 0; i < l; i++) {
//             System.out.print("Введите элементы массива: ");
//             arr[i] = Integer.parseInt(iscanner.nextLine());
//         }
//         System.out.println();
//         unique_elements(arr);
//     }

//     static void unique_elements(int[] arr) {
//         System.out.print("Unique elements is: ");
//         for (int k : arr) {
//             int counter = 0;
//             for (int i : arr) {
//                 if (k == i) counter++;
//             }
//             if (counter == 1) System.out.printf("%d ", k);
//         }
//     }
// }

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = iScanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {
            arr[i] = iScanner.nextInt();
        }
        int count = 1;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((arr[i] == arr[j]) && ( i != j)) {
                    count++;
                }
            }
            if (count == 1) System.out.println(arr[i]);
            count = 1;
        }
    }
}
