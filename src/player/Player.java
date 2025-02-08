package player;
import items.*;
import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int health;
    private int experience;
    private List<Item> inventory;

    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.experience = 0;
        this.inventory = new ArrayList<>();
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            System.out.println(name + " game over!");
        }
    }

    public void addExperience(int exp) {
        this.experience += exp;
        System.out.println(name + " exp" + exp + " .");
    }

    public void pickUpItem(Item item) {
        inventory.add(item);
        System.out.println(name + " get " + item.getName());
    }

    public void useItem(Item item) {
        item.use(this);
    }

    public int getHealth() { return health; }
}


