package com.example.lenovo.baodingdong;


import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

public class AAMyTextView extends android.support.v7.widget.AppCompatTextView {

    public AAMyTextView(Context context) {
        super(context);
    }

    public AAMyTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public AAMyTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean isFocused() {
        return true;
    }
}
