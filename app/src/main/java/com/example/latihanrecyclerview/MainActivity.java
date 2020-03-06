package com.example.latihanrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.latihanrecyclerview.Adapter.mahasiswaAdapter;
import com.example.latihanrecyclerview.model.mahasiswa;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<mahasiswa> mhs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView= findViewById(R.id.rv);
        mhs = mahasiswa.createmhslist(10);

        mahasiswaAdapter mahasiswaAdapter = new mahasiswaAdapter(mhs);
        recyclerView.setAdapter(mahasiswaAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


}
