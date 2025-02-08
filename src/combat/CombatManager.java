class CombatManager {
    public static void engage(Player player, Enemy enemy) {
        System.out.println("A wild " + enemy.getClass().getSimpleName() + " appears!");
        enemy.attack(player);
    }
}

