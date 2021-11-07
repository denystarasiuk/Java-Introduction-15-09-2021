package ua.hillel.denys.hometask;

/*Задан массив целых чисел. Поместить все нули в начало массива.
Например дано {х,х,0,х,0,х}, в результате получаем {0,0,х,х,х,х},
порядок ненулевых чисел значения не имеет.
*/

import java.util.Arrays;
import java.util.Scanner;

public class HomeTask18 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер масива (от 5 до 10)");

        int n = input.nextInt();
        int[] array = new int[n];

        System.out.println("Заполните масив числами");
        System.out.println("Масив должен включать нули, положительные и отрицательные целые числа");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("Исходный масив имеет вид:");
        System.out.println(Arrays.toString(array));

        int a = array.length - 1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != 0) {
                array[a] = array[i];
                a--;
            }
        }

        while (a >= 0) {
            array[a] = 0;
            a--;
        }

        System.out.println("Отсортированный масив - нули в начало масива");
        System.out.print(Arrays.toString(array));

    }
}
