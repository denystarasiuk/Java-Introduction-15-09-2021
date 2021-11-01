package ua.hillel.denys.hometask;

import java.util.Scanner;

public class HomeTask19 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Задайте размер матрицы MxN");
        int m = input.nextInt();
        int n = input.nextInt();

        int[][] matrix = new int[m][n];
        System.out.println("Заполните матрицу");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("Матрица имеет вид:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Транспонированная матрица имеет вид:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }


    }


}
