package ua.hillel.denys.hometask;

import java.util.Arrays;

public class HomeTask13 {

    public static void main(String[] args) {

        int[] teamBear = new int[25];
        int[] teamEagle = new int[25];


        for (int i = 0; i < teamBear.length; i++) {
            teamBear[i] = (int) (Math.random() * 20) + 20;
            teamEagle[i] = (int) (Math.random() * 20) + 20;
        }

        System.out.print("Возраст команды teamBear: ");
        System.out.println(Arrays.toString(teamBear));
        System.out.print("Возраст команды teamEagle: ");
        System.out.println(Arrays.toString(teamEagle));

        int sumTeamBear = 0;
        int sumTeamEagle = 0;
        for (int i = 0; i < teamBear.length; i++) {
            sumTeamBear = sumTeamBear + teamBear[i];
            sumTeamEagle = sumTeamEagle + teamEagle[i];
        }
        //System.out.println(sumTeamBear);
        //System.out.println(sumTeamEagle);

        double averageTeamBear = (double) sumTeamBear / teamBear.length;
        System.out.println("Средний возраст команды teamBear: " + averageTeamBear);
        double averageTeamEagle = (double) sumTeamEagle / teamEagle.length;
        System.out.println("Средний возраст команды teamEagle: " + averageTeamEagle);

        if (averageTeamBear > averageTeamEagle) {
            System.out.println("Средний возраст команды teamBear больше чем у команды teamEagle: " + averageTeamBear + " > " + averageTeamEagle);
        } else if (averageTeamBear < averageTeamEagle) {
            System.out.println("Средний возраст команды teamBear меньше чем у команды teamEagle: " + averageTeamBear + " < " + averageTeamEagle);
        } else {
            System.out.println("Средний возраст команды teamBear и команды teamEagle равны: " + averageTeamBear + " = " + averageTeamEagle);
        }


    }
}
