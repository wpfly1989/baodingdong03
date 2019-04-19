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

public class A3_GuanNei_ctc extends AppCompatActivity {
    private ListView listView;
    private ArrayList<AANewBaseListView> baseListView = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a3__guan_nei_ctc);

        listView = (ListView) findViewById(R.id.a3guanneictc);
        initGuanNeictc();
        AANewBaseAdapter adapter = new AANewBaseAdapter(A3_GuanNei_ctc.this, R.layout.aanewbaselistlayout, baseListView);
        listView.setAdapter(adapter);
        listView.setDivider(new ColorDrawable(Color.BLACK));
        listView.setDividerHeight(5);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                AANewBaseListView item = baseListView.get(position);

                String msg = item.getName();
                if (msg.contains("京广高铁")) {
                    Intent intent=new Intent(A3_GuanNei_ctc.this,A3_WangTu_ctc.class);
                    startActivity(intent);
                } else if (msg.contains("网络优化")) {
                    Intent intent=new Intent(A3_GuanNei_ctc.this,A3_WangTu_ctc2014.class);
                    startActivity(intent);
                }
            }
        });
    }

    private void initGuanNeictc() {
        AANewBaseListView sss = new AANewBaseListView("京广高铁CTC网图");
        baseListView.add(sss);
        AANewBaseListView youhua = new AANewBaseListView("CTC网络优化后2014.8.21");
        baseListView.add(youhua);
    }
}
