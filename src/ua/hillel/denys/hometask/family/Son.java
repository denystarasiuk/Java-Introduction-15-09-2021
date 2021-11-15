package ua.hillel.denys.hometask.family;

public class Son {

    private String name;
    private Parents parents;


    public Son(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
