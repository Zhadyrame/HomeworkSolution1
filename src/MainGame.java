public class MainGame {
    public static void main(String[] args) {
        Player player = new Player("Hero");
        LevelManager levelManager = new LevelManager();
        Random random = new Random();

        levelManager.nextLevel();
        Enemy enemy = random.nextBoolean() ? new Skeleton() : new Vampire();
        CombatManager.engage(player, enemy);

        if (player.getHealth() > 0) {
            Item item = random.nextBoolean() ? new GoldCoin() : new HealthElixir();
            player.addItem(item);
        }
    }
}


