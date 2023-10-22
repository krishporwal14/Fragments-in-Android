package com.example.fragmentsex;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.app.FragmentManager;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button ff, sf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ff = findViewById(R.id.firstFragment);
        sf = findViewById(R.id.secondFragment);
        ff.setOnClickListener(view -> {
            loadFragment(new FirstFragment());
        });
        sf.setOnClickListener(view -> {
            loadFragment(new SecondFragment());
        });
    }

    public void loadFragment(Fragment fragment) {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fl1, fragment);
        ft.commit();
    }
}