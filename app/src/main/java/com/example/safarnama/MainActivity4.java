package com.example.safarnama;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;

import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity implements View.OnClickListener {
    ImageButton imageButton9;
    ImageButton imageButton10;
    ImageButton imageButton14;
    ImageButton imageButton15;
    Spinner spinner;
    String[] SPINNERVALUES = {"Mumbai","Mahabaleshwar","Matheran","Ajanta & Ellora"};
    String SpinnerValue;
    Button GOTO;
    Intent intent;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        imageButton9 =findViewById(R.id.imageButton9);
        imageButton10 =findViewById(R.id.imageButton10);
        imageButton14 = findViewById(R.id.imageButton14);
        imageButton15 = findViewById(R.id.imageButton15);
        imageButton9.setOnClickListener(this);
        imageButton10.setOnClickListener(this);
        imageButton14.setOnClickListener(this);
        imageButton15.setOnClickListener(this);

        spinner =(Spinner)findViewById(R.id.spinner1);

        GOTO = (Button)findViewById(R.id.button1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity4.this, android.R.layout.simple_list_item_1, SPINNERVALUES);

        spinner.setAdapter(adapter);

        //Adding setOnItemSelectedListener method on spinner.
        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {

                SpinnerValue = (String)spinner.getSelectedItem();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub

            }
        });

        GOTO.setOnClickListener(v -> {
            // TODO Auto-generated method stub

            switch(SpinnerValue){

                case "Mumbai":
                    intent = new Intent(MainActivity4.this, MainActivity6.class);
                    startActivity(intent);
                    break;

                case "Mahabaleshwar":
                    intent = new Intent(MainActivity4.this, MainActivity8.class);
                    startActivity(intent);
                    break;

                case "Matheran":
                    intent = new Intent(MainActivity4.this, MainActivity9.class);
                    startActivity(intent);
                    break;
                case "Ajanta & Ellora"    :
                    intent = new Intent(MainActivity4.this, MainActivity10.class);
                    startActivity(intent);
                    break;



            }
        });

    }







    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.imageButton9:
                Intent intent = new Intent(MainActivity4.this, MainActivity6.class);
                startActivity(intent);
                break;

            case R.id.imageButton10:
                Intent i = new Intent(MainActivity4.this, MainActivity8.class);
                startActivity(i);
                break;

            case R.id.imageButton14:
                Intent intent1= new Intent(MainActivity4.this,MainActivity9.class);
                startActivity(intent1);
                break;

            case R.id.imageButton15:
                Intent intent2= new Intent(MainActivity4.this,MainActivity10.class);
                startActivity(intent2);
                break;




        }
    }
}