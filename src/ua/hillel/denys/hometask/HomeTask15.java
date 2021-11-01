package ua.hillel.denys.hometask;

import java.util.Arrays;
import java.util.Scanner;

public class HomeTask15 {

    public static void main(String[] args) {

        Scanner numb = new Scanner(System.in);

        int[] arrayBig = new int[20];
        System.out.println("Введите числа:");
        for (int i = 0; i < arrayBig.length; i++) {
            arrayBig[i] = numb.nextInt();
        }
        System.out.println("Массив на 20 чисел: " + Arrays.toString(arrayBig));

        int[] arraySmall1 = new int[10];
        int[] arraySmall2 = new int[10];

        System.arraycopy(arrayBig,0,arraySmall1,0,10);
        System.out.println("Массив на первые 10 чисел: " + Arrays.toString(arraySmall1));

        System.arraycopy(arrayBig,10,arraySmall2,0,10);
        System.out.println("Массив на вторые 10 чисел: " + Arrays.toString(arraySmall2));;


    }
}
