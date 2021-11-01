package ua.hillel.denys.hometask;

public class HomeTask6 {

    public static void main(String[] args) {


        printAirplaneInfo("Jet", "F-16 Fighting Falcon");
        printAirplaneInfo("Airliner", "Airbus A320", 200);
        printAirplaneInfo("Airliner", "Boeing 777-200", 150, 50);

    }

    public static void printAirplaneInfo(String typeAirplane, String modelAirplane) {
        System.out.println("Тип самолёта: " + typeAirplane + ". " + "Модель: " + modelAirplane);

    }

    public static void printAirplaneInfo(String typeAirplane, String modelAirplane, int economyClass) {
        System.out.println("Тип самолёта: " + typeAirplane + ". " + "Модель: " + modelAirplane + ". " + "Кол-во пассажиров эконом класса: " + economyClass);

    }

    public static void printAirplaneInfo(String typeAirplane, String modelAirplane, int economyClass, int businessClass) {
        System.out.println("Тип самолёта: " + typeAirplane + ". " + "Модель: " + modelAirplane + ". " + "Кол-во пассажиров эконом класса: " + economyClass + ". " + "Кол-во пассажиров бизнес класса: " +  businessClass);
    }


}
