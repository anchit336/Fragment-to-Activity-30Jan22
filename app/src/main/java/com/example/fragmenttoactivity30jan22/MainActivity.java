package com.example.fragmenttoactivity30jan22;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.fragmenttoactivity30jan22.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        MyFirstFragment myFirstFragment = new MyFirstFragment();

        fragmentTransaction.add(R.id.linear, myFirstFragment);

        fragmentTransaction.commit();
    }

    public void takeData(String userName, String userEmail)
    {
        binding.name.setText(userName);
        binding.email.setText(userEmail);
    }
}