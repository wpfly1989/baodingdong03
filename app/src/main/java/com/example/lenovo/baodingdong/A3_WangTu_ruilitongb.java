package com.example.lenovo.baodingdong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bm.library.PhotoView;

public class A3_WangTu_ruilitongb extends AppCompatActivity {
    private PhotoView photoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a3__wang_tu_ruilitongb);
        photoView = (PhotoView) findViewById(R.id.a3ruilitongb);
        photoView.enable();
        photoView.setMaxScale(10.0f);
    }
}
