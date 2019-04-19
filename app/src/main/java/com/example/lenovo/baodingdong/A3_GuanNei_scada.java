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

public class A3_GuanNei_scada extends AppCompatActivity {
    private ListView listView;
    private ArrayList<AANewBaseListView> baseListView = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a3__guan_nei_scada);

        listView = (ListView) findViewById(R.id.a3guanneiscada);
        initGuanNeiscada();
        AANewBaseAdapter adapter = new AANewBaseAdapter(A3_GuanNei_scada.this, R.layout.aanewbaselistlayout, baseListView);
        listView.setAdapter(adapter);
        listView.setDivider(new ColorDrawable(Color.BLACK));
        listView.setDividerHeight(5);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                AANewBaseListView item = baseListView.get(position);

                String msg = item.getName();
                if (msg.contains("电力SCADA环1")) {
                    Intent intent=new Intent(A3_GuanNei_scada.this,A3_WangTu_scadad1.class);
                    startActivity(intent);
                } else if (msg.contains("电力SCADA环3")) {
                    Intent intent=new Intent(A3_GuanNei_scada.this,A3_WangTu_scadad3.class);
                    startActivity(intent);
                } else if (msg.contains("电力SCADA环4")) {
                    Intent intent=new Intent(A3_GuanNei_scada.this,A3_WangTu_scadad4.class);
                    startActivity(intent);
                } else if (msg.contains("电力SCADA环8")) {
                    Intent intent=new Intent(A3_GuanNei_scada.this,A3_WangTu_scadad8.class);
                    startActivity(intent);
                } else if (msg.contains("电力SCADA环9")) {
                    Intent intent=new Intent(A3_GuanNei_scada.this,A3_WangTu_scadad9.class);
                    startActivity(intent);
                } else if (msg.contains("牵引SCADA环1")) {
                    Intent intent=new Intent(A3_GuanNei_scada.this,A3_WangTu_scadaq1.class);
                    startActivity(intent);
                } else if (msg.contains("牵引SCADA环2")) {
                    Intent intent=new Intent(A3_GuanNei_scada.this,A3_WangTu_scadaq2.class);
                    startActivity(intent);
                } else if (msg.contains("牵引SCADA环3")) {
                    Intent intent=new Intent(A3_GuanNei_scada.this,A3_WangTu_scadaq3.class);
                    startActivity(intent);
                }
            }
        });

    }

    private void initGuanNeiscada() {
        AANewBaseListView sss = new AANewBaseListView("京石武电力SCADA环1");
        baseListView.add(sss);
        AANewBaseListView youhua = new AANewBaseListView("京石武电力SCADA环3");
        baseListView.add(youhua);
        AANewBaseListView a = new AANewBaseListView("京石武电力SCADA环4");
        baseListView.add(a);
        AANewBaseListView b = new AANewBaseListView("京石武电力SCADA环8");
        baseListView.add(b);
        AANewBaseListView cc = new AANewBaseListView("京石武电力SCADA环9");
        baseListView.add(cc);
        AANewBaseListView dd = new AANewBaseListView("京石武牵引SCADA环1");
        baseListView.add(dd);
        AANewBaseListView ee = new AANewBaseListView("京石武牵引SCADA环2");
        baseListView.add(ee);
        AANewBaseListView ff = new AANewBaseListView("京石武牵引SCADA环3");
        baseListView.add(ff);

    }
}
