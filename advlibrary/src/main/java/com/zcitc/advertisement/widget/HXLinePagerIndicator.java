package com.zcitc.advertisement.widget;

/**
 * author : LiuJie
 * date   : 2021/3/212:40
 */


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;

public class HXLinePagerIndicator extends LinePagerIndicatorEx {
    public HXLinePagerIndicator(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        LinearGradient lg = new LinearGradient(getLineRect().left, getLineRect().top, getLineRect().right, getLineRect().bottom, new int[]{0xFF52dac2, 0xFF4ec4dd}, null, LinearGradient.TileMode.CLAMP);
        getPaint().setShader(lg);
        canvas.drawRoundRect(getLineRect(), getRoundRadius(), getRoundRadius(), getPaint());
    }
}
