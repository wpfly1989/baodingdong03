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

public class A3_GuanNei_fangzai extends AppCompatActivity {
    private ListView listView;
    private ArrayList<AANewBaseListView> baseListView = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a3__guan_nei_fangzai);

        listView = (ListView) findViewById(R.id.a3guanneifangzai);
        initGuanNeifangzai();
        AANewBaseAdapter adapter = new AANewBaseAdapter(A3_GuanNei_fangzai.this, R.layout.aanewbaselistlayout, baseListView);
        listView.setAdapter(adapter);
        listView.setDivider(new ColorDrawable(Color.BLACK));
        listView.setDividerHeight(5);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                AANewBaseListView item = baseListView.get(position);

                String msg = item.getName();
                if (msg.contains("地震")) {
                    Intent intent=new Intent(A3_GuanNei_fangzai.this,A3_WangTu_fangzaid.class);
                    startActivity(intent);
                } else if (msg.contains("环1")) {
                    Intent intent=new Intent(A3_GuanNei_fangzai.this,A3_WangTu_fangzai1.class);
                    startActivity(intent);
                } else if (msg.contains("环2")) {
                    Intent intent=new Intent(A3_GuanNei_fangzai.this,A3_WangTu_fangzai2.class);
                    startActivity(intent);
                } else if (msg.contains("环3")) {
                    Intent intent=new Intent(A3_GuanNei_fangzai.this,A3_WangTu_fangzai3.class);
                    startActivity(intent);
                } else if (msg.contains("环4")) {
                    Intent intent=new Intent(A3_GuanNei_fangzai.this,A3_WangTu_fangzai4.class);
                    startActivity(intent);
                }
            }
        });
    }

    private void initGuanNeifangzai() {
        AANewBaseListView sss = new AANewBaseListView("防灾地震报警环图");
        baseListView.add(sss);
        AANewBaseListView youhua = new AANewBaseListView("防灾环图环1");
        baseListView.add(youhua);
        AANewBaseListView aaa = new AANewBaseListView("防灾环图环2");
        baseListView.add(aaa);
        AANewBaseListView bbb = new AANewBaseListView("防灾环图环3");
        baseListView.add(bbb);
        AANewBaseListView ccc = new AANewBaseListView("防灾环图环4");
        baseListView.add(ccc);
    }
}
