package ua.hillel.denys.hometask;

import java.util.Scanner;

public class HomeTask11 {

    public static void main(String[] args) {

        double random = Math.random();
        int a = (int) (random * 10);


        Scanner in = new Scanner(System.in);
        System.out.println("input number: ");
        int number = in.nextInt();

        while (number != a) {
            System.out.println("input number: ");
            int newNumber = in.nextInt();
            number = newNumber;
        }

        System.out.println("Bingo! " + a);


    }
}
