package com.example.lenovo.baodingdong;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class A3_GuanNei_shujuwang extends AppCompatActivity {
    private ListView listView;
    private ArrayList<AANewBaseListView> baseListView = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a3__guan_nei_shujuwang);

        listView = (ListView) findViewById(R.id.a3guanneishujuwang);
        initGuanNeishujuwang();
        AANewBaseAdapter adapter = new AANewBaseAdapter(A3_GuanNei_shujuwang.this, R.layout.aanewbaselistlayout, baseListView);
        listView.setAdapter(adapter);
        listView.setDivider(new ColorDrawable(Color.BLACK));
        listView.setDividerHeight(5);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                AANewBaseListView item = baseListView.get(position);

                String msg = item.getName();
                if (msg.contains("数据网网")) {
                    Intent intent=new Intent(A3_GuanNei_shujuwang.this,A3_WangTu_shujuwang.class);
                    startActivity(intent);
                } else if (msg.contains("数据网传输")) {
                    Intent intent=new Intent(A3_GuanNei_shujuwang.this,A3_WangTu_shujuwangtongdao.class);
                    startActivity(intent);
                }
            }
        });
    }

    private void initGuanNeishujuwang() {
        AANewBaseListView sss = new AANewBaseListView("数据网网图");
        baseListView.add(sss);
        AANewBaseListView youhua = new AANewBaseListView("数据网传输通道图");
        baseListView.add(youhua);
    }
}
