package com.example.lenovo.baodingdong;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AAMyAdapter extends RecyclerView.Adapter<AAMyAdapter.ViewHolder>{
    private  Context context;
    private List<AAProjectItem> myList;
    private int where;
    private OnItemClickListener myClickListener = null;


    class ViewHolder extends RecyclerView.ViewHolder {

        View projectView;
        ImageView projectImage;
        TextView projectName;

        public ViewHolder(View itemView) {
            super(itemView);
            projectView = itemView;
            projectImage = (ImageView) itemView.findViewById(R.id.aaproject_image);
            projectName = (TextView) itemView.findViewById(R.id.aaproject_name);

        }
    }

    public AAMyAdapter(List<AAProjectItem> mmyList) {
        myList = mmyList;
    }

    public AAMyAdapter(Context context, List<AAProjectItem> mmyList) {
        this.context = context;
        myList = mmyList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.aaprojectitem, parent, false);
        final ViewHolder holder = new ViewHolder(view);
        where = holder.getAdapterPosition();

        return holder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        AAProjectItem item = myList.get(position);
        holder.projectImage.setImageResource(item.getImageId());
        holder.projectName.setText(item.getName());

        if (myClickListener != null) {
            holder.projectImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = holder.getLayoutPosition();
                    myClickListener.OnClick(holder.itemView, position);
                }
            });
        }


    }

    @Override
    public int getItemCount() {
        return myList.size();
    }



    public void setOnItemClickListener (OnItemClickListener listener) {
        this.myClickListener = listener;
    }

    public interface OnItemClickListener {
        void OnClick(View view ,int position);
    }



}
