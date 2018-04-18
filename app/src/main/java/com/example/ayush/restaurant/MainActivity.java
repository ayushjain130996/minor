package com.example.ayush.restaurant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview);

        ArrayList<Table> table = new ArrayList<Table>();
        table.add(new Table("Table 1"));
        table.add(new Table("Table 2"));
        table.add(new Table("Table 3"));
        table.add(new Table("Table 4"));
        table.add(new Table("Table 5"));
        table.add(new Table("Table 6"));
        table.add(new Table("Table 7"));
        table.add(new Table("Table 8"));
        table.add(new Table("Table 9"));
        table.add(new Table("Table 10"));

        TableAdapter adapter = new TableAdapter(this, table);

        GridView gridView = (GridView) findViewById(R.id.gridview);

        gridView.setAdapter(adapter);
    }

    public void getMenu(View view) {
        Intent menuIntent = new Intent(this, MenuActivity.class);
        startActivity(menuIntent);
    }
}