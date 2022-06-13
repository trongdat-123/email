package com.example.email;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<ItemModel> items = new ArrayList<>();
        items.add(new ItemModel("Edurila.com", "12:34 PM", "$19 Only (first 10 spots) - Bestselling. Are you looking to learn Web Designing"));
        items.add(new ItemModel( "Chris Abad", "11:22 AM", "Help make Campaign Monitor better. Let us know your thoutghts! No Images"));
        items.add(new ItemModel( "Tuto.com", "11:04 AM", "8h de formation gratuite et les. Photoshop, SEO, Blener, CSS, ..."));
        items.add(new ItemModel( "support", "10:26 AM", "Societe Ovh: suivi de vos services. SAS OVH - http://www.ovh.com"));
        items.add(new ItemModel( "Matt from lonic", "11:34 AM", "The new lonic Creator Is here.  Announcing the all-new Creator"));
        ItemAdapter adapter = new ItemAdapter(this, items);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}