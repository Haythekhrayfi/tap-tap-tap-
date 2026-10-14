package com.yandex.mobile.ads.impl;

import android.widget.ImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class z10 {
    public static String a(String str) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        StringBuilder sbA = v60.a("#S");
        sbA.append(scaleType.ordinal());
        sbA.append(str);
        return sbA.toString();
    }

    public static String a(String str, ImageView.ScaleType scaleType) {
        StringBuilder sbA = v60.a("#S");
        sbA.append(scaleType.ordinal());
        sbA.append(str);
        return sbA.toString();
    }
}
