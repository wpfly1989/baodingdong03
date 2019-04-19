package com.example.lenovo.baodingdong;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class A3_Banzu_Fragment extends Fragment{
    private TextView textView;
    private Calendar calendarbeFore;
    private Calendar calendarNow;
    private Calendar calendarOfBaoDingDong;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        menu.clear();
        inflater.inflate(R.menu.banzu, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.fenxiang :
                Intent intent = new Intent(getActivity(), A3_Download.class);
                startActivity(intent);
                break;
                default:
                    break;
        }
        return true;
    }

    private ArrayList<AAProjectItem> projectList = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View viewForBanzu = inflater.inflate(R.layout.a3_banzu_fragment, container, false);

        Toolbar toolbar = (Toolbar) viewForBanzu.findViewById(R.id.a3_main_toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        toolbar.inflateMenu(R.menu.banzu);


        textView = (TextView) viewForBanzu.findViewById(R.id.a3shengchantianshu);
        calendarbeFore = Calendar.getInstance();
        calendarbeFore.set(2010, 2, 21);
        long timeOfDuan = calendarbeFore.getTimeInMillis();

        calendarOfBaoDingDong = Calendar.getInstance();
        calendarOfBaoDingDong.set(2012, 7, 1);
        long timeOfBaoDingDong = calendarOfBaoDingDong.getTimeInMillis();

        calendarNow = Calendar.getInstance();
        calendarNow.setTime(new Date());
        long timeNow = calendarNow.getTimeInMillis();

        long daysOfDuan = (timeNow - timeOfDuan) / 1000 / 60 / 60 / 24 - 1;
        long daysOfBaoDingDong = (timeNow - timeOfBaoDingDong) / 1000 / 60 / 60 / 24 - 2;
        String msg = "段安全生产" + daysOfDuan + "天 车间安全生产" + daysOfDuan + "天 班组安全生产" + daysOfBaoDingDong + "天";
        textView.setText(msg);
        initProject();
        RecyclerView recyclerView = (RecyclerView) viewForBanzu.findViewById(R.id.banzu_recyclerview);

        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 3);
        recyclerView.setLayoutManager( layoutManager);

        AAMyAdapter adapter = new AAMyAdapter(getActivity() ,projectList);

        recyclerView.setAdapter( adapter);

        adapter.setOnItemClickListener(new AAMyAdapter.OnItemClickListener() {
            @Override
            public void OnClick(View view ,int position) {
                if (projectList.get(position).getImageId() == R.mipmap.aagongqujieshao) {
                    Intent intent = new Intent (getActivity(),GqgkActivity.class);
                    startActivity(intent);

                } else if (projectList.get(position).getImageId() == R.mipmap.aaguanneihuantu) {
                    Intent intent = new Intent (getActivity(),A3_GuanNeiWangTu.class);
                    startActivity(intent);
                } else if (projectList.get(position).getImageId() == R.mipmap.aarenyuanlianxi) {
                    Intent intent = new Intent(getActivity(),RylxActivity.class);
                    startActivity(intent);
                } else if (projectList.get(position).getImageId() == R.mipmap.aadaohangdingwei) {

                    Intent intent = new Intent(getActivity(),AANewDingWeiDaoHang.class);
                    startActivity(intent);

                } else  if (projectList.get(position).getImageId() == R.mipmap.aajizhanshebei) {
                    Intent intent = new Intent(getActivity(),AANewJiZhanSheBei.class);
                    startActivity(intent);
                } else if (projectList.get(position).getImageId() == R.mipmap.aarichangguzhang) {
                    Intent intent = new Intent(getActivity(),AANewRiChangGuZhang.class);
                    startActivity(intent);
                } else if (projectList.get(position).getImageId() == R.mipmap.aayiqiyibiao)  {
                    Intent intent = new Intent(getActivity(), AANewYiQiYiBiao.class);
                    startActivity(intent);
                } else if (projectList.get(position).getImageId() == R.mipmap.aaguizhangzhidu) {
                    Intent intent = new Intent(getActivity(),AANewGuiZhangZhiDu.class);
                    startActivity(intent);
                } else if (projectList.get(position).getImageId() == R.mipmap.aajianyibianqian) {
                    Intent intent = new Intent(getActivity(),AANewJianYiBianQian.class);
                    startActivity(intent);
                }
            }
        });

        return viewForBanzu;
    }
    private void initProject() {
        AAProjectItem gongqujieshao = new AAProjectItem("工区介绍", R.mipmap.aagongqujieshao);
        projectList.add(gongqujieshao);

        AAProjectItem guanneihuantu = new AAProjectItem("管内网图", R.mipmap.aaguanneihuantu);
        projectList.add(guanneihuantu);

        AAProjectItem renyuanlianxi = new AAProjectItem("人员联系", R.mipmap.aarenyuanlianxi);
        projectList.add(renyuanlianxi);

        AAProjectItem dingweidaohang = new AAProjectItem("定位导航", R.mipmap.aadaohangdingwei);
        projectList.add(dingweidaohang);

        AAProjectItem jizhanshebei = new AAProjectItem("基站设备", R.mipmap.aajizhanshebei);
        projectList.add(jizhanshebei);

        AAProjectItem richangguzhang = new AAProjectItem("应急故障", R.mipmap.aarichangguzhang);
        projectList.add(richangguzhang);

        AAProjectItem yiqiyibiao = new AAProjectItem("仪器仪表", R.mipmap.aayiqiyibiao);
        projectList.add(yiqiyibiao);

        AAProjectItem guizhangzhidu = new AAProjectItem("规章制度", R.mipmap.aaguizhangzhidu);
        projectList.add(guizhangzhidu);

        AAProjectItem jianyibianqian = new AAProjectItem("事件记录", R.mipmap.aajianyibianqian);
        projectList.add(jianyibianqian);


    }
}
