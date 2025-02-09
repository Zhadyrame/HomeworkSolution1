package src.level;

import java.util.ArrayList;
import java.util.List;
import src.enemies.Enemy;
import src.enemies.Skeleton;
import src.enemies.Zombie;
import src.enemies.Vampire;
import src.items.*;

public class LevelManager {
    private int level;
    private List<Enemy> enemies;
    private List<Item> items;

    public LevelManager() {
        this.level = 1;
        this.enemies = new ArrayList<>();
        this.items = new ArrayList<>();
        initializeLevel();
    }

    private void initializeLevel() {
        enemies.clear();
        items.clear();
        if (level == 1) {
            enemies.add(new Skeleton());
            enemies.add(new Zombie());
            items.add(new GoldCoin());
            items.add(new HealthElixir());
        } else if (level == 2) {
            enemies.add(new Vampire());
            items.add(new MagicScroll());
        } else if (level == 3) {
            enemies.add(new Vampire());
            enemies.add(new Zombie());
            items.add(new HealthElixir());
            items.add(new GoldCoin());
        }
    }

    public void advanceLevel() {
        level++;
        initializeLevel();
    }

    public List<Enemy> getEnemies() {
        return enemies;
    }

    public List<Item> getItems() {
        return items;
    }

    public int getLevel() {
        return level;
    }
}