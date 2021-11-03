package ua.hillel.denys.lesson13;

public class Elephant extends Animal{

    public Elephant (String name) {
        super(name);
    }

    public void speak(){
        //super.speak();
        System.out.println(name + " says tru-ru-ru");
    }

}
