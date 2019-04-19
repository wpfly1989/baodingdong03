package com.example.lenovo.baodingdong;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;


public class A3_MainActivity extends AppCompatActivity implements View.OnClickListener{



    private TextView banzu;
    private TextView jingtong;
    private TextView kaoshi;
    private TextView guanyu;

    private Fragment currentFragment = new Fragment();
    private A3_Banzu_Fragment banzuFragment;
    private A3_GuanYu_Fragment guanYuFragment;
    private A3_Kaoshi_Fragment kaoshiFragment;
    private A3_Jingtong_Fragment jingtongFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a3_main_layout);
        banzuFragment = new A3_Banzu_Fragment();
        guanYuFragment = new A3_GuanYu_Fragment();
        kaoshiFragment = new A3_Kaoshi_Fragment();
        jingtongFragment = new A3_Jingtong_Fragment();

        banzu = (TextView)findViewById(R.id.banzu);
        guanyu = (TextView) findViewById(R.id.guanyu);
        jingtong = (TextView)findViewById(R.id.jingtong);
        kaoshi = (TextView) findViewById(R.id.kaoshi);
        banzu.setOnClickListener(this);
        guanyu.setOnClickListener(this);
        jingtong.setOnClickListener(this);
        kaoshi.setOnClickListener(this);

        //init();
        banzu.setTextColor(Color.parseColor("#00C957"));
        showFragment(banzuFragment);
    }





    @Override
    public void onClick(View v) {
        FragmentManager fm = getFragmentManager();
        // 开启Fragment事务
        FragmentTransaction transaction = fm.beginTransaction();


        switch (v.getId()) {
            case R.id.banzu:

                initColor();
                banzu.setTextColor(Color.parseColor("#00C957"));

                showFragment(banzuFragment);
                break;
            case R.id.guanyu :
                initColor();
                guanyu.setTextColor(Color.parseColor("#00C957"));
                /*if (guanYuFragment == null) {
                    guanYuFragment = new A3_GuanYu_Fragment();
                }
                transaction.replace(R.id.contentFragment,guanYuFragment );*/
                showFragment(guanYuFragment);
                break;
            case R.id.kaoshi :
                initColor();
                kaoshi.setTextColor(Color.parseColor("#00C957"));
                showFragment(kaoshiFragment);
                break;
            case R.id.jingtong :
                initColor();
                jingtong.setTextColor(Color.parseColor("#00C957"));
                showFragment(jingtongFragment);
                break;
                default:
                    break;

        }
        transaction.commit();
    }
    private void showFragment(Fragment fragment) {
                 if (currentFragment!=fragment) {
                     FragmentManager fm = getFragmentManager();
                     // 开启Fragment事务
                     FragmentTransaction transaction = fm.beginTransaction();
                        transaction.hide(currentFragment);
                        currentFragment = fragment;
                       if (!fragment.isAdded()) {
                                 transaction.add(R.id.contentFragment, fragment).show(fragment).commit();
                             } else {
                                 transaction.show(fragment).commit();
                            }
                    }
            }

        private void initColor() {
            banzu.setTextColor(Color.BLACK);
            guanyu.setTextColor(Color.BLACK);
            jingtong.setTextColor(Color.BLACK);
            kaoshi.setTextColor(Color.BLACK);
        }
}
