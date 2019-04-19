package com.example.lenovo.baodingdong;

import android.app.Activity;
import android.content.Context;
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

public class AANewRiChangGuZhang extends AppCompatActivity {
    private ListView listView;
    private ArrayList<AANewBaseListView> baseListView = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aanew_ri_chang_gu_zhang);
        listView = (ListView) findViewById(R.id.aanewrichangguzhang);
        initRiChangGuZhang();
        AANewBaseAdapter adapter = new AANewBaseAdapter(AANewRiChangGuZhang.this, R.layout.aanewbaselistlayout, baseListView);
        listView.setAdapter(adapter);
        listView.setDivider(new ColorDrawable(Color.parseColor("#228B22")));
        listView.setDividerHeight(5);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                AANewBaseListView item = baseListView.get(position);

                String msg = item.getName();

                if (msg.contains("BTS设备")) {
                    Intent intent = new Intent(AANewRiChangGuZhang.this,AANewGuZhangBTS.class);
                    startActivity(intent);
                } else if (msg.contains("车站UPS")) {
                    Intent intent = new Intent(AANewRiChangGuZhang.this,AANewGuZhangCheZhanUPS.class);
                    startActivity(intent);
                } else if (msg.contains("传输设备")) {
                    Intent intent = new Intent(AANewRiChangGuZhang.this,AANewGuZhangChuanShu.class);
                    startActivity(intent);
                } else if (msg.contains("动环设备")) {
                    Intent intent = new Intent(AANewRiChangGuZhang.this,AANewGuZhangDongHuan.class);
                    startActivity(intent);
                } else if (msg.contains("防灾设备")) {
                    Intent intent = new Intent(AANewRiChangGuZhang.this,AANewGuZhangFangZai.class);
                    startActivity(intent);
                } else if (msg.contains("高开设备")) {
                    Intent intent = new Intent(AANewRiChangGuZhang.this,AANewGuZhangGaoKai.class);
                    startActivity(intent);
                } else if (msg.contains("基站空调")) {
                    Intent intent = new Intent(AANewRiChangGuZhang.this,AANewGuZhangKongTiao.class);
                    startActivity(intent);
                } else if (msg.contains("ONU设备")) {
                    Intent intent = new Intent(AANewRiChangGuZhang.this,AANewGuZhangONU.class);
                    startActivity(intent);
                } else if (msg.contains("基站视频设备")) {
                    Intent intent = new Intent(AANewRiChangGuZhang.this,AANewGuZhangShiPin.class);
                    startActivity(intent);
                } else if (msg.contains("基站UPS")) {
                    Intent intent = new Intent(AANewRiChangGuZhang.this,AANewGuZhangUPS.class);
                    startActivity(intent);
                } else if (msg.equals("电池组通信状态检查及修复")) {
                    Intent intent = new Intent(AANewRiChangGuZhang.this,DianchijiankongActivity.class);
                    startActivity(intent);
                } else if (msg.contains("车站视频服务器")) {
                    Intent intent = new Intent(AANewRiChangGuZhang.this,JingshafuwuqiActivity.class);
                    startActivity(intent);
                } else if (msg.equals("网线头制作方法")) {
                    Intent intent = new Intent(AANewRiChangGuZhang.this,WangxiantouActivity.class);
                    startActivity(intent);
                } else if (msg.equals("2M头制作方法")) {
                    Intent intent = new Intent(AANewRiChangGuZhang.this,M2Activity.class);
                    startActivity(intent);
                } else if (msg.equals("电池组整体脱管重新挂载")) {
                    Intent intent = new Intent(AANewRiChangGuZhang.this,DianchizutuoguanActivity.class);
                    startActivity(intent);
                } else if (msg.contains("客票电路")) {
                    Intent intent = new Intent(AANewRiChangGuZhang.this,A3_YingJi_kepiao.class);
                    startActivity(intent);
                } else if (msg.contains("数据网")) {
                    Intent intent = new Intent(AANewRiChangGuZhang.this,A3_YingJi_shujuwang.class);
                    startActivity(intent);
                } else if (msg.contains("FAS系统")) {
                    Intent intent = new Intent(AANewRiChangGuZhang.this,A3_YingJi_fas.class);
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

    private void initRiChangGuZhang() {
        AANewBaseListView aaa = new AANewBaseListView("客票电路应急处置预案");
        baseListView.add(aaa);
        AANewBaseListView bbb = new AANewBaseListView("数据网应急预案");
        baseListView.add(bbb);
        AANewBaseListView ccc = new AANewBaseListView("FAS系统应急预案");
        baseListView.add(ccc);
        AANewBaseListView chuanshu = new AANewBaseListView("传输设备应急预案及日常故障");
        baseListView.add(chuanshu);
        AANewBaseListView bts = new AANewBaseListView("BTS设备应急预案及日常故障");
        baseListView.add(bts);
        AANewBaseListView czups = new AANewBaseListView("车站UPS日常故障");
        baseListView.add(czups);
        AANewBaseListView donghuan = new AANewBaseListView("动环设备日常故障");
        baseListView.add(donghuan);
        AANewBaseListView fangzai = new AANewBaseListView("防灾设备日常故障");
        baseListView.add(fangzai);
        AANewBaseListView gaokai = new AANewBaseListView("高开设备日常故障");
        baseListView.add(gaokai);
        AANewBaseListView kongtiao = new AANewBaseListView("基站空调日常故障");
        baseListView.add(kongtiao);
        AANewBaseListView onu = new AANewBaseListView("ONU设备日常故障");
        baseListView.add(onu);
        AANewBaseListView jzshipin = new AANewBaseListView("基站视频设备日常故障");
        baseListView.add(jzshipin);
        AANewBaseListView ups = new AANewBaseListView("基站UPS日常故障");
        baseListView.add(ups);
        AANewBaseListView txzt = new AANewBaseListView("电池组通信状态检查及修复");
        baseListView.add(txzt);
        AANewBaseListView czshipin = new AANewBaseListView("车站视频服务器日常故障");
        baseListView.add(czshipin);
        AANewBaseListView wangxiantou = new AANewBaseListView("网线头制作方法");
        baseListView.add(wangxiantou);
        AANewBaseListView m2tou = new AANewBaseListView("2M头制作方法");
        baseListView.add(m2tou);
        AANewBaseListView ztgz = new AANewBaseListView("电池组整体脱管重新挂载");
        baseListView.add(ztgz);

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
