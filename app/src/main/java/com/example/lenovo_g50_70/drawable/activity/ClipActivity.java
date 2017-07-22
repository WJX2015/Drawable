package com.example.lenovo_g50_70.drawable.activity;

import android.graphics.drawable.ClipDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.lenovo_g50_70.drawable.R;

public class ClipActivity extends AppCompatActivity {

    private ImageView mImageView;
    private ClipDrawable mDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clip);

        mImageView= (ImageView) findViewById(R.id.clip);
        mDrawable = (ClipDrawable) mImageView.getDrawable();
        /**
         *  取值0~10000，0完全不见，10000完全显示
         *  裁剪通过setLevel()
         */
        mDrawable.setLevel(5000);
    }
}
