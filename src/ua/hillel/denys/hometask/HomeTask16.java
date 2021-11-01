package ua.hillel.denys.hometask;

public class HomeTask16 {

    public static void main(String[] args) {

        String str1 = "А роза упала на лапу азора";
        System.out.println("Является ли строка " + "'" + str1 + "'" + " палиндромом?");
        str1 = str1.replace(" ", "");

        String str2 = reverseString(str1);


        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Строка - ПАЛИНДРОМ!!");
        } else {
            System.out.println("Строка - НЕ палиндром!!");
        }

    }

    public static String reverseString(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }
        return result;
    }

}






