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

public class SuotingPingmianActivity extends AppCompatActivity{
    private Button chuanshu;
    private Button onu;
    private Button shipin;
    private Button donghuan;
    private Button gaokai;
    private Button ups;
    private Button kongtiao;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suotingpingmiantu);

        chuanshu=(Button)findViewById(R.id.suotingchuanshuId);
        onu=(Button)findViewById(R.id.suotingONUId);
        shipin=(Button)findViewById(R.id.suotingshipinId);
        donghuan=(Button)findViewById(R.id.suotingdonghuanId);
        gaokai=(Button)findViewById(R.id.suotinggaokaiId);
        ups=(Button)findViewById(R.id.suotingupsId);
        kongtiao=(Button)findViewById(R.id.suotingkongtiaoId);

        kongtiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SuotingPingmianActivity.this,SuotingKongtiaoActivity.class);
                startActivity(intent);
            }
        });
        ups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SuotingPingmianActivity.this,UpsActivity.class);
                startActivity(intent);
            }
        });
        gaokai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SuotingPingmianActivity.this,GaokaiActivity.class);
                startActivity(intent);
            }
        });
        donghuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SuotingPingmianActivity.this,DonghuanActivity.class);
                startActivity(intent);
            }
        });
        shipin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SuotingPingmianActivity.this,ShipinActivity.class);
                startActivity(intent);
            }
        });
        onu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SuotingPingmianActivity.this,OnuActivity.class);
                startActivity(intent);
            }
        });
        chuanshu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SuotingPingmianActivity.this,ATsuoChuanshuActivity.class);
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
