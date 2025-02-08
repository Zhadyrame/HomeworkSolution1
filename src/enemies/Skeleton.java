package enemies;

public class Skeleton extends Enemy {
    public Skeleton() {
        super("Скелет", 50, 10);
    }

    @Override
    public void specialAbility() {
        System.out.println("Oops!");
    }
}
