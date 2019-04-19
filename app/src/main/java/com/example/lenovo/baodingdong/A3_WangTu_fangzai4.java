package com.example.lenovo.baodingdong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bm.library.PhotoView;

public class A3_WangTu_fangzai4 extends AppCompatActivity {
    private PhotoView photoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a3__wang_tu_fangzai4);
        photoView = (PhotoView) findViewById(R.id.a3fangzai4);
        photoView.enable();
        photoView.setMaxScale(10.0f);
    }
}
