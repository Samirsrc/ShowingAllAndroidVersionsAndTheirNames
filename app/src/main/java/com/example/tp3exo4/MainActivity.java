package com.example.tp3exo4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        createMenu(menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        return MenuChoice(item);
    }

    private void createMenu(Menu menu) {
        MenuItem mnu1 = menu.add(0, 0, 0, "Cupecake");
        mnu1.setAlphabeticShortcut('a');
        MenuItem mnu2 = menu.add(0, 1, 1, "Eclair");
        mnu1.setAlphabeticShortcut('b');
        MenuItem mnu3 = menu.add(0, 2, 2, "Honneycomb");
        mnu1.setAlphabeticShortcut('c');
        MenuItem mnu4 = menu.add(0, 3, 3, "Ice Cream Sandwidch");
        mnu1.setAlphabeticShortcut('d');
        MenuItem mnu5 = menu.add(0, 4, 4, "Jelly Bean");
        mnu1.setAlphabeticShortcut('e');
        MenuItem mnu6 = menu.add(0, 5, 5, "Kitkat");
        mnu1.setAlphabeticShortcut('f');
        MenuItem mnu8 = menu.add(0, 6, 6, "Lollipop");
        mnu1.setAlphabeticShortcut('g');


    }

    private boolean MenuChoice(MenuItem item) {
        switch (item.getItemId()) {
            case 0:
                Toast.makeText(this, "Version 1.5", Toast.LENGTH_LONG).show();
                return true;
            case 1:
                Toast.makeText(this, "Version 2.0", Toast.LENGTH_LONG).show();
                return true;
            case 2:
                Toast.makeText(this, "Version 3.0", Toast.LENGTH_LONG).show();
                return true;
            case 3:
                Toast.makeText(this, "Version 4.0", Toast.LENGTH_LONG).show();
                return true;
            case 4:
                Toast.makeText(this, "Version 4.1", Toast.LENGTH_LONG).show();
                return true;
            case 5:
                Toast.makeText(this, "Version 4.4", Toast.LENGTH_LONG).show();
                return true;
            case 6:
                Toast.makeText(this, "Version 5.0", Toast.LENGTH_LONG).show();
                return true;


        }

        return false;

    }
}


