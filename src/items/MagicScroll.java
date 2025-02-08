package items;
import player.Player;

public class MagicScroll extends Item {
    public MagicScroll() {
        super("Магический свиток");
    }

    @Override
    public void use(Player player) {
        System.out.println("Игрок получил магическое усиление!");
    }
}
