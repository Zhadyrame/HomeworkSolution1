package adventuregame.items;

import adventuregame.player.Player;
import java.util.Random;

public class ItemManager {
    public void giveRandomItem(Player player) {
        Random random = new Random();
        Item item;
        switch (random.nextInt(3)) {
            case 0: item = new GoldCoin(); break;
            case 1: item = new HealthElixir(); break;
            case 2: item = new MagicScroll(); break;
            default: item = new GoldCoin(); break;
        }
        player.addItem(item);
    }
}
