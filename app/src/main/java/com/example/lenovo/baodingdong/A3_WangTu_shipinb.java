package com.example.lenovo.baodingdong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bm.library.PhotoView;

public class A3_WangTu_shipinb extends AppCompatActivity {
    private PhotoView photoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a3__wang_tu_shipin);
        photoView = (PhotoView)findViewById(R.id.a3shipinb);
        photoView.enable();
        photoView.setMaxScale(10.0f);
    }
}
