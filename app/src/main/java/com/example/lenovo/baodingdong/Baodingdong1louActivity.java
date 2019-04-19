package com.example.lenovo.baodingdong;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by lenovo on 2018/1/27.
 */

public class Baodingdong1louActivity extends AppCompatActivity{
    private Button zonghepeixian;
    private Button gaokai;
    private Button jiaoliupeixian;
    private Button gaokaidianchi1;
    private Button gaokaidianchi2;
    private Button upsdianchi;
    private Button ups;
    private Button kongtiao;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baodingdong1lou);
        gaokai=(Button)findViewById(R.id.baodingdonggaokaiId);
        zonghepeixian=(Button)findViewById(R.id.baodingdongzonghepeixianguiId);
        jiaoliupeixian=(Button)findViewById(R.id.baodingdongUPSpeixianguiId);
        gaokaidianchi1=(Button)findViewById(R.id.baodingdonggaokaidianyuan1Id);
        gaokaidianchi2=(Button)findViewById(R.id.baodingdonggaokaidianyuan2Id);
        upsdianchi=(Button)findViewById(R.id.baodingdongupsdianyuanId);
        ups=(Button)findViewById(R.id.baodingdongUPSiId);
        kongtiao=(Button)findViewById(R.id.baodingdong1loukongtiaoId);

        kongtiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Baodingdong1louActivity.this,QuangaokongtiaoActivity.class);
                startActivity(intent);
            }
        });
        ups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Baodingdong1louActivity.this,ChezhanupsActivity.class);
                startActivity(intent);
            }
        });
        upsdianchi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Baodingdong1louActivity.this,DianchizuActivity.class);
                startActivity(intent);
            }
        });
        gaokaidianchi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Baodingdong1louActivity.this,DianchizuActivity.class);
                startActivity(intent);
            }
        });
        gaokaidianchi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Baodingdong1louActivity.this,DianchizuActivity.class);
                startActivity(intent);
            }
        });
        jiaoliupeixian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Baodingdong1louActivity.this,Baodingdong1louJiaoliuActivity.class);
                startActivity(intent);
            }
        });
        zonghepeixian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Baodingdong1louActivity.this,ZonghepeixianActivity.class);
                startActivity(intent);
            }
        });
        gaokai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Baodingdong1louActivity.this,GaokaiActivity.class);
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
