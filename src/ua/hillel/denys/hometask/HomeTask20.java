package ua.hillel.denys.hometask;

/*
Даны матрицы С и D размерностью 3 на 3 и заполненные случайными числами в диапазоне от 0 до 99.
Выполните по отдельности сначала сложение, потом умножения матриц друг на друга.
Выведете исходные матрицы и результат вычислений на консоль
 */

import java.sql.Array;
import java.util.Arrays;

public class HomeTask20 {

    public static void main(String[] args) {

        int[][] c = new int[3][3];
        int[][] d = new int[3][3];

        c = array(c);
        d = array(d);

        System.out.println("Исходная матрица C");
        outArray(c);
        System.out.println();

        System.out.println("Исходная матрица D");
        outArray(d);
        System.out.println();

        System.out.println("Сумма матриц C + D");
        sumArray(c, d);
        System.out.println();

        System.out.println("Умножение матриц C * D");
        multiArray(c, d);

    }

    public static int[][] array(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 99) + 1;
            }
        }
        return arr;
    }

    public static void outArray(int ar[][]) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j] + "   ");
            }
            System.out.println();
        }
    }

    public static void sumArray(int[][] c, int[][] d) {
        int[][] sumArray = new int[3][3];
        for (int i = 0; i < sumArray.length; i++) {
            for (int j = 0; j < sumArray[i].length; j++) {
                sumArray[i][j] = c[i][j] + d[i][j];
                System.out.print(sumArray[i][j] + "   ");
            }
            System.out.println();
        }
    }

    public static void multiArray(int[][] c, int[][] d){
        int[][] multiArray = new int[3][3];
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                multiArray[i][j] = c[i][j] * d[i][j];
                System.out.print(multiArray[i][j] + "   ");
            }
            System.out.println();
        }
    }


}
