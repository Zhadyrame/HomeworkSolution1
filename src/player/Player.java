import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Player {
    private String name;
    private int health;
    private List<Item> inventory;
    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.inventory = new ArrayList<>();
    }
    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            System.out.println(name + " has been defeated!");
        }
    }
    public void addItem(Item item) {
        inventory.add(item);
        System.out.println(name + " picked up " + item.getName());
    }
    public int getHealth() {
        return health;
    }
}

