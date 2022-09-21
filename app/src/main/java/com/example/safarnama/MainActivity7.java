package com.example.safarnama;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
public class MainActivity7 extends AppCompatActivity {
    RecyclerView recycler;
    List<Model> modelList;
    RecyclerView.Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        modelList = new ArrayList<>();
        recycler = findViewById(R.id.recyclerView);
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        //call our items
        modelList.add(new Model(R.drawable.t1,"Ajanta-Ellora Caves","Ajanta and Ellora caves, considered to be one of the finest examples of ancient rock-cut caves, are located near Aurangabad in Maharashtra, India. Ajanta and Ellora caves complex is adorned with beautiful sculptures, paintings, and frescoes and include Buddhist monasteries, Hindu and Jain temples. The Ajanta caves are 29 in number and were built between the 2nd century BC and 6th century AD, whereas the Ellora Caves are more spread out and 34 in number and dates to the period between 6th and 11th Century AD.\n" +
                "\n" +
                "Ajanta and Ellora caves are designated as UNESCO World Heritage Sites and are quite popular among travelers worldwide. Ajanta Caves, located around 99km north of Aurangabad, are mostly Buddhist sites and were used as a retreat by Buddhist Monks. Ellora is just 15 km west of Aurangabad and has a better mix of Hindu, Jain, and Buddhist sites. These hand-carved caves were built and sponsored by the Indian rulers of those periods and almost buried by thick forests. One of the most famous places in the entire Ajanta and Ellora Caves is the Kailash Temple, which is also the single most massive monolithic structure globally. These rock-cut caves containing carvings are some of the best examples of ancient Indian architecture and sculpture.\n" +
                "\n"));
        modelList.add(new Model(R.drawable.t2,"Mahabaleshwar","Mahabaleshwar is a hill station located in the Western Ghats, in Satara district of Maharashtra. Apart from its strawberries, Mahabaleshwar is also well known for its numerous rivers, magnificent cascades and majestic peaks. It is among the most sought after weekend getaways from Pune & Mumbai, located about 120km south-west of Pune and 285km from Mumbai.\n" +
                "\n" +
                "Mahabaleshwar is also a sacred pilgrimage place for Hindus as the Krishna river originates from here. Once a summer capital of the British, the hill station of Mahabaleshwar comprises of ancient temples, boarding schools, manicured and lush green dense forest, waterfalls, hills, valleys. It is often used as a base to visit the magnificent Pratapgad Fort, located an hour away.\n" +
                "\n" +
                "Malcolm Peth, Old Kshetra Mahabaleshwar and a region of the Shindola village are the three villages that make up Mahabaleshwar."));
        modelList.add(new Model(R.drawable.t3,"Lawasa","Known as India's newest hill station, the Lavasa Corporation is constructing this private city. The city is a beautiful project, stylistically based on the Italian town Portofino. Spreading across 7 hills, covering an area of 25000 acres, Lavasa is a perfect blend of beauty and infrastructure.\n" +
                "\n" +
                "Lavasa is a privately planned hill city located near Pune in Maharashtra. This modern day hill station is an enjoyable retreat for all its visitors and has a lot to offer to its tourists from picturesque sceneries to an extremely well-developed infrastructure including hotels, resorts, educational institutes, malls, residential property, IT companies etc. Lavasa is turning out to be a new hangout for people looking for a small trip away from the hustle and bustle of hectic city life. It is absolutely a leisure holiday destination located in the middle of lush green hills. Lavasa city is located in the Western Ghats of Maharashtra and manages to charm one with its mesmerising views. It is situated in Mose Valley near Pune at a distance of 65 Km, about an hour drive, and from Mumbai, it is approximately 200 Km away. Spread over 25,000 acres of land, it covers 65Km of lakefront that gives the whole city a mesmerising look."));
        modelList.add(new Model(R.drawable.t4,"Gateway Of India","The Gateway of India is an arch monument built during the 20th century in Bombay, India. The monument was erected to commemorate the landing of King George V and Queen Mary at Apollo Bunder on their visit to India in 1911.\n" +
                "\n" +
                "Built in Indo-Saracenic style, the foundation stone for the Gateway of India was laid on 31 March 1911. The structure is an arch made of basalt, 26 metres (85 feet) high. The final design of George Wittet was sanctioned in 1914 and the construction of the monument was completed in 1924. The Gateway was later used as a symbolic ceremonial entrance to India for Viceroys and the new Governors of Bombay.  It served to allow entry and access to India.\n" +
                "\n" +
                "The Gateway of India is located on the waterfront at Apollo Bunder area at the end of Chhatrapati Shivaji Marg in South Mumbai and overlooks the Arabian Sea. The monument has also been referred to as the Taj Mahal of Mumbai, and is the city’s top tourist attraction."));
        modelList.add(new Model(R.drawable.t5,"Konkan ","Konkan is a ribbon of land on the west India coast running from Thane in the north to Karwar in the south, with the Arabian Sea to the west and the Western Ghats in the east.[1] The hinterland east of the coast has numerous river valleys and riverine islands among the hilly slopes leading up into the tablelands of the Deccan Plateau. The region has been recognized by name since at least the time of Strabo in the third century CE.[1] The best-known islands of Konkan are Goa Island, location of the state of Goa's capital Panjim, and the seven islands of Bombay on which sits Bombay (Mumbai), the capital of Maharashtra.Konkan is a beautiful stretch of the western coastline of India. It has a 720 km long sea face which extends from Dahanu and Bordi in the north up to Vengurla in the south. It is made up of the seven districts Mumbai City, Mumbai Suburban, Thane, Palghar, Raigad, Ratnagiri and Sindhudurg.\n" +
                "\n" +
                "Konkan region boosts several places of geographical, cultural and architectural interest. The coastline is dotted with palm grooves, mango trees planted in the agricultural fields, temples, creeks, sea forts, harbours, hot water springs, caves, and the tiled homes.\n" +
                "\n" +
                "It is one of the chief tourist regions of Maharashtra. The beautiful beaches, greenery, world famous Warli art and sea forts of Konkan magnetize a constant flow of visitors and tourists."));
        modelList.add(new Model(R.drawable.t6," Matheran","The Matheran hill station is the best place to enjoy the sunset and sunrise view along with some mind blowing sceneries to keep you fresh and up front. This extraordinary hill station offers the best tourist places in Matheran which are untouched and undisturbed by the rustling city life that surrounds the town. The place is actually located on the Western Ghats that ranges in an elevation of around 800 meter above the sea level. The place always has a pleasant weather to enjoy during any time of the year, but its beauty gets added up during the season of rain and thunderstorm.\n" +
                "\n" +
                " Another thing about the beautiful hill station is that it is eco friendly and has no rush of cars and buses honking on the street. The major was taken by the government of Maharashtra in order to protect Matheran. The best thing about this place is that it is like a quiet and relaxing place with no buzzing of horns and pollution and along with that it contains some mesmerizing places and views of the extraordinary nature that will leave you bewitched of its beauty and make you feel relax and stress free.\n" +
                "\n" +
                " Just not only trekker, Matheran is a treat for the photographers also to explore and capture the best of the beauty of the beautiful hill station. The beauty of Western Ghats, Matheran is the smallest hill station of India. Travellers and tourists who visit the place love exploring the place by walking on foot. By which it becomes more exciting to get lost in the scenic beauty of the town while finding your way. Plan your trip to Matheran and indulge yourself in various activities that Matheran provides like camping, trekking, rappelling etc.\n" +
                "\n" +
                "Matheran town is the best option for a person who loves getting lost in the nature and also for those who wants to take a break from their busy city life. The tourist places in Matheran are absolutely breathtaking."));
        modelList.add(new Model(R.drawable.t7,"Lonavla","Lonavala is a hill station surrounded by green valleys in western India near Mumbai. The Karla Caves and the Bhaja Caves are ancient Buddhist shrines carved out of the rock. They feature massive pillars and intricate relief sculptures. South of the Bhaja Caves sits the imposing Lohagad Fort, with its 4 gates. West of here is Bhushi Dam, where water overflows onto a set of steps during rainy season."));
        //init the adapter with model list and context
        adapter = new ViewHolder(modelList,getApplicationContext());
        //set the adapter into recyclerView
        recycler.setAdapter(adapter);
    }
}