package com.example.lenovo.baodingdong;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class AANewGuZhangUPS extends AppCompatActivity {
    private TextView upsdianchijiankongmokuai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aanew_gu_zhang_ups);

        upsdianchijiankongmokuai = (TextView) findViewById(R.id.upsdianchijiankongmokuai);
        upsdianchijiankongmokuai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AANewGuZhangUPS.this, DianchijiankongActivity.class);
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
