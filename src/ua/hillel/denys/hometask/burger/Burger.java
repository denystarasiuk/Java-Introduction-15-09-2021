package ua.hillel.denys.hometask.burger;

public class Burger {

    public String name;
    public int bun;
    public int meat;
    public int cheese;
    public int lettuce;
    public int mayo;


    public Burger() {
    }

    public Burger(String name, int bun, int meat, int cheese, int lettuce, int mayo) {
        this.name = name;
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.mayo = mayo;
        System.out.println("Состав бургера " + "'" + name + "'" + ": булочка- " + bun + ", мясо- " + meat + ", сыр- " + cheese + ", салат- " + lettuce + ", майонез- " + mayo);

    }

    public Burger(String name, int bun, int meat, int cheese, int lettuce) {
        this.name = name;
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.lettuce = lettuce;
        System.out.println("Состав бургера " + "'" + name + "'" + ": булочка- " + bun + ", мясо- " + meat + ", сыр- " + cheese + ", салат- " + lettuce);

    }

    @Override
    public String toString() {
        return this.name + this.bun + this.meat + this.cheese + this.lettuce + this.mayo;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Burger)) {
            return false;
        }
        Burger burger = (Burger) obj;
        return this.bun==(burger.bun) && this.meat==(burger.meat)
                && this.cheese==(burger.cheese) && this.lettuce==(burger.lettuce)
                && this.mayo==(burger.mayo);
    }

}
