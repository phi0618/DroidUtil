package com.phi.xutils.uikit;

import android.content.res.Resources;
import android.util.DisplayMetrics;

public class DisplayUtil {
    private DisplayUtil() {

    }

    public static int dp2Px(int dp) {
        return dp2Px((float) dp);
    }

    public static int dp2Px(float dp) {
        float density = Resources.getSystem().getDisplayMetrics().density;
        return (int) (dp * density + 0.5f);
    }

    public static int getScreenHeight() {
        DisplayMetrics metrics = Resources.getSystem().getDisplayMetrics();
        return metrics.heightPixels;
    }

    public static int getScreenWidth() {
        DisplayMetrics metrics = Resources.getSystem().getDisplayMetrics();
        return metrics.widthPixels;
    }
}
