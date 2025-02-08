class MagicScroll implements Item {
    @Override
    public void use(Player player) {
        System.out.println(player.getName() + " used a Magic Scroll!");
    }
}