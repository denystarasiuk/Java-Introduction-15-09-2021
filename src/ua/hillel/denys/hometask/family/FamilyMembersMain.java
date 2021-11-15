package ua.hillel.denys.hometask.family;

public class FamilyMembersMain {

    public static void main(String[] args) {

        Son son = new Son("Денис");
        Parents parents = new Parents("Папа");
        Parents parents1 = new Parents("Мама");

        System.out.println("Сын - " + son.getName() + ", родители: " + parents.getParents() + " и " + parents1.getParents());



    }

}
