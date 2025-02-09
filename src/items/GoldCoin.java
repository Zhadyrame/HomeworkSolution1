package src.items;

import src.player.Player;

public class GoldCoin implements Item {
    @Override
    public void use(Player player) {
        player.gainExperience(5);
    }
}