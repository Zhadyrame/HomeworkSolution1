import java.util.ArrayList;
import java.util.List;

class LevelManager {
    private int currentLevel = 1;

    public void advanceLevel(Player player) {
        System.out.println("🎉 Level up! " + (currentLevel + 1));
        currentLevel++;
        player.restoreHealth();
    }

    public List<Enemy> generateEnemies(int level) {
        List<Enemy> enemies = new ArrayList<>();
        if (level == 1) {
            enemies.add(new Skeleton());
            enemies.add(new Zombie());
        } else if (level == 2) {
            enemies.add(new Vampire());
        } else if (level == 3) {
            enemies.add(new Zombie());
            enemies.add(new Vampire());
        }
        return enemies;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }
}
