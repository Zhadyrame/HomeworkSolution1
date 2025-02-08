abstract class Enemy {
    protected String name;
    protected int damage;

    public Enemy(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public void attack(Player player) {
        System.out.println(name + " attacks for " + damage + " damage!");
        player.takeDamage(damage);
    }
}