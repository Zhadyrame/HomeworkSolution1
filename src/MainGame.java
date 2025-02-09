package src;

import src.player.Player;
import src.combat.CombatManager;
import src.level.LevelManager;
import src.items.Item;
import src.enemies.Enemy;

public class MainGame {
    public static void main(String[] args) {
        Player player = new Player("Adventurer");
        LevelManager levelManager = new LevelManager();

        while (player.getHealth() > 0 && levelManager.getEnemies().size() > 0) {
            System.out.println("=== Level " + levelManager.getLevel() + " ===");
            for (Enemy enemy : levelManager.getEnemies()) {
                CombatManager.fight(player, enemy);
                if (player.getHealth() <= 0) {
                    System.out.println(player.getName() + " has perished. Game Over.");
                    return;
                }
            }
            for (Item item : levelManager.getItems()) {
                item.use(player);
            }
            levelManager.advanceLevel();
        }
        System.out.println("Congratulations! You completed the adventure with " + player.getExperience() + " experience points!");
    }
}


