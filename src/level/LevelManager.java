package level;

public class LevelManager {
    private int currentLevel = 1;

    public void nextLevel() {
        currentLevel++;
        System.out.println("Игрок перешел на уровень " + currentLevel);
    }

    public int getCurrentLevel() { return currentLevel; }
}

