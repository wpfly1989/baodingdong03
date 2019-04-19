package com.example.lenovo.baodingdong;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by lenovo on 2018/2/28.
 */

public class BaoyangdianActivity extends AppCompatActivity{
    private Button kongtiao;
    private Button zonghepeixian;
    private Button chuanshu;
    private Button shipin;
    private Button gaokai;
    private Button ups;
    private Button donghuan;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baoyangdian);
        kongtiao=(Button)findViewById(R.id.baoyangdiankongtiaoId);
        zonghepeixian=(Button)findViewById(R.id.baoyangdianzonghepeixianguiId);
        chuanshu=(Button)findViewById(R.id.baoyangdianchuanshuId);
        shipin=(Button)findViewById(R.id.baoyangdianshipinId);
        gaokai=(Button)findViewById(R.id.baoyangdiangaokaiId);
        ups=(Button)findViewById(R.id.baoyangdianupsId);
        donghuan=(Button)findViewById(R.id.baoyangdiandonghuanId);

        donghuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BaoyangdianActivity.this,DonghuanActivity.class);
                startActivity(intent);
            }
        });
        ups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BaoyangdianActivity.this,UpsActivity.class);
                startActivity(intent);
            }
        });
        gaokai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BaoyangdianActivity.this,GaokaiActivity.class);
                startActivity(intent);
            }
        });
        shipin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BaoyangdianActivity.this,ShipinActivity.class);
                startActivity(intent);
            }
        });
        chuanshu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BaoyangdianActivity.this,ChuanshuActivity.class);
            }
        });
        zonghepeixian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BaoyangdianActivity.this,BaoyangdianZonghepeixianActivity.class);
                startActivity(intent);
            }
        });
        kongtiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BaoyangdianActivity.this,BaoyangdianKongtiaoActivity.class);
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
