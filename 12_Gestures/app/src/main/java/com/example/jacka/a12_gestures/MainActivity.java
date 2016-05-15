package com.example.jacka.a12_gestures;

import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.StringBuilderPrinter;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements
        GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    private static TextView textView;
    private GestureDetectorCompat gestureDetectorCompat;

    private StringBuilder singleTouchStringInfo = new StringBuilder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize() {
        textView = (TextView) findViewById(R.id.textView);
        gestureDetectorCompat = new GestureDetectorCompat(this, this);
        gestureDetectorCompat.setOnDoubleTapListener(this);
    }

    /* This method should be called so the application will call*/
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        gestureDetectorCompat.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        singleTouchStringInfo.append("onSingleTapConfirmed\n");
        textView.setText(singleTouchStringInfo.toString());
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        singleTouchStringInfo.append("onDoubleTap\n");
        textView.setText(singleTouchStringInfo.toString());
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        singleTouchStringInfo.append("onDoubleTapEvent\n");
        textView.setText(singleTouchStringInfo.toString());
        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        singleTouchStringInfo.append("onDown\n");
        textView.setText(singleTouchStringInfo.toString());
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        singleTouchStringInfo.append("onShowPress\n");
        textView.setText(singleTouchStringInfo.toString());
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        singleTouchStringInfo.append("onSingleTapUp\n");
        textView.setText(singleTouchStringInfo.toString());
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        singleTouchStringInfo.append("onScroll\n");
        textView.setText(singleTouchStringInfo.toString());
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        singleTouchStringInfo.append("onLongPress\n");
        textView.setText(singleTouchStringInfo.toString());
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        singleTouchStringInfo.append("onFling\n");
        textView.setText(singleTouchStringInfo.toString());
        return false;
    }
}
