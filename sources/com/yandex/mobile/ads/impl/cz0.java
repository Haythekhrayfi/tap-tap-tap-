package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class cz0 {
    public static boolean a(Context context) {
        try {
            return context.getPackageManager().hasSystemFeature("android.hardware.touchscreen");
        } catch (Throwable th) {
            x60.a(th, th.getMessage(), new Object[0]);
            return false;
        }
    }
}
