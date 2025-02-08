class LevelManager {
    private int level = 1;

    public void nextLevel() {
        level++;
        System.out.println("Welcome to level " + level);
    }
}
