package items;
import player.Player;

public class MagicScroll extends Item {
    public MagicScroll() {
        super("Scroll");
    }

    @Override
    public void use(Player player) {
        System.out.println("+power!");
    }
}
