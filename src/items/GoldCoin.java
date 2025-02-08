package items;
import player.Player;

public class GoldCoin extends Item {
    private int value;

    public GoldCoin(int value) {
        super("Gold");
        this.value = value;
    }

    @Override
    public void use(Player player) {
        System.out.println("Gold " + value + " get.");
    }
}
