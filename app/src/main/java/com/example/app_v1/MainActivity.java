package com.example.app_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lv_tin_tuc;
    String link = "https://vtc.vn/rss/thoi-su.rss";
    String link_2 = "https://vtv.vn/trong-nuoc/xa-hoi.rss";
    List<Tin_tuc> tin_tucList;

    Button btn_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_show = findViewById(R.id.btn_show);
        tin_tucList = new ArrayList<>();
        lv_tin_tuc = findViewById(R.id.lv_tin_tuc);


    }
}