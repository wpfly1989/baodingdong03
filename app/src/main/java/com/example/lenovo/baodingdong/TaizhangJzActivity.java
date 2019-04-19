package com.example.lenovo.baodingdong;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by lenovo on 2017/12/10.
 */

public class TaizhangJzActivity extends AppCompatActivity{
    private Button kongtiao;
    private Button bts;
    private Button ups;
    private Button donghuan;
    private Button gaokai;
    private Button jiaoliu;
    private Button chuanshu;
    private Button shipin;
    private Button fangzai;
    private Button onu;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jizhantaizhang);
        kongtiao=(Button)findViewById(R.id.kongtiaoId);
        bts=(Button)findViewById(R.id.BTSId);
        ups=(Button)findViewById(R.id.upsId);
        donghuan=(Button)findViewById(R.id.donghuanId);
        gaokai=(Button)findViewById(R.id.gaokaiId);
        jiaoliu=(Button)findViewById(R.id.jiaoliupeidianxiangId);
        chuanshu=(Button)findViewById(R.id.chuanshuId);
        shipin=(Button)findViewById(R.id.shipinId);
        fangzai=(Button)findViewById(R.id.fangzaiId);
        onu=(Button)findViewById(R.id.onuId);

        onu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TaizhangJzActivity.this,OnuActivity.class);
                startActivity(intent);
            }
        });
        fangzai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TaizhangJzActivity.this,FangzaiActivity.class);
                startActivity(intent);
            }
        });
        shipin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TaizhangJzActivity.this,ShipinActivity.class);
                startActivity(intent);
            }
        });
        chuanshu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TaizhangJzActivity.this,ChuanshuActivity.class);
                startActivity(intent);
            }
        });
        jiaoliu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TaizhangJzActivity.this,JiaoliuActivity.class);
                startActivity(intent);
            }
        });
        gaokai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TaizhangJzActivity.this,GaokaiActivity.class);
                startActivity(intent);
            }
        });
        donghuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TaizhangJzActivity.this,DonghuanActivity.class);
                startActivity(intent);
            }
        });
        ups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TaizhangJzActivity.this,UpsActivity.class);
                startActivity(intent);
            }
        });
        kongtiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TaizhangJzActivity.this,KongtiaoActivity.class);
                startActivity(intent);
            }
        });
        bts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TaizhangJzActivity.this,BtsActivity.class);
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
