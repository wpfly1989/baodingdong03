package com.example.lenovo.baodingdong;

import android.app.Fragment;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class A3_Jingtong_Fragment extends Fragment{


    private ListView listView;
    private ArrayList<AANewBaseListView> baseListView = new ArrayList<>();


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View viewForJingtong = inflater.inflate(R.layout.a3_jingtong_fragment, container, false);

        listView = (ListView)viewForJingtong.findViewById(R.id.a3suoyouwenjianlistView);
        initWenjian();
        AANewBaseAdapter adapter = new AANewBaseAdapter(getActivity(),R.layout.aanewbaselistlayout, baseListView);
        listView.setAdapter(adapter);
        listView.setDivider(new ColorDrawable(Color.parseColor("#FF4500")));
        listView.setDividerHeight(5);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                AANewBaseListView item = baseListView.get(position);

                String msg = item.getName();

                if (msg.contains("京通安")) {
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.lanzous.com/b313938/"));
                    startActivity(intent);
                }  else if (msg.contains("限期内")) {
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.lanzous.com/b313939/"));
                    startActivity(intent);
                }  else if (msg.contains("不同阶段")) {
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.lanzous.com/b313940/"));
                    startActivity(intent);
                }else if (msg.contains("其他文")) {
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.lanzous.com/b313954/"));
                    startActivity(intent);
                }

            }
        });

        return viewForJingtong;
    }

    private void initWenjian() {
        AANewBaseListView sss = new AANewBaseListView("京通安等所有文件");
        baseListView.add(sss);
        AANewBaseListView shitiaogongxian = new AANewBaseListView("限期内有完成任务的文件");
        baseListView.add(shitiaogongxian);
        AANewBaseListView shibuzhun = new AANewBaseListView("需要不同阶段完成的文件");
        baseListView.add(shibuzhun);
        AANewBaseListView aaa = new AANewBaseListView("其他文件");
        baseListView.add(aaa);
    }

}
