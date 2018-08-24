package de.garritfra.casca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import de.garritfra.casca.view.InventoryActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button viewInventoryButton = findViewById(R.id.view_inventory_button);

        viewInventoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewInventoryIntent = new Intent(MainActivity.this, InventoryActivity.class);
                MainActivity.this.startActivity(viewInventoryIntent);
            }
        });
    }
}
