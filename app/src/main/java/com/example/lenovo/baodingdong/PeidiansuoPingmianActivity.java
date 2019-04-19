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

public class PeidiansuoPingmianActivity extends AppCompatActivity{
    private Button shipin;
    private Button onu;
    private Button chuanshu;
    private Button gaokai;
    private Button ups;
    private Button kongtiao;
    private Button donghuan;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peidiansuopingmian);

        shipin=(Button)findViewById(R.id.peidiansuoshipinId);
        onu=(Button)findViewById(R.id.peidiansuoONUId);
        chuanshu=(Button)findViewById(R.id.peidiansuochuanshuId);
        gaokai=(Button)findViewById(R.id.peidiansuogaokaiId);
        ups=(Button)findViewById(R.id.peidiansuoupsId);
        kongtiao=(Button)findViewById(R.id.peidiansuokongtiaoId);
        donghuan=(Button)findViewById(R.id.peidiansuodonghuanId);

        donghuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PeidiansuoPingmianActivity.this,DonghuanActivity.class);
                startActivity(intent);
            }
        });
        kongtiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PeidiansuoPingmianActivity.this,SuotingKongtiaoActivity.class);
                startActivity(intent);
            }
        });
        ups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PeidiansuoPingmianActivity.this,UpsActivity.class);
                startActivity(intent);
            }
        });
        gaokai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PeidiansuoPingmianActivity.this,GaokaiActivity.class);
                startActivity(intent);
            }
        });
        chuanshu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PeidiansuoPingmianActivity.this,PeidiansuoChuanshuActivity.class);
                startActivity(intent);
            }
        });
        onu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PeidiansuoPingmianActivity.this,OnuActivity.class);
                startActivity(intent);
            }
        });
        shipin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PeidiansuoPingmianActivity.this,ShipinActivity.class);
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
