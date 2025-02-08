package combat;
import player.Player;
import enemies.Enemy;

public class CombatManager {
    public static void fight(Player player, Enemy enemy) {
        while (player.getHealth() > 0 && !enemy.isDefeated()) {
            enemy.attack(player);
            if (player.getHealth() <= 0) break;
            System.out.println("Attack!");
            enemy.takeDamage(20);
        }
        if (enemy.isDefeated()) {
            System.out.println("won!");
        }
    }
}

