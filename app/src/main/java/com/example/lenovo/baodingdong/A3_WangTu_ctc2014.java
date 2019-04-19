package com.example.lenovo.baodingdong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bm.library.PhotoView;

public class A3_WangTu_ctc2014 extends AppCompatActivity {
    private PhotoView photoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a3__wang_tu_ctc2014);

        photoView = (PhotoView) findViewById(R.id.a3ctc01);
        photoView.enable();
        photoView.setMaxScale(10.0f);
    }
}
