package enemies;

public class Vampire extends Enemy {
    public Vampire() {
        super("Вампир", 70, 12);
    }

    @Override
    public void specialAbility() {
        System.out.println("Oops!");
    }
}
