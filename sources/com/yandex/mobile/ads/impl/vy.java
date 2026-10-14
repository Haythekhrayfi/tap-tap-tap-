package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class vy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f26102a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile wx f26103b;

    public static j90 a(Context context) {
        if (f26103b == null) {
            synchronized (f26102a) {
                if (f26103b == null) {
                    f26103b = new wx(context, "com.huawei.hms.location.LocationServices");
                }
            }
        }
        return f26103b;
    }
}
