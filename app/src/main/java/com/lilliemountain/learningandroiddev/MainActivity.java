package com.lilliemountain.learningandroiddev;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rec;
    EditText editText;
    StringRecyclerAdapter sRA;
    List<String> text=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.text);
        rec=findViewById(R.id.rec);
        sRA=new StringRecyclerAdapter(text);
        rec.setAdapter(sRA);
        rec.setLayoutManager(new LinearLayoutManager(this));
        findViewById(R.id.update).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string=editText.getText().toString();
                text.add(string);
                sRA=new StringRecyclerAdapter(text);
                rec.setAdapter(sRA);
                rec.setLayoutManager(new LinearLayoutManager(v.getContext()));
            }
        });
    }
}
