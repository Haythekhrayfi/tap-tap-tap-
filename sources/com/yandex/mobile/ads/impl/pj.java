package com.yandex.mobile.ads.impl;

import android.graphics.Color;

/* JADX INFO: loaded from: classes3.dex */
public final class pj {
    public static final int a(String str) {
        try {
            return Color.parseColor(str);
        } catch (Throwable unused) {
            return -16777216;
        }
    }
}
