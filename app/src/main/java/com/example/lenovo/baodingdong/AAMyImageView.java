package com.example.lenovo.baodingdong;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class AAMyImageView extends android.support.v7.widget.AppCompatImageView{
    public AAMyImageView(Context context) {
        super(context);
    }

    public AAMyImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public AAMyImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);
    }
}
