

public class Hero {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int health;
    private int damage;
    private String superPower;

    public Hero(String name, int health, int damage, String superPower) {
        this.name=name;
        this.health = health;
        this.damage = damage;
        this.superPower = superPower;
    }

    public Hero(String name ,int health, int damage) {
        this.name=name;
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperPower() {
        return superPower;
    }
}

