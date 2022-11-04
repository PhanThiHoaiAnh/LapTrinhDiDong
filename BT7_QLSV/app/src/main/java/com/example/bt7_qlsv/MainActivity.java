package com.example.bt7_qlsv;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<ItemSinhVien> arrayList;
    private AdapterSinhVien adtSV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);
        arrayList = new ArrayList<>();
        arrayList.add(new ItemSinhVien("Phan Thị Hoài Anh","2050531200106","20T1",R.drawable.student));
        arrayList.add(new ItemSinhVien("Phạm Duy Đạt","2050531200106","20T1",R.drawable.student));
        arrayList.add(new ItemSinhVien("Nguyễn Tiến An","2050531200106","20T1",R.drawable.student));
        arrayList.add(new ItemSinhVien("Lê Thuận Diệu","2050531200106","20T1",R.drawable.student));
        arrayList.add(new ItemSinhVien("Đặng Thị Thùy Dung","2050531200106","20T1",R.drawable.student));
        arrayList.add(new ItemSinhVien("Trần Anh Tuấn","2050531200106","20T1",R.drawable.student));
        arrayList.add(new ItemSinhVien("Phạm Văn Huấn","2050531200106","20T1",R.drawable.student));
        arrayList.add(new ItemSinhVien("Trần Hữu Tiến Đạt","2050531200106","20T1",R.drawable.student));

        adtSV = new AdapterSinhVien(MainActivity.this, R.layout.layout_item, arrayList);
        listView.setAdapter(adtSV);
    }
}