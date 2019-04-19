package com.example.lenovo.baodingdong;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by lenovo on 2018/3/2.
 */

public class GaobeidiandongActivity extends AppCompatActivity{
    private Button gaokaidianchizu1;
    private Button gaokaidianchizu2;
    private Button upsdianchizu;
    private Button gaokai;
    private Button odf;
    private Button ddf;
    private Button onu;
    private Button chuanshu622;
    private Button chuanshu10g;
    private Button zonghepeixian;
    private Button kongtiao;
    private Button fas;
    private Button shujuwang;
    private Button zongheshipingui;
    private Button lvfushipingui;
    private Button bts;
    private Button ups;
    private Button donghuan;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaobeidiandongpingmian);
        gaokaidianchizu1=(Button)findViewById(R.id.gaobeidiandonggaokaidianchizu1Id);
        gaokaidianchizu2=(Button)findViewById(R.id.gaobeidiandonggaokaidianchizu2Id);
        upsdianchizu=(Button)findViewById(R.id.gaobeidiandongupsdianchizuId);
        gaokai=(Button)findViewById(R.id.gaobeidiandonggaokaiId);
        odf=(Button)findViewById(R.id.gaobeidiandongODFId);
        ddf=(Button)findViewById(R.id.gaobeidiandongDDFId);
        onu=(Button)findViewById(R.id.gaobeidiandongONUId);
        chuanshu622=(Button)findViewById(R.id.gaobeidiandong622Id);
        chuanshu10g=(Button)findViewById(R.id.gaobeidiandong10GId);
        zonghepeixian=(Button)findViewById(R.id.gaobeidiandongzonghepeixianId);
        kongtiao=(Button)findViewById(R.id.gaobeidiandongkongtiaoId);
        fas=(Button)findViewById(R.id.gaobeidiandongFASId);
        shujuwang=(Button)findViewById(R.id.gaobeidiandongshujuwangId);
        zongheshipingui=(Button)findViewById(R.id.gaobeidiandonzongheshipinguiId);
        lvfushipingui=(Button)findViewById(R.id.gaobeidiandonglvfushipinguiId);
        bts=(Button)findViewById(R.id.gaobeidiandongBTSId);
        ups=(Button)findViewById(R.id.gaobeidiandongUPSId);
        donghuan=(Button)findViewById(R.id.gaobeidiandongdonghuanId);

        donghuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GaobeidiandongActivity.this,DonghuanActivity.class);
                startActivity(intent);
            }
        });
        ups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GaobeidiandongActivity.this,ChezhanupsActivity.class);
                startActivity(intent);
            }
        });
        bts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GaobeidiandongActivity.this,BtsActivity.class);
                startActivity(intent);
            }
        });
        lvfushipingui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GaobeidiandongActivity.this,BaodingdongShipingui2.class);
                startActivity(intent);
            }
        });
        zongheshipingui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GaobeidiandongActivity.this,JingshafuwuqiActivity.class);
                startActivity(intent);
            }
        });
        shujuwang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GaobeidiandongActivity.this,ShujuwangActivity.class);
                startActivity(intent);
            }
        });
        fas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GaobeidiandongActivity.this,FasActivity.class);
                startActivity(intent);
            }
        });
        kongtiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GaobeidiandongActivity.this,QuangaokongtiaoActivity.class);
                startActivity(intent);
            }
        });
        zonghepeixian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GaobeidiandongActivity.this,BaodingdongShipingui2.class);
                startActivity(intent);
            }
        });
        chuanshu10g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GaobeidiandongActivity.this,GaobeidiandongChuanshuActivity.class);
                startActivity(intent);
            }
        });
        chuanshu622.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GaobeidiandongActivity.this,GaobeidiandongChuanshuActivity.class);
                startActivity(intent);
            }
        });
        onu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GaobeidiandongActivity.this,OnuActivity.class);
                startActivity(intent);
            }
        });
        ddf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GaobeidiandongActivity.this,DdfActivity.class);
                startActivity(intent);
            }
        });
        odf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GaobeidiandongActivity.this,DdfActivity.class);
                startActivity(intent);
            }
        });
        gaokai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GaobeidiandongActivity.this,GaokaiActivity.class);
                startActivity(intent);
            }
        });
        upsdianchizu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GaobeidiandongActivity.this,DianchizuActivity.class);
                startActivity(intent);
            }
        });
        gaokaidianchizu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GaobeidiandongActivity.this,DianchizuActivity.class);
                startActivity(intent);
            }
        });
        gaokaidianchizu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GaobeidiandongActivity.this,DianchizuActivity.class);
                startActivity(intent);
            }
        });
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
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
