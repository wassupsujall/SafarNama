package com.example.safarnama;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity10 extends AppCompatActivity {

    RecyclerView recycler;
    List<Model3> modelList1;
    RecyclerView.Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        modelList1 = new ArrayList<>();
        recycler = findViewById(R.id.recyclerView);
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        //call our items
        modelList1.add(new Model3(R.drawable.ehotel1,"Ellora Heritage Resort","Free Breakfast, Restaurant and bar","Understated quarters in a modest countryside resort with a relaxed eatery, a garden & loaner bikes.","3","Free Wifi","Pool","For more information visit:http://elloraheritageresort.com/"));
        modelList1.add(new Model3(R.drawable.ehotel2,"Hotel ajanta green restaurant & resort","Breakfast","ajanta caves, Near ,Ajanta caves parking, at post, Fardapur, Maharashtra 431118•098224 43721 ","4.8","Free Wifi","Outdoor Pool","For more information visit:http://elloraheritageresort.com/"));
        modelList1.add(new Model3(R.drawable.ehotel3,"Hotel Kailas","Breakfast","Relaxed property featuring open-air dining & a playground, plus Ellora Caves views.","4","Free Wifi","Pool","For more information visit:http://hotelkailas.com/"));
        modelList1.add(new Model3(R.drawable.ehotel4,"Treebo Trend Aroma Executive","Free Breakfast","Samarth Nagar, Aurangabad, Maharashtra 431001","4.6","Free Wifi","Outdoor Pool","For more information visit:https://www.treebo.com/"));



        adapter = new ViewHolder3(modelList1,getApplicationContext());
        //set the adapter into recyclerView
        recycler.setAdapter(adapter);
    }
}
