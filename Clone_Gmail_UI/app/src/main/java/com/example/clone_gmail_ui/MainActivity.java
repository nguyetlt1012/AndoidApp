package com.example.clone_gmail_ui;


import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterViewAnimator;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import com.*;


public class MainActivity extends AppCompatActivity {


    List<ItemModel> items;
    ItemAdapter adapter;

//    Faker faker = new Faker();
//faker.name.name();          // Tạo tên ngẫu nhiên
//faker.lorem.sentence();     // Tạo câu ngẫu nhiên
//faker.lorem.paragraph();    // Tạo đoạn văn ngẫu nhiên

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items = new ArrayList<>();
       // items.add(new ItemModel(R.drawable.thumb1,"Title 1","Content 1"));
        items.add(new ItemModel(R.drawable.thumb3,"Edurila.com","$19 Only(First 10 spots)-Bestselling","Are you looking to Learn Web Designing","12:00 AM"));

        adapter= new ItemAdapter(items);

        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);


    }
}