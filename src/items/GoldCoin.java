class GoldCoin implements Item {
    @Override
    public void use(Player player) {
        System.out.println(player.getName() + " collected a Gold Coin!");
    }
}
