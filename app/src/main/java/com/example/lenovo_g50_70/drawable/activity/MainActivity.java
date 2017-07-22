package com.example.lenovo_g50_70.drawable.activity;

import android.graphics.drawable.ScaleDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.lenovo_g50_70.drawable.R;

public class MainActivity extends AppCompatActivity {
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = (ImageView) findViewById(R.id.image_scale);
        ScaleDrawable drawable = (ScaleDrawable) mImageView.getDrawable();
        drawable.setLevel(1000);
        /**
         * 为什么设置drawable——level
         * 如果我们直接运行，发现并没有显示图片
         * draw()方法判断getLevel() != 0才绘制图片
         * 默认getLevel()都是0
         */
    }
}
