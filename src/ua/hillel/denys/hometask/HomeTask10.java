package ua.hillel.denys.hometask;

public class HomeTask10 {

    public static void main(String[] args) {

        int a = 1;
        int b = 1;
        int c = 1;
        for (int i = 0; i <= 11; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a + ", ");
        }
    }
}
