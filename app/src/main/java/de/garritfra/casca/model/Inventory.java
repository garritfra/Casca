package de.garritfra.casca.model;

import android.content.ClipData;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items;

    public Inventory() {
        this.items = new ArrayList<>();
        items.add(new Item("Hammer", "To be used on nails only"));
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
