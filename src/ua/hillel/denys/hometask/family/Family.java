package ua.hillel.denys.hometask.family;

public class Family {

    private String familyMember;
    private String name;

    public Family(String familyMember, String name){
        this.familyMember = familyMember;
        this.name = name;
        System.out.println("Член семьи: " + familyMember + " " + name);
    }
}
