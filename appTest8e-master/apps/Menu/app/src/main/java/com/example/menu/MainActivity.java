package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView contact = findViewById(R.id.Id_contact);
        registerForContextMenu(contact);
    }

    //Show menu
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.setHeaderTitle("Opciones:");
        getMenuInflater().inflate(R.menu.opciones1, menu);
    }

    //Actions Menu Options
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.opt_1 :
                Toast.makeText(this, "Edit contact", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.opt_2 :
                Toast.makeText(this, "Delete contact", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.opt_3 :
                Toast.makeText(this, "Call contact", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.opt_4 :
                Toast.makeText(this, "Share contact", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }
}



















