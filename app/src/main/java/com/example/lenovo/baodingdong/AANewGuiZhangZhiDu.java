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

public class AANewGuiZhangZhiDu extends AppCompatActivity {

    private ListView listView;
    private ArrayList<AANewBaseListView> baseListView = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aanew_gui_zhang_zhi_du);

        listView = (ListView) findViewById(R.id.aaguizhangzhidu);
        initGuiZhangZhiDu();
        AANewBaseAdapter adapter = new AANewBaseAdapter(AANewGuiZhangZhiDu.this, R.layout.aanewbaselistlayout, baseListView);
        listView.setAdapter(adapter);
        listView.setDivider(new ColorDrawable(Color.parseColor("#FF4500")));
        listView.setDividerHeight(5);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                AANewBaseListView item = baseListView.get(position);

                String msg = item.getName();

                if (msg.contains("三不动")) {
                    Intent intent=new Intent(AANewGuiZhangZhiDu.this,SanbudongActivity.class);
                    startActivity(intent);
                } else if (msg.contains("电务上线作业十条")) {
                    Intent intent=new Intent(AANewGuiZhangZhiDu.this,HongxianActivity.class);
                    startActivity(intent);
                } else if (msg.contains("通信电路纪律十")) {
                    Intent intent=new Intent(AANewGuiZhangZhiDu.this,ShibuzhunActivity.class);
                    startActivity(intent);
                } else if (msg.contains("电务系统基本规章")) {
                    Intent intent=new Intent(AANewGuiZhangZhiDu.this,JibenhongxianActivity.class);
                    startActivity(intent);
                } else if (msg.contains("通信段安全管理八")) {
                    Intent intent=new Intent(AANewGuiZhangZhiDu.this,TongxinduanhongxianActivity.class);
                    startActivity(intent);
                } else if (msg.contains("高铁电务上线作业")) {
                    Intent intent=new Intent(AANewGuiZhangZhiDu.this,WubixuActivity.class);
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

    private void initGuiZhangZhiDu() {
        AANewBaseListView sss = new AANewBaseListView("三不动、三不离、三不放过");
        baseListView.add(sss);
        AANewBaseListView shitiaogongxian = new AANewBaseListView("电务上线作业十条红线");
        baseListView.add(shitiaogongxian);
        AANewBaseListView shibuzhun = new AANewBaseListView("通信电路纪律十不准");
        baseListView.add(shibuzhun);
        AANewBaseListView guizhanghongxian = new AANewBaseListView("电务系统基本规章“红线");
        baseListView.add(guizhanghongxian);
        AANewBaseListView batiaohongxian = new AANewBaseListView("通信段安全管理八条红线");
        baseListView.add(batiaohongxian);
        AANewBaseListView wubixu = new AANewBaseListView("高铁电务上线作业“五必须");
        baseListView.add(wubixu);
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
