package ua.hillel.denys.hometask;

import java.util.Arrays;
import java.util.Scanner;

public class HomeTask14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[5];
        System.out.println("Введите число:");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(array));

        boolean x = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                x = false;
                break;
            }
        }
        if (x) {
            System.out.println("Последовательность строго возрастающая!");
        } else {
            System.out.println("Последовательность НЕ строго возрастающая!");
        }


    }
}
