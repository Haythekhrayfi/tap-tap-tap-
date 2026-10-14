package com.facebook.ads.redexgen.X;

import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class JK {
    public static JI A00(DisplayMetrics displayMetrics) {
        int i10 = (int) (displayMetrics.widthPixels / displayMetrics.density);
        int screenWidth = displayMetrics.heightPixels;
        int screenHeight = (int) (screenWidth / displayMetrics.density);
        if (C0995Ko.A04(i10, screenHeight)) {
            return JI.A0H;
        }
        if (screenHeight > i10) {
            return JI.A0J;
        }
        return JI.A0G;
    }

    public static void A01(DisplayMetrics displayMetrics, View view, JG jg) {
        int iCeil;
        int i10 = (int) (displayMetrics.widthPixels / displayMetrics.density);
        int screenWidth = jg.A03();
        if (i10 >= screenWidth) {
            iCeil = displayMetrics.widthPixels;
        } else {
            int screenWidth2 = jg.A03();
            iCeil = (int) Math.ceil(screenWidth2 * displayMetrics.density);
        }
        int screenWidth3 = jg.A02();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iCeil, (int) Math.ceil(screenWidth3 * displayMetrics.density));
        layoutParams.addRule(14, -1);
        view.setLayoutParams(layoutParams);
    }
}
