package enemies;

public abstract class Enemy {
    protected String name;
    protected int health;
    protected int attackPower;

    public Enemy(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void attack(Player player) {
        System.out.println(name + " атакует игрока!");
        player.takeDamage(attackPower);
    }

    public boolean isDefeated() {
        return health <= 0;
    }

    public abstract void specialAbility();
}
