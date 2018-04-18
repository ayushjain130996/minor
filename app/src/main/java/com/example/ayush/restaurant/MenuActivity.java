package com.example.ayush.restaurant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview);

        ArrayList<Menu> menu = new ArrayList<Menu>();
        menu.add(new Menu("Starter",R.drawable.starter));
        menu.add(new Menu("Salad",R.drawable.salad));
        menu.add(new Menu("MainCourse",R.drawable.maincourse));
        menu.add(new Menu("Breads",R.drawable.breads));
        menu.add(new Menu("Chinese",R.drawable.chinese));
        menu.add(new Menu("South Indian",R.drawable.southindian));
        menu.add(new Menu("Beverages",R.drawable.beverages));
        menu.add(new Menu("Dessert",R.drawable.dessert));

        MenuAdapter adapter=new MenuAdapter(this,menu,R.color.category_family);

        GridView gridView=(GridView) findViewById(R.id.gridview);

        gridView.setAdapter(adapter);
    }
}

