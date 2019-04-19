package com.example.lenovo.baodingdong;

import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class A3_GuanNei_xinxianyunyong extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a3__guan_nei_xinxianyunyong);

        textView = (TextView)findViewById(R.id.a3taizhangxiazai);
        textView.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://pan.baidu.com/s/1xa4E7ehqElQSG49tG7aaiA"));
                startActivity(intent);
            }
        });
    }
}
