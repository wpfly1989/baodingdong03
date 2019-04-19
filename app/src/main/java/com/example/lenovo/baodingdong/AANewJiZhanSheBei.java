package com.example.lenovo.baodingdong;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class AANewJiZhanSheBei extends AppCompatActivity {

    private ListView listView;
    private ArrayList<AANewBaseListView> baseListView = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aanew_ji_zhan_she_bei);

        listView = (ListView) findViewById(R.id.aanewjizhanshebeiListView);
        initJiZhanSheBei();
        AANewBaseAdapter adapter = new AANewBaseAdapter(AANewJiZhanSheBei.this, R.layout.aanewbaselistlayout, baseListView);
        listView.setAdapter(adapter);
        listView.setDivider(new ColorDrawable(Color.parseColor("#8A2BE2")));
        listView.setDividerHeight(5);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                AANewBaseListView item = baseListView.get(position);

                String msg = item.getName();

                if (msg.contains("DK080+188")) {
                    setJiZhan();

                } else if (msg.contains("DK081+660")) {
                    setSuoTing();
                } else if (msg.contains("DK082+750")) {
                    Intent intent=new Intent(AANewJiZhanSheBei.this,GaobeidiandongActivity.class);
                    startActivity(intent);
                } else if (msg.contains("K79+108")) {
                    set10KV();
                } else if (msg.contains("DK085+865")) {
                   setJiZhan();
                } else if (msg.contains("DK088+980")) {
                   setJiZhan();
                } else if (msg.contains("DK092+070")) {
                   setJiZhan();
                } else if (msg.contains("DK092+720")) {
                    setSuoTing();
                } else if (msg.contains("DK095+180")) {
                    setJiZhan();
                } else if (msg.contains("DK098+350")) {
                    setJiZhan();
                } else if (msg.contains("DK101+680")) {
                   setJiZhan();
                } else if (msg.contains("DK103+660")) {
                    setSuoTing();
                } else if (msg.contains("DK104+730")) {
                   setJiZhan();
                } else if (msg.contains("DK107+880")) {
                    setJiZhan();
                } else if (msg.contains("DK110+912")) {
                    setJiZhan();
                } else if (msg.contains("DK114+030")) {
                    Intent intent=new Intent(AANewJiZhanSheBei.this,XushuidongActivity.class);
                    startActivity(intent);
                } else if (msg.contains("DK115+700")) {
                   setSuoTing();
                } else if (msg.contains("DK116+882")) {
                    setJiZhan();
                } else if (msg.contains("DK119+578")) {
                    setJiZhan();
                } else if (msg.contains("DK122+173")) {
                    setJiZhan();
                } else if (msg.contains("DK124+778")) {
                    setJiZhan();
                } else if (msg.contains("DK127+600")) {
                   setJiZhan();
                } else if (msg.contains("DK127+970")) {
                   setSuoTing();
                } else if (msg.contains("DK130+469")) {
                    setJiZhan();
                } else if (msg.contains("DK133+163")) {
                    setJiZhan();
                } else if (msg.contains("DK140+300")) {
                   setJiZhan();
                } else if (msg.contains("K134+300")) {
                    Intent intent=new Intent(AANewJiZhanSheBei.this,BaoyangdianActivity.class);
                    startActivity(intent);
                } else if (msg.contains("DK142+685")) {
                    set10KV();
                } else if (msg.contains("DK142+900")) {
                    Intent intent=new Intent(AANewJiZhanSheBei.this,BaodingdongActivity.class);
                    startActivity(intent);
                } else if (msg.contains("DK144+300")) {
                    setSuoTing();
                } else if (msg.contains("DK145+818")) {
                    setJiZhan();
                } else if (msg.contains("DK148+282")) {
                    setJiZhan();
                } else if (msg.contains("DK151+148")) {
                    setJiZhan();
                } else if (msg.contains("DK153+700")) {
                    setJiZhan();
                } else if (msg.contains("DK156+600")) {
                    setJiZhan();
                } else if (msg.contains("DK157+730")) {
                    setSuoTing();
                } else if (msg.contains("DK159+200")) {
                    setJiZhan();
                } else if (msg.contains("DK161+600")) {
                    setJiZhan();
                } else if (msg.contains("DK164+250")) {
                    setJiZhan();
                } else if (msg.contains("DK167+050")) {
                   setJiZhan();
                } else if (msg.contains("DK168+400")) {
                    setSuoTing();
                } else if (msg.contains("DK169+600")) {
                   setJiZhan();
                } else if (msg.contains("DK172+200")) {
                    setJiZhan();
                }
            }
        });

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    private void setJiZhan() {
        Intent intent = new Intent(AANewJiZhanSheBei.this,TaizhangJzActivity.class);
        startActivity(intent);
    }

    private void setSuoTing() {
        Intent intent = new Intent(AANewJiZhanSheBei.this, SuotingPingmianActivity.class);
        startActivity(intent);
    }
    private void set10KV() {
        Intent intent = new Intent(AANewJiZhanSheBei.this, PeidiansuoPingmianActivity.class);
        startActivity(intent);
    }

    private void initJiZhanSheBei() {
        AANewBaseListView zg07 = new AANewBaseListView("ZZD-GBDD07 \nDK080+188  K76+437");
        baseListView.add(zg07);

        AANewBaseListView fangguan = new AANewBaseListView("方官AT所 \nDK081+660  K77+920");
        baseListView.add(fangguan);

        AANewBaseListView gaobeidiandong = new AANewBaseListView("高碑店东站 \nDK082+750  K79+008");
        baseListView.add(gaobeidiandong);

        AANewBaseListView gaobeidiandong10kv = new AANewBaseListView("高碑店东10KV配电所\nK79+108");
        baseListView.add(gaobeidiandong10kv);

        AANewBaseListView gx01 = new AANewBaseListView("GBDD-XSD01 \nDK085+865  K82+123");
        baseListView.add(gx01);

        AANewBaseListView gx02 = new AANewBaseListView("GBDD-XSD02 \nDK088+980  K85+184");
        baseListView.add(gx02);

        AANewBaseListView gx03 = new AANewBaseListView("GBDD-XSD03 \nDK092+070  K88+274");
        baseListView.add(gx03);

        AANewBaseListView zangguanying = new AANewBaseListView("臧官营AT所 \nDK092+720  K88+920");
        baseListView.add(zangguanying);

        AANewBaseListView gx04 = new AANewBaseListView("GBDD-XSD04 \nDK095+180  K91+384");
        baseListView.add(gx04);

        AANewBaseListView gx05 = new AANewBaseListView("GBDD-XSD05(5号中继） \nDK098+350  K94+554");
        baseListView.add(gx05);

        AANewBaseListView gx06 = new AANewBaseListView("GBDD-XSD06 \nDK101+680  K97+884");
        baseListView.add(gx06);

        AANewBaseListView yjz = new AANewBaseListView("姚家庄牵引变电所 \nDK103+660  K99+800");
        baseListView.add(yjz);

        AANewBaseListView gx07 = new AANewBaseListView("GBDD-XSD07 \nDK104+730  K100+934");
        baseListView.add(gx07);

        AANewBaseListView gx08 = new AANewBaseListView("GBDD-XSD08 \nDK107+880  K104+084");
        baseListView.add(gx08);

        AANewBaseListView gx09 = new AANewBaseListView("GBDD-XSD09 \nDK110+912  K107+116");
        baseListView.add(gx09);

        AANewBaseListView xsd = new AANewBaseListView("徐水东站 \nDK114+030  K110+234");
        baseListView.add(xsd);

        AANewBaseListView cz = new AANewBaseListView("崔庄AT所 \nDK115+700  K111+900");
        baseListView.add(cz);

        AANewBaseListView xb01 = new AANewBaseListView("XSD-BDD01 \nDK116+882  K113+086");
        baseListView.add(xb01);

        AANewBaseListView xb02 = new AANewBaseListView("XSD-BDD02 \nDK119+578  K115+782");
        baseListView.add(xb02);

        AANewBaseListView xb03 = new AANewBaseListView("XSD-BDD03 \nDK122+173  K118+377");
        baseListView.add(xb03);

        AANewBaseListView xb04 = new AANewBaseListView("XSD-BDD04 \nDK124+778  K120+982");
        baseListView.add(xb04);

        AANewBaseListView xb05 = new AANewBaseListView("XSD-BDD05（6号中继） \nDK127+600  K123+804");
        baseListView.add(xb05);

        AANewBaseListView xxy = new AANewBaseListView("西小营AT所 \nDK127+970  K124+170");
        baseListView.add(xxy);

        AANewBaseListView xb06 = new AANewBaseListView("XSD-BDD06 \nDK130+469  K126+673");
        baseListView.add(xb06);

        AANewBaseListView xb07 = new AANewBaseListView("XSD-BDD07 \nDK133+163  K129+367");
        baseListView.add(xb07);

        AANewBaseListView xb08 = new AANewBaseListView("XSD-BDD08 \nDK140+300  K132+301");
        baseListView.add(xb08);

        AANewBaseListView weixiu = new AANewBaseListView("京广高铁综合维修工区 \nK134+300");
        baseListView.add(weixiu);

        AANewBaseListView bd10kv = new AANewBaseListView("保定东10KV配电所\nDK142+685  K134+685");
        baseListView.add(bd10kv);

        AANewBaseListView bdd = new AANewBaseListView("保定东站 \nDK142+900  K134+951");
        baseListView.add(bdd);

        AANewBaseListView sc = new AANewBaseListView("孙村AT所 \nDK144+300  K136+301");
        baseListView.add(sc);

        AANewBaseListView bd01 = new AANewBaseListView("BDD-DZD01 \nDK145+818  K137+819");
        baseListView.add(bd01);

        AANewBaseListView bd02 = new AANewBaseListView("BDD-DZD02 \nDK148+282  K140+283");
        baseListView.add(bd02);

        AANewBaseListView bd03 = new AANewBaseListView("BDD-DZD03 \nDK151+148  K143+149");
        baseListView.add(bd03);

        AANewBaseListView bd04 = new AANewBaseListView("BDD-DZD04(7号中继） \nDK153+700  K145+701");
        baseListView.add(bd04);

        AANewBaseListView bd05 = new AANewBaseListView("BDD-DZD05 \nDK156+600  K148+601");
        baseListView.add(bd05);

        AANewBaseListView bdqyb = new AANewBaseListView("保定东牵引变电所 \nDK157+730  K149+730");
        baseListView.add(bdqyb);

        AANewBaseListView bd06 = new AANewBaseListView("BDD-DZD06 \nDK159+200  K151+201");
        baseListView.add(bd06);

        AANewBaseListView bd07 = new AANewBaseListView("BDD-DZD07 \nDK161+600  K153+601");
        baseListView.add(bd07);

        AANewBaseListView bd08 = new AANewBaseListView("BDD-DZD08（8号中继） \nDK164+250  K156+251");
        baseListView.add(bd08);

        AANewBaseListView bd09 = new AANewBaseListView("BDD-DZD09 \nDK167+050  K159+051");
        baseListView.add(bd09);

        AANewBaseListView jz = new AANewBaseListView("靳庄AT所 \nDK168+400  K160+400");
        baseListView.add(jz);

        AANewBaseListView bd10 = new AANewBaseListView("BDD-DZD10 \nDK169+600  K161+601");
        baseListView.add(bd10);

        AANewBaseListView bd11 = new AANewBaseListView("BDD-DZD11 \nDK172+200  K164+201");
        baseListView.add(bd11);
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
