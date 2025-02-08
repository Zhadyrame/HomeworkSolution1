package items;
import player.Player;

public class HealthElixir extends Item {
    private int healAmount;

    public HealthElixir(int healAmount) {
        super("Helth");
        this.healAmount = healAmount;
    }

    @Override
    public void use(Player player) {
        System.out.println(" +" + healAmount + " HP!");
    }
}

