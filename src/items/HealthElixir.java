class HealthElixir implements Item {
    @Override
    public void use(Player player) {
        player.heal(20);
        System.out.println(player.getName() + " used a Health Elixir and restored 20 HP!");
    }
}

