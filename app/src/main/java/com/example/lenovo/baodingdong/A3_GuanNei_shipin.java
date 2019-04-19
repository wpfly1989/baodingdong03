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

public class A3_GuanNei_shipin extends AppCompatActivity {
    private ListView listView;
    private ArrayList<AANewBaseListView> baseListView = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a3__guan_nei_shipin);

        listView = (ListView) findViewById(R.id.a3guanneishipin);
        initGuanNeishipin();
        AANewBaseAdapter adapter = new AANewBaseAdapter(A3_GuanNei_shipin.this, R.layout.aanewbaselistlayout, baseListView);
        listView.setAdapter(adapter);
        listView.setDivider(new ColorDrawable(Color.BLACK));
        listView.setDividerHeight(5);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                AANewBaseListView item = baseListView.get(position);

                String msg = item.getName();
                if (msg.contains("保定东")) {
                    Intent intent=new Intent(A3_GuanNei_shipin.this,A3_WangTu_shipinb.class);
                    startActivity(intent);
                } else if (msg.contains("高碑店东")) {
                    Intent intent=new Intent(A3_GuanNei_shipin.this,A3_WangTu_shiping.class);
                    startActivity(intent);
                }
            }
        });
    }

    private void initGuanNeishipin() {

        AANewBaseListView sss = new AANewBaseListView("保定东站机械室视频设备组网图");
        baseListView.add(sss);
        AANewBaseListView youhua = new AANewBaseListView("高碑店东站机械室视频设备组网图");
        baseListView.add(youhua);
    }
}
