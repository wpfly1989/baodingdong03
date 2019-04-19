package com.example.lenovo.baodingdong;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by lenovo on 2018/1/18.
 */

public class BaodingdongActivity extends AppCompatActivity{
    private Button bts;
    private Button chuanshu622;
    private Button chuanshu10g;
    private Button fas;
    private Button ddf;
    private Button shujuwang;
    private Button baodingdong1lou;
    private Button onu;
    private Button yuyinpeixian;
    private Button odf1;
    private Button odf2;
    private Button shipingui2;
    private Button jinghusui;
    private Button jinduanji;
    private Button yuanduanji;
    private Button kongtiao;
    private Button shipingui1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baodingdong);
        bts=(Button)findViewById(R.id.baodingdongBTSId);
        chuanshu622=(Button)findViewById(R.id.baodingdong622Id);
        fas=(Button)findViewById(R.id.baodingdongfasId);
        ddf=(Button)findViewById(R.id.baodingdongddfId);
        shujuwang=(Button)findViewById(R.id.baodingdongshujuwangId);
        chuanshu10g=(Button)findViewById(R.id.baodingdong10gId);
        baodingdong1lou=(Button)findViewById(R.id.baodingdong1louId);
        onu=(Button)findViewById(R.id.baodingdongONUId);
        yuyinpeixian=(Button)findViewById(R.id.baodingdongyuyinpeixianjiaId);
        odf1=(Button)findViewById(R.id.baodingdongodf1Id);
        odf2=(Button)findViewById(R.id.baodingdongodf2Id);
        shipingui2=(Button)findViewById(R.id.baodingdongshipin2Id);
        jinghusui=(Button)findViewById(R.id.baodingdongjinghusuiId);
        jinduanji=(Button)findViewById(R.id.baodingdongjinduanId);
        yuanduanji=(Button)findViewById(R.id.baodingdongyuanduanId);
        kongtiao=(Button)findViewById(R.id.baodingdongkongtiaoId);
        shipingui1=(Button)findViewById(R.id.baodingdongshipin1Id);

        shipingui1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BaodingdongActivity.this,JingshafuwuqiActivity.class);
                startActivity(intent);
            }
        });
        kongtiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BaodingdongActivity.this,QuangaokongtiaoActivity.class);
                startActivity(intent);
            }
        });
        yuanduanji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BaodingdongActivity.this,ZhifangzhanActivity.class);
                startActivity(intent);
            }
        });
        jinduanji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BaodingdongActivity.this,ZhifangzhanActivity.class);
                startActivity(intent);
            }
        });
        jinghusui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BaodingdongActivity.this,BaodingdongJinghusuiActivity.class);
                startActivity(intent);
            }
        });
        shipingui2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BaodingdongActivity.this,BaodingdongShipingui2.class);
                startActivity(intent);
            }
        });
        odf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BaodingdongActivity.this,DdfActivity.class);
                startActivity(intent);
            }
        });
        odf1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BaodingdongActivity.this,DdfActivity.class);
                startActivity(intent);
            }
        });
        yuyinpeixian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BaodingdongActivity.this,ZonghepeixianActivity.class);
                startActivity(intent);
            }
        });
        onu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BaodingdongActivity.this,OnuActivity.class);
                startActivity(intent);
            }
        });
        baodingdong1lou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BaodingdongActivity.this,Baodingdong1louActivity.class);
                startActivity(intent);
            }
        });
        chuanshu10g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BaodingdongActivity.this,ChezhanchuanshuActivity.class);
                startActivity(intent);
            }
        });
        shujuwang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BaodingdongActivity.this,ShujuwangActivity.class);
                startActivity(intent);
            }
        });
        ddf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BaodingdongActivity.this,DdfActivity.class);
                startActivity(intent);
            }
        });
        fas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BaodingdongActivity.this,FasActivity.class);
                startActivity(intent);
            }
        });
        chuanshu622.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BaodingdongActivity.this,ChezhanchuanshuActivity.class);
                startActivity(intent);
            }
        });
        bts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BaodingdongActivity.this,BtsActivity.class);
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
