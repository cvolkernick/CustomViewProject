package com.example.cvolk.customviewproject;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.ImageButton;


public class ToggleButton extends android.support.v7.widget.AppCompatImageButton {

    private static final String TAG = "MAIN_TAG";

    public ToggleButton(Context context) {
        super(context);
    }

    public ToggleButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ToggleButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "onTouchEvent: down");

                this.setBackgroundResource(R.drawable.cat);
                break;

            case MotionEvent.ACTION_UP:
                Log.d(TAG, "onTouchEvent: up");

                this.setBackgroundColor(Color.WHITE);
                break;
        }

        return super.onTouchEvent(event);
    }
}
