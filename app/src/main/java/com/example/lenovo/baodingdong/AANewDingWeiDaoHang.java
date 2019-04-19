package com.example.lenovo.baodingdong;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class AANewDingWeiDaoHang extends AppCompatActivity {

    private ListView listView;
    private ArrayList<AANewBaseListView> baseListView = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aanew_ding_wei_dao_hang);
        listView = (ListView) findViewById(R.id.aanewdingweidaohangListView);

        initDingWeiDaoHang();
        AANewBaseAdapter adapter = new AANewBaseAdapter(AANewDingWeiDaoHang.this, R.layout.aanewbaselistlayout, baseListView);
        listView.setAdapter(adapter);
        listView.setDivider(new ColorDrawable(Color.parseColor("#FF0000")));
        listView.setDividerHeight(5);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                AANewBaseListView item = baseListView.get(position);

                String msg = item.getName();

                if (msg.contains("DK080+188")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=39.314938,115.968294&title=ZZD-GBDD07&content=makeamarker&traffic=on"));
                    startActivity(intent);

                } else if (msg.contains("DK081+660")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=39.302292,115.959922&title=方官AT所&content=makeamarker&traffic=on"));
                    startActivity(intent);
                } else if (msg.contains("DK082+750")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=39.295055,115.952822&title=高碑店东站&content=makeamarker&traffic=on"));

                    startActivity(intent);
                } else if (msg.contains("K79+108")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=39.293581,115.952556&title=高碑店东10KV配电所&content=makeamarker&traffic=on"));

                    startActivity(intent);
                } else if (msg.contains("DK085+865")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=39.272022,115.935165&title=GBDD-XSD01&content=makeamarker&traffic=on"));
                    startActivity(intent);
                } else if (msg.contains("DK088+980")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=39.244218,115.912959&title=GBDD-XSD02&content=makeamarker&traffic=on"));
                    startActivity(intent);
                } else if (msg.contains("DK092+070")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=39.224964,115.894813&title=GBDD-XSD03&content=makeamarker&traffic=on"));
                    startActivity(intent);
                } else if (msg.contains("DK092+720")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=39.220296,115.890231&title=臧官营AT所&content=makeamarker&traffic=on"));
                    startActivity(intent);
                } else if (msg.contains("DK095+180")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=39.202230,115.873739&title=GBDD-XSD04&content=makeamarker&traffic=on"));
                    startActivity(intent);
                } else if (msg.contains("DK098+350")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=39.175504,115.857084&title=GBDD-XSD05&content=makeamarker&traffic=on"));
                    startActivity(intent);
                } else if (msg.contains("DK101+680")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=39.149054,115.841364&title=GBDD-XSD06&content=makeamarker&traffic=on"));
                    startActivity(intent);
                } else if (msg.contains("DK103+660")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=39.133747,115.832219&title=姚家庄牵引变电所&content=makeamarker&traffic=on"));
                    startActivity(intent);
                } else if (msg.contains("DK104+730")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=39.124455,115.826685&title=GBDD-XSD07&content=makeamarker&traffic=on"));
                    startActivity(intent);
                } else if (msg.contains("DK107+880")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=39.099757,115.808881&title=GBDD-XSD08&content=makeamarker&traffic=on"));
                    startActivity(intent);
                } else if (msg.contains("DK110+912")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=39.077718,115.789334&title=GBDD-XSD09&content=makeamarker&traffic=on"));
                    startActivity(intent);
                } else if (msg.contains("DK114+030")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=39.052989,115.766858&title=徐水东站&content=makeamarker&traffic=on"));
                    startActivity(intent);
                } else if (msg.contains("DK115+700")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=39.041683,115.757911&title=崔庄AT所&content=makeamarker&traffic=on"));
                    startActivity(intent);
                } else if (msg.contains("DK116+882")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=39.032897,115.750042&title=XSD-BDD01&content=makeamarker&traffic=on"));
                    startActivity(intent);
                } else if (msg.contains("DK119+578")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=39.012939,115.732327&title=XSD-BDD02&content=makeamarker&traffic=on"));
                    startActivity(intent);
                } else if (msg.contains("DK122+173")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=38.995332,115.712421&title=XSD-BDD03&content=makeamarker&traffic=on"));
                    startActivity(intent);
                } else if (msg.contains("DK124+778")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=38.976682,115.693395&title=XSD-BDD04&content=makeamarker&traffic=on"));
                    startActivity(intent);
                } else if (msg.contains("DK127+600")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=38.956638,115.676471&title=XSD-BDD05&content=makeamarker&traffic=on"));
                    startActivity(intent);
                } else if (msg.contains("DK127+970")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=38.953790,115.674045&title=西小营AT所&content=makeamarker&traffic=on"));
                    startActivity(intent);
                } else if (msg.contains("DK130+469")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=38.933894,115.657499&title=XSD-BDD06&content=makeamarker&traffic=on"));
                    startActivity(intent);
                } else if (msg.contains("DK133+163")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=38.914238,115.641185&title=XSD-BDD07&content=makeamarker&traffic=on"));
                    startActivity(intent);
                } else if (msg.contains("DK140+300")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=38.890343,115.623758&title=XSD-BDD08&content=makeamarker&traffic=on"));
                    startActivity(intent);
                } else if (msg.contains("K134+300")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=38.877213,115.614146&title=京广高铁保定东保养点&content=makeamarker&traffic=on"));
                    startActivity(intent);
                } else if (msg.contains("DK142+685")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=38.872691,115.609888&title=保定东10KV配电所&content=makeamarker&traffic=on"));
                    startActivity(intent);
                } else if (msg.contains("DK142+900")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=38.872691,115.609888&title=保定东站&content=makeamarker&traffic=on"));
                    startActivity(intent);
                } else if (msg.contains("DK144+300")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=38.860583,115.601911&title=孙村AT所&content=makeamarker&traffic=on"));
                    startActivity(intent);
                } else if (msg.contains("DK145+818")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=38.848160,115.592946&title=BDD-DZD01&content=makeamarker&traffic=on"));
                    startActivity(intent);
                } else if (msg.contains("DK148+282")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=38.828906,115.578744&title=BDD-DZD02&content=makeamarker&traffic=on"));
                    startActivity(intent);
                } else if (msg.contains("DK151+148")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=38.562763,115.806729&title=BDD-DZD03&content=makeamarker&traffic=on"));
                    startActivity(intent);
                } else if (msg.contains("DK153+700")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=38.787804,115.546468&title=BDD-DZD04&content=makeamarker&traffic=on"));
                    startActivity(intent);
                } else if (msg.contains("DK156+600")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=38.767270,115.526355&title=BDD-DZD05&content=makeamarker&traffic=on"));
                    startActivity(intent);
                } else if (msg.contains("DK157+730")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=38.758390,115.517372&title=保定东牵引变电所&content=makeamarker&traffic=on"));
                    startActivity(intent);
                } else if (msg.contains("DK159+200")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=38.749020,115.505874&title=BDD-DZD06&content=makeamarker&traffic=on"));
                    startActivity(intent);
                } else if (msg.contains("DK161+600")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=38.736497,115.481404&title=BDD-DZD07&content=makeamarker&traffic=on"));
                    startActivity(intent);
                } else if (msg.contains("DK164+250")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=38.725365,115.456036&title=BDD-DZD08&content=makeamarker&traffic=on"));
                    startActivity(intent);
                } else if (msg.contains("DK167+050")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=38.712401,115.428853&title=BDD-DZD09&content=makeamarker&traffic=on"));
                    startActivity(intent);
                } else if (msg.contains("DK168+400")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=38.705588,115.416312&title=靳庄AT所&content=makeamarker&traffic=on"));
                    startActivity(intent);
                } else if (msg.contains("DK169+600")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=38.699196,115.404581&title=BDD-DZD10&content=makeamarker&traffic=on"));
                    startActivity(intent);
                } else if (msg.contains("DK172+200")) {
                    Intent intent=new Intent();
                    intent.setData(Uri.parse("baidumap://map/marker?location=38.686851,115.381988&title=BDD-DZD11&content=makeamarker&traffic=on"));
                    startActivity(intent);
                }
            }
        });
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    private void initDingWeiDaoHang() {
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
