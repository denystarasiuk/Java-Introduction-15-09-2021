package ua.hillel.denys.hometask;

import java.util.Scanner;

public class HomeTask9 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Hello! Enter, please, dimensions of your baggage (cm)");
        System.out.println();

        System.out.println("input width: ");
        double width = in.nextDouble();

        System.out.println("input length: ");
        double length = in.nextDouble();

        System.out.println("input height: ");
        double height = in.nextDouble();

        if (width >= 20 && width <= 22 && length >= 40 && length <= 55 && height >= 40 && height <= 53) {
            System.out.println("Carry-on baggage: Ok");
        } else if (width < 20 && length < 40 && height < 40) {
            System.out.println("Carry-on baggage: Ok");
        } else if (width > 22 && length > 55 && height > 53) {
            System.out.println("NOT carry-on baggage");
        } else {
            System.out.println("NOT carry-on baggage");
        }


    }
}
