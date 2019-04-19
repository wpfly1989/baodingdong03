package com.example.lenovo.baodingdong;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by lenovo on 2017/12/9.
 */

public class RylxActivity extends AppCompatActivity{

    private TextView beijing;
    private TextView baoding;
    private TextView gongwu;
    private TextView gongdian;
    private TextView xinhao;
    private TextView jianzhu;
    private TextView gongan;
    private TextView chezhan;
    private TextView changjia;
    private LinearLayout beijinglayout;
    private LinearLayout baodinglayout;
    private LinearLayout gongwulayout;
    private LinearLayout gongdianlayout;
    private LinearLayout xinhaolayout;
    private LinearLayout jianzhulayout;
    private LinearLayout gonganlayout;
    private LinearLayout chezhanlayout;
    private LinearLayout changjialayout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aanewrenyuanlianxi);

        beijing = (TextView) findViewById(R.id.beijingclick);
        beijinglayout = (LinearLayout) findViewById(R.id.beijinglayout);
        baoding = (TextView)findViewById(R.id.baodingclick);
        baodinglayout = (LinearLayout) findViewById(R.id.baodinglayout);
        gongwu = (TextView) findViewById(R.id.gongwuclick);
        gongwulayout = (LinearLayout) findViewById(R.id.gongwulayout);
        gongdian = (TextView) findViewById(R.id.gongdianclick);
        gongdianlayout = (LinearLayout) findViewById(R.id.gongdianlayout);
        xinhao = (TextView) findViewById(R.id.xinhaoclick);
        xinhaolayout = (LinearLayout) findViewById(R.id.xinhaolayout);
        jianzhu = (TextView) findViewById(R.id.jianzhuclick);
        jianzhulayout = (LinearLayout) findViewById(R.id.jianzhulayout);
        gongan = (TextView) findViewById(R.id.gonganclick);
        gonganlayout = (LinearLayout) findViewById(R.id.gonganlayout);
        chezhan = (TextView) findViewById(R.id.chezhanclick);
        chezhanlayout = (LinearLayout)findViewById(R.id.chezhanlayout);
        changjia = (TextView) findViewById(R.id.changjiaclick);
        changjialayout = (LinearLayout) findViewById(R.id.changjialayout);

        beijing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (beijinglayout.getVisibility() == View.GONE) {
                    beijinglayout.setVisibility(View.VISIBLE);
                    beijing.setText("[收起]");
                } else {
                    beijinglayout.setVisibility(View.GONE);
                    beijing.setText("[展开]");
                }
            }
        });
        baoding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (baodinglayout.getVisibility() == View.GONE) {
                    baodinglayout.setVisibility(View.VISIBLE);
                    baoding.setText("[收起]");
                } else {
                    baodinglayout.setVisibility(View.GONE);
                    baoding.setText("[展开]");
                }
            }
        });
        gongwu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gongwulayout.getVisibility() == View.GONE) {
                    gongwulayout.setVisibility(View.VISIBLE);
                    gongwu.setText("[收起]");
                } else {
                    gongwulayout.setVisibility(View.GONE);
                    gongwu.setText("[展开]");
                }
            }
        });
        gongdian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gongdianlayout.getVisibility() == View.GONE) {
                    gongdianlayout.setVisibility(View.VISIBLE);
                    gongdian.setText("[收起]");
                }else {
                    gongdianlayout.setVisibility(View.GONE);
                    gongdian.setText("[展开]");
                }
            }
        });
        xinhao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (xinhaolayout.getVisibility() == View.GONE) {
                    xinhaolayout.setVisibility(View.VISIBLE);
                    xinhao.setText("[收起]");
                } else {
                    xinhaolayout.setVisibility(View.GONE);
                    xinhao.setText("[展开]");
                }
            }
        });
        jianzhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (jianzhulayout.getVisibility() == View.GONE) {
                    jianzhulayout.setVisibility(View.VISIBLE);
                    jianzhu.setText("[收起]");
                }else {
                    jianzhulayout.setVisibility(View.GONE);
                    jianzhu.setText("[展开]");
                }
            }
        });
        gongan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gonganlayout.getVisibility() == View.GONE) {
                    gonganlayout.setVisibility(View.VISIBLE);
                    gongan.setText("[收起]");
                } else {
                    gonganlayout.setVisibility(View.GONE);
                    gongan.setText("[展开]");
                }
            }
        });
        chezhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chezhanlayout.getVisibility() == View.GONE) {
                    chezhanlayout.setVisibility(View.VISIBLE);
                    chezhan.setText("[收起]");
                } else {
                    chezhanlayout.setVisibility(View.GONE);
                    chezhan.setText("[展开]");
                }
            }
        });
        changjia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (changjialayout.getVisibility() == View.GONE) {
                    changjialayout.setVisibility(View.VISIBLE);
                    changjia.setText("[收起]");
                } else {
                    changjialayout.setVisibility(View.GONE);
                    changjia.setText("[展开]");
                }
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
