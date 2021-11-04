package ua.hillel.denys.hometask;

/* Дан двумерный массив, содержащий отрицательные и положительные числа.
Выведете на экран номера тех ячеек массива, которые содержат отрицательные числа
*/
public class HomeTask21 {

    public static void main(String[] args) {

        int[][] ar = {{-6, 5, 10, -4}, {-9, 22, -3, 8}};

        System.out.println("массив имеет вид:");
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Номера ячеек массива с отрицательными числами:");

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (ar[i][j] < 0) {
                    System.out.print(i + "" + j + ", ");
                }
            }
        }

    }
}

