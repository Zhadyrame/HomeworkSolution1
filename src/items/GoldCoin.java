package items;
import player.Player;

public class GoldCoin extends Item {
    private int value;

    public GoldCoin(int value) {
        super("Золотая монета");
        this.value = value;
    }

    @Override
    public void use(Player player) {
        System.out.println("Игрок получил " + value + " монет.");
    }
}
