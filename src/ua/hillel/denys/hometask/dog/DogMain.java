package ua.hillel.denys.hometask.dog;

public class DogMain {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Sharik",3,30,"Boxer");
        Dog dog2 = new Dog("Pivas",5,7,"Pug");

        System.out.println(dog1.equals(dog2));
        System.out.print("Количество собак: ");
        Dog.printCount();


    }
}
