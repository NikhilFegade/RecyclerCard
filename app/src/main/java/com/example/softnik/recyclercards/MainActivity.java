package com.example.softnik.recyclercards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.node,"Clicked at Studio"));
        exampleList.add(new ExampleItem(R.drawable.oner,"Clicked at Rome"));
        exampleList.add(new ExampleItem(R.drawable.twor,"Clicked at Japan"));
        exampleList.add(new ExampleItem(R.drawable.threer,"Clicked at Chine"));
        exampleList.add(new ExampleItem(R.drawable.fourr,"Clicked at US"));
        exampleList.add(new ExampleItem(R.drawable.fiver,"Clicked at London"));
        exampleList.add(new ExampleItem(R.drawable.sixr,"Clicked at India"));

        recyclerView=findViewById(R.id.recyclerView);

        //improve performance
        recyclerView.setHasFixedSize(true);


        layoutManager=new LinearLayoutManager(this);
        adapter=new ExampleAdapter(exampleList);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
