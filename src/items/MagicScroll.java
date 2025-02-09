package src.items;

import src.player.Player;

public class MagicScroll implements Item {
    @Override
    public void use(Player player) {
        player.gainExperience(15);
    }
}