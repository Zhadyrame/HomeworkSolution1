package src.items;

import src.player.Player;

public class HealthElixir implements Item {
    @Override
    public void use(Player player) {
        player.takeDamage(-20);
    }
}
