public class Main {
    public static void main(String[] args) {
        Boss boss= new Boss();
        boss.setBossHealth(1000);
        boss.setBossDamage(700);
        boss.setBossProtection("щит");
        System.out.println(boss.getBossHealth()+ " " + boss.getBossDamage()+" " + boss.getBossProtection());
    }
}