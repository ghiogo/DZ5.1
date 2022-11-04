public class Hero {
    private int heroHealth;
    private int heroDamage;
    private String heroSuperPower;

    public Hero (int health, int damage , String superPower){
        this.heroHealth=health;
        this.heroDamage=damage;
        this.heroSuperPower=superPower;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public String getHeroSuperPower() {
        return heroSuperPower;
    }

    public Hero (int health, int damage){
        this.heroHealth=health;
        this.heroDamage=damage;
    }
}
