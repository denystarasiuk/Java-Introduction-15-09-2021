package ua.hillel.denys.hometask;

/* Создать генератор паролей, который будет генерировать случайные неповторяющиеся пароли по следующим правилам:
        Пароль состоит из 8 символов
        В пароле допускаются только латинские большие и маленькие буквы, цифры и символ подчеркивания
        Пароль обязательно должен содержать большие и маленькие буквы и цифры
*/

import java.util.Random;

public class HomeTask23 {

    public static void main(String[] args) {

        int length = 8;
        System.out.println("Пароль состоит из " + length + " символов");

        String bigLet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallLet = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String chr = "_";
        String unionStrings = bigLet + numbers + smallLet + chr;

        Random random = new Random();

        char[] genPas = new char[length];
            for (int i = 0; i < genPas.length; i++) {
                genPas[i] = unionStrings.charAt(random.nextInt(unionStrings.length()));
        }
        System.out.println(genPas);

    }
}
