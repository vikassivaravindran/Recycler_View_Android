package com.example.sample_recycler_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    public ArrayList<Student> studentEmails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        studentEmails = new ArrayList<>();

        for(int i = 0; i < 20; i++) {
            studentEmails.add(new Student("Hello from Vikas", " Hi! I am good, How are You?", "vikassivaravindran@gmail.com"));
        }

        recyclerView = findViewById(R.id.recycler_view);

        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter (see also next example)
        mAdapter = new StudentAdapter(studentEmails);
        recyclerView.setAdapter(mAdapter);

    }
}
