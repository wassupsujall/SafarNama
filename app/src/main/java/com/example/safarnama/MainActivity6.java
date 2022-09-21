package com.example.safarnama;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity6 extends AppCompatActivity {

        RecyclerView recycler;
        List<Model1> modelList1;
        RecyclerView.Adapter adapter;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main6);
            modelList1 = new ArrayList<>();
            recycler = findViewById(R.id.recyclerView);
            recycler.setHasFixedSize(true);
            recycler.setLayoutManager(new LinearLayoutManager(this));
            //call our items
            modelList1.add(new Model1(R.drawable.hotel1,"Ginger Mumbai (Andheri East)","Free Breakfast, Restaurant and bar","Air conditioning,Fitness center,Room Service,Free Parking ","3","Free Wifi","Pool","For more information visit:https://www.gingerhotels.com/"));
            modelList1.add(new Model1(R.drawable.hotel2,"ITC Maratha, a Luxury Collection Hotel, Mumbai","Breakfast","Air conditioning,Fitness center,Room Service,Free Parking,Beach Access,Spa ","5","Free Wifi","Outdoor Pool","For more information visit:https://www.marriott.com/"));
            modelList1.add(new Model1(R.drawable.hotel3,"Radisson Blu Mumbai International Airport","Breakfast & Bar","Air conditioning,Fitness center,Room Service,Free Parking,Air Shuttle","4.4","Free Wifi","Pool","For more information visit:https://www.radissonhotels.com/en-us/hotels/radisson-blu-mumbai-airport?facilitatorId=GOOGLECHAP&cid=a:ps+b:ggl+c:apac+i:brand+e:rdb+d:ind+r:brt+f:en-US+g:ho+h:INMHBOMAIR+v:cf&gclid=Cj0KCQjwg_iTBhDrARIsAD3Ib5jHsdcfIQfhH9YQflHhV8uwLGBoxpySm20M1qhu0K-MalPjRtPVSLoaAoT6EALw_wcB&gclsrc=aw.ds"));
            modelList1.add(new Model1(R.drawable.hotel4,"Lemon Tree Premier, Mumbai International Airport","Free Breakfast","Air conditioning,Fitness center,Room Service,Free Parking","4.2","Free Wifi","Outdoor Pool","For more information visit:https://www.lemontreehotels.com/"));



            adapter = new ViewHolder1(modelList1,getApplicationContext());
            //set the adapter into recyclerView
            recycler.setAdapter(adapter);
        }
    }
