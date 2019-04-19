package com.example.lenovo.baodingdong;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by lenovo on 2018/3/1.
 */

public class XushuidongActivity extends AppCompatActivity{
    private Button odf;
    private Button ddf;
    private Button chuanshu;
    private Button onu;
    private Button bts;
    private Button donghuan;
    private Button ups;
    private Button gaokai;
    private Button fas;
    private Button shipin;
    private Button upsdianchizu;
    private Button gaokaidianchizu1;
    private Button gaokaidianchizu2;
    private Button kongtiao;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xushuidong);
        odf=(Button)findViewById(R.id.xushuidongODFId);
        ddf=(Button)findViewById(R.id.xushuidongDDFId);
        chuanshu=(Button)findViewById(R.id.xushuidongchuanshuId);
        onu=(Button)findViewById(R.id.xushuidongONUId);
        bts=(Button)findViewById(R.id.xushuidongBTSId);
        donghuan=(Button)findViewById(R.id.xushuidongdonghuanId);
        ups=(Button)findViewById(R.id.xushuidongUPSId);
        gaokai=(Button)findViewById(R.id.xushuidonggaokaiId);
        fas=(Button)findViewById(R.id.xushuidongFASId);
        shipin=(Button)findViewById(R.id.xushuidongshipinId);
        upsdianchizu=(Button)findViewById(R.id.xushuidongUPSdianchizuId);
        gaokaidianchizu1=(Button)findViewById(R.id.xushuidonggaokaidianchizu1Id);
        gaokaidianchizu2=(Button)findViewById(R.id.xushuidonggaokaidianchizu2Id);
        kongtiao=(Button)findViewById(R.id.xushuidongkontiaoId);

        kongtiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(XushuidongActivity.this,XushuidongKongtiaoActivity.class);
                startActivity(intent);
            }
        });
        gaokaidianchizu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(XushuidongActivity.this,DianchizuActivity.class);
                startActivity(intent);
            }
        });
        gaokaidianchizu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(XushuidongActivity.this,DianchizuActivity.class);
                startActivity(intent);
            }
        });
        upsdianchizu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(XushuidongActivity.this,DianchizuActivity.class);
                startActivity(intent);
            }
        });
        shipin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(XushuidongActivity.this,ShipinActivity.class);
                startActivity(intent);
            }
        });
        fas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(XushuidongActivity.this,FasActivity.class);
                startActivity(intent);
            }
        });
        gaokai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(XushuidongActivity.this,GaokaiActivity.class);
                startActivity(intent);
            }
        });
        ups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(XushuidongActivity.this,ChezhanupsActivity.class);
                startActivity(intent);
            }
        });
        donghuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(XushuidongActivity.this,DonghuanActivity.class);
                startActivity(intent);
            }
        });
        bts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(XushuidongActivity.this,BtsActivity.class);
                startActivity(intent);
            }
        });
        onu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(XushuidongActivity.this,OnuActivity.class);
                startActivity(intent);
            }
        });
        chuanshu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(XushuidongActivity.this,XushuiChuanshuActivity.class);
                startActivity(intent);
            }
        });
        ddf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(XushuidongActivity.this,DdfActivity.class);
                startActivity(intent);
            }
        });
        odf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(XushuidongActivity.this,DdfActivity.class);
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
