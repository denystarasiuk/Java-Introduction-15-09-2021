package ua.hillel.denys.hometask.burger;

public class BurgerMain {

    public static void main(String[] args) {

        Burger burger1 = new Burger("Обычный бургер", 1,1,1,1, 1);
        Burger burger2 = new Burger("Диетический бургер", 1, 1, 1, 1);
        Burger burger3 = new Burger("Бургер с двойным мясом", 1, 2, 1, 1, 1);

        System.out.println();
        System.out.println(burger1.equals(burger2));
        System.out.println(burger1.equals(burger3));
        System.out.println(burger2.equals(burger3));


    }
}
