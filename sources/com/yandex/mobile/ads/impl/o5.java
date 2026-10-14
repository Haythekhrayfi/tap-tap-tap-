package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class o5 {
    public static FrameLayout a(Context context) {
        n5 n5Var = new n5(context);
        FrameLayout frameLayout = new FrameLayout(context);
        int i10 = eh1.f20253b;
        int iA = y11.a(context, 1, 25.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA, iA);
        layoutParams.gravity = 17;
        int iRound = Math.round(TypedValue.applyDimension(1, 19.5f, context.getResources().getDisplayMetrics()));
        layoutParams.setMargins(iRound, iRound, iRound, iRound);
        frameLayout.addView(n5Var, layoutParams);
        n5Var.setTag(dh1.a("close_button"));
        n5Var.f23235h = 1.0f;
        n5Var.invalidate();
        return frameLayout;
    }
}
