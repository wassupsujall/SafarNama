package com.example.safarnama.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.safarnama.MainActivity4;
import com.example.safarnama.MainActivity5;
import com.example.safarnama.MainActivity6;
import com.example.safarnama.MainActivity7;
import com.example.safarnama.R;
import com.example.safarnama.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment implements View.OnClickListener {
    ImageButton button;
    ImageButton button2;
    ImageButton button3;
    private FragmentHomeBinding binding;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.fragment_home, container, false);
        button = (ImageButton) v.findViewById(R.id.button);
        button2 = (ImageButton) v.findViewById(R.id.button2);
        button3 = (ImageButton) v.findViewById(R.id.button3);

        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);



        return v;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.button:
                Intent intent = new Intent(getActivity(), MainActivity4.class);
                startActivity(intent);
           break;

            case R.id.button2:
                Intent i = new Intent(getActivity(), MainActivity7.class);
                startActivity(i);
                break;

            case R.id.button3:
                Intent intent1 = new Intent(getActivity(), MainActivity5.class);
                startActivity(intent1);
                break;
        }
    }
}
