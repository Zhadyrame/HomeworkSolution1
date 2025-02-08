package adventuregame;

import adventuregame.player.Player;
import adventuregame.combat.CombatManager;
import adventuregame.enemies.*;
import adventuregame.items.*;
import adventuregame.level.LevelManager;
import adventuregame.score.ScoreManager;

import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player("Hero");
        LevelManager levelManager = new LevelManager();
        CombatManager combatManager = new CombatManager();
        ScoreManager scoreManager = new ScoreManager();

        System.out.println("Welcome to SOLID-Refactored Adventure Game!");

        while (player.isAlive()) {
            System.out.println("Choose an action: [fight] [collect item] [next level] [exit]");
            String action = scanner.nextLine().toLowerCase();

            switch (action) {
                case "fight":
                    Enemy enemy = levelManager.spawnEnemy();
                    combatManager.fight(player, enemy);
                    break;
                case "collect item":
                    ItemManager itemManager = new ItemManager();
                    itemManager.giveRandomItem(player);
                    break;
                case "next level":
                    levelManager.advanceLevel();
                    break;
                case "exit":
                    System.out.println("Thanks for playing!");
                    return;
                default:
                    System.out.println("Invalid action. Try again.");
                    break;
            }
        }

        System.out.println("Game Over. Your score: " + scoreManager.getScore());
        scanner.close();
    }
}

