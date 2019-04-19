package com.example.lenovo.baodingdong;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by lenovo on 2017/12/25.
 */

public class UpsActivity extends AppCompatActivity{
    private Button upsdianchijiankong;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ups);
        upsdianchijiankong=(Button)findViewById(R.id.upsdianchijiankongId);

        upsdianchijiankong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(UpsActivity.this,DianchijiankongActivity.class);
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
