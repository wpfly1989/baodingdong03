package com.example.lenovo.baodingdong;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by lenovo on 2017/12/9.
 */

public class YqybActivity extends AppCompatActivity{
    private Button otdr;
    private Button zhubobi;
    private Button m2ceshiyi;
    private Button neizuceshiyi;
    private Button shipingongchengbao;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yiqiyibiao);
        otdr=(Button)findViewById(R.id.otdrId);
        zhubobi=(Button)findViewById(R.id.zhubobiceshiyiId);
        m2ceshiyi=(Button)findViewById(R.id.m2ceshiyiId);
        neizuceshiyi=(Button)findViewById(R.id.neizuceshiyiId);
        shipingongchengbao=(Button)findViewById(R.id.shipingongchengbaoId);

        shipingongchengbao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(YqybActivity.this,ShipingongchengbaoActivity.class);
                startActivity(intent);
            }
        });
        neizuceshiyi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(YqybActivity.this,NeizuceshiyiActivity.class);
                startActivity(intent);
            }
        });
        m2ceshiyi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(YqybActivity.this,M2fenxiyiActivity.class);
                startActivity(intent);
            }
        });
        zhubobi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(YqybActivity.this,ZhubobiActivity.class);
                startActivity(intent);
            }
        });
        otdr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(YqybActivity.this,OtdrActivity.class);
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
