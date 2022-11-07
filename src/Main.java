

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHealth(1000);
        boss.setBossDamage(500);
        boss.setBossProtection("щит");
        System.out.println(boss.getBossHealth() + "  " + boss.getBossDamage()  + " " +boss.getBossProtection());
        createHeroes();
    }
    public static Hero[] createHeroes() {
        Hero Mechnik = new Hero("Mechnik",300,150);
        Hero Mag = new Hero("Mag",300, 100, "fair");
        Hero Medic = new Hero("Medic", 350, 100);
        Hero createHeroes[] = {Mechnik, Mag, Medic};
        for (int i = 0; i < createHeroes.length; i++) {
            System.out.println( createHeroes[i].getName()+": "+createHeroes[i].getDamage() + "  "
                    + createHeroes[i].getHealth() + " " + createHeroes[i].getSuperPower() );
        }
        return createHeroes;
    }
}