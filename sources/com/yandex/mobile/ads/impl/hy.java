package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class hy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f21518a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile wx f21519b;

    public static j90 a(Context context) {
        if (f21519b == null) {
            synchronized (f21518a) {
                if (f21519b == null) {
                    f21519b = new wx(context, "com.google.android.gms.location.LocationServices");
                }
            }
        }
        return f21519b;
    }
}
