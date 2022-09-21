package com.example.safarnama;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity9 extends AppCompatActivity {

    RecyclerView recycler;
    List<Model3> modelList2;
    RecyclerView.Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        modelList2 = new ArrayList<>();
        recycler = findViewById(R.id.recyclerView);
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        //call our items
        modelList2.add(new Model3(R.drawable.nhotel1,"Hotel Panorama - Luxury Hotel in Matheran","Free Breakfast, Restaurant and bar","Simple rooms with verandas in a relaxed hotel offering an outdoor pool, a restaurant & a game room.","4.3","Free Wifi","Pool","For more information visit:https://www.hotelpanorama.in/"));
        modelList2.add(new Model3(R.drawable.nhotel2,"Adamo The Resort, Matheran","Breakfast","Relaxed accommodations in a happening hotel with dining & an Ayurvedic spa, plus a pool & yoga.","4.1","Free Wifi","Outdoor Pool","https://www.adamohotels.com/matheran-hotels/adamo-the-resort-matheran?utm_source=google&utm_medium=organic"));
        modelList2.add(new Model3(R.drawable.nhotel3,"MTDC Resort, Matheran","Breakfast","Simple resort in a rainforest, offering rustic cottages & a laid-back restaurant.","4.1","Free Wifi","Pool","Dasturi Naka, near Railway Station, Matheran, Maharashtra 410102•1800 22 9930"));
        modelList2.add(new Model3(R.drawable.nhotel4,"Misty Matheran Resorts","Free Breakfast","Simple rooms, some with whirlpool baths, in a casual hotel offering a restaurant & a game room.","4.6","Free Wifi","Outdoor Pool","Matheran, Maharashtra 410102"));


        adapter = new ViewHolder3(modelList2,getApplicationContext());
        //set the adapter into recyclerView
        recycler.setAdapter(adapter);
    }
}
