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

public class A3_GuanNeiWangTu extends AppCompatActivity {
    private ListView listView;
    private ArrayList<AANewBaseListView> baseListView = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a3__guan_nei_wang_tu);

        listView = (ListView) findViewById(R.id.a3guanneihuantu);
        initGuanNeiWangTu();
        AANewBaseAdapter adapter = new AANewBaseAdapter(A3_GuanNeiWangTu.this, R.layout.aanewbaselistlayout, baseListView);
        listView.setAdapter(adapter);
        listView.setDivider(new ColorDrawable(Color.parseColor("#4169E1")));
        listView.setDividerHeight(5);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                AANewBaseListView item = baseListView.get(position);

                String msg = item.getName();
                if (msg.contains("BTS")) {
                    Intent intent = new Intent(A3_GuanNeiWangTu.this, AANewGuanNeiHuanTu.class);
                    startActivity(intent);
                } else if (msg.contains("CTC")) {
                    Intent intent = new Intent(A3_GuanNeiWangTu.this,A3_GuanNei_ctc.class);
                    startActivity(intent);
                } else if (msg.contains("SCADA")) {
                    Intent intent = new Intent(A3_GuanNeiWangTu.this,A3_GuanNei_scada.class);
                    startActivity(intent);
                } else if (msg.contains("车站视频")) {
                    Intent intent = new Intent(A3_GuanNeiWangTu.this,A3_GuanNei_shipin.class);
                    startActivity(intent);
                } else if (msg.contains("传输")) {
                    Intent intent = new Intent(A3_GuanNeiWangTu.this,A3_WangTu_chuanshu.class);
                    startActivity(intent);
                } else if (msg.contains("道岔融雪")) {
                    Intent intent = new Intent(A3_GuanNeiWangTu.this,A3_WangTu_daocharongxue.class);
                    startActivity(intent);
                } else if (msg.contains("动环")) {
                    Intent intent = new Intent(A3_GuanNeiWangTu.this,A3_GuanNei_donghuan.class);
                    startActivity(intent);
                } else if (msg.contains("防灾")) {
                    Intent intent = new Intent(A3_GuanNeiWangTu.this,A3_GuanNei_fangzai.class);
                    startActivity(intent);
                } else if (msg.contains("固标")) {
                    Intent intent = new Intent(A3_GuanNeiWangTu.this,A3_WangTu_gubiao.class);
                    startActivity(intent);
                } else if (msg.contains("客票")) {
                    Intent intent = new Intent(A3_GuanNeiWangTu.this,A3_WangTu_kepiao.class);
                    startActivity(intent);
                } else if (msg.contains("瑞利通")) {
                    Intent intent = new Intent(A3_GuanNeiWangTu.this,A3_GuanNei_ruilitong.class);
                    startActivity(intent);
                } else if (msg.equals("数据网网图")) {
                    Intent intent = new Intent(A3_GuanNeiWangTu.this,A3_GuanNei_shujuwang.class);
                    startActivity(intent);
                } else if (msg.contains("信号安全数据")) {
                    Intent intent = new Intent(A3_GuanNeiWangTu.this,A3_WangTu_xinhaoanquanshujuwang.class);
                    startActivity(intent);
                } else if (msg.contains("光缆线路资源运用")) {
                    Intent intent = new Intent(A3_GuanNeiWangTu.this,A3_GuanNei_xinxianyunyong.class);
                    startActivity(intent);
                }
            }
        });
    }

    private void initGuanNeiWangTu() {
        AANewBaseListView bts = new AANewBaseListView("BTS网图");
        baseListView.add(bts);
        AANewBaseListView ctc = new AANewBaseListView("CTC网图");
        baseListView.add(ctc);
        AANewBaseListView scada = new AANewBaseListView("SCADA网图");
        baseListView.add(scada);
        AANewBaseListView shipin = new AANewBaseListView("车站视频设备网图");
        baseListView.add(shipin);
        AANewBaseListView chuanshu = new AANewBaseListView("传输网图");
        baseListView.add(chuanshu);
        AANewBaseListView daocharongxue = new AANewBaseListView("道岔融雪网图");
        baseListView.add(daocharongxue);
        AANewBaseListView donghuan = new AANewBaseListView("动环网图");
        baseListView.add(donghuan);
        AANewBaseListView fangzai = new AANewBaseListView("防灾网图");
        baseListView.add(fangzai);
        AANewBaseListView gubiao = new AANewBaseListView("固标网图");
        baseListView.add(gubiao);
        AANewBaseListView kepiao = new AANewBaseListView("客票网图");
        baseListView.add(kepiao);
        AANewBaseListView ruilitong = new AANewBaseListView("瑞利通网图");
        baseListView.add(ruilitong);
        AANewBaseListView shujuwang = new AANewBaseListView("数据网网图");
        baseListView.add(shujuwang);
        AANewBaseListView xinhaoanquan = new AANewBaseListView("信号安全数据网网图");
        baseListView.add(xinhaoanquan);
        AANewBaseListView abcabc = new AANewBaseListView("光缆线路资源运用台帐表\n(需自行下载)");
        baseListView.add(abcabc);

    }
}
