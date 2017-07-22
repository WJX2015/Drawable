package com.example.lenovo_g50_70.drawable.drawable;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/**
 * 自定义Drawable   圆角
 * Created by lenovo-G50-70 on 2017/6/11.
 */

public class RoundDrawable extends Drawable {

    //画笔
    private Paint mPaint;
    //矩形
    private RectF mRectF;
    //我们想改变的图片
    private Bitmap mBitmap;

    public RoundDrawable(Bitmap bitmap) {
        mBitmap=bitmap;
        BitmapShader shader =new BitmapShader(mBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        //着色，和setColor类似
        mPaint.setShader(shader);
    }


    @Override
    public void draw(Canvas canvas) {
        //画圆角矩形
        canvas.drawRoundRect(mRectF,50,50,mPaint);
    }

    @Override
    public void setAlpha(int alpha) {
        mPaint.setAlpha(alpha);
    }

    @Override
    public void setBounds(int left, int top, int right, int bottom) {
        //制定一个区域
        mRectF=new RectF(left,top,right,bottom);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        mPaint.setColorFilter(colorFilter);
        /**
         * 实现滤镜效果
         * ColorMatrix 色彩矩阵类,功能很强大，但太过难用
         * ColorMatrixColorFilter 色彩矩阵颜色过滤器
         * LightingColorFilter  光照颜色过滤器  可以简单的完成色彩过滤和色彩增强功能
         * PorterDuffColorFilter  图形混合滤镜  相当PS里的图层结合
         */
    }

    @Override
    public int getOpacity() {
        //透明度
        return PixelFormat.TRANSLUCENT;
    }

    @Override
    public int getIntrinsicWidth() {
        //图片实际的宽
        return mBitmap.getWidth();
    }

    @Override
    public int getIntrinsicHeight() {
        //图片实际的高
        return mBitmap.getHeight();
    }
}
