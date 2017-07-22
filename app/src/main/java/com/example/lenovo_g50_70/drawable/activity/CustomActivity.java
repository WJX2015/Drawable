package com.example.lenovo_g50_70.drawable.activity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.lenovo_g50_70.drawable.R;
import com.example.lenovo_g50_70.drawable.drawable.CircleDrawable;
import com.example.lenovo_g50_70.drawable.drawable.RoundDrawable;

public class CustomActivity extends AppCompatActivity {

    private ImageView mRoundView;
    private ImageView mRectRView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState);
        setContentView(R.layout.activity_custom);

        mRoundView = (ImageView) findViewById(R.id.cus);

        Bitmap round = BitmapFactory.decodeResource(getResources(),R.drawable.wang0);
        //自定义的圆图
        CircleDrawable draw =new CircleDrawable(round);

        mRoundView.setImageDrawable(draw);

        mRectRView = (ImageView) findViewById(R.id.tom);

        Bitmap rectF =BitmapFactory.decodeResource(getResources(),R.drawable.wang5);

        RoundDrawable able =new RoundDrawable(rectF);

        mRectRView.setImageDrawable(able);

    }
}
