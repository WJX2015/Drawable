package com.example.lenovo_g50_70.drawable.drawable;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/**
 * 自定义Drawable   圆形
 * Created by lenovo-G50-70 on 2017/6/11.
 */

public class CircleDrawable extends Drawable {

    private Paint mPaint;
    private int mWidth;
    private Bitmap mBitmap;

    public CircleDrawable(Bitmap bitmap){
        mBitmap=bitmap;
        //着色器，图片，水平着色，垂直着色
        BitmapShader bitmapShader=new BitmapShader(mBitmap, Shader.TileMode.CLAMP ,Shader.TileMode.CLAMP);
        mPaint= new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setShader(bitmapShader);
        mWidth =Math.min(mBitmap.getWidth(),mBitmap.getHeight());
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawCircle(mWidth/2,mWidth/2,mWidth/2,mPaint);
    }

    @Override
    public void setAlpha(int alpha) {
        //设置画笔的透明度
        mPaint.setAlpha(alpha);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        mPaint.setColorFilter(colorFilter);
    }

    @Override
    public int getOpacity() {
        //支持和窗口一样的透明度
        return PixelFormat.TRANSLUCENT;
    }

    @Override
    public int getIntrinsicWidth() {
        //返回Drawable实际的宽
        return mWidth;
    }

    @Override
    public int getIntrinsicHeight() {
        //返回Drawable实际的高
        return mWidth;
    }
}
