package com.example.fragmentsex;
import android.widget.Toast;
import android.widget.Button;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;

public class FirstFragment extends Fragment {
    View v;
    Button btn1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.first_fragment, container, false);
        btn1 = v.findViewById(R.id.btn1);
        btn1.setOnClickListener(view -> {
            Toast.makeText(getActivity(), "This is First Fragment", Toast.LENGTH_SHORT).show();
        });
        return v;
    }
}
