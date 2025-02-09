package src.combat;

import src.player.Player;
import src.enemies.Enemy;

public class CombatManager {
    public static void fight(Player player, Enemy enemy) {
        System.out.println(player.getName() + " engages in combat with " + enemy.getName() + "!");
        player.takeDamage(enemy.getDamage());
        player.gainExperience(enemy.getExperience());
    }
}


