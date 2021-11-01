package ua.hillel.denys.hometask;

import java.util.Scanner;

public class HomeTask8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите свои оценки по 12-ти бальной шкале");

        System.out.println("Введите свою оценку по математике");
        int maths = in.nextInt();

        System.out.println("Введите свою оценку по физике");
        int physics = in.nextInt();

        System.out.println("Введите свою оценку по информатике");
        int computerScience = in.nextInt();

        System.out.println("Введите свою оценку по экономике");
        int economy = in.nextInt();

        System.out.println("Введите свою оценку по теоретической механике");
        int theoreticalMechanics = in.nextInt();

        double averageScore = (double) (maths + physics + computerScience + economy + theoreticalMechanics) / 5;
        // System.out.println("средний балл: " + averageScore);

        if (averageScore >= 10) {
            System.out.println("Средний балл: " + averageScore + " - Стипендия повышенная!");
        } else if (averageScore >= 8) {
            System.out.println("Средний балл: " + averageScore + " - Стипендия обычнная!");
        } else {
            System.out.println("Средний балл: " + averageScore + " - Стипендии нет!");
        }
    }
}
