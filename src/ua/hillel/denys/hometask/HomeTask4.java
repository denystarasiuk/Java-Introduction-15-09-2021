package ua.hillel.denys.hometask;

public class HomeTask4 {

    public static void main(String[] args) {

        //Найти результат выражения: |a-b|/(a+b)^3-√c

        // Присваиваю значения переменным a, b, c
        double a = 2.5;
        double b = 4.5;
        double c = 9.9;

        // Нахожу модуль: |a-b|
        double module = Math.abs(a-b);  // |a-b| = |2.5-4.5| = 2

        // Возвожу в степнь 3 сумму a+b: (a+b)^3
        double pow = Math.pow((a+b), 3);  // (a+b)^3 = (2.5+4.5)^3 = 7^3 = 343

        // Нахожу корень переменной с: √c
        double sqrt = Math.sqrt(c);  // √c = √9.9 = 3.14642654.....

        System.out.println("Решение выражения");
        System.out.println("|a-b|/(a+b)^3-√c = |2.5-4.5|/(2.5+4.5)^3-√9.9 = " + ((module/pow)-sqrt));

    }
}
