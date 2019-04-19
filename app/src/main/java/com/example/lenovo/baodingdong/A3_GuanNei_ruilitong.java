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

public class A3_GuanNei_ruilitong extends AppCompatActivity {
    private ListView listView;
    private ArrayList<AANewBaseListView> baseListView = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a3__guan_nei_ruilitong);

        listView = (ListView) findViewById(R.id.a3guanneiruilitong);
        initGuanNeiruilitong();
        AANewBaseAdapter adapter = new AANewBaseAdapter(A3_GuanNei_ruilitong.this, R.layout.aanewbaselistlayout, baseListView);
        listView.setAdapter(adapter);
        listView.setDivider(new ColorDrawable(Color.BLACK));
        listView.setDividerHeight(5);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                AANewBaseListView item = baseListView.get(position);

                String msg = item.getName();
                if (msg.contains("保定东")) {
                    Intent intent=new Intent(A3_GuanNei_ruilitong.this,A3_WangTu_ruilitongb.class);
                    startActivity(intent);
                } else if (msg.contains("徐水东")) {
                    Intent intent=new Intent(A3_GuanNei_ruilitong.this,A3_WangTu_ruilitongx.class);
                    startActivity(intent);
                } else if (msg.contains("高碑店东")) {
                    Intent intent=new Intent(A3_GuanNei_ruilitong.this,A3_WangTu_ruilitongg.class);
                    startActivity(intent);
                }
            }
        });
    }

    private void initGuanNeiruilitong() {
        AANewBaseListView sss = new AANewBaseListView("保定东瑞利通组网图");
        baseListView.add(sss);
        AANewBaseListView youhua = new AANewBaseListView("徐水东瑞利通组网图");
        baseListView.add(youhua);
        AANewBaseListView aaa = new AANewBaseListView("高碑店东瑞利通组网图");
        baseListView.add(aaa);
    }
}
