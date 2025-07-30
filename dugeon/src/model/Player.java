package model;
import java.util.List;
import java.util.ArrayList;

public class Player {
    private String name;
    private int health;
    private List<String> invetory;

    public Player(String name, int health){
        this.name = name;
        this.health = health;
        this.invetory = new ArrayList<>();
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " recibió: " + damage + " de daño, Vida Actual: " + health);

    }

    public void addItem(String item) {
        invetory.add(item);
        System.out.println(name + " recogió: " + item);
    }

    public boolean isAlive(){
        return health > 0;
    }

    public void showStatus(){
        System.out.println("\n=== Estado del Jugador===");
        System.out.println("Nombre: " + name);
        System.out.println("Vida: " + health);
        System.out.println("Inventario: " + invetory);
    }
}
