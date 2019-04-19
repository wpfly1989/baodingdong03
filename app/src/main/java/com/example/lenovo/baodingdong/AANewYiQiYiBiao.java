package com.example.lenovo.baodingdong;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class AANewYiQiYiBiao extends AppCompatActivity {
    private ListView listView;
    private ArrayList<AANewBaseListView> baseListView = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aanew_yi_qi_yi_biao);
        listView = (ListView) findViewById(R.id.aanewyiqiyibiao);
        initYiQiYiBiao();
        AANewBaseAdapter adapter = new AANewBaseAdapter(AANewYiQiYiBiao.this, R.layout.aanewbaselistlayout, baseListView);
        listView.setAdapter(adapter);
        listView.setDivider(new ColorDrawable(Color.parseColor("#FF6100")));
        listView.setDividerHeight(5);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                AANewBaseListView item = baseListView.get(position);

                String msg = item.getName();

                if (msg.contains("OTDR")) {
                    Intent intent=new Intent(AANewYiQiYiBiao.this,OtdrActivity.class);
                    startActivity(intent);
                } else if (msg.contains("驻波比测试仪")) {
                    Intent intent=new Intent(AANewYiQiYiBiao.this,ZhubobiActivity.class);
                    startActivity(intent);
                } else if (msg.contains("2M传输性能分析仪")) {
                    Intent intent=new Intent(AANewYiQiYiBiao.this,M2fenxiyiActivity.class);
                    startActivity(intent);
                } else if (msg.contains("蓄电池内阻测试仪")) {
                    Intent intent=new Intent(AANewYiQiYiBiao.this,NeizuceshiyiActivity.class);
                    startActivity(intent);
                } else if (msg.contains("视频工程宝")) {
                    Intent intent=new Intent(AANewYiQiYiBiao.this,ShipingongchengbaoActivity.class);
                    startActivity(intent);
                } else if (msg.contains("万用表")) {
                    Intent intent = new Intent(AANewYiQiYiBiao.this,A3_YiBiao_wanyongbiao.class);
                    startActivity(intent);
                } else if (msg.contains("兆欧表")) {
                    Intent intent = new Intent(AANewYiQiYiBiao.this,A3_YiBiao_zhaooubiao.class);
                    startActivity(intent);
                } else if (msg.contains("接地电阻测试仪")) {
                    Intent intent = new Intent(AANewYiQiYiBiao.this,A3_YiBiao_jiedidianzu.class);
                    startActivity(intent);
                }

            }
        });

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    private void initYiQiYiBiao() {
        AANewBaseListView otdr = new AANewBaseListView("OTDR（T-BERD 6000A）\n使用方法");
        baseListView.add(otdr);
        AANewBaseListView zbb = new AANewBaseListView("驻波比测试仪（JD723A）\n使用方法");
        baseListView.add(zbb);
        AANewBaseListView m2 = new AANewBaseListView("2M传输性能分析仪（GT-1CJ）\n使用方法");
        baseListView.add(m2);
        AANewBaseListView neizu = new AANewBaseListView("蓄电池内阻测试仪（CRM2000）\n使用方法");
        baseListView.add(neizu);
        AANewBaseListView gcb = new AANewBaseListView("视频工程宝（STEST-895）\n使用方法");
        baseListView.add(gcb);
        AANewBaseListView aaa = new AANewBaseListView("万用表\n使用方法");
        baseListView.add(aaa);
        AANewBaseListView bbb = new AANewBaseListView("兆欧表\n使用方法");
        baseListView.add(bbb);
        AANewBaseListView ccc = new AANewBaseListView("接地电阻测试仪\n使用方法");
        baseListView.add(ccc);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // back button
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
