package com.example.baikiemtra_giuaky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<Item> arrayList;
    private AdapterChitieu adtFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);
        arrayList = new ArrayList<>();
        arrayList.add(new Item("Ăn uống","",R.drawable.anuong));
        arrayList.add(new Item("Đi chợ","",R.drawable.shopping));
        arrayList.add(new Item("Ăn ngoài","",R.drawable.anngoai));
        arrayList.add(new Item("Gaz","",R.drawable.gaz));
        arrayList.add(new Item("Điện","",R.drawable.dien));
        arrayList.add(new Item("Nước","",R.drawable.nuoc));
        arrayList.add(new Item("Cho vay","",R.drawable.money));
        arrayList.add(new Item("Bạn bè","",R.drawable.friend));

        adtFood = new AdapterChitieu(MainActivity.this, R.layout.layout_iem, arrayList);
        listView.setAdapter(adtFood);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, SecondActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}