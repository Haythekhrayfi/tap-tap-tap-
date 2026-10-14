package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public final class u6 {
    public static boolean a(int i10) {
        return Build.VERSION.SDK_INT >= i10;
    }

    public static boolean a(Context context) {
        return (context == null || (context.getApplicationInfo().flags & 2) == 0) ? false : true;
    }
}
