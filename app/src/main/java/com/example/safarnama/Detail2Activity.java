package com.example.safarnama;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.widget.ImageView;
import android.widget.TextView;
public class Detail2Activity extends AppCompatActivity {
    ImageView imageView;
    TextView name, tag,tag1,tag2,tag3,tag4,tag5;
    String alphaName, alphaTag,alphaTag1,alphaTag2,alphaTag3,alphaTag4,alphaTag5;
    int alphaImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);
        imageView = findViewById(R.id.image);
        name = findViewById(R.id.name);
        tag = findViewById(R.id.tag);
        tag1=findViewById(R.id.tag1);
        tag2=findViewById(R.id.tag2);
        tag3=findViewById(R.id.tag3);
        tag4=findViewById(R.id.tag4);
        tag5=findViewById(R.id.tag5);
        tag5.setLinksClickable(true);
        Linkify.addLinks(tag5, Linkify.WEB_URLS);
        tag5.setMovementMethod(LinkMovementMethod.getInstance());

        //get the intent
        alphaName = getIntent().getStringExtra("name");
        alphaTag = getIntent().getStringExtra("tag");
        alphaTag1=getIntent().getStringExtra("tag1");
        alphaTag2 = getIntent().getStringExtra("tag2");
        alphaTag3 = getIntent().getStringExtra("tag3");
        alphaTag4 = getIntent().getStringExtra("tag4");
        alphaTag5 = getIntent().getStringExtra("tag5");
        alphaImage = getIntent().getIntExtra("image",0);
        //now set the get values in the respective widgets
        name.setText(alphaName);
        tag.setText(alphaTag);
        tag1.setText(alphaTag1);
        tag2.setText(alphaTag2);
        tag3.setText(alphaTag3);
        tag4.setText(alphaTag4);
        tag5.setText(alphaTag5);

        imageView.setImageResource(alphaImage);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}