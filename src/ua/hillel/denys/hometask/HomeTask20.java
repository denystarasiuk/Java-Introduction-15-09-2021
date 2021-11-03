package ua.hillel.denys.hometask;

import java.util.Arrays;

public class HomeTask20 {

    public static void main(String[] args) {

        int[][] c = new int[3][3];
        int[][] d = new int[3][3];

        c = array(c);
        for (int i =0; i<c.length; i++){
            for (int j=0; j<c[i].length; j++) {
                System.out.println(c);
            }
        }
        //System.out.println(Arrays.toString(c));


    }

    public static int[][] array(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 99) + 1;
            }
        }
        return arr;
    }
}
