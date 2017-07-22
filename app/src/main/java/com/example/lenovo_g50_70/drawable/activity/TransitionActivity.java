package com.example.lenovo_g50_70.drawable.activity;

import android.graphics.drawable.TransitionDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.lenovo_g50_70.drawable.R;

public class TransitionActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView mImageView;
    private Button TrannOpen;
    private Button TranClose;
    private TransitionDrawable mDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition);

        mImageView= (ImageView) findViewById(R.id.transition);
        mImageView.setImageLevel(8);

        TrannOpen = (Button) findViewById(R.id.tran_open);
        TrannOpen.setOnClickListener(this);

        TranClose = (Button) findViewById(R.id.tran_close);
        TranClose.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.tran_open:
                mDrawable = (TransitionDrawable) mImageView.getDrawable();
                mDrawable.startTransition(3000);
                break;

            case R.id.tran_close:
                mDrawable = (TransitionDrawable) mImageView.getDrawable();
                mDrawable.reverseTransition(3000);
                break;

        }

    }
}
