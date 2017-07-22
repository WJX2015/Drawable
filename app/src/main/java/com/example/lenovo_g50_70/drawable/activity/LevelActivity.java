package com.example.lenovo_g50_70.drawable.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.lenovo_g50_70.drawable.R;

public class LevelActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView mImageView;
    private Button btnOpen;
    private Button btnClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);

        mImageView = (ImageView) findViewById(R.id.level);
        mImageView.setImageLevel(8);

        btnOpen = (Button) findViewById(R.id.btn_open);
        btnOpen.setOnClickListener(this);

        btnClose = (Button) findViewById(R.id.btn_close);
        btnClose.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btn_open:
                mImageView.setImageLevel(15);
                break;

            case R.id.btn_close:
                mImageView.setImageLevel(8);
                break;

        }
    }
}
