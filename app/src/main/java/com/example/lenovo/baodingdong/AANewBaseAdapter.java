package com.example.lenovo.baodingdong;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class AANewBaseAdapter extends ArrayAdapter<AANewBaseListView>{

    private int resourseId;

    public AANewBaseAdapter(@NonNull Context context, int resource, @NonNull List<AANewBaseListView> objects) {
        super(context, resource, objects);
        resourseId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        AANewBaseListView baseListView = getItem(position);
        View view;
        ViewHolder viewHolder;

        if (convertView == null) {
        view = LayoutInflater.from(getContext()).inflate(resourseId,parent,false);
        viewHolder = new ViewHolder();
        viewHolder.name = (TextView) view.findViewById(R.id.aabasename);
        view.setTag(viewHolder);
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.name.setText(baseListView.getName());
        return view;
    }

    class ViewHolder {
        TextView name;
    }
}
