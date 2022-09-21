package com.example.safarnama.ui.account;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.safarnama.MainActivity;
import com.example.safarnama.MainActivity2;
import com.example.safarnama.MainActivity4;
import com.example.safarnama.R;
import com.example.safarnama.databinding.FragmentAccountBinding;

import com.example.safarnama.databinding.FragmentHomeBinding;
import com.example.safarnama.ui.account.AccountViewModel;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

import java.security.cert.CertPathBuilder;


public class AccountFragment extends Fragment implements  View.OnClickListener{
    Button button4;


        private FragmentAccountBinding binding;


        public View onCreateView(@NonNull LayoutInflater inflater,
                                 ViewGroup container, Bundle savedInstanceState) {


            View v = inflater.inflate(R.layout.fragment_account, container, false);
            button4 = (Button) v.findViewById(R.id.button4);


            button4.setOnClickListener(this);




            return v;
        }

        @Override
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.button4:
                    Intent intent = new Intent(getActivity(), MainActivity.class);
                    startActivity(intent);
                   getActivity() .finish();
                
            }}


}

