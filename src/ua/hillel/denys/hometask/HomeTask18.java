package ua.hillel.denys.hometask;

import java.util.Arrays;

public class HomeTask18 {

    public static void main(String[] args) {

        int[] array = {-2, 3, 0, 26, 0, -3};
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

        System.out.print(Arrays.toString(array));

    }
}
