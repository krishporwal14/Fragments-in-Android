package com.example.fragmentsex;
import android.os.Bundle;
import android.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.Toast;
import android.widget.Button;

public class SecondFragment extends Fragment {
    View v;
    Button btn2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.second_fragment, container, false);
        btn2 = v.findViewById(R.id.btn2);
        btn2.setOnClickListener(view -> {
            Toast.makeText(getActivity(), "This is Second Fragment", Toast.LENGTH_SHORT).show();
        });
        return v;
    }
}
