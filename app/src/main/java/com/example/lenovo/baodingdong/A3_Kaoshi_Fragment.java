package com.example.lenovo.baodingdong;

import android.app.Fragment;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class A3_Kaoshi_Fragment extends Fragment{
    private ListView listView;
    private ArrayList<AANewBaseListView> baseListView = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View viewForKaoshi = inflater.inflate(R.layout.a3_kaoshi_fragment, container,false);
        listView = (ListView) viewForKaoshi.findViewById(R.id.a3kaoshifragment);

        initKaoshi();
        AANewBaseAdapter adapter = new AANewBaseAdapter(getActivity(), R.layout.aanewbaselistlayout, baseListView);
        listView.setAdapter(adapter);
        listView.setDivider(new ColorDrawable(Color.parseColor("#FF4500")));
        listView.setDividerHeight(5);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                AANewBaseListView item = baseListView.get(position);

                String msg = item.getName();
                if (msg.contains("上机考试")) {
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.lanzous.com/b308046/"));
                    startActivity(intent);
                } else if (msg.contains("车间实作")) {
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.lanzous.com/b308047/"));
                    startActivity(intent);
                } else if (msg.contains("笔答实作")) {
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.lanzous.com/b308048/"));
                    startActivity(intent);
                } else if (msg.contains("其他考试")) {
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.lanzous.com/b308222/"));
                    startActivity(intent);
                }
            }
        });
        return viewForKaoshi;
    }

    private void initKaoshi() {
        AANewBaseListView sss = new AANewBaseListView("（星级考试理论部分）\n上机考试试题资料");
        baseListView.add(sss);
        AANewBaseListView shitiaogongxian = new AANewBaseListView("(星级考试实作部分)\n车间实作考试资料");
        baseListView.add(shitiaogongxian);
        AANewBaseListView shibuzhun = new AANewBaseListView("(星级考试实作部分)\n笔答实作考试资料");
        baseListView.add(shibuzhun);
        AANewBaseListView aaa = new AANewBaseListView("班组其他考试资料下载");
        baseListView.add(aaa);
    }
}
