package com.example.safarnama;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity8 extends AppCompatActivity {

    RecyclerView recycler;
    List<Model2> modelList1;
    RecyclerView.Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        modelList1 = new ArrayList<>();
        recycler = findViewById(R.id.recyclerView);
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        //call our items
        modelList1.add(new Model2(R.drawable.mhotel,"Citrus Chamber","Free Breakfast, Restaurant and bar","Airy rooms in a posh hotel with an outdoor pool, a restaurant & a spa, plus free breakfast. ","4.2","Free Wifi","Pool","For more information visit:https://www.citrushotels.com/"));
        modelList1.add(new Model2(R.drawable.mhotel1,"Valley View Resort","Breakfast","Unfussy quarters in a relaxed budget hotel with vegetarian dining, an indoor pool & mountain views. ","3.9","Free Wifi","Outdoor Pool","Valley View Rd, Near Market, Mahabaleshwar, Maharashtra 412806•077580 03401"));
        modelList1.add(new Model2(R.drawable.mhotel2,"Om niwas cottage Mahabaleshwar","Breakfast","House No.27, Ganesh Nagar Housing Socitey, Satara-Medha-Mahabaleshwar Rd, Datta Krupa Housing Society, Mahabaleshwar, Maharashtra 412806","3","Free Wifi","Pool","House No.27, Ganesh Nagar Housing Socitey, Satara-Medha-Mahabaleshwar Rd, Datta Krupa Housing Society, Mahabaleshwar, Maharashtra 412806"));
        modelList1.add(new Model2(R.drawable.mhotel3,"Le Méridien Mahabaleshwar Resort & Spa","Free Breakfast","Air conditioning,Fitness center,Room Service,Free Parking","4.6","Free Wifi","Outdoor Pool","For more information visit:https://www.marriott.com/en-us/hotels/pnqdm-le-meridien-mahabaleshwar-resort-and-spa/overview/?scid=bb1a189a-fec3-4d19-a255-54ba596febe2&y_source=1_Mjg2OTk5Ny03MTUtbG9jYXRpb24ud2Vic2l0ZQ%3D%3D"));



        adapter = new ViewHolder2(modelList1,getApplicationContext());
        //set the adapter into recyclerView
        recycler.setAdapter(adapter);
    }
}
