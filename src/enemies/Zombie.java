package enemies;

public class Zombie extends Enemy {
    public Zombie() {
        super("Зомби", 80, 8);
    }

    @Override
    public void specialAbility() {
        System.out.println("Danger!");
        this.health += 5;
    }
}
