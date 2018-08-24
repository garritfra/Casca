package de.garritfra.casca.model;

public class Player {
    private Inventory inventory;
    private String name;

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public Inventory getInventory() {
        return inventory;
    }
}
