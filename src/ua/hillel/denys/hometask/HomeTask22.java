package ua.hillel.denys.hometask;

// Вычислить факториал числа N с помощью рекурсивной функции

import java.util.Scanner;

public class HomeTask22 {

    public static void main(String[] args) {

        System.out.println("Введите число от 0 до 10 для вычисления его факториала");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println();
        System.out.print("Факториал числа " + n + " равен: ");
        System.out.println(factorial(n));

    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);

    }

}
