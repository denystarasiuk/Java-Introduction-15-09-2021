package ua.hillel.denys.lesson13;

public class PetStore {

    public static void main(String[] args) {

        Animal animal = new Animal("unknown");
        //animal.name = "unknown";
        animal.speak();


        Cat cat = new Cat("Pixel");
        //cat.name = "Pixel";
        cat.speak();


        Dog dog = new Dog("Ted");
        //dog.name = "Ted";
        dog.speak();

        Elephant elephant = new Elephant("Bobbi");
        elephant.speak();


    }

}
