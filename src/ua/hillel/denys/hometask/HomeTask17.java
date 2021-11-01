package ua.hillel.denys.hometask;

import java.util.Arrays;
import java.util.Scanner;

public class HomeTask17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arrOne = new int[7];
        int[] arrTwo = new int[7];

        System.out.println("Введите числа от 0 до 9:");

        for (int i = 0; i < 7; i++) {
            arrOne[i] = (int) (Math.random() * 10);
            arrTwo[i] = input.nextInt();
        }

        Arrays.sort(arrOne);
        Arrays.sort(arrTwo);
        System.out.println(Arrays.toString(arrOne) + " - Массив случайных чисел");
        System.out.println(Arrays.toString(arrTwo) + " - Массив чисел введённых пользователем");

        int count = 0;
        for (int i = 0; i < 7; i++) {
            if (arrOne[i] == arrTwo[i]) {
                count++;
            }
        }
        System.out.println("Количество совпадений: " + count);
    }
}

