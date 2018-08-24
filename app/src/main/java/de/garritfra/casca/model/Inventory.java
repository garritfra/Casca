package de.garritfra.casca.model;

import android.content.ClipData;

import java.util.ArrayList;

class Inventory {
    private ArrayList<Item> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
