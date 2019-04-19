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

public class A3_GuanNei_donghuan extends AppCompatActivity {
    private ListView listView;
    private ArrayList<AANewBaseListView> baseListView = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a3__guan_nei_donghuan);

        listView = (ListView) findViewById(R.id.a3guanneidonghuan);
        initGuanNeidonghuan();
        AANewBaseAdapter adapter = new AANewBaseAdapter(A3_GuanNei_donghuan.this, R.layout.aanewbaselistlayout, baseListView);
        listView.setAdapter(adapter);
        listView.setDivider(new ColorDrawable(Color.BLACK));
        listView.setDividerHeight(5);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                AANewBaseListView item = baseListView.get(position);

                String msg = item.getName();
                if (msg.contains("环1")) {
                    Intent intent=new Intent(A3_GuanNei_donghuan.this,A3_WangTu_donghuan1.class);
                    startActivity(intent);
                } else if (msg.contains("环2")) {
                    Intent intent=new Intent(A3_GuanNei_donghuan.this,A3_WangTu_donghuan2.class);
                    startActivity(intent);
                }
            }
        });
    }

    private void initGuanNeidonghuan() {
        AANewBaseListView sss = new AANewBaseListView("动环网图环1");
        baseListView.add(sss);
        AANewBaseListView youhua = new AANewBaseListView("动环网图环2");
        baseListView.add(youhua);
    }
}
