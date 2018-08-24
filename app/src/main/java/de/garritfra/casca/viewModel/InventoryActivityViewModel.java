package de.garritfra.casca.viewModel;

import android.arch.lifecycle.ViewModel;

import java.util.List;

import de.garritfra.casca.model.Item;
import de.garritfra.casca.model.Player;
import de.garritfra.casca.view.InventoryActivity;

public class InventoryActivityViewModel extends ViewModel {
    private List<Item> inventoryItems;

    public InventoryActivityViewModel() {
        this.inventoryItems = new Player().getInventory().getItems();
    }

    public List<Item> getInventoryItems() {
        return inventoryItems;
    }
}
