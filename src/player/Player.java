package src.player;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int health;
    private int experience;
    private List<String> inventory;

    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.experience = 0;
        this.inventory = new ArrayList<>();
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public void gainExperience(int exp) {
        this.experience += exp;
    }

    public void pickUpItem(String item) {
        this.inventory.add(item);
    }

    public int getHealth() {
        return health;
    }

    public int getExperience() {
        return experience;
    }

    public List<String> getInventory() {
        return inventory;
    }

    public String getName() {
        return name;
    }
}


